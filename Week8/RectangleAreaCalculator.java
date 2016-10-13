import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleAreaCalculator extends JFrame {

    private JLabel lengthL, widthL, areaL, perimeterL;
    private JTextField lengthTF, widthTF, areaTF, perimeterTF;
    private JButton calculateB, exitB;
    
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
    
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    
    public RectangleAreaCalculator() {
    
        
        
        lengthL = new JLabel("Enter the length: ", SwingConstants.LEFT);
        widthL = new JLabel("Enter the width: ", SwingConstants.LEFT);
        areaL = new JLabel("Area: ", SwingConstants.LEFT);
        perimeterL = new JLabel("Perimeter: ", SwingConstants.LEFT);
        
        lengthTF = new JTextField(10);
        widthTF = new JTextField(10);
        areaTF = new JTextField(10);
        perimeterTF = new JTextField(10);
        
        calculateB = new JButton("Calculate");
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
        
        exitB  = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        setTitle("Rectangle Calculator");
        
        Container pane = getContentPane();
        
        pane.setLayout(new GridLayout(5,2));
        
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
        
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private class CalculateButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double width, length, area, perimeter;
            
            length = Double.parseDouble(lengthTF.getText());
            width = Double.parseDouble(widthTF.getText());
            area = length * width;
            perimeter = 2 * (length + width);
            
            areaTF.setText("" + area);
            perimeterTF.setText("" + perimeter);
        }
    }
    
    private class ExitButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        RectangleAreaCalculator rectProg = new RectangleAreaCalculator();
    }
}