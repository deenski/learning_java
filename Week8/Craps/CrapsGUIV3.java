/* Craps GUI by Jakob Vendegna
for CSC 160 - Kathleen Kelley

This program extends JFrame, but is actually a craps game */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CrapsGUIV3 extends JFrame {
    //set private variables 
    private JLabel nullText, listenerL, dice1L, dice2L, dice1L2, dice2L2, sumL, pointL, statusL;
    private JTextField dice1TF, dice2TF, sumTF, pointTF, statusTF;
    private JButton rollB, exitB;
    
    private boolean firstRoll = true;
    private int point = 0;
    private int sum = 0;
    
    private static final int WIDTH = 375;
    private static final int HEIGHT = 500;

    //bring in images for dice
    private ImageIcon diceIcon1 = new ImageIcon("dice1.jpg");
    private ImageIcon diceIcon2 = new ImageIcon("dice2.jpg");
    private ImageIcon diceIcon3 = new ImageIcon("dice3.jpg");
    private ImageIcon diceIcon4 = new ImageIcon("dice4.jpg");
    private ImageIcon diceIcon5 = new ImageIcon("dice5.jpg");
    private ImageIcon diceIcon6 = new ImageIcon("dice6.jpg");

    //start CrapsGUIV3 method
    public CrapsGUIV3() {
        //build JLabels
        nullText = new JLabel(""); // used for debugging
        dice1L = new JLabel("Dice 1: ");
        dice2L = new JLabel("Dice 2: ");
        sumL = new JLabel("Sum: ");
        pointL = new JLabel("Point: ");
        statusL = new JLabel("Status: ");

        //build our dice as JLabels
        dice1L2 = new JLabel("", SwingConstants.RIGHT);
        dice2L2 = new JLabel();
        listenerL = new JLabel(); //used for debugging
        
        //build textfields
        sumTF = new JTextField(10);
        sumTF.setEditable(false);
        sumTF.setBackground(Color.WHITE);
        
        pointTF = new JTextField(10);
        pointTF.setEditable(false);
        pointTF.setBackground(Color.YELLOW);
        
        statusTF = new JTextField(10);
        statusTF.setEditable(false);
        statusTF.setBackground(Color.WHITE);
        
        //build buttons
        exitB = new JButton("Exit");
        exitB.addActionListener(new ExitButtonHandler());
        
        rollB = new JButton("Roll");
        rollB.addActionListener(new RollButtonHandler());
        
        //set the title of the JFrame
        setTitle("Craps3.1 by Jakob Vendegna");
        
        //add a content pane called pane
        Container pane = getContentPane();
        
        //set the layout and background color of the content pane
        pane.setLayout(new GridLayout(6,2));//change 6 to 7 for debugging
        //pane.setBackground(Color.ORANGE);
        
        //add our elements to the content pane
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
        //uncomment for debugging
        //pane.add(listenerL);
        //pane.add(nullText);
        
        pane.add(exitB);
        pane.add(rollB);
        
        //set the size, make the window visible, and set the X button operation
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //Action Listener for the Roll button
    private class RollButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int dice1, dice2;
            
            if (firstRoll == true) {
                //listenerL used for debugging, uncomment below
                //listenerL.setText("First Roll = true");
                //listenerL.revalidate();
                //listenerL.repaint();
                
                //remove number in pointTF
                pointTF.setText("");                    
                
                //roll the dice
                dice1 = (int) Math.floor(Math.random() * 6) + 1;
                dice2 = (int) Math.floor(Math.random() * 6) + 1;
                sum = dice1 + dice2;
                
                //uncomment for testing
                //System.out.println("Sum firstRoll = " + sum);
                
                
               /*Okay, here is where it gets fun, 
               All of the following switches (all switches in this program)
               are used to set the image of the dice which is displayed.
               if dice1 == 2 display diceIcon2 and so on.
               */
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
                //set dice2L2 image
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
                //display the sum
                sumTF.setText("" + sum);
                
                //game logic
                if (sum == 2 || sum == 3 || sum == 12){
                    statusTF.setText("You Crapped Out!");
                    statusTF.setBackground(Color.RED);
                    sumTF.setBackground(Color.RED);
                    pointTF.setText("");
                    
                }
                
                else if (sum == 7 || sum == 11) { 
                    statusTF.setText("You Win!");
                    statusTF.setBackground(Color.GREEN);
                    sumTF.setBackground(Color.GREEN);
                    pointTF.setText("");
                }
                //if you don't win or lose on the first roll
                else {
                    //set firstRoll to false so we follow the 
                    //rules in the else statement below
                    firstRoll = false;
                    point = sum;
                    
                    //uncomment for testing
                    //System.out.println("Sum: " + sum);
                    //System.out.println("Point: " + point);
                    
                    //set the point and status textfields
                    statusTF.setText("Your point is " + point + ", Roll Again");
                    pointTF.setText("" + point);   
                    statusTF.setBackground(Color.WHITE);
                    sumTF.setBackground(Color.WHITE);                 
                }
            }
            
            //if firstRoll == false
            else {
                //uncomment for testing
                //listenerL.setText("First Roll = false");
                
                //roll the dice again
                dice1 = (int) Math.floor(Math.random() * 6) + 1;
                dice2 = (int) Math.floor(Math.random() * 6) + 1;
                sum = dice1 + dice2;
                
                //uncomment for testing
                //System.out.println("Sum not firstRoll = " + sum);
                
                // set images
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
                
                // set sum textfield
                sumTF.setText("" + sum);
                
                //uncomment for testing
                //System.out.println("point: " + point);
                
                //more game logic
                if (sum == point) {
                     //you win
                     statusTF.setText("You Win!");
                     //set firstRoll to true to start the game over
                     firstRoll = true; 
                     statusTF.setBackground(Color.GREEN);                      
                }
                else if (sum == 7) {
                     //you crapped out
                     statusTF.setText("Crapped Out!");
                     //set firstRoll to true to start the game over
                     firstRoll = true;
                     statusTF.setBackground(Color.RED);
                     sumTF.setBackground(Color.RED);
                }
                else {
                     //keep rolling
                     statusTF.setText("Roll Again");
                     
                }
            }   
        }
    }
    //exit button Action Listener
    private class ExitButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //quit the program
            System.exit(0);
        }
    }
    
    //main method
    public static void main(String[] args) {
        //start the game!
        CrapsGUIV3 crapsProgram = new CrapsGUIV3();
    }
}