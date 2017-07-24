public class Problem2
{
   public static void main(String[] args)
   {
      int n1 = 3;
      int[] a1 = {6, 81, 17, 12, 25, 24, 12};
      int x1 = closestPower(n1, a1);
      System.out.println(x1);
      System.out.println();
      
      int n2 = 4;
      int[] a2 = {3, 4, 5, 1, 12 , 67, 3, 1, 1};
      int x2 = closestPower(n2, a2);
      System.out.println(x2);
      System.out.println();
      
      int n3 = 7;
      int[] a3 = {77, 22, 185, 20, 269, 88};
      int x3 = closestPower(n3, a3);
      System.out.println(x3);
      System.out.println();
      
      int n4 = 2;
      int[] a4 = {1, 4, 24, 3, 12, 8};
      int x4 = closestPower(n4, a4);
      System.out.println(x4);
      System.out.println();     
      
      
   }//main ends
   
   public static int closestPower(int n, int[] a)
   {
      int max = a[0], count = 0, i, j, num = max, tempCount = 1;
      for (i = 0; i < a.length; i++)
      {
         count = 0;
         for (j = 0; j < a.length; j++)
         {
             if (a[i] == a[j])
               count++;
         }
         if (count > tempCount)
         {
            tempCount = count;
            num = a[i];
         } 
         if (a[i] > max)
            max = a[i];
  
      }//for ends
      
      ///get the value of num
      
      //if there is no repeatation, find the max to get num.
       if (tempCount == 1)
       {
         num = max;
       } 
      boolean action = true;
      i = 0;
      while (action)
      {
         if (Math.pow(n, i) < num )
            i++;
         
         else 
            action = false; 
      }//finds the power that is near to num
      if (i != 0)
         i--;
      int val = 0;
      if (num - Math.pow(n, i) == Math.pow(n, i+1)- num ) 
            val = i;
      else if ( num - Math.pow(n, i) < Math.pow(n, i+1) - num )
         val = i;
      else
         val = i+1;
         
     return val;
   }//closedPower ends
}//program ends