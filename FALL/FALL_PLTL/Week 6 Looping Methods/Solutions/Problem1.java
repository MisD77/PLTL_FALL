import java.util.Scanner;
public class Problem1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int firstNum, secondNum, smallDiff, largeDiff, i = 2;
      
      System.out.print("Enter an integer: ");
      firstNum = kb.nextInt();
      System.out.print("Enter an integer: ");
      secondNum = kb.nextInt();
      
      
      largeDiff = secondNum - firstNum;
      smallDiff = secondNum - firstNum;
      
      
      while(i < 10)
      {
         firstNum = secondNum;
         System.out.print("Enter an integer: ");
         secondNum = kb.nextInt();
         
         if (secondNum - firstNum > largeDiff)
             largeDiff = secondNum - firstNum;
         
         if (secondNum - firstNum < smallDiff)
            smallDiff = secondNum - firstNum;
        
       i++;
      }
      
      System.out.println("Largest difference: "+ largeDiff);
      System.out.println("Smallest difference: "+ smallDiff);
   }
}