//Jakob Vendegna
//CSC 121 104

import java.util.*;

public class BankingProgramV2
{
   public static void main(String[] args)
   {  
      //initialize CONSTANTS and variables
      final String DISPLAYMESSAGE = "Please enter your account number (int), account type (char), minimum balance, and current balance: ";
      
      final double SAVINGSINTREST = 0.04;
      final double CHECKINGSERVICEFEE = 25;
      final double SAVINGSSERVICEFEE = 10;
      double minimumBalance, currentBalance, checkingIntrestRate, serviceCharge;
      
      int accountNumber;
      
      char accountType;
      
      boolean  checking = false;
      boolean savings = true;
      boolean applyFee = false;
      
      checkingIntrestRate = 0;
      
      //
      Scanner accountInfo = new Scanner(System.in);
      
      System.out.println(DISPLAYMESSAGE);
      accountNumber = accountInfo.nextInt();
      accountType = accountInfo.next().charAt(0);
      accountType = Character.toLowerCase(accountType);
      minimumBalance = accountInfo.nextDouble();
      currentBalance = accountInfo.nextDouble();
      //System.out.printf("Account Number: %0d", accountNumber);
      
      //   
      switch (accountType)
      {
         case 'c':
            checking = true;
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account type: " + accountType);
            

            if ((minimumBalance + 5000) > currentBalance)
            {
               checkingIntrestRate = 0.03;
               System.out.printf("You have earned $%.2f intrest on your account%n", (currentBalance * checkingIntrestRate));
               currentBalance = currentBalance + (currentBalance * checkingIntrestRate);
            
            }
            else
            {
               checkingIntrestRate = 0.05;
               System.out.printf("You have earned $%.2f intrest on your account%n", (currentBalance * checkingIntrestRate));
               currentBalance = currentBalance + (currentBalance * checkingIntrestRate);
            }
 
            break;
            
         case 's':
            savings = true;
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account type: " + accountType);
            System.out.printf("You have earned $%.2f intrest on your account%n", (currentBalance * SAVINGSINTREST));
            currentBalance = currentBalance + (currentBalance * SAVINGSINTREST);


            break;
            
         default:
            System.out.println("Invalid account type!");
            
       }
       
       if (minimumBalance > currentBalance)
       {         
         if (accountType == 'c')
         {
            System.out.printf("Your account balance has fallen below the $%.0f minimum balance %n", minimumBalance);
            System.out.printf("You have been charged a $%.2f Service Fee %n", CHECKINGSERVICEFEE);
            currentBalance = (currentBalance - CHECKINGSERVICEFEE);
            System.out.printf("Your current balance is $%.2f%n", currentBalance);
         
         }
         else
         {
            System.out.printf("Your account balance has fallen below the $%.0f minimum balance %n", minimumBalance);
            System.out.printf("You have been charged a $%.2f Service Fee %n", SAVINGSSERVICEFEE);
            currentBalance = (currentBalance - SAVINGSSERVICEFEE);
            System.out.printf("Your current balance is $%.2f%n", currentBalance);
         }
       }
       
       
    
       
   }
}