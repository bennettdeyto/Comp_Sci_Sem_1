import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String choice = sc.nextLine();
		if(choice.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(choice.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(choice.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		
		System.out.println("");
		
		int points = 25;
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		
		System.out.print("Strength (1-10): ");
		int Strength = sc.nextInt();
		if(Strength > points){
			System.out.print("Please input a smaller value. Strength (1-10): ");
			Strength = sc.nextInt();
		}
		points = points - Strength;
		System.out.println("You have " + points + " left to spend.");
		System.out.println("");
		
		System.out.print("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		if(Dexterity > points){
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			Dexterity = sc.nextInt();
		}
		points = points - Dexterity;
		System.out.println("You have " + points + " left to spend.");
		System.out.println("");
		
		System.out.print("Intelligence (1-10): ");
		int Intelligence = sc.nextInt();
		if(Intelligence > points){
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			Intelligence = sc.nextInt();
		}
		points = points - Intelligence;
		System.out.println("You have " + points + " left to spend.");
		System.out.println("");
		
		System.out.print("Constituion (1-10): ");
		int Constituion = sc.nextInt();
		if(Constituion > points){
			System.out.print("Please input a smaller value. Constituion (1-10): ");
			Constituion = sc.nextInt();
		}
		points = points - Constituion;
		System.out.println("You have " + points + " left to spend.");
		System.out.println("");
		
		System.out.print("Charisma (1-10): ");
		int Charisma = sc.nextInt();
		if(Charisma > points){
			System.out.print("Please input a smaller value. Charisma (1-10): ");
			Charisma = sc.nextInt();
		}
		points = points - Charisma;
		System.out.println("You have " + points + " left to spend.");
		
		if(points > 0){
			System.out.println("You have " +points + " leftover points.");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------------");
		
		
		
		
		
		System.out.println("You are " + name + ", " + title + " of CVHS.");
		System.out.println("You're a " + choice + " with the following stats!");
		System.out.println("Strenth - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Constituion - " + Constituion);
		System.out.println("Charisma - " + Charisma);
		
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + ".");
	}
}
