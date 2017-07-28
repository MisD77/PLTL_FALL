import java.io.*;
import java.util.*;

public class Hangman
{
   public static void main(String[] args)
   {
      
      //TODO Complete this method

   }//main ends
       
   // TODO create methods here
 
    
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