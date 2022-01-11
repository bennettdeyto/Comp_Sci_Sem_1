import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String a = sc.nextLine();
		for(int i = 0; i < a.length(); i++){
			System.out.println(i + " " + a.substring(i, i + 1));
		}
		

		
	}
}
