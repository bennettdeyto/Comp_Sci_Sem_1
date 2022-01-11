import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Dwarf[] d = new Dwarf[100];
		
		for(int i = 0; i < d.length; i++){
			int random = rand.nextInt(7);
			d[i] = new Dwarf();
			d[i].setAge(rand.nextInt(100) + 1);
			if(random == 0){
				d[i].setName("Grumpy");
			}
			if(random == 1){
				d[i].setName("Dopey");
			}
			if(random == 2){
				d[i].setName("Doc");
			}
			if(random == 3){
				d[i].setName("Happy");
			}
			if(random == 4){
				d[i].setName("Bashful");
			}
			if(random == 5){
				d[i].setName("Sneezy");
			}
			if(random == 6){
				d[i].setName("Sleepy");
			}
		}
		for(int i = 0; i < d.length; i++){
			System.out.println(d[i].getName() + ": age - " + d[i].getAge());
		}
		
	}
}
