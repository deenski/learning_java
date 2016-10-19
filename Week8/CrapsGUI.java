import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CrapsGUI extends JFrame {
        
    private JLabel dice1L, dice2L, sumL, pointL, statusL;
    private JTextField dice1TF, dice2TF, sumTF, pointTF, statusTF;
    private JButton rollB, exitB;
    
    private RollButtonHandler rbHandler;
    private ExitButtonHandler ebHandler;
    
    private boolean firstRoll = true;
    private boolean gameOver = false;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    
    public CrapsGUI() {
        
        dice1L = new JLabel("Dice 1: ");
        dice2L = new JLabel("Dice 2: ");
        sumL = new JLabel("Sum: ");
        pointL = new JLabel("Point: ");
        statusL = new JLabel("Status: ");
        
        dice1TF = new JTextField(10);
        dice2TF = new JTextField(10);
        sumTF = new JTextField(10);
        pointTF = new JTextField(10);
        statusTF = new JTextField(10);
        
        exitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        rollB = new JButton("Roll");
        rbHandler = new RollButtonHandler();
        rollB.addActionListener(rbHandler);
        
        setTitle("Craps by Jakob Vendegna");
        
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
            int dice1, dice2, sum, point, winLose;
            sum = 0;
          
           
            
//             while (gameOver == false) {
                if (firstRoll == true) {
                
                    dice1 = (int) Math.floor(Math.random() * 6) + 1;
                    dice2 = (int) Math.floor(Math.random() * 6) + 1;
                    sum = dice1 + dice2;
                    
                    dice1TF.setText("" + dice1);
                    dice2TF.setText("" + dice2);
                    sumTF.setText("" + sum);
                        
                    //uncomment next line to view dice info
                    //System.out.printf("dice1 = %d, dice2 = %d, sum = %d", dice1, dice2, sum);
                        
                    //if statement to control the logic of the game
                    if (sum == 2 || sum == 3 || sum == 12){
                        //crap out
                        statusTF.setText("You Crapped Out!");
                        //gameOver = true;
                        String playOn = JOptionPane.showInputDialog("Would you like to play again? y/n: ");
                        
//                         switch (playOn.charAt(0)) {
//                             case "n":
//                             case "N":
//                                 System.exit(0);
//                             default:
//                                 firstRoll = true;
//                         }
                        //break;
                    }
                    else if (sum == 7 || sum == 11) {
                        //you win
                        statusTF.setText("You Win!");  
                        //gameOver = true;
                        String playOn = JOptionPane.showInputDialog("Would you like to play again?");
                        
//                         switch (playOn.charAt(0)) {
//                             case "n":
//                             case "N":
//                                 System.exit(0);
//                             default:
//                                 firstRoll = true;
//                         }
                        //break;
                    }
                    else {
                        //keep rolling
                        firstRoll = false;
                        
                    }
                }
                else {
                    // print the outcome of each roll

                    statusTF.setText("You rolled a " + sum);
                    point = sum ;
                    pointTF.setText("" + point);
                    sum = 0;
                    // fix System.out.printf("Your point is now %d. Good Luck!%n", point);
                    
                    // keep rolling till you hit your point or crap out.
                    
                       
                        dice1 = (int) Math.floor(Math.random() * 6) + 1;
                        dice2 = (int) Math.floor(Math.random() * 6) + 1;
                        sum = dice1 + dice2;
                        
                        dice1TF.setText("" + dice1);
                        dice2TF.setText("" + dice2);
                        sumTF.setText("" + sum);
                          
                        //print the outcome of each roll
                        if (sum == point) {
                             //you win
                             statusTF.setText("You Win!");
                             gameOver = true;
//                             break;
                        }
                        else if (sum > point || sum == 7) {
                             //you crapped out
                             statusTF.setText("Crapped Out!");
                             gameOver = true;
//                             break;
                        }
                        else {
                             //keep rolling
                             statusTF.setText("Rolling Again");
                        }
                                                
                        
                }
            //}
        }
    }
    
    public static void main(String[] args) {
        CrapsGUI crapsProgram = new CrapsGUI();
    }
}
