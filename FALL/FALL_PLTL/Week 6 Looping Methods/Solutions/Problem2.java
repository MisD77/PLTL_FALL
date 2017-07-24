public class Problem2
{
   public static void main(String[] args)
   {
   
    System.out.println(allDigitsOdd(73925));
    System.out.println(allDigitsOdd(59175));
    System.out.println(allDigitsOdd(530));
    System.out.println(allDigitsOdd(31));

   }
   
   public static boolean allDigitsOdd(int n)
   {
      int m = n, r;
      boolean odd = true;
      
      while(odd == true && m > 0)
      {
         r = m % 10;
         
         if (r % 2 == 0)
            odd = false;
            
         m /= 10;
         
      }
      return odd;
   }
}