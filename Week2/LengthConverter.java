//Created by Jakob Vendegna for CSC 160 401
import java.util.*;

public class LengthConverter 
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      System.out.println("Welcome to my length converter");
      System.out.println("Enter the number of feet: ");
      int feet = console.nextInt();
      
      System.out.println("Enter the number of inches: ");
      int inches = console.nextInt();
      
      System.out.println("You've entered " + feet + " feet and " + inches + " inches");
      
      int totalInches = (12 * feet) + inches;
      double centimeters = totalInches * 2.54;
      
      System.out.println(feet + " feet and " + inches + " inches is " + centimeters + " centimeters");
   
   }
   
}
