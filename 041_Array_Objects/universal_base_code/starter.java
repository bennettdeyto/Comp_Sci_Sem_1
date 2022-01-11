import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard[] wiz = new Wizard[100];
		Warrior[] war = new Warrior[100];
		
		for(int i = 0; i < wiz.length; i++){
			wiz[i] = new Wizard();
			war[i] = new Warrior();
		}
		
		int z = 0;
		int r = 0;
		
		while(z <= 99 && r <= 99){
			while(!wiz[z].isDead() || !war[r].isDead()){
				wiz[z].attack(war[r]);
				war[r].attack(wiz[z]);
				
				if(wiz[z].isDead()){
					z = z + 1;
					if(z == 100){
						break;
					}
				}
				if(war[r].isDead()){
					r = r + 1;
					if(r == 100){
						break;
					}
				}
			}
		}
		if(r < z){
			System.out.println("Warriors won with " + (100 - r) + " left in their army.");
		}
		else{
			System.out.println("Wizards won with " + (100 - z) + " left in their army.");
		}
		
		
		
		
		

		
	}
}
