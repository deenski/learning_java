//Jakob Vendegna
//crapshoot

import java.util.Scanner;
public class craps
{
   public static void main(String[] args)
   {
      int dice1, dice2, sum, point;
      boolean gameover = false;
      Scanner kb = new Scanner(System.in);
      char playOn = 'y';
      
      while (gameover == false)
      {
         System.out.println("Welcome to Craps");
         dice1 = (int) Math.floor(Math.random() * 6) + 1;
         dice2 = (int) Math.floor(Math.random() * 6) + 1;
         sum = dice1 + dice2;
         //System.out.printf("dice1 = %d, dice2 = %d, sum = %d", dice1, dice2, sum);
         if (sum == 2 || sum == 3 || sum == 12)
         {
            System.out.printf("You rolled a %d%n",sum);
            System.out.printf("CRAPS! You lose.%nWould you like to play again? (y/n): ");
            playOn = kb.next().charAt(0);
            playOn =  Character.toLowerCase(playOn);
            switch (playOn)
            {
               case 'y':
                  gameover = false;
                  break;
               default:
                  gameover = true;
            }
         }
         else if (sum == 7 || sum == 11)
         {
            System.out.printf("You rolled a %d! You Win!%nWould you like to play again? (y/n): ", sum);
            playOn = kb.next().charAt(0);
            playOn = Character.toLowerCase(playOn);
            switch (playOn)
            {
               case 'y':
                  gameover = false;
                  break;
               default:
                  gameover = true;
            }         
         }
         else
         {
            System.out.printf("You rolled a %d%n", sum);
            point = sum;
            sum = 0;
            System.out.printf("Your point is now %d. Good Luck!%n", point);
            while (sum != point || sum < point)
            {
               dice1 = (int) Math.floor(Math.random() * 6) + 1;
               dice2 = (int) Math.floor(Math.random() * 6) + 1;
               sum = dice1 + dice2;
               if (sum == point)
               {
                  System.out.printf("You rolled a %d! You win!%n", sum);
                  break;
               }
               else if (sum > point)
               {
                  System.out.printf("You rolled a %d! Craped out!%n", sum);
                  break;
               }
               else
               {
                  System.out.printf("You rolled a %d. Your point is %d. Rolling again.%n", sum, point);
               }
                                    
            }
            
            System.out.println("Would you like to play again? (y/n):");
            playOn = kb.next().charAt(0);
            playOn = Character.toLowerCase(playOn);
            switch (playOn)
            {
               case 'y':
                  gameover = false;
                  break;
               default:
                  gameover = true;
            }
         }

      }
   }
}