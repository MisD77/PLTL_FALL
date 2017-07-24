
public class Problem2
{
	public static void main(String[] args)
	{
		char[] a = {'w', 'a', 't', 'e', 'r'};
      char[] b = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
      char[] c = {'f', 'o', 'o', 'b', 'a', 'r'};
      char[] d = {'c', 'b', 'a', 'a', 'b', 'c'};
      System.out.println(palindromeChar(a));
      System.out.println(palindromeChar(b));
      System.out.println(palindromeChar(c));
      System.out.println(palindromeChar(d));

	}//method ends
   
   public static boolean palindromeChar(char[] arr)
   {
      int j = 0; 
      boolean isPalindrome = true;
      for (int i = arr.length - 1; i <= 0; i++)
      {
         if (arr[i] != arr[j])
            isPalindrome = false;
         
         j++;
      }
      if (isPalindrome)
         System.out.println("");
      return isPalindrome;
   }

}