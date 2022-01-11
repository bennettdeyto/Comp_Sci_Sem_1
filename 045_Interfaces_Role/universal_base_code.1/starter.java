import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Role[] mon = new Role[3];
		
		mon[0] = new Wizard();
		mon[1] = new Warrior();
		mon[2] = new BloodHunter();
		
		System.out.println("This is " + mon[0].getName());
		System.out.println("This is " + mon[1].getName());
		System.out.println("This is " + mon[2].getName());
	
		
		
		

		
	}
}
