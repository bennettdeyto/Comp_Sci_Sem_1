import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter test = new myCharacter();
		System.out.println("Your role is " + test.role + "\nYour strength trait is 0 \nYour dexterity trait is 0 \nYour intelligence trait is 0 \nYour constitution trait is 0 \nYour charisma trait is 0");
		System.out.println("-------------------------------------");
	
		System.out.println("What class would you like to be?");
		
		String input = sc.nextLine();
		myCharacter assign = new myCharacter(input);
		System.out.println("Your role is " + assign.role + "\nYour strength trait is 0 \nYour dexterity trait is 0 \nYour intelligence trait is 0 \nYour constitution trait is 0 \nYour charisma trait is 0");

		
	}
}
