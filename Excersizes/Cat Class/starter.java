import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class cat {
	public String name = new String();
	
	public cat(){
		name = "Garfield";
	}
	
	public cat(String a){
		name = a;
	}
	
	public void meow(){
		System.out.println(name + ": meow");
		return;	
	}
	
}
class starter{
	public static void main(String args[]) {
		cat one = new cat();
		one.meow();
		cat two = new cat("Mo");
		two.meow();
		
	}
}