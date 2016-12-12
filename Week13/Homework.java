import java.util.*;

public class HomeworkV2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
                
        try {
            System.out.println("Birthday Converter");
            System.out.println("Please enter the month" +
                               " you were born during(1-12)");
            int month = kb.nextInt();
            System.out.println("please enter the day of " +
                               "the month you were born during");
            int day = kb.nextInt();
            System.out.println("please enter the year " +
                               "during which you were born");
            int year = kb.nextInt();
            
            if (day < 0 || year < 1900 || year > 2016) {
                throw new InvalidDateException();
            }
            
            String output =(monthString() + " " + day + 
                            ", " + year);

            
            System.out.println(output);
        }
        catch(InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public String monthString(int month) {
    
        String monthString;
        
        switch(month) {
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
                case(12):
                    monthString = "December";
                    break;
                default:
                    throw new InvalidDateException();
                    
                return monthString;

    }
}