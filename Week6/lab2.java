import java.util.Scanner;

public class lab2 {
   public static void main(String[] args) {
      int num = 0;
      Scanner kb = new Scanner(System.in);
      int evenCounter = 0;
      int oddCounter = 0;
      int sum = 0;
      
      System.out.println("Please enter numbers, -1 when done");
      
      while (num != -1) {
         num = kb.nextInt();
         if (num == -1)
            break;
         else if (num % 2 == 0) {
            evenCounter++;
            sum += num;
         }
         else {
            oddCounter++;
            sum += num;
         }
      }
      System.out.printf("You entered %d even numbers%n", evenCounter);
      System.out.printf("You entered %d odd numbers%n", oddCounter);
      System.out.printf("The sum is: %d%n", sum);
   }
}