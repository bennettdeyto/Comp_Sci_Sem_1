import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii one = new Ascii("human");
		one.setName("Daniel");
		one.setNumber(1);
		one.printArt();
		Ascii two = new Ascii("Bennett", "Jhon Whick");
		two.setNumber(1);
		two.printArt();
		Ascii three = new Ascii("dog", "Rufus", 1);
		three.printArt();
		Ascii four = new Ascii();
		four.setName("splrgfs");
		four.setType("other");
		four.setAscii("(╬ಠ益ಠ)");
		four.setNumber(1);
		four.printArt();

		
		
		

		
	}
}
