import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	
	public static boolean checkPrime(int a){
		int walk = a;
		int i = 2;
		while(i < walk){
			if(walk%i == 0){
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static void printPrime(int a){
		int walk = a;
		int i = 2;
		while(i <= walk){
			if(checkPrime(i)==true){
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = sc.nextInt();
		printPrime(num);
	}
}
