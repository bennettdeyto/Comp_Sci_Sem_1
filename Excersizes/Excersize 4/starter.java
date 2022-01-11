import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int x = sc.nextInt();
		for(int i = 0; i < 5; i++){
			System.out.println(x + i);
	}
}
}
