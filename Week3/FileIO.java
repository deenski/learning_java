//Jakob Vendegna
//CSC 160 401
//____ Program Assignment
import java.util.*;
import java.io.*;

public class FileIO
{

	public static void main(String[] args)
                           throws FileNotFoundException
	{
	   Scanner inFile = new Scanner(new FileReader("employeedata.txt"));
      String firstName;
      String lastName;
      double hoursWorked, payRate, wages;
      
      firstName = inFile.next();
      lastName = inFile.next();
      
      hoursWorked = inFile.nextDouble();
      payRate = inFile.nextDouble();
      
      wages = hoursWorked * payRate;
      
      inFile.close();
      
      PrintWriter outFile = new PrintWriter("output.txt");
      outFile.println(firstName + "'s wages are: " + wages);
      outFile.close();
	}

}