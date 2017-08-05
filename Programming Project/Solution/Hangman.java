//Programming I
//Instructor version
import java.io.*;
import java.util.*;

public class Hangman
{
   public static void main(String[] args)
   {
      //loads the list of words from the file given so that it can be accessed from anywhere inside the program.
      String[] dictionary = loadWords();
      
      //starts the game by calling gameStart and passing the words lists
      gameStart(dictionary);
   }//main ends
       
   public static void gameStart(String[] wordList)
   {
      Scanner kb = new Scanner(System.in);
      //generates a secretWord to be guessed by the user
      String secretWord = generateWord(wordList); 
      //the string is converted as a list of chars
      char[] secretArray = stringToChar(secretWord);  
     
      int guesses = 5, index = 0;
      char guessInput = ' ', decision = ' ';
      boolean occupiedBefore, letterCheck = false, winGame;
      
      //create an array of char to store the values entered by player
      char[] inputArray = new char[50];
      
      //create another array which is displayed instead of secretArray
      char[] dashArray = new char[secretArray.length];
      
      //the display array should look as dashes seperated by space
      for (int j = 0; j < dashArray.length; j++)
         dashArray[j] = '_';//secretWord displayed as: _ _ _ _ _ _
         
      //welcome message
      System.out.println("Welcome to the Hangman Game!");
      System.out.println("I am thinking of a word that is " + dashArray.length + " letters long.");
      
      //start the game
      do
      {
         System.out.println("-------------");
         System.out.println("You have "+ guesses + " guesses left.");
         System.out.print("Please Guess a letter: ");
         
         guessInput = kb.next().charAt(0); //takes user input as char
         //checks if the user input has been entered before
         occupiedBefore = repeat(inputArray, guessInput);//returns a boolean
         
         
         if (occupiedBefore) 
            System.out.print("You have already guessed that letter: "); //displey
          
         //if the user input is not entered before        
         else
         {
            inputArray[index] = guessInput; //add the letter to inputArray
            index++;
            //check the letter matches any of the letter in secretWord
            letterCheck = isGuessedWord(secretArray, guessInput); //returns a boolean
         
            if (letterCheck)
            {
               System.out.print("Good guess: "); //display
               // And replace this letter in the dash display
               dashArray = replaceWithLetter(secretArray, dashArray, guessInput);// returns a modified dashArray            
           }
            
            else //if the letter is not in the secretWord then
            {
               guesses--; //decrease the number of  guesses
               System.out.print("Oops! That letter is not in my word: "); //display
            }
         }
         printArray(dashArray); //print out the new dashArray
         winGame = game(secretArray, dashArray);  //checks if the user entered all the letters
      }
      while(guesses != 0 && !winGame);//do-while ends when the number of guess is 0 or game is won
     
      System.out.println("-------------");
     
      if (winGame)
         System.out.println("Yayy, congratulations. You won!");
         
      else if (guesses == 0)
      {
         System.out.print("Sorry you ran out of guesses. The word was: ");
         printArray(secretArray);
      }
      //CASE: PLAY AGAIN 
      /* 
         System.out.print("Play again? Press 'y' if YES or 'n' if NO: ");
         decision = kb.next().charAt(0);
      
         if (decision == 'y')
         {
            System.out.println("Let's play again!");
            gameStart(wordList);
         }
         else
            System.out.println("Have a good day. Come again soon.");
     */
     
   }//gameStart ends
   
   
   public static String generateWord(String[] wordsArr)
   {
   /**
   * takes a String[] of words 
   * returns a string which is a secretWord generated from the random index.
   */
      int index = (int)(Math.random() * wordsArr.length);
      String randomWord = wordsArr[index];  
      return randomWord;
   }//generateWord ends
   
   public static boolean repeat(char[] inputArr, char userInput)
   {
   /* takes an inputArr and userInput and returns a true if the user input is already in the array
   */
      boolean previous = false;
     
      for (int i = 0; i < inputArr.length; i++)
      {
         if (inputArr[i] == userInput)
            previous = true;
      }
      return previous;
   }//repeat ends
   
   public static boolean isGuessedWord(char[] secretArr, char userInput)
   {
   /**
   * takes two parameters, the secretArray and the word the user is guessing
   * returns a boolean, true if all the letters of secretArray are in lettersGuessed 
   */
      boolean guess = false;
      int i = 0;
      
      while(i < secretArr.length && (!guess)){
         if (secretArr[i] == userInput)
            guess = true;
         i++;      
      }
      return guess;
   }//isGuessedWord ends
   
   public static char[] replaceWithLetter(char[] secretArr, char[] displayArr, char userInput)
   {
   /**
   * takes three parameters: secretArr, displayArr and userInput
   * returns a modified char[], where "_" is replaced by the userInput 
   * depending upon its position in secretArray
   */  
      for (int i = 0; i < displayArr.length; i++)
      {
         if (secretArr[i] == userInput)
            displayArr[i] = userInput;
      }
      return displayArr;
   }//replaceWithLetter ends
   
   public static boolean game(char[] secretArr, char[] displayArr)
   {
   /**
   * takes secretArr and displayArr and checks if all the elements in displayArr is same that of secretArr
   * returns true if all letters in secretArr is in displayArr
   */  
      boolean win = true;
      int i = 0;
      while (win && i < secretArr.length) 
      {        
         if (displayArr[i] != secretArr[i])
            win = false;
         i++;    
      }
      return win;
   }// gameWin ends
   
   public static void printArray(char[] arr)
   {
   /** takes a char[] and print the elements in the same line seperated by spaces
   */
      for(int i = 0 ; i < arr.length; i++)
         System.out.print(arr[i]+ " ");
      System.out.println();
   }//printArray ends
    
   /**Helper Code--------------------
   * You don't have to understand these helper codes
   * But you will have to know how/when to call these methods
   * Make sure to read the docstrings
   * DONOT make any changes to the methods EXCEPT when asked to.
   */
   
   public static String[] loadWords()
   {
   /**
   * Returns a String array of valid words.
   * Also prints out the total number of words(Strings) in the array.
   */
   
      ArrayList<String> wordList = new ArrayList<String>();
      File f = new File("words.txt");
      String[] wordsArr = new String[wordList.size()];
      try
      {
         Scanner in = new Scanner(f);
         while(in.hasNext())
         {
            String word = in.next();
            wordList.add(word);
         }
         in.close(); 
         System.out.println("Loading words from the file......");
         System.out.println(wordList.size()+" words loaded.");
         System.out.println("-------------");
         wordsArr = (String[])wordList.toArray(wordsArr);
      }
      
      catch(FileNotFoundException ex)
      {
         System.out.println("File not found.");
      }
      return wordsArr;
   }//loadWords ends
   
   public static char[] stringToChar(String secretWord)
   {
   /**
   * takes a string which is a secretWord
   * Returns a Char array of secretWord
   * You can use printArray method to test the output
   */
      char[] secretArr = new char[secretWord.length()];    
      for (int i = 0; i < secretArr.length; i++)
      {
         secretArr[i] = secretWord.charAt(i);
      }
      return secretArr; 
   }//stringToChar ends
   
   // End of Helper Code--------------------
    
}//program ends