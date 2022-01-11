import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] ar = new int[1000];
		for(int i = 0; i < ar.length; i++){
			ar[i] = rand.nextInt(1000) + 1;
			System.out.println(ar[i]);
		}

		
	}
}
