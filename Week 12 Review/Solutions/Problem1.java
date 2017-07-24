public class Problem1
{
   public static void main(String[] args)
   {
      int[][] a = {{31, 888, 77, 50, 28},{29, 15, 555, 20, 100},{30, 302, 33, 80, 66},{32, 90, 44, 90, 232}};
      double a1 = mostFrequentAverage(a);
      System.out.println(a1);
      
      int[][] b = {{20, 10, 8, 9}, {49, 5, 2, 8}, {6, 16, 41, 89}, {5, 15, 29, 33}};
      double b1 = mostFrequentAverage(b);
      System.out.println(b1);
      
      int[][] c = {{1, 2, 3, 4, 5}, {4, 3, 2, 3, 9}, {4, 2, -15, 15, 6}, {5, 7, 24, 3, -5}};
      double c1 = mostFrequentAverage(c);
      System.out.println(c1);
   
   
   }//main ends
   
   public static double mostFrequentAverage(int[][] a)
   {
      int i, j;
      double[] b = new double[a[0].length];
      for(i = 0; i < a[0].length; i++)
      {
         int sum = 0;
         for(j = 0; j < a.length; j++)
         {
              sum += a[j][i];
         }
         b[i] = sum /(a.length * 1.0);
      }
      
      int tempCount = 1, count;
      double value = 0;
      for (i = 0; i < b.length; i++)
      {
         count = 0;
         for (j = 0; j < b.length; j++)
         {
            if (b[i] == b[j])
            {
               count++;
            }
         }
         if (count > tempCount){
            tempCount = count; 
            value = b[i];  
         }
      }
      return value;      
     
   }//mostFrequentAverage removed
   
}