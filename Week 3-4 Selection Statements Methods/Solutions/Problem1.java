public class Problem1
{
   public static void main(String[] args)
   {
   
      SumProduct(5, 1);
      System.out.println();
      SumProduct(64, 32);
      System.out.println();
      SumProduct(4, 2);
      System.out.println();
      SumProduct(2, 2);
      
   }
   
   public static void SumProduct(int a, int b)
   {
      int sum, product;
      
      sum = a + b;
      product = a * b;
      
      if (sum % 8 == 0 && product % 8 == 0)
         System.out.println("Awesome");
         
      else if (sum == product)
         System.out.println("Tie");
      
      else if (sum > product)
         System.out.println("Sum ");
      
      else
         System.out.println("Product");    
      
   }
}