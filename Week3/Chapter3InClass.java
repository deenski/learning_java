import javax.swing.JOptionPane;

public class Chapter3InClass
{
   public static void main(String[] args)
   {
      double length, width, area;
      String sLength, sWidth;
      
      sLength = JOptionPane.showInputDialog("Please enter a rectangle length: ");
      sWidth = JOptionPane.showInputDialog("Please enter a rectangle width: ");
      length = Double.parseDouble(sLength);
      width = Double.parseDouble(sWidth);
      
      area = length * width;
      String result = String.format("The area of your rectangle is %.2f", area);
      JOptionPane.showMessageDialog(null, result, "Rectangle Area Calculation", JOptionPane.INFORMATION_MESSAGE);
      
      System.exit(0);
   
   }
}