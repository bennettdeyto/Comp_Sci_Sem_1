import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int i = 0;
		while(i < 100){
			System.out.println(i + 1 + " - " + rand.nextInt(100));
			i++;
		}

		
	}
}
