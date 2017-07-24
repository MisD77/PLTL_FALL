public class Problem1
{
   public static void main(String[] args)
   {
   
      int[] a = {1, 21, 5, 9, 12, 50, 47};
      boolean[] a1 = multipleOfIndices(a);
      int[] b = {5, 3, 77, 34, 43};
      boolean[] b1 = multipleOfIndices(b);
      int[] c = {30, 22, 42, 8, 15, 27, 6};
      boolean[] c1 = multipleOfIndices(c);
      int[] d = {10, 51, 34, 69, 44, 95};
      boolean[] d1 = multipleOfIndices(d);
      
      printArray(a1);
            System.out.println();

      printArray(b1);
            System.out.println();

      printArray(c1);
            System.out.println();

      printArray(d1);
            System.out.println();


   }//main ends
   
   public static boolean[] multipleOfIndices(int[] arr)
   {
      int i;
      boolean[] boo = new boolean[arr.length];
      for(i = 0; i < arr.length; i++)
      {
         if (i == 0 || i == 1)
            boo[i] = arr[i] % 10 == i ;
         else
            boo[i] = arr[i] % i == 0;
      }
       return boo;
   
   }//multipleOfIndices ends
   
   public static void printArray(boolean[] arr)
   {
      for (int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + ", ");
      }
      System.out.println();
   }//printArray ends
}