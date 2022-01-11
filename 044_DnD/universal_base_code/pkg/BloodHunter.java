package pkg;
import java.util.Scanner;
import java.util.Random;


public class BloodHunter {
	Random rand = new Random();
	public String name;
	public int health;
	public int attack;

	public BloodHunter() {
		name = "Morbius";
		health = rand.nextInt(15) + 1;
		attack = rand.nextInt(15) + 1;
	}
	public BloodHunter(String name, int health, int attack){
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	public void setHealth(int a){
		health = a;
	}
	public int getHealth(){
		return health;
	}
	public String getName(){
		return name;
	}
	public void attack(Warrior a){
		int dmg = rand.nextInt(1, attack);
		a.setHealth(a.getHealth() - dmg);
	}
	public void attack(Wizard a){
		int dmg = rand.nextInt(1, attack);
		a.setHealth(a.getHealth() - dmg);
	}

}
//SEVENTYSEVEN  3IGHTY3IGHT