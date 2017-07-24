import java.util.Scanner;
public class Problem1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int n, i, j;
      do{
         System.out.print("Enter square length greater than 1 ( > 1): ");
         n = kb.nextInt();
      }while ( n <= 1 );
      
      int temp = n;
      for (i = 0; i < n; i++)
      {
         for (j = 0; j < n; j++)
         {
            if (j == i)
               System.out.print(temp+ " ");
            else if (j == n-1-i)
               System.out.print(i+1 + " ");
            else
               System.out.print("* " );   
         }System.out.println();
         temp--;    
      }
      System.out.println();
   }
}