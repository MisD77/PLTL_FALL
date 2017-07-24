public class Problem2
{
   public static void main(String[] args)
   {
      int[] x1 = {4, 3, 5, 2};
      char[] y1 = {'Q', 'W', 'r', 'B'};
      char[][] z1 = repeatChar(x1, y1);
      print2DArray(z1); 
      System.out.println();
      
      int[] x2 = {5, 2, 3, 4, 1};
      char[] y2 = {'@', '!', '<', 'S', 'm'};
      char[][] z2 = repeatChar(x2, y2);
      print2DArray(z2); 
      System.out.println();
      
      
   }
   public static char[][] repeatChar(int[] a, char[] c)
   {
      char[][] arr= new char[a.length][];
      int i;
      for (i = 0; i < arr.length; i++)
      {
         int col = a[i];
         arr[i] = new char [col];
         for(int j = 0; j < col; j++)
         {
            arr[i][j] = c[i];
         }
      }
      return arr;
   }
   public static void print2DArray(char[][] ch)
   {
      for (int i = 0; i < ch.length; i++)
      {
         for (int j = 0; j < ch[i].length; j++)
         {
            System.out.print(ch[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
   }
}