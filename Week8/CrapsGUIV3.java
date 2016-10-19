import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CrapsGUIV3 extends JFrame {
        
    private JLabel dice1L, dice2L, sumL, pointL, statusL;
    private JTextField dice1TF, dice2TF, sumTF, pointTF, statusTF;
    private JButton rollB, exitB;
    
    private RollButtonHandler rbHandler;
    private ExitButtonHandler ebHandler;
    
    private boolean firstRoll = true;
    private int point = 0;
    private int sum = 0;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    
    public CrapsGUIV3() {
        
        dice1L = new JLabel("Dice 1: ");
        dice2L = new JLabel("Dice 2: ");
        sumL = new JLabel("Sum: ");
        pointL = new JLabel("Point: ");
        statusL = new JLabel("Status: ");
        
        dice1TF = new JTextField(10);
            dice1TF.setEditable(false);
        dice2TF = new JTextField(10);
            dice2TF.setEditable(false);
        sumTF = new JTextField(10);
            sumTF.setEditable(false);
        pointTF = new JTextField(10);
            pointTF.setEditable(false);
        statusTF = new JTextField(10);
            statusTF.setEditable(false);
        
        exitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        rollB = new JButton("Roll");
        rbHandler = new RollButtonHandler();
        rollB.addActionListener(rbHandler);
        
        setTitle("Craps3 by Jakob Vendegna");
        
        Container pane = getContentPane();
        
        pane.setLayout(new GridLayout(6,2));
        
        pane.add(dice1L);
        pane.add(dice1TF);
        pane.add(dice2L);
        pane.add(dice2TF);
        pane.add(sumL);
        pane.add(sumTF);
        pane.add(pointL);
        pane.add(pointTF);
        pane.add(statusL);
        pane.add(statusTF);
        pane.add(exitB);
        pane.add(rollB);
        
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private class ExitButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    private class RollButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int dice1, dice2;
                if (firstRoll == true) {
                
                    dice1 = (int) Math.floor(Math.random() * 6) + 1;
                    dice2 = (int) Math.floor(Math.random() * 6) + 1;
                    sum = dice1 + dice2;
                    
                    dice1TF.setText("" + dice1);
                    dice2TF.setText("" + dice2);
                    sumTF.setText("" + sum);
                    
                    if (sum == 2 || sum == 3 || sum == 12){
                        statusTF.setText("You Crapped Out!");
                    }
                    
                    else if (sum == 7 || sum == 11) { 
                        statusTF.setText("You Win!");
                    }
                    
                    else {
                        firstRoll = false;
                        statusTF.setText("You rolled a " + sum);
                        point = sum ;
                        pointTF.setText("" + point);
                    
                    }
                }
                
                if (firstRoll == false) {
                    dice1 = (int) Math.floor(Math.random() * 6) + 1;
                    dice2 = (int) Math.floor(Math.random() * 6) + 1;
                    sum = dice1 + dice2;
                    
                    dice1TF.setText("" + dice1);
                    dice2TF.setText("" + dice2);
                    sumTF.setText("" + sum);
                    
                    if (sum == point) {
                         //you win
                         statusTF.setText("You Win!");
                         firstRoll = true;
//                       
                    }
                    else if (sum == 7) {
                         //you crapped out
                         statusTF.setText("Crapped Out!");
                         firstRoll = true;
                    }
                    else {
                         //keep rolling
                         statusTF.setText("Roll Again");
                    }
                }   
            }
        }
        public static void main(String[] args) {
            CrapsGUIV3 crapsProgram = new CrapsGUIV3();
    }
}