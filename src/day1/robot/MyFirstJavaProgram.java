package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot bobby = new Robot();
bobby.penDown();
bobby.setRandomPenColor();
bobby.setSpeed(10);
for (int i = 0; i < 33; i++) {
bobby.setRandomPenColor();
bobby.hide();
bobby.turn(45);
bobby.move(100);
bobby.turn(-40);
bobby.move(100);
bobby.turn(-45);
bobby.turn(-90);
bobby.move(200);

}



	}
}
