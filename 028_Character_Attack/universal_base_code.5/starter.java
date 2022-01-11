import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter jack = new myCharacter();
		System.out.println("What class would you like to be?");
		String input = sc.nextLine();
		jack.setRole(input);

		
		System.out.println("_______________________________");
		System.out.println(" ");
	
		jack.myToString();
		
		System.out.println("_______________________________");
		System.out.println(" ");
		
		jack.levelUp();
		
		System.out.println(" ");
		System.out.println("_______________________________");
		System.out.println(" ");
		
		jack.myToString();
		
		System.out.println("_______________________________");
		System.out.println(" ");
		
		jack.setAttackMod();
		jack.takeDamage(2);
		jack.takeDamage(10);
		jack.isDead();
		
	}
}
