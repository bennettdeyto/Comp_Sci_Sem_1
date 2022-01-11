package pkg;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;



public class SubClass extends BaseClass {
	public SubClass() {
		
	}
	Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//random
		public int rand(int a){
			int randomnum = super.random(a);
			// System.out.println("Out of " + a + " numbers: your random number is " +randomnum);
			return randomnum;
		}
		//abs
		public int abs(int a){
			int absvalue = super.abs(a);
			System.out.println("|" + a + "| = " + absvalue);
			return absvalue;
		}
		//minimum - array
		public int minarray(ArrayList<Integer> a){
			int min = super.minarray(a);
			// System.out.println("From your array: " + a);
			return min;
		}
		//maximum - array
		public int maxarray(ArrayList<Integer> a){
			int max = super.maxarray(a);
			return max;
		}
		//max
		public int max(int a, int b){
			int max = super.max(a,b);
			int min = super.min(a,b);
			System.out.println("The max is " + max + ", this is " + (max-min) +" more than the other inputed value.");
			return max;
		}
		//min
		public int min(int a, int b){
			int min = super.min(a,b);
			int max = super.max(a,b);
			System.out.println("The minimum is " + min + ", this is " + (max-min) +" less than the other inputed value.");
			return min;
		}
		//power
		public int pow(int a, int b){
			int pow = super.pow(a,b);
			// System.out.println(a + " to the power of " + b + " is " + pow);
			return pow;
		}
		//avg
		public int avg(ArrayList<Integer> a){
			int avg = super.avg(a);
			return avg;
		}
		//sqrt
		public int sqrt(int a){
			int sqrt = super.sqrt(a);
			return sqrt;
		}
		
			

		
		
}
