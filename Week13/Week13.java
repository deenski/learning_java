import java.util.*;

public class Week13 {
    public static void main(String[] args) {
        try {
        method1();
        }
        catch(ArithmeticException a) {
            System.out.println("Cannot divide by zero");
            throw a;
        }   
        
        method2();
    }
    public static void method1(){
    
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        
        try {
            int num = number1();
            int den = kb.nextInt();
            System.out.println("You entered " + den);
            int quo = num /den;
            System.out.println(num + " / " + den + " = " + quo);
            

        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input, Please enter an intiger");
            System.out.println(e.getMessage());
        }
        //catch(ArithmeticException a) {
          //  System.out.println("Cannot divide by zero");
          //  System.out.println(a.getMessage());
        //}
        
        finally {
            System.out.println("Thanks for playing!");
        }
    }
    public static int number1(){
        Scanner kb = new Scanner(System.in);
        boolean invalidInput = true;
        while(invalidInput == true) {
            try {
                int num = kb.nextInt();
                System.out.println("You entered " + num);
                invalidInput = false;
                return num;

            }
            catch(InputMismatchException e) {
               System.out.println("Invalid input, please try again");
               int num = 0;
               return num; 
            }
        }
        int num = 0;
        return num;
    }
    public static void method2() {
        Scanner kb = new Scanner(System.in);
        try {
            System.out.println("Please enter an even number");
            int num = kb.nextInt();
            
            if (num % 2 != 0) {
                throw new EvenNumberException("You're a dumbass");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}