import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter jack = new myCharacter();
		jack.myToString();
		System.out.println("-------------------------------------");
		System.out.println("What class would you like to be?");
		String input = sc.nextLine();
		jack.setRole(input);
		jack.myToString();
		
	}
}
