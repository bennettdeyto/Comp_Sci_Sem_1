import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String s = sc.nextLine();
		//the quick brown fox ran
		//12345678901234567890123
		s = s + " ";
		s = " " + s;
		
		int a = 0;
		String sp = new String();
		
		for(int i = 0; i < s.length(); i ++){
			if(s.substring(i, i + 1).compareTo(" ") == 0){
				sp = s.substring(a, i) + sp;
				a = i;
			}
		}
		
		System.out.println(sp.substring(1));
		
	}
}
