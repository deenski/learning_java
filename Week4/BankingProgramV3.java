//Jakob Vendegna
//CSC 160 401
//9-22-16

// this program works sort of like a behind the scenes of a bank
// it will take input as to the account number, account type,
// minimum balance, and current balance. Depending on the input 
// there are various outputs, such as if your current balance has 
// fallen below the minimum balance, this will affect output.

import java.util.*;

public class BankingProgramV3
{
   public static void main(String[] args)
   {  
      //initialize CONSTANTS and variables
      final String DISPLAYMESSAGE = "Please enter your account number (int), account type (char), minimum balance, and current balance: ";
      
      final double SAVINGSINTREST = 0.04;
      final double CHECKINGSERVICEFEE = 25;
      final double SAVINGSSERVICEFEE = 10;
      
      String outputString;
      
      double minimumBalance, currentBalance, checkingIntrestRate, accountIntrest;
      
      int accountNumber;
      
      char accountType;
      
      boolean belowMin = false;
     
      // added this line because it was popping an "perhaps this variable has not been
      // initialized" error while compiling. Moved the first instance of the variable
      // outside of the switch below, and now all is well in the world.
      checkingIntrestRate = 0;
      
      // setup the Scanner variable
      Scanner accountInfo = new Scanner(System.in);
      
      //start getting info
      System.out.println(DISPLAYMESSAGE);
      accountNumber = accountInfo.nextInt();
      accountType = accountInfo.next().charAt(0);
      // set that account type to lower case, so we don't have to test for CAPS
      accountType = Character.toLowerCase(accountType);
      
      minimumBalance = accountInfo.nextDouble();
      currentBalance = accountInfo.nextDouble();
      
      // This switch will divide responses based on account type, and then
      // do all the math associated with the possible type, so that our 
      // output can match the inputs properly.
      switch (accountType)
      {
         case 'c':
            // check if current balance is below minimum balance
            if (minimumBalance > currentBalance)
            {
               currentBalance = currentBalance - CHECKINGSERVICEFEE;
               // this little devil is used later when deciding which form of output to use
               belowMin = true;
            
            }
            else
            {
               // decide which intrest rate is appropriate
               if ((minimumBalance + 5000) > currentBalance)
               {
                  checkingIntrestRate = 0.03;
                  currentBalance = currentBalance + (currentBalance * checkingIntrestRate);
               }
               else
               {
                  checkingIntrestRate = 0.05;
                  currentBalance = currentBalance + (currentBalance * checkingIntrestRate);
               }          
            }
            break;
            
         case 's':
            // again, checking that the current balance exceeds the minimum and
            // doing the math to make sure all outputs are correct.
            if (minimumBalance > currentBalance)
            {
               currentBalance = currentBalance - SAVINGSSERVICEFEE;
               belowMin = true;
            }
            else
            {
               currentBalance = currentBalance + (currentBalance * SAVINGSINTREST);
            }
         break;
         
         default:
            // if account type is not 's' or 'c', do this:
            System.out.println("Invalid Account Type!");
         
      }
      
      // this is where I built out our output statements
      
      // if it's a checking account and the current balance is less than the minimum balance
      if (accountType == 'c' && belowMin == true)
      {
         outputString = String.format("Account Number: %d%n", accountNumber)
                        + String.format("Account Type: %c%n", accountType)
                        + String.format("Your current balance has fallen below the necessary minimum balance of $%.0f%n",
                                        minimumBalance) 
                        + String.format("You have been charged a $%.2f service fee.%n",
                                        CHECKINGSERVICEFEE)
                        + String.format("Current Balance: $%.2f%n", currentBalance);
                        
         System.out.print(outputString);
                                     
      }
      // if it's a checking account but the current balance exceeds the minimum balance
      else if (accountType == 'c' && belowMin == false)
      {
         outputString = String.format("Account Number: %d%n", accountNumber)
                        + String.format("Account Type: %c%n", accountType)
                        + String.format("You have earned %.2f interest on your account.%n", checkingIntrestRate)
                        + String.format("Current Balance: $%.2f%n", currentBalance);
                        
         System.out.print(outputString);

      }
      // you get the idea...
      else if (accountType == 's' && belowMin == true)
      {
         outputString = String.format("Account Number: %d%n", accountNumber)
                        + String.format("Account Type: %c%n", accountType)
                        + String.format("Your current balance has fallen below the necessary minimum balance of $%.0f%n",
                                        minimumBalance) 
                        + String.format("You have been charged a $%.2f service fee.%n",
                                        SAVINGSSERVICEFEE)
                        + String.format("Current Balance: $%.2f%n", currentBalance);
                        
         System.out.print(outputString);
      }
      // I really wish I could have found a better way to output these cases. 
      // I am sure I could have included these in the switch above, but
      // I felt it would have cluttered up the place... IDK which way is better.
      else if (accountType == 's' && belowMin == false)
      {
         outputString = String.format("Account Number: %d%n", accountNumber)
                        + String.format("Account Type: %c%n", accountType)
                        + String.format("You have earned %.2f interest on your account.%n", SAVINGSINTREST)
                        + String.format("Current Balance: $%.2f%n", currentBalance);
                        
         System.out.print(outputString);
      }
     // that's it, that's all
   }           
}
