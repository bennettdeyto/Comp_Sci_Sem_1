import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void main(String args[]) {
	
		String[] turkey = new String[7];
		turkey[0] = "	       n n";
		turkey[1] = "          _   n| | |  n";
		turkey[2] = "	< o)_|_| | |//";
		turkey[3] = "	  \\\\   \\| |/";
		turkey[4] = "	   \\___|__/";
		turkey[5] = "	      ||";
		turkey[6] = "	      ##";
		
		for(int i = 0; i < turkey.length; i++){
			System.out.println(turkey[i]);
		}
		System.out.println("HAPPY THANKSGIVING");
		
	}
}
