//Jakob Vendegna
//crapshoot

import java.util.Scanner;
public class craps_v3
{
   public static void main(String[] args)
   {  
      //initialize variables
      int dice1, dice2, sum, point, chickenDinner;
      boolean gameover = false;
      Scanner kb = new Scanner(System.in);
      char playOn = 'y';

      
      while (gameover == false)
      {
         System.out.println("Welcome to Craps");
         dice1 = (int) Math.floor(Math.random() * 6) + 1;
         dice2 = (int) Math.floor(Math.random() * 6) + 1;
         sum = dice1 + dice2;
         //uncomment next line to view dice info
         //System.out.printf("dice1 = %d, dice2 = %d, sum = %d", dice1, dice2, sum);
         
         //if statement to control the logic of the game
         if (sum == 2 || sum == 3 || sum == 12)
         {
            //crap out
            chickenDinner = 0;
         }
         else if (sum == 7 || sum == 11)
         {
            //you win
            chickenDinner = 1;   
         }
         else
         {
            //keep on rolling rolling rolling, rawhide!
            chickenDinner = 2;
         }

         // print the outcome of each roll and ask to continue the game or not
         if (chickenDinner == 0)
         {
            //craped out
            System.out.printf("You rolled a %d%n",sum);
            System.out.printf("CRAPS! You lose.%nWould you like to play again? (y/n): ");
            playOn = kb.next().charAt(0);
            playOn = Character.toLowerCase(playOn);
         }
         else if (chickenDinner == 1)
         {
            //you win!
            System.out.printf("You rolled a %d! You Win!%nWould you like to play again? (y/n): ", sum);
            playOn = kb.next().charAt(0);
            playOn = Character.toLowerCase(playOn);
         }
         else
         {  
            //keep rolling
            System.out.printf("You rolled a %d%n", sum);
            point = sum;
            sum = 0;
            System.out.printf("Your point is now %d. Good Luck!%n", point);
            
            // keep rolling till you hit your point or crap out.
            while (sum != point || sum < point || sum != 7)
            {
               dice1 = (int) Math.floor(Math.random() * 6) + 1;
               dice2 = (int) Math.floor(Math.random() * 6) + 1;
               sum = dice1 + dice2;
               //print the outcome of each roll
               if (sum == point)
               {  
                  //you win
                  System.out.printf("You rolled a %d! You win!%n", sum);
                  break;
               }
               else if (sum > point || sum == 7)
               {
                  //you crapped out
                  System.out.printf("You rolled a %d! Craped out!%n", sum);
                  break;
               }
               else
               {
                  //keep rolling
                  System.out.printf("You rolled a %d. Your point is %d. Rolling again.%n", sum, point);
               }
                                     
            }
             
             System.out.println("Would you like to play again? (y/n):");
             playOn = kb.next().charAt(0);
             playOn = Character.toLowerCase(playOn);
         } //close else
         
         //kill the main while loop based on user input to stop the game
         switch (playOn)
         {
           //keep playing if user types a 'y', not case sensitive.
           case 'y':
              gameover = false;
              break;
           //kill the game if they enter anything else.
           default:
              //be kind, because kindness is key.
              System.out.println("Thanks for playing!");
              gameover = true;
         }

      }
   }
}