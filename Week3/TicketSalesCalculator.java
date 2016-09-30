//Jakob Vendegna
//CSC 160 401
//3rd Program Assignment: Ticket Sales Calculator

//This program will take input from a file and output the total ticket sales for a game

// import the scanner, io options, and the JOptionPane dialogue box
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

// define our class
public class TicketSalesCalculator
{
   // declare the main function
   public static void main(String[] args)
                           //throws an exception if the file we are reading from does not exist
                           throws FileNotFoundException 
   {
      //initialize and define our file Scanner so it can read from TicketSalesData.txt
      Scanner fileReader = new Scanner(new FileReader("TicketSalesData.txt"));
      
      //initialize our variables for use
      double boxTickets, sidelineTickets, premiumTickets, gaTickets;
      double boxTicketPrice, sidelineTicketPrice, premiumTicketPrice, gaTicketPrice;
      double totalBox, totalSideline, totalPremium, totalGA, grandTotal, totalTicketsSold;
      String outputString,dollarSign;
      
      //get the information from TicketSalesData.txt one item at a time, then save that item in
      //an independent variable
      boxTicketPrice = fileReader.nextDouble();
      boxTickets = fileReader.nextDouble();
      sidelineTicketPrice = fileReader.nextDouble();
      sidelineTickets = fileReader.nextDouble();
      premiumTicketPrice = fileReader.nextDouble();
      premiumTickets = fileReader.nextDouble();
      gaTicketPrice = fileReader.nextDouble();
      gaTickets = fileReader.nextDouble();
      
      //do the math to get the totals generated from each type of ticket sale
      totalBox = boxTicketPrice * boxTickets;
      totalSideline = sidelineTicketPrice * sidelineTickets;
      totalPremium = premiumTicketPrice * premiumTickets;
      totalGA = gaTicketPrice * gaTickets;
      
      //find the sum of money taken in from ticket sales
      grandTotal = totalBox + totalSideline + totalPremium + totalGA;
      
      //find the total amount of tickets sold
      totalTicketsSold = boxTickets + sidelineTickets + premiumTickets + gaTickets;
      
      //close TicketSalesData.txt
      fileReader.close();
      
      //declare dollarSign variable, 
      // this is my solution for aligning the dollar sign to the right as well as the total
      dollarSign = "$";
      
      //declare our outputString variable so it may be used in a JOptionPane Message Dialog box
      outputString = String.format("%.0f Box Tickets Sold at %29s%.2f%n", 
                                    boxTickets, dollarSign, boxTicketPrice)
                     + String.format("%.0f Sideline Tickets Sold at %19s%.2f%n",
                                     sidelineTickets, dollarSign, sidelineTicketPrice)
                     + String.format("%.0f Premium Tickets Sold at %19s%.2f%n",
                                     premiumTickets, dollarSign, premiumTicketPrice)
                     + String.format("%.0f General Admission Tickets Sold at $%.2f%n",
                                     gaTickets, gaTicketPrice)
                     + String.format("=======================================%n")
                     + String.format("%.0f Total Tickets Sold for %13s%.2f",
                                     totalTicketsSold, dollarSign, grandTotal); 
      
      //show the contents of the variable outputString in a JOptionPane Message Dialog box
      JOptionPane.showMessageDialog(null, outputString , "Ticket Calculations",
                                    JOptionPane.INFORMATION_MESSAGE);
                                    
      //make sure system resources are freed up for future use when the Dialog box closes                    
      System.exit(0);
      
      
   }

}