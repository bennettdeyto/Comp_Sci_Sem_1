import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter test = new myCharacter();
		test.myToString();
		System.out.println("-------------------------------------");
	
		System.out.println("What class would you like to be?");
		
		String input = sc.nextLine();
		myCharacter assign = new myCharacter(input);
		assign.myToString();
		
	}
}
