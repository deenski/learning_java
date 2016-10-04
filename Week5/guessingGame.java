import java.util.Scanner;

public class guessingGame{
   public static int MAX_NUMBER = 100;
   
   public static void main(String[] args){
   
      int number = (int) Math.floor(Math.random() * MAX_NUMBER) + 1;
      //System.out.println("Number is " + number); //cheater bar
      Scanner kb = new Scanner(System.in);
      int guess = 0;
      int numGuess = 0;
      
      
         while (guess != number) {
            System.out.printf("Please guess a number between 1 and %d%n", MAX_NUMBER);
            guess = kb.nextInt();
            numGuess++;
            if (guess == number) {
               System.out.printf("You guessed correctly in %d guesses%n", numGuess);
            }
            else {
               System.out.println("Incorrect");
               if (guess < number){
                  System.out.println("Try a larger number");
               }
               else {
                  System.out.println("Try a smaller number");
               }
            
            
            }
         }
      }
   }
   

