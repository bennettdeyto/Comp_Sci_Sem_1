import pkg.*;
import java.util.Scanner;
import java.util.Random;

//MODE+MEDIAN

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
	public static int getMode(int[] a){
		if(a.length >= 1){
			return -1;
		}
		int repeat = 0;
		int[] x = new int[a.length];
		//goes through every value in array
		for(int i = 0; i < a.length; i++){
			int p = 0;
			//checks every value in array to see how many repeats of a[i]
			while(p < a.length){
				if(a[i] == a[p]){
					repeat++;
				}
				p++;
			}
			x[i] = repeat;
			repeat = 0;
		}
		//index of whatever the most repeating value is
		int mode = 0;
		//compares number of repeats for every index
		for(int i = 0; i < x.length; i++){
			if(x[i] > mode){
				mode = x[i];
			}
		}
		return a[mode];
	}
	public static int getMedian(int[] a){
		if((a.length/2)%2 == 0){
			int middleVal = (a.length/2;
		}
		else{
			int middleVal = (a.length/2) + 1
		}
		int median = a[middleVal];
		
		return median;
	}
	
	
	
}
//HANGMAN

public class Hangman{
	private String guesingWord;
	private int numTries;
	
	public Hangman(){
		guessingWord = generateWord();
		numTries = 5;
	}
	public Hangman(int a){
		guessingWord = generateWord();
		numTries = a;
	}
	public int guessFirst(String a, int sp){
		for(int i = sp; i < guesingWord.length(); i++){
			if(guesingWord.substring(i, i + 1).equals(a)){
				return i + sp;
			}
		}
		return -1;
	}
	public boolean checkWin(boolean[] a){
		int b = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i]){
				b++;
			}
		}
		if(b == a.length){
			return true;
		}
		return false;
	}
	
	
}