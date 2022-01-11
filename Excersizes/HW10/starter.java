import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] x = new int[20];
	
		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers");
		
		for(int i = 0; i < x.length; i++){
			x[i] = rand.nextInt(10) + 1;
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		int target = rand.nextInt(10) + 1;
		System.out.println("The random number to look for is " + target);
	
		int dup = 0;
		for(int i = 0; i < x.length; i++){
			if(x[i] == target){
				System.out.println("Duplicate found at index " + x[i]);
				dup = dup + 1;
			}
		}
		System.out.println("Total number of duplicates for " + target + " is " + dup);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row:");
	
		for(int i = 1; i < x.length; i++){
			if(x[i] == x[i - 1]){
				System.out.println("Two in a row found at indexes " + (i - 1) + " and " + i + ". The number is " + x[i]);
			}
		}
		
		
		
		
		
	}
}
