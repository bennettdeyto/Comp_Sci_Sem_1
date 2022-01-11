package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
	public String role = new String();

	public myCharacter() {
		role = "No Role";
	}
	public myCharacter(String a) {
		if(a.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			role = "Rogue";
		}
		else if(a.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
			role = "Wizard";
		}
		else if(a.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
			role = "Warrior";
		}
		else{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
		
		
	}
	public void myToString(){
		System.out.println("Your role is " + role + "\nYour strength trait is 0 \nYour dexterity trait is 0 \nYour intelligence trait is 0 \nYour constitution trait is 0 \nYour charisma trait is 0");
	}

}

