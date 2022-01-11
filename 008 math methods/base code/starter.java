import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input value x:");
		double numx = sc.nextDouble();
		System.out.println("Input value y:");
		double numy = sc.nextDouble();
		
		System.out.println("The max value is " + Math.max(numx, numy));
		System.out.println("The square root of y is " + Math.sqrt(numy));
		System.out.println("THe power of x to y is " + Math.pow(numx, numy));
		
	}
}
