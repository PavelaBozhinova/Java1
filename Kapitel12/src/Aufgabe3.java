import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		
		System.out.println("Tankkapazit�t:");
		int kapazit�t = scan.nextInt();
		
		System.out.println("Benzinanzeige:");
		int benzinA = scan.nextInt();
		
		System.out.println("Meilen pro Gallone:");
		int mpg = scan.nextInt();
		
		int Benzin = (kapazit�t*benzinA)/100;
		
		if (Benzin < mpg)
			System.out.println("Tanken!");
		else 
			System.out.println("Weiterfahren.");
	}

}
