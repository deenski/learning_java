import java.util.Scanner;

public class TestingNumbers
{

   public static void main(String[] args)
   {
      char d = 'D';
      System.out.println("D = " + ((int)d)); 
      String name = "Joe";
      System.out.println("Hi " + name);

      Scanner console = new Scanner(System.in);

      int a;
      System.out.println("Enter a number:"); 
      a = console.nextInt();
      System.out.println("You entered " + a);
      
      String b;
      System.out.println("Enter a word:");
      b = console.next();
      System.out.println("You entered: " + b);
      
      char c;
      System.out.println("Enter a character");
      c = console.next().charAt(0);
      System.out.println("You entered = " + "\"" + c + "\"");
      

   }
}