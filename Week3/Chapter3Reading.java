//Jakob Vendegna
//CSC 160 401
//Chapter 3 Reading and coding
//Used to test concepts found in the book for a better understanding
	// of their functionality

//no need to import Math from java.lang
import javax.swing.JOptionPane;

public class Chapter3Reading
{

	public static void main(String[] args)
	{
		String u_string, v_string;
      double u_double, v_double, power;
		u_string = JOptionPane.showInputDialog("Enter your root number and press OK");
      u_double = Double.parseDouble(u_string);
		v_string = JOptionPane.showInputDialog("Enter your exponent and press OK");
      v_double = Double.parseDouble(v_string);
      
      power = Math.pow(u_double, v_double);
      
      String name = JOptionPane.showInputDialog("Enter your name and press OK");
		String message1 = "Thanks, " + name + "\n if u = " + u_double + " and v = " + v_double + "\n";
		String message2 = "Then u to the power of v is: " + power;
      
      JOptionPane.showMessageDialog(null, message1 + message2, "Work",
                                    JOptionPane.INFORMATION_MESSAGE);
                                    
      
      System.exit(0);
      

	}

}