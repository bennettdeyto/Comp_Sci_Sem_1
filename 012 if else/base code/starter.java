import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int specialnum = rand.nextInt(1000) + 1;
		// System.out.println(specialnum);
		System.out.println("Guess a number 1-1000: ");
		int guess = sc.nextInt();
		
		if(guess == specialnum){
			System.out.println("You guessed it right! The random number is " +specialnum);
		}
		else {
			System.out.println("You are wrong.");
			System.out.println("The correct number is " + specialnum);
		}
		
	}
}
