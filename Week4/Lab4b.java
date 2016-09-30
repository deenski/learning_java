import java.util.Scanner;

public class Lab4b
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("Please input a nubmber");
      
      int number = userInput.nextInt();
   
      if (number == 0)
      {
         System.out.println("Your number is zero");
      }
      else if ((number % 2)== 0)
      {
         System.out.println("Your number is even");
      }
      else
       {
         System.out.println("Your number was odd");
       }  
     }
     
}