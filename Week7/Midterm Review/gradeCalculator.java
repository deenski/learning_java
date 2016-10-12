//Jakob Vendegna
/*
This is the midterm grade calculator
this program will take input from a teacher
seperating male and female grade point averages
and then display an average GPA for the males
and females seperately.
*/
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        //declaring variables
        final char SENTINNEL = 'q';
        char gender = 'a';
        double getGPA = 0;
        double maleAverage = 0;
        double femaleAverage = 0;
        int maleCounter = 1;
        int femaleCounter = 1;
        // I'm a little tired this evening, so I am using the following FirstRun variables
        // to keep track of whether or not the teacher has entered a grade for the males
        // or females yet. This is getting me out of a counter variable headache, and avoids dividing by zero.
        boolean maleFirstRun = true;
        boolean femaleFirstRun = true;
        // create a new scanner object to get input with
        Scanner kb = new Scanner(System.in);

        //while user enters anything but 'q' in the gender field:
        while (gender != SENTINNEL) {
            System.out.println("Please enter the student type: m for male, f for female, or q to quit.");
            // get input from the user, and only store the first letter.
            gender = kb.next().charAt(0);
            // convert that letter to lower case, so we don't have to test for all cases.
            gender = Character.toLowerCase(gender);
            
            if (gender == 'm'){
                System.out.println("Please enter this male's GPA: ");
                // implementing a counter to keep track of how many male grades are entered
                // but making sure not to divide by zero
                if (maleFirstRun == true) {
                    // the first time a teacher enters a male grade, I do not want to 
                    // add one to the counter, instead flip the switch and move on.
                    maleFirstRun = false;
                }
                else {
                    // after the first gpa is entered, increment the counter by one.
                    maleCounter++;
                }
                // get the GPA of the male
                getGPA = kb.nextDouble();
                // add the gpa to the maleAverage variable for later use to find the average of
                // all male grades entered
                maleAverage += getGPA;
            }
            else if (gender == 'f') {
                System.out.println("Please enter this female's GPA: ");
                // counter to keep track of how many female grades are entered
                
                if (femaleFirstRun == true) {
                    // same goes here as for the males, if it's the first time entering
                    // a female grade, skip incrementing the coutner.
                    femaleFirstRun = false;
                }
                else {
                    // after the first female gpa is entered, increment the counter by one for each
                    // additional average entered.
                    femaleCounter++;
                }
                
                // get the GPA of the female
                getGPA = kb.nextDouble();
                // add the average to the femaleAverage variable for later use to find the average
                // of all female grades entered
                femaleAverage += getGPA;
            }
            else if (gender == 'q') {
                // I added this so that it wouldn't ask for a valid student type when the user
                // trys to quit.
                continue;
            }
            else {
                // if the user entered any character or string that begins with any letter other than m, f, or q.
                System.out.println("Please enter a valid student type");
            }
            
        }
        if (gender == 'q') {
            // when the user prompts the program to quit, compute the averages using our 
            // male and female average variables, which up to this point only held the 
            // sum of the GPA numbers entered.
            maleAverage /= maleCounter;
            femaleAverage /= femaleCounter;
            // initialize and declare the outputString variable, used for proper
            // output formatting.
            String outputString = String.format("The average GPA of all male students is %.2f%n", maleAverage)
                                + String.format("The average GPA of all female students is %.2f%n", femaleAverage);
            // print the averages
            System.out.println(outputString);

        }
    }
}