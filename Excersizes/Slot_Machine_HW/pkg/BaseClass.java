package pkg;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class BaseClass {
	public BaseClass() {
		
	}
	Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//random
		public int random(int parameter){
			int randomnum = rand.nextInt(parameter);
			return randomnum;
		}
		//abs
		public int abs(int parameter){
			int absvalue = parameter;
			if(parameter < 0){
				absvalue = absvalue * -1;
			}
			return absvalue;
		}
	
		//minarray
		public int minarray(ArrayList<Integer> array){
			int min = 10000;
			for(int i = 0; i < array.size(); i++){
			if(array.get(i) < min){
				min = array.get(i);
			}
		}
			return min;
		}
		//maxarray
		public int maxarray(ArrayList<Integer> array){
			int max = 0;
			for(int i = 0; i < array.size(); i++){
			if(array.get(i) > max){
				max = array.get(i);
			}
		}
			return max;
		}
		//max
		public int max(int parametera, int parameterb){
			if(parametera > parameterb){
				return parametera;
			}
			if(parameterb > parametera){
				return parameterb;
			}
			return parametera;
		}
		
		//min
		public int min(int parametera, int parameterb){
			if(parametera > parameterb){
				return parameterb;
			}
			if(parameterb > parametera){
				return parametera;
			}
			return parametera;
		}
		
		//pow
		//(base,exponent)
		public int pow(int parametera, int parameterb){
			int count = 1;
			int pointer = parametera;
			while(count != parameterb){
				pointer = pointer * parametera;
				count++;
				// System.out.println(pointer);
				// System.out.println(count);
			}
			int result = pointer;
			return result;
		}
		public int sqrt(int parametera){
			if(parametera>=0){
			int half = parametera/2;
			while(half*half>parametera + 0.0000000001 || half*half<-0.0000000001){
				half = (parametera/half+half)/2;
			}
			return half;
			}
			System.out.println("Sqaure rooted number must not be negative.");
			return parametera;
		}
		public int avg(ArrayList<Integer> parameters){
			int sum = 0;
			for(int i = 0; i < parameters.size(); i++){
				sum = sum + parameters.get(i);
			}
			sum = sum/parameters.size();
			return sum;
			
				
		}
		
		
		
		//sqrt
		
		
		//avg
		
		
		//random
}
