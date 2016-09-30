import java.util.Scanner;

public class Lab2a
{
   public static void main(String[] args)
   {
      //Prompt the user for a length and width.
      //Output the area.
      
      Scanner console = new Scanner(System.in);
      
      double length, width, area;
      
      System.out.println("Please enter the length of your rectangle:");
      length = console.nextDouble();
      
      System.out.println("Next, enter the width:");
      width = console.nextDouble();
      
      area = length * width;
      System.out.println("The area of your rectangle is: " + area);
      
      
   }
}