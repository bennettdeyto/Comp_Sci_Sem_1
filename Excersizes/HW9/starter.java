import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	
	int[] randInts = new int[20];
	
	System.out.println("These are the 20 numbers");
	
	for(int i = 0; i < randInts.length; i++){
		randInts[i] = rand.nextInt(50) + 1;
		System.out.print(randInts[i] + " ");
	}
	System.out.println("");
	
	int[] backwardsInts = new int[20];
	
	System.out.println("These are those numbers backwards");
	
	for(int i = 0; i < backwardsInts.length; i++){
		backwardsInts[i] = randInts[19 - i];
		System.out.print(backwardsInts[i] + " ");
	}
	
	
	}
	
	
}
