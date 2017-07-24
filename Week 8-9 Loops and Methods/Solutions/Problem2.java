public class Problem2{
   public static void main(String[] args)
   {
      int[] a1 = {1, 4, 16, -19, -12, 2, 5};
      int[] x1 = greaterThanSum(a1);
      
      int[] a2 = {-1, -2, -4, -12};
      int[] x2 = greaterThanSum(a2);
      
      int[] a3 = {29, -10, 22, 5, -15, 19, 62};
      int[] x3 = greaterThanSum(a3);
      
      int[] a4 = {5, 8, 17, 50}; 
      int[] x4 = greaterThanSum(a4);
      
      printArray(x1);
      printArray(x2);
      printArray(x3);
      printArray(x4);
   }//main ends
   
   public static int[] greaterThanSum(int[] a)
   {
      int count = 0, i, j = 0, sum = 0;
      for (i = 0; i < a.length; i++)
      {
         if (a[i] > sum)
            count++;
         
         sum += a[i];
      }
      int[] x = new int[count];
      sum = 0;
      for(i = 0; i < a.length; i++)
      {
         if (a[i] > sum){
            x[j] =  a[i];
            j++;
         }
         sum += a[i];
      }
      return x;
   }//greaterThanSum ends
   
   public static void printArray(int[] x)
   {
      for(int i = 0; i < x.length; i++)
      {
         System.out.print(x[i]+ ", ");
      }
      System.out.println();
   }//printArray ends 
}