package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using ""
		int number = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(number);
	// 4. Get the user to enter something that they think is awesome
		String answer = JOptionPane.showInputDialog("Type something you think is awesome!");
		// 5. If the random number is 0
		if (number == 0) {
			System.out.println( answer +  " is awesome :-)");
		}
	// -- tell the user whatever they entered is awesome!
	// 6. If the random number is 1
		if (number == 1) {
			System.out.println(answer + " is ok :-I");
		}
	// -- tell the user whatever they entered is ok.
	// 7. If the random number is 2
		if (number == 2) {
		System.out.println( answer + " is boring :-(");
		}
	// -- tell the user whatever they entered is boring.
	// 8. If the random number is 3
		if (number == 3) {
		System.out.println("Get a life, kid :-()");
		}
	// -- write your own answer
	}
}


