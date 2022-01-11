import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class Dog{
	public String name = new String();
	public int age;
	public String breed = new String();
	
	//CONSTRUCTORS
	public Dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
		
	}
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	public Dog(String a, int c){
		name = a;
		age = c;
		breed = "dog dog";
	}
	
	//METHODS
	public void setName(String a){
		name = a;
	}
	public void setBreed(String a){
		breed = a;
	}
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		Random rand = new Random();
		if(rand.nextInt(2) == 0){
			return true;
		}
		return false;
	}
	public void bark(){
		System.out.println(name + ": bark!");
		return;
	}
	
	
}
class starter{
	public static void main(String args[]) {
		Dog Fido =  new Dog("Fido");
		Fido.setAge(6);
		Dog Dash = new Dog("Dash", "Golden Retriever");
		if(Fido.isSleeping()){
			Fido.bark();
			Dash.bark();
		}
		else{
			System.out.println(Fido.getName() + " is asleep.");
		}
		
		
	}
}