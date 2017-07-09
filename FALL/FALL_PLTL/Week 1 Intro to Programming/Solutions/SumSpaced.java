import java.util.Scanner;
public class SumSpaced
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int input, sum, remainder, n1, n2, n3, n4;
      System.out.print("Enter n: ");
      
      input = kb.nextInt();      
      sum = ( input * ( input + 1)) / 2;      
      System.out.println("The sum of first "+ input + " numbers is " + sum );
      
      n4 = sum % 10;
      remainder = sum / 10;
      n3 = remainder % 10;
      remainder = remainder / 10;
      n2 = remainder % 10;
      n1 = remainder / 10;
      
      System.out.print("The sum seperated by space is: "+ n1 +" "+ n2 + " " + n3 + " " + n4);
      
   }//main ends
   
}