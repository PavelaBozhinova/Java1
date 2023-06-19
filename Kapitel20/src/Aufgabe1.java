import java.util.Random;
import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
	    Random rand = new Random();
	    
	    int versuch=1, zahl=0, random;
	    
	    System.out.println("Ich denke an eine Zahl von 1 bis 10.");
	    System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
	    System.out.println("Raten Sie!");
	    random = rand.nextInt(10);
	    
	    while(versuch<=3) {
	    	
	    	System.out.println("Versuch " + versuch);
	    	zahl = scan.nextInt();
	    	
	    	if (zahl == random) {
	    		
	    		System.out.println("RICHTIG! ");
	    		System.out.println("Die richtige Zahl war " + random);
	    		System.out.println("Sie haben das Spiel gewonnen.");
	    		break;	}
	    						
	    	versuch++;}
	    	
	    if (zahl != random) {
			System.out.println("Falsch");
			System.out.println("Die richtige Zahl war "+ random);
			System.out.println("Sie haben das Spiel verloren.");}
	  
}
}	


