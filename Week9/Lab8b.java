import java.util.Scanner;

public class Lab8b {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a letter and I will tell you if it is a vowel: ");
        char userInput = kb.next().charAt(0);
        //userInput = userInput.toLowerCase();
        boolean methodOutput = isVowel(userInput);
        
        if (methodOutput) {
            System.out.println("The letter you entered is a vowel");
        }
        else {
            System.out.println("The letter you entered is not a vowel");
        }
    }
    
    public static boolean isVowel(char i) {
        switch(i){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'y': {
            return true;
        }
        default:
            return false;
        }
    }
   
    
}