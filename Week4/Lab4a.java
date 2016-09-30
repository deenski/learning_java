//get number tell if positive negative or zero
import java.util.Scanner;

public class Lab4a
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("Please input a nubmber");
      
      int number = userInput.nextInt();
   
      if (number < 0)
         System.out.println("Your number is negative");
      else if (number > 0)
         System.out.println("Your number is positive");
      else
         System.out.println("Your number was zero");
         
   }


}