import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] ar = new int[rand.nextInt(150) + 51];
		int min = 100;
		int max = 0;
		int sum = 0;
		for(int i = 0; i < ar.length; i++){
			ar[i] = rand.nextInt(100) + 1;
			if(ar[i] < min){
				min = ar[i];
			}
			if(ar[i] > max){
				max = ar[i];
			}
			sum = sum + ar[i];
		}
		System.out.println("The amount of elements: " + ar.length);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + sum/ar.length);

		
	}
}
