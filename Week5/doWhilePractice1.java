//******************************************
// Author: Jakob Vendegna
// This program is a short quiz with the option
// to continue answering until the correct answer
// is supplied.
//******************************************
import java.util.Scanner;

public class doWhilePractice1 {

	public static void main(String[] args) {
		
		String PLAY_AGAIN = "Again? y to continue.";
		String replay = "y";
		Scanner kb = new Scanner(System.in);
		String answer = "b";
		do {
			System.out.println("True or False?");
			System.out.println("a. True");
			System.out.println("b. False");
			answer = kb.next();
			answer = answer.toLowerCase();

			if (answer.charAt(0) == 'a') {
				System.out.println("Contratulations!"); break;
			}
			else {
				System.out.println(PLAY_AGAIN);
				replay = kb.next();
				replay = replay.toLowerCase();
			}
			
		}
		while (replay.charAt(0) == 'y');
	}
}
