import java.util.Scanner;
public class NHalvesOfNSum
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int userInput, sum, nHalves, remainder;
      System.out.print("Enter n: ");
      userInput = kb.nextInt();
      
      sum = ( userInput * ( userInput + 1)) / 2;
      
      nHalves = sum / userInput;
      remainder = sum / userInput; 
      
      System.out.print("The sum of "+ n + "numbers is " + "sum. ");
      System.out.print("Andc" + sum + " can be divided into " + n + " in " + nHalves + ".");
      System.out.println();
        
   }//main ends
   
}