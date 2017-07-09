import java.util.Scanner;
public class RightAngledTriangle
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      double a, b, c, max, hypotenuse;
      System.out.print("Enter a: ");
      a = kb.nextDouble();
      System.out.print("Enter b: ");
      b = kb.nextDouble();
      System.out.print("Enter c: ");
      c = kb.nextDouble();
      
      max = Math.max(a, b);
      hypotenuse = Math.max(max, c);
      
      double aHypo = Math.sqrt(Math.pow(b, 2)+ Math.pow(c,2));
      double bHypo = Math.sqrt(Math.pow(a, 2)+ Math.pow(c,2));
      double cHypo = Math.sqrt(Math.pow(a, 2)+ Math.pow(b,2));

      
      if (a == aHypo || b == bHypo || c == cHypo )
         System.out.println("A right angled triangle" );
         
      else
         System.out.println("Not a right angled triangle.");
      
   }
}