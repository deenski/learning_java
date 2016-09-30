//Jakob Vendegna
//CSC 121 104

import java.util.*;

public class BankingProgram
{
   public static void main(String[] args)
   {  
      //initialize CONSTANTS and variables
      final double SAVINGSINTREST = 0.04;
      final String DISPLAYMESSAGE = "Please enter your account number (int), account type (char), minimum balance, and current balance: ";
      
      char accountType;
      double variableIntrestRate, accountNumber, minimumBalance, currentBalance;
      
      Scanner accountInfo = new Scanner(System.in);
      
      System.out.println(DISPLAYMESSAGE);
      accountNumber = accountInfo.nextDouble();
      accountType = accountInfo.next().charAt(0);
      Character.toLowerCase(accountType);
      
         
       switch (accountType)
       {
         case 'c':
            break;
         case 's':
            break;
         default:
            System.out.println("Invalid account type!");
       }

      minimumBalance = accountInfo.nextDouble();
      currentBalance = accountInfo.nextDouble();
      
      
      if (minimumBalance < currentBalance)
      {
      
      }
      
      
     // if account
      
   }
}