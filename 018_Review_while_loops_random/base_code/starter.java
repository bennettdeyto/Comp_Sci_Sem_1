import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int specialnum = rand.nextInt(1000) + 1;
		System.out.println(specialnum);
		System.out.println("Guess a number 1-1000: ");
		
		while(true){
			int guess = sc.nextInt();
			if(guess == specialnum){
				
				break;
				
			}
			else {
				System.out.println("You are wrong.");
				System.out.println("Try again: ");
			}
		}
		System.out.println("You guessed it right! The random number is " +specialnum + "!");

		
	}
}
