//Jakob Vendegna
import java.util.*;

public class HomeworkV2 {
    public static void main(String[] args) {
        //Scanner to get input from user
        Scanner kb = new Scanner(System.in);
        //bool to control while loop
        boolean control = true;
        
        //repeat until control == false
        while(control) {
                
            try {
                System.out.println("Birthday Converter");
                System.out.println("Please enter the month" +
                                   " you were born during(1-12)");
                //get month of birth from user
                int month = kb.nextInt();
                
                System.out.println("please enter the day of " +
                                   "the month you were born during");
                //get day of birth from user
                int day = kb.nextInt();
                
                System.out.println("please enter the year " +
                                   "during which you were born");
                //get year of birth from user
                int year = kb.nextInt();
                
                
                //decide if date is valid or not
                if (month < 0 || month >= 13 || day < 0 ||
                    day > 31 || year > 2016 || year < 1900) {
                   
                    throw new InvalidDateException();
                }
                //if no exception thrown switch the boolean
                control = false;
                
                // build the string for output, calling the monthString function
                // to convert the int entered to its string representation.
                String output =(monthString(month) + " " + day + 
                                ", " + year);
    
                //print the birthday
                System.out.println(output);
            }
            
            //if exception is thrown, catch it here
            catch(InvalidDateException e) {
                //print the error message
                System.out.println(e.getMessage());
            }
        }
    }
    //use this method to convert int input into string representation of
    //the int entered, relative to the months of the year.
    public static String monthString(int m) {
        //create and store an empty string in memory
        String monthString = new String("");
        
        //switch on the int given. 1 = January and so on.
        switch(m) {
            case(1): 
                monthString = "January";
                break;
            case(2): 
                monthString = "Febuary";
                break;
            case(3): 
                monthString = "March";
                break;
            case(4): 
                monthString = "April";
                break;
            case(5): 
                monthString = "May";
                break;
            case(6): 
                monthString = "June";
                break;
            case(7): 
                monthString = "July";
                break;
            case(8): 
                monthString = "August";
                break;
            case(9): 
                monthString = "September";
                break;
            case(10): 
                monthString = "October";
                break;
            case(11): 
                monthString = "November";
                break;
            default:
                monthString = "December";            
            }
        //return the string representation of the month entered
        return monthString;
    }   
}
