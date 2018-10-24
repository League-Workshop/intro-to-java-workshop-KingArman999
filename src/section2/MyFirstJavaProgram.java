package section2;

import java.awt.Color;
import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot Person = new Robot();
Person.setWindowColor(200, 100, 65);
Person.penDown();
Person.setSpeed(10);
Person.move(100);	 
Person.sparkle();
Person.turn(90);
Person.move(100);
Person.turn(90);
Person.move(100);
Person.turn(90);
Person.move(100);
for (int i = 0; i < 5; i++) {
Person.move(100);
Person.turn(360/5);
}
	
}

	}
