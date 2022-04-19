

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		
	
	String answer = JOptionPane.showInputDialog("How old are you?");
	int a = Integer.parseInt(answer); 
	int b = 2022 - a;
	
	if (a > 30) {
		System.out.println("You are too old to play this game!");
		System.out.print("You were born in " + b);
	}
	else {
		System.exit(0);
	}


}

}