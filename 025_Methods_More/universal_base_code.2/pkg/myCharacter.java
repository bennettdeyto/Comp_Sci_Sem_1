package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	Scanner sc = new Scanner(System.in);
	
	public String role = new String();
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	
	public int setStrength(int a){
		strength = a;
		return strength;
	}
	public int setDexterity(int a){
		dexterity = a;
		return dexterity;
	}
	public int setIntelligence(int a){
		intelligence = a;
		return intelligence;
	}
	public int setConstitution(int a){
		constitution = a;
		return constitution;
	}
	public int setCharisma(int a){
		charisma = a;
		return charisma;
	}
	
	public myCharacter() {
		role = "No Role";
		strength = 0;
		
	}
	public void setRole(String a){
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
		
	
	public myCharacter(String a) {
		setRole(a);
		
		
	}
	public void myToString(){
		System.out.println("Your role is " + role + "\nYour strength trait is " + strength + "\nYour dexterity trait is " + dexterity + "\nYour intelligence trait is " + intelligence + "\nYour constitution trait is " + constitution + "\nYour charisma trait is " + charisma);
	}
	public boolean setAll(String a, int strength, int dexterity, int intelligence, int constitution, int charisma){
		setRole(a);
		setStrength(strength);
		setDexterity(dexterity);
		setIntelligence(intelligence);
		setConstitution(constitution);
		setCharisma(charisma);
		if(a.equals("Warrior")||a.equals("Wizard")||a.equals("Rogue")){
			return true;
		}
		else{
			return false;
		}
		
	}

}

