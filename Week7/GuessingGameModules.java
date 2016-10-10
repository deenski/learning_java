import java.util.Scanner;
public class GuessingGameModules {
    public static void main(String[] args) {
       
        gameLogic();
        
        
        
                        
    }
    
    public static void getGuess() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input your guess: ");        
        int guess = kb.nextInt();
        
    }
    
    public static void gameLogic() {
    
        boolean guessAgain = true;
        while (guessAgain == true){
        
            int number = (int) Math.floor(Math.random() * 100);
            System.out.println(number);
            System.out.println("Guess a number between 1 and 100");
            int guess = int getGuess();
            
            if (guess == number) {
                System.out.println("You Win, The number was " + number);
                guessAgain = false;
            }
            else if (guess < number){
                System.out.println("Guess again! Try Higher");
                guessAgain = true;
            }
            else {
                System.out.println("Guess again! Try Lower");
                guessAgain = true;
            }
            
            
            if (guessAgain = true) {
                guess = kb.nextInt();
            }
        }
    }
}