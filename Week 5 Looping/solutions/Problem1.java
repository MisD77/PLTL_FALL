
import java.util.Scanner;
public class Problem1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int product = 1, input = 1, count = 0;
      do{
      product *= input;
      System.out.print("Enter a positive integer: ");
      input = kb.nextInt();
      count++;
      }while(count < 5 && input > 0);
      
      if (input <= 0)
         count--;
      else
         product *= input;
 
      System.out.println("Number of positive numbers is: "+ count);
      System.out.println("The product of positive numbers is: "+ product);
      int sum = SumFromProduct(product);
      int factorial = SumFactorial(sum);
      System.out.println("The sum of the product is: "+ sum);
      System.out.println("The factorial of "+sum + " is: "+ factorial);
   }
   
   public static int SumFromProduct(int n)
   {
      int sum = 0,newSum = 0, r, m = n;
      do
      {
       r = m % 10;
       sum += r;
       m /= 10;
      }while ( m > 0 );
      
      
      if (sum > 10)
      {
         while(sum > 0)
         {
            r = sum % 10;
            newSum += r;
            sum /= 10;
         }
         sum = newSum;
      }
      return sum;
    }
    
    public static int SumFactorial(int m)
    {
         int factorial = 1, i;
         for(i = 1; i <= m; i++)
         {
            factorial *= i;
         }
         
         return factorial;
    }
}