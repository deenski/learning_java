//Jakob Vendgna CSC 160 401

import java.util.Scanner;

public class Lab2b
{
   public static void main(String[] args)
   {
      //Prompt the user for the age
      //Output age in dog years
      Scanner console = new Scanner(System.in);
      final double DOG_YEARS = 7;
      
      System.out.println("Please enter your age: ");
      int age = console.nextInt();
      double ageInDogYears = age * DOG_YEARS;
      
      System.out.println("Your age in dog years is: " + ageInDogYears);
      
   }
}