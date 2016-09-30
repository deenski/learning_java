import java.util.Scanner;
public class Chapter5Work
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      final int NUM_GRADES = 5;
      int i = 0;
      double grade;
      double sum = 0.0;
      
      System.out.println("Please enter " + NUM_GRADES + " grades");

      
      while (i < NUM_GRADES)
      {
         grade = console.nextDouble();
         sum += grade;
         i++;
         
      }
      
      double average = sum / NUM_GRADES;
      
      System.out.println("The average of your grades is: " + average);

      
   }
}