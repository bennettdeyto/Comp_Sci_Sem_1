import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static String divThree(int a, int b){
		int product = a * b;
		if(product%3 == 0){
			return "Your product is divisible by 3.";
		}
		else{
		return "Your product is not divisible by 3.";
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first value: ");
		int a = sc.nextInt();
		System.out.print("Input second value: ");
		int b = sc.nextInt();
		String answer = divThree(a,b);
		System.out.println(answer);
	}
}
