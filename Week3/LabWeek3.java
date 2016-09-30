import java.util.*;
import java.io.*;

public class LabWeek3
{
   public static void main(String[] args) throws FileNotFoundException
   {
      double test1, test2, test3, test4, test5;
      String name;
      Scanner infile = new Scanner(new FileReader("Lab3input.txt"));
      
      name = infile.next();
      test1 = infile.nextDouble();
      test2 = infile.nextDouble();
      test3 = infile.nextDouble();
      test4 = infile.nextDouble();
      test5 = infile.nextDouble();
      
      double average	= (test1	+ test2 + test3 +	test4	+ test5)/5.0;
      
      PrintWriter outfile = new PrintWriter("labOutput.txt");
      outfile.print("Thank you " + name + ", the average of your test scores is: ");
      outfile.printf("%.2f", average);
      
      infile.close();
      outfile.close();
      
      System.exit(0);
      
      
      
   }
}