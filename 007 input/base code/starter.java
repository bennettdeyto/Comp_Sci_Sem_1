import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your First Name?");
		String q1 = sc.nextLine();
		System.out.println("What is your age?");
		int q2 = sc.nextInt();
		System.out.println("What is your birthday month?(1-12)");
		int q3 = sc.nextInt();
		System.out.println("What is your birthday day?");
		int q4 = sc.nextInt();
		System.out.println("What is your birthday year?");
		int q5 = sc.nextInt();
		System.out.println("What is half of five?");
		Double q6 = sc.nextDouble();
		System.out.println("Your name is " +q1+ " and you were born on "+q3 +"/"+q4+"/"+q5+".");
		System.out.println("You are " +q2+" years old!");
		System.out.println("Half of five is "+ q6+".");
	}
}
