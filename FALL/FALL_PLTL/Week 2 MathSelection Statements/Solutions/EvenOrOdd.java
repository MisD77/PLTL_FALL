import java.util.Scanner;

public class EvenOrOdd
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int bitVal, decimalVal, n1, n2, n3, n4, r;
      System.out.print("Enter a 4-bit integer : ");
      bitVal = kb.nextInt();
      
      n1 = bitVal / 1000;
      r = bitVal % 1000;
      n2 = r / 100;
      r = r % 100;
      n3 = r / 10;
      n4 = r % 10;
      
      decimalVal = 8*n1 + 4*n2 + 2*n3 + 1*n4;
      
      System.out.println("The decimal value of "+ bitVal + " is " + decimalVal);
      
      if (decimalVal % 2 == 0)
         System.out.println(decimalVal + " is an even number");
      
      else
         System.out.println(decimalVal + " is an odd number");
         
      }
}