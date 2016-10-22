import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CrapsGUIV3 extends JFrame {
        
    private JLabel nullText, listenerL, dice1L, dice2L, dice1L2, dice2L2, sumL, pointL, statusL;
    private JTextField dice1TF, dice2TF, sumTF, pointTF, statusTF;
    private JButton rollB, exitB;
    
    private boolean firstRoll = true;
    private int point = 0;
    private int sum = 0;

    
    private RollButtonHandler rbHandler;
    private ExitButtonHandler ebHandler;
    
    private static final int WIDTH = 400;
    private static final int HEIGHT = 500;
    
    private ImageIcon diceIcon1 = new ImageIcon("dice1.jpg");
    private ImageIcon diceIcon2 = new ImageIcon("dice2.jpg");
    private ImageIcon diceIcon3 = new ImageIcon("dice3.jpg");
    private ImageIcon diceIcon4 = new ImageIcon("dice4.jpg");
    private ImageIcon diceIcon5 = new ImageIcon("dice5.jpg");
    private ImageIcon diceIcon6 = new ImageIcon("dice6.jpg");

    
    public CrapsGUIV3() {
        
        nullText = new JLabel("");
        dice1L = new JLabel("Dice 1: ");
        dice2L = new JLabel("Dice 2: ");
        sumL = new JLabel("Sum: ");
        pointL = new JLabel("Point: ");
        statusL = new JLabel("Status: ");
        
        dice1L2 = new JLabel("", SwingConstants.RIGHT);
        dice2L2 = new JLabel();
        listenerL = new JLabel();
        
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
        
        setTitle("Craps3.1 by Jakob Vendegna");
        
        Container pane = getContentPane();
        
        pane.setLayout(new GridLayout(7,2));
        
        pane.add(dice1L);
        pane.add(dice1L2);        
        pane.add(dice2L);
        pane.add(dice2L2);
        pane.add(sumL);
        pane.add(sumTF);
        pane.add(pointL);
        pane.add(pointTF);
        pane.add(statusL);
        pane.add(statusTF);
        pane.add(listenerL);
        pane.add(nullText);
        pane.add(exitB);
        pane.add(rollB);
        
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private class RollButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int dice1, dice2;
            

                if (firstRoll == true) {
                    
                    listenerL.setText("First Roll = true");
                    listenerL.revalidate();
                    listenerL.repaint();
                    
                    pointTF.setText("");                    
                    
                    dice1 = (int) Math.floor(Math.random() * 6) + 1;
                    dice2 = (int) Math.floor(Math.random() * 6) + 1;
                    sum = dice1 + dice2;
                    
                    switch (dice1) {
                        case 2: 
                            dice1L2.setIcon(diceIcon2);
                            break;
                        case 3:
                            dice1L2.setIcon(diceIcon3);
                            break;
                        case 4:
                            dice1L2.setIcon(diceIcon4);
                            break;
                        case 5:
                            dice1L2.setIcon(diceIcon5);
                            break;
                        case 6:
                            dice1L2.setIcon(diceIcon6);
                            break;
                        default:
                            dice1L2.setIcon(diceIcon1);
                    }
                    
                    dice1L2.revalidate();
                    dice1L2.repaint();

                    
                    switch (dice2) {
                        case 2: 
                            dice2L2.setIcon(diceIcon2);
                            break;
                        case 3:
                            dice2L2.setIcon(diceIcon3);
                            break;
                        case 4:
                            dice2L2.setIcon(diceIcon4);
                            break;
                        case 5:
                            dice2L2.setIcon(diceIcon5);
                            break;
                        case 6:
                            dice2L2.setIcon(diceIcon6);
                            break;
                        default:
                            dice2L2.setIcon(diceIcon1);
                    }

                    dice2L2.revalidate();
                    dice2L2.repaint();
                    
                    sumTF.setText("" + sum);
                    
                    if (sum == 2 || sum == 3 || sum == 12){
                        statusTF.setText("You Crapped Out!");
                        pointTF.setText("");
                    }
                    
                    else if (sum == 7 || sum == 11) { 
                        statusTF.setText("You Win!");
                        pointTF.setText("");
                    }
                    
                    else {
                        firstRoll = false;
                        point = sum ;
                        System.out.println(point);
                        statusTF.setText("Your point is " + point);
                        pointTF.setText("" + point);
                    
                    }
                }
                
                if (firstRoll == false) {
                    listenerL.setText("First Roll = false");
                    listenerL.revalidate();
                    listenerL.repaint();
                    
                    dice1 = (int) Math.floor(Math.random() * 6) + 1;
                    dice2 = (int) Math.floor(Math.random() * 6) + 1;
                    sum = dice1 + dice2;
                    
                    switch (dice1) {
                        case 2: 
                            dice1L2.setIcon(diceIcon2);
                            break;
                        case 3:
                            dice1L2.setIcon(diceIcon3);
                            break;
                        case 4:
                            dice1L2.setIcon(diceIcon4);
                            break;
                        case 5:
                            dice1L2.setIcon(diceIcon5);
                            break;
                        case 6:
                            dice1L2.setIcon(diceIcon6);
                            break;
                        default:
                            dice1L2.setIcon(diceIcon1);
                    }
                    
                    dice1L2.revalidate();
                    dice1L2.repaint();
                    
                    switch (dice2) {
                        case 2: 
                            dice2L2.setIcon(diceIcon2);
                            break;
                        case 3:
                            dice2L2.setIcon(diceIcon3);
                            break;
                        case 4:
                            dice2L2.setIcon(diceIcon4);
                            break;
                        case 5:
                            dice2L2.setIcon(diceIcon5);
                            break;
                        case 6:
                            dice2L2.setIcon(diceIcon6);
                            break;
                        default:
                            dice2L2.setIcon(diceIcon1);
                    }
                    
                    dice2L2.revalidate();
                    dice2L2.repaint();

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
        
        private class ExitButtonHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        
        public static void main(String[] args) {
            CrapsGUIV3 crapsProgram = new CrapsGUIV3();
    }
}