import java.util.Scanner;
import java.io.*;

public class lab3 {
   public static void main(String[] args)
                           throws FileNotFoundException
   {
      int num = 0;
      Scanner infile = new Scanner(new FileReader("inputFile.txt")); 
                                       
      int evenCounter = 0;
      int oddCounter = 0;
      int sum = 0;
      
      System.out.println("Please enter numbers");
    
      while (infile.hasNext()) {
         num = infile.nextInt();
         
         if (num % 2 == 0) {
            evenCounter++;
            sum += num;
         }
         else {
            oddCounter++;
            sum += num;
         }
      }
      infile.close();
      System.out.printf("You entered %d even numbers%n", evenCounter);
      System.out.printf("You entered %d odd numbers%n", oddCounter);
     
      System.out.printf("The sum is: %d%n", sum);
   }
}