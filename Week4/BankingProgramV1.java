//Jakob Vendegna
//CSC 121 104

import java.util.*;

public class BankingProgramV1
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
      
      //
      Scanner accountInfo = new Scanner(System.in);
      
      System.out.println(DISPLAYMESSAGE);
      accountNumber = accountInfo.nextInt();
      accountType = accountInfo.next().charAt(0);
      accountType = Character.toLowerCase(accountType);
      minimumBalance = accountInfo.nextDouble();
      currentBalance = accountInfo.nextDouble();
      
      
      //   
      switch (accountType)
      {
         case 'c':
            checking = true;
            System.out.println("checking = " + checking);
            

            if ((minimumBalance + 5000) > currentBalance)
            {
               checkingIntrestRate = 0.03;
               System.out.println("intrestRate is " + checkingIntrestRate);
            
            }
            else
            {
               checkingIntrestRate = 0.05;
               System.out.println("intrestRate is " + checkingIntrestRate);
            }
 
            break;
            
         case 's':
            savings = true;
            System.out.println("savings = " + savings);
            System.out.println("SAVINGSINTREST applied");
            minimumBalance = accountInfo.nextDouble();
            currentBalance = accountInfo.nextDouble();

            break;
            
         default:
            System.out.println("Invalid account type!");
            
       }
       
       if (minimumBalance > currentBalance)
       {
         applyFee = true;
         System.out.println("service fee applied");
         
       }
       
       
    
       
   }
}