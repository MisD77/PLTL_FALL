public class Problem2{
   public static void main(String[] args)
   {
      int[][] a = { { 4, 13, 10, 3, 9 }, { 14, 19, 43, 5 }, { 31, 17, 40, 11 } };
      boolean[][] a1 = isPrime(a);
      print2DArray(a1);
      System.out.println();
      
      int[][] b =  { { 89, 7, 9 }, { 25, 39 }, { 133, 29, 41 } };  
      boolean[][] b2 = isPrime(b);
      print2DArray(b2);
      System.out.println();

                 
   }//main ends
   
   public static boolean[][] isPrime(int[][] arr)
   {
      boolean[][] b = new boolean[arr.length][];
      for(int i = 0; i < arr.length; i++)
      {
         b[i] = new boolean [arr[i].length];
      }
      for(int i = 0; i < arr.length; i++)
      {
         for (int j = 0; j < arr[i].length; j++)
               b[i][j] =  primeCheck(arr[i][j]);
         
      }
      return b;
   }//deepReverse method ends
   
   public static boolean primeCheck(int x)
   {
      boolean prime = true;
      for(int i = 2; i < x; i++)
      {
         if (x % i == 0)
         prime = false;
      }
      return prime;  
   }//primeCheck ends
   
   public static void print2DArray(boolean[][] a)
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
