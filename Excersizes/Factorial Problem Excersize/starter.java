import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static int fact(int a){
		int x = a;
		int y = x;
		int i = 1;
		while(i < y){
			x = x * i;
			i++;
		}
		return y;

	}
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value to get the factorial: ");
	int x = sc.nextInt();
	int answer = fact(x);
	System.out.println(answer);
	}
}
