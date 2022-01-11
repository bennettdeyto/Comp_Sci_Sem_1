package pkg;
import java.util.Scanner;
import java.util.Random;

public class slotMachine {
	public slotMachine() {
		
	}
	
	public static void play(){
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int money = 100;
		
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println(" ");
		while(true){
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
			String answer = sc.nextLine();
			if(answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
				System.out.println(money);
				break;	
			}
			if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
				int wager;
				while(true){
					System.out.print("You have $100. How much would you like to wager? ");
					wager = sc.nextInt();
					String m = sc.nextLine();
					if(wager <= money){
						System.out.println(" ");
						break;
					}
					else{
						System.out.println("You only have $" + money + "! Please enter a smaller number : ");
					}
				}
				System.out.println(" ");
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are:");
				System.out.println("_______________________");
				int val1 = rand.nextInt(10) + 1;
				int val2 = rand.nextInt(10) + 1;
				int val3 = rand.nextInt(10) + 1;
				System.out.println(" | " + val1 + " | " + val2 + " | " + val3 + " |");
				System.out.println("_______________________");
				if(val1 == val2 && val2 == val3){
					wager = wager * 3;
					if(wager < money){
						money = money + wager;
					}
					else{
						money = wager;
					}
					System.out.println("You won! You're wager has now been tripled!");
					System.out.println("You now have $" + money);
					System.out.println(" ");
					System.out.println("--------------------------------------------------");
				}
				else if(val1 == val2 || val2 == val3 || val1 == val3){
					wager = wager * 2;
					if(wager < money){
						money = money + wager;
					}
					else{
						money = wager;
					}
					System.out.println("You won! You're wager has now been doubled!");
					System.out.println("You now have $" + money);
					System.out.println(" ");
					System.out.println("--------------------------------------------------");
				}
				else{
					money = money - wager;
					System.out.println("Didn't win this time, better luck next time!");
					System.out.println("You now have $" + money);
					System.out.println(" ");
					System.out.println("--------------------------------------------------");

					if(money == 0){
						System.out.println(" ");
						System.out.println("You've run out of money! Thanks for coming! Come back soon!");
						break;
					}
				}
			}
			
		}
		
		
		
		
	}
}
