public class Problem1{
   public static void main(String[] args)
   {
      int[][] arr1 = { { 1, 2 , 4, 0}, { 3, 4, 5, 6 }, { 7, 8, 9, 12 } };
      int[][] a1 = deepReverse(arr1);
      print2DArray(a1);
      System.out.println();
      
      int[][] arr2 =  { { 2, 8 }, { 7, 20 }, { 9, 3 }, { 5, 12 } };  
      int[][] a2 = deepReverse(arr2);
      print2DArray(a2);
      System.out.println();

                 
   }//main ends
   
   public static int[][] deepReverse(int[][] arr)
   {
      int[][] x = new int[arr.length][arr[0].length];
      int n = arr.length - 1, i, j, m ;
      for (i = 0; i < arr.length; i++)
      {
         x[i] = arr[n];
         n--;
      }
      
      int[][] x1 = new int[arr.length][arr[0].length];
      
      int temp = x[0].length-1;
      for (i = 0; i < x1.length; i++)
      { 
         m = temp;
         for (j = 0; j < x1[i].length; j++)
         {
            x1[i][j] = x[i][m];
            m--;
         }
      }
      return x1;
      
   }//deepReverse method ends
   
   public static void print2DArray(int[][] a)
   {
      for (int i = 0; i < a.length; i++)
      {
         for (int j = 0; j < a[i].length; j++)
         {
            System.out.print(a[i][j]+ ", ");
         }
         System.out.println();
      }
   }//print2DArray ends

}//program ends
