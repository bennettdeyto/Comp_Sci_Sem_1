import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.print("What is your name?: ");
	String name = sc.nextLine();
	System.out.print("How many times would you like this to be repeated?: ");
	int times = sc.nextInt();
	int count = 1;
	while(true){
		System.out.println(name);
		if(count >= times){
			break;
		}
		count++;
	}

		
	}
}
