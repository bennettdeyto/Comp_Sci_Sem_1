import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public void toStringArray(int []a){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		return;
	}
	public int getArrayAverage(int []a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum = sum + a[i];
		}
		int avg = sum/a.length;
		return avg;
	}
	public int getArrayMax(int []a){
		int max = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
