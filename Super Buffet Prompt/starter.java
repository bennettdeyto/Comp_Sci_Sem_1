import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList


class starter {
	
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		SubClass mud = new SubClass();
		Random rdm = new Random();
		int result = mud.abs(-9);
		System.out.println(result);
		
		int rand = mud.rand(1000);
		System.out.println(rand);
		
		int max = mud.max(5,12);
		System.out.println(max);
		
		int min = mud.min(5,12);
		System.out.println(min);
		
		int pow = mud.pow(4,6);
		System.out.println(pow);
		
		int sqrt = mud.sqrt(5);
		System.out.println(sqrt);
		
		// ArrayList<Integer> monkey = new ArrayList<Integer>();
		// for(int i = 0; i < 1000; i++){
		// 	monkey.add(rdm.nextInt(1000));
		// }
		// System.out.println(monkey.get(1));
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		ArrayList<Integer> powints = new ArrayList<Integer>();
		ArrayList<Integer> sqrtints = new ArrayList<Integer>();
		// int[] powints = new int[1000];
		// int[] sqrtints = new int[1000];
		ArrayList<Integer> randints = new ArrayList<Integer>();
		// int[] randints = new int[1000];
		// int i = 0;
		for(int i = 0; i < 1000; i++){
			randints.add(test.random(1000));
			powints.add(test.pow(randints.get(i),2));
			sqrtints.add(mud.sqrt(randints.get(i)));
		}
		// for(i = 0; i < randints.length; i++){
		// 	randints[i] = test.random(1000);
		// 	powints[i] = test.pow(randints[i],2);
		// 	sqrtints[i] = test.sqrt(randints[i]);
		// }
		System.out.println(randints.get(72));
		System.out.println(powints.get(72));
		System.out.println(sqrtints.get(72));
		
		
		int avgrandints = mud.avg(randints);
		System.out.println(avgrandints);
		int maxpowints = mud.maxarray(powints);
		System.out.println(maxpowints);
		int minpowints = mud.minarray(powints);
		System.out.println(minpowints);
		
		
		

		
	}
}
