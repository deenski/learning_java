//Created by Jakob Vendegna for CSC 160 401

//import java utilities used in this case to save user input to variables
import java.util.*;

//declare class
public class GradeCalculator
{   
   //declare main function
   public static void main(String[] args)
   {
      //initialize our 5 constant as a double so it may calculate decimal points
      final double FIVE = 5.0;
   
      //initialize new Scanner variable called userInput to get system input
      Scanner userInput = new Scanner(System.in);

      //print welcome message
     	System.out.println("Hello, Welcome to my Grade Calculator");
      
      //prompt user to input their name
   	System.out.println("Please enter your name: ");
      
      //save the user's name in a string variable called userName
      String userName = userInput.next();
      
      //prompt user for their test scores
   	System.out.println(userName	+ ", please enter 5 test scores");
      
      //save each input to a double point variable in case a test score is a decimal value
      double test1	= userInput.nextDouble();
      double test2	= userInput.nextDouble();
   	double test3	= userInput.nextDouble();
   	double test4	= userInput.nextDouble();
   	double test5	= userInput.nextDouble();
      
      //initialize a double called average which holds the equation to compute
      //the average of the test scores
   	double average	= (test1	+ test2 + test3 +	test4	+ test5)/FIVE;
      
      //print the results
      System.out.print("Thank you " + userName + ", the average of your test scores is: ");
      System.out.printf("%.2f", average);
   }
}