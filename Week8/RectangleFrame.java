import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleFrame extends JFrame {
    private JLabel lengthL, widthL, areaL, perimeterL;
    private JTextField lengthTF, widthTF, areaTF, perimeterTF;
    private JButton calculateB, exitB;
    
    //private CalculateButtonHandler cbHandler;
    //private ExitButtonHandlser ebHandler;
    
    private Icon lengthIcon = new ImageIcon("ruler.png");
    private Icon areaIcon = new ImageIcon("area.png");
    private Icon widthIcon = new ImageIcon("widthRuler.png");
    private Icon perimeterIcon = new ImageIcon("perimeter.jpg");
    
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    
    public RectangleFrame() {
        setTitle("Area and Perimeter of a Rectangle");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Get content pane to add elements to.
        Container pane = getContentPane();
        //set the grid layout
        pane.setLayout(new GridLayout(5,2));

        
        //add JLabel info
        lengthL = new JLabel("Enter the length: ", lengthIcon , SwingConstants.LEFT);
        widthL = new JLabel("Enter the width: ", widthIcon, SwingConstants.LEFT);
        areaL = new JLabel("Area: ", areaIcon, SwingConstants.LEFT);
        perimeterL = new JLabel("Perimeter: ", perimeterIcon, SwingConstants.LEFT);
        
        //add JTextField info
        lengthTF = new JTextField(10);
        widthTF = new JTextField(10);
        areaTF = new JTextField(10);
        areaTF.setEditable(false);
        perimeterTF = new JTextField(10);
        perimeterTF.setEditable(false);
        
        calculateB = new JButton("Calculate");
        calculateB.addActionListener(new CalculateButtonHandler());
        
        exitB  = new JButton("Exit");
        exitB.addActionListener(new ExitButtonHandler());
        
        
        pane.add(lengthL);
        pane.add(lengthTF);
        pane.add(widthL);
        pane.add(widthTF);
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(perimeterL);
        pane.add(perimeterTF);
        pane.add(calculateB);
        pane.add(exitB);

        setVisible(true);
    }
    
    private class CalculateButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            double width, length, area, perimeter;
            
            length = Double.parseDouble(lengthTF.getText());
            width = Double.parseDouble(widthTF.getText());
            area = length * width;
            perimeter = 2 * (length + width);
            
            areaTF.setText(String.format("%.2f",area));
            //areaTF.setText("" + area);
            perimeterTF.setText("" + perimeter);
        }
    }
    
    private class ExitButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        RectangleFrame myRect = new RectangleFrame();
    }
}