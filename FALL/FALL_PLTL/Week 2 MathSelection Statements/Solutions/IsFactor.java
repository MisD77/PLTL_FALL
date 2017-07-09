import java.util.Scanner;

public class IsFactor
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int n1, n2, max, min;
      System.out.print("Enter the first number: ");
      n1 = kb.nextInt();
      System.out.print("Enter the second number: ");
      n2 = kb.nextInt();
      
      max = Math.max(n1, n2);
      min = Math.min(n1, n2);
      
      if ( max % min == 0)
         System.out.println(min + " is a factor of "+ max);
      
      else
         System.out.println(min + " is not a factor of "+ max);
   }
}