import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name and last name with a space in the middle.");
		String name = sc.nextLine();
		
		
		String lastName = name.substring(name.indexOf(" ") + 1);
		
		System.out.println("The last name is " + lastName);

		
	}
}
