import java.util.Scanner;

public class Lab8a {
    public static void main(String[] args) {
        System.out.println("Please enter your age, I will convert it to dog years: ");
        Scanner kb = new Scanner(System.in);
        int userInput = kb.nextInt();
        System.out.println("You are " + dogYears(userInput) + " years old, in dog years");
    }
    
    public static int dogYears(int age) {
        return age * 7;
    }
}