import java.util.*;
import java.io.*;

public class Chapter3Work_2
{
   public static void main(String[] args)throws FileNotFoundException
   {
      System.out.println("Gathering input...");
      Scanner inFile = new Scanner(new FileReader("input.txt"));
      
      double length = inFile.nextDouble();
      double width = inFile.nextDouble();
      
      double area = length * width;
      String result = String.format("The area of your rectangle is %.2f", area);
      
      PrintWriter outfile = new PrintWriter("outfile.txt");
      outfile.println("Area = " +  area);
      outfile.println("Good job Jake");
      inFile.close();
      outfile.close();
      
      //JOptionPane.showMessageDialog(null, result, "Rectangle Area", JOptionPane.INFORMATION_MESSAGE());
      
      
      
      
      
   }
}