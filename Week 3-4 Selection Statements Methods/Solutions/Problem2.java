public class Problem2
{
   public static void main(String[] args)
   {
      int a = GetRandomNumber();
      int b = GetRandomNumber();
      int c = GetRandomNumber();
      int d = GetRandomNumber();
      System.out.print(a + " degrees. ");
      System.out.println(WeatherCheck("Fall",a));
      System.out.print(b + " degrees. ");
      System.out.println(WeatherCheck("Spring",b));
      System.out.print(c + " degrees. ");
      System.out.println(WeatherCheck("Winter",c));
      System.out.print(d + " degrees. ");
      System.out.println(WeatherCheck("Summer",d));

   }//main ends
   public  static int GetRandomNumber()
   {
      int randomDeg = (int)(Math.random()* 100 + 1);
      
      return randomDeg;
   }//getRandomNumber ends
   
   public static String WeatherCheck(String season, int deg)
   {
      String s = "";
      
      if ( season == "Fall")
      {
         if (deg >= 0 && deg <= 30)
            s = "It's cold for a fall.";
         else if (deg > 30 && deg <= 60)
            s = "It's normal temperature for fall.";
         else
            s = "It's hot. I cannot believe it's fall."; 
      }
      
      else if (season == "Spring")
      {
         if (deg >= 0 && deg <= 30)
            s = "It's cold for a spring.";
         else if (deg > 30 && deg <= 60)
            s = "It's normal temperature for spring.";
         else
            s = "It's hot. It appears that summer is already here." ;
     
      }
      
      else if (season == "Winter")
      {
         if (deg >= 0 && deg <= 30)
            s = "It’s normal for a winter.";
         else if (deg > 30 && deg <= 60)
            s = "It's warm. Very nice weather.";
         else
            s = "It's super-hot for winter. Do you even live in Chicago?";
     
      }
      else 
      {
         if (deg >= 0 && deg <= 30)
            s = "It's too cold for summer. Well, well, here is Chicago for you.";
         else if (deg > 30 && deg <= 60)
            s = "It's cold. Is it summer yet?";
         else
            s = "It's so nice. I love summer.";
      }
      
      return s;
   }
   
   
}