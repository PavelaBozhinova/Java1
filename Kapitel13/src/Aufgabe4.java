import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		 
		System.out.println("Wilkommen zu Yertle's Schatzsuche");
		System.out.println("Geben Sie den Namen der Spielfigur ein: ");
		String name = scan.nextLine();
		
		System.out.println("Stärke eingeben (1-10):");
		int stärke = scan.nextInt();
		
		System.out.println("Gesundheit eingeben (1-10):");
		int gesundheit = scan.nextInt();
		
		System.out.println("Gluck eingeben (1-10):");
		int glück = scan.nextInt();
		
		int gesamt = stärke + gesundheit + glück;
		
		if (gesamt <= 15) {
			System.out.println(name + ", " + "Stärke: " + stärke + ", " + "Gesundheit: " + gesundheit + ", " + "Glück: " + glück);}
		

		if (gesamt > 15) {
			System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben! ");
			System.out.println(name + ", " + " Stärke: 5, " + "Gesundheit: 5, " + "Glück: 5");
		}
	}

}
