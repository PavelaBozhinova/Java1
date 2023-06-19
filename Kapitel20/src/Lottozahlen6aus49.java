import java.util.Random;
import java.util.Scanner;

public class Lottozahlen6aus49 {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
	    Random rand = new Random();
	    
	    int random1=0, random2=0, random3=0, random4=0, random5=0, random6=0;
	    
	    random1 = rand.nextInt(49);
	    random2 = rand.nextInt(49);
	    random3 = rand.nextInt(49);
	    random4 = rand.nextInt(49);
	    random5 = rand.nextInt(49);
	    random6 = rand.nextInt(49);
	    
	    
	    System.out.println("Die erste Lottozahl lautet: " + random1);
	    
	    if (random2!=random1)
	    System.out.println("Die zweite Lottozahl lautet: " + random2);
	    
	    if (random3!=random1) {
	    	 if (random3!=random2) {
	    System.out.println("Die dritte Lottozahl lautet: " + random3);
	    	 }
	    }
	    
	    if (random4!=random1) {
	    	 if (random4!=random2) {
	    		 if (random4!=random3)
	    			 System.out.println("Die vierte Lottozahl lautet: " + random4);
	    	 }
	    }
	    
	    if (random5!=random1) {
	    	if (random5!=random2) {
	    		if (random5!=random3) {
	    			if (random5!=random4)
	    				System.out.println("Die fünfte Lottozahl lautet: " + random5);
	    		}
	    	}
	    }
	    
	    if (random6!=random1) {
	    	if (random6!=random2) {
	    		if (random6!=random3) {
	    			if (random6!=random4) {
	    				if (random6!=random5)
	    					System.out.println("Die sechste Lottozahl lautet: " + random6);
	    			}
	    		}
	    	}
	    	else 
	    		System.out.println("Die sechste Lottozahl lautet: " + random6 + 1);
	    }
	    
	   
	    

	}
}
