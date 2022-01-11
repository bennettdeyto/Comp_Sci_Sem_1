import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] ar = new int[10];
		for(int i = 0; i < ar.length; i++){
			ar[i] = 9 - i;
			System.out.println(ar[i]);
		}

		
	}
}
