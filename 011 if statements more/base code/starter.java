import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input value x: ");
		int x = sc.nextInt();
		System.out.println("Insput value y: ");
		int y = sc.nextInt();
		
		boolean t = (x != y);
		
		if(t)
		{
			System.out.println("x does not equal y!");
		}
	}
}
