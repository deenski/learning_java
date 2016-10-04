import java.util.Scanner;

public class lab1 {
   public static void main(String[] args) {
      int num;
      Scanner kb = new Scanner(System.in);
      int evenCounter = 0;
      int oddCounter = 0;
      
      System.out.println("Please enter 10 numbers");
      for (int i = 0; i < 10; i++) {
         //Get num from user
         //Decide if num is odd or even
         num = kb.nextInt();
         if (num % 2 == 0)
            evenCounter++;
         else
            oddCounter++;
         
      }
      System.out.printf("You entered %d even numbers%n", evenCounter);
      System.out.printf("You entered %d odd numbers%n", oddCounter);
   }
}