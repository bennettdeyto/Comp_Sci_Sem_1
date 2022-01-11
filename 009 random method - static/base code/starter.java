import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand1 = rand.nextInt(10);
		// System.out.println(rand1);
		int rand2 = rand.nextInt(100) + 1;
		double rand3 = rand.nextDouble() + 2.5;
		double rand4 = rand.nextDouble() * 575 + 14;
		
		System.out.println("A random number between 0 and 9 is " +rand1);
		System.out.println("A random number between 1 and 100 is " +rand2);
		System.out.println("A random number between 2.5 and 3.5 is " +rand3);
		System.out.println("A random numver between 14 abd 589 is " +rand4);
	}
}
