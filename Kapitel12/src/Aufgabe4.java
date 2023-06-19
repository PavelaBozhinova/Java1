import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		
		System.out.println("Preis pro Pfund Packung A:");
		double preisA = scan.nextDouble();
		
		System.out.println("Prozent mageres Fleisch Packung A:");
		int prozentA = scan.nextInt();
		
		System.out.println("Preis pro Pfund Packung B:");
		double preisB = scan.nextDouble();
		
		System.out.println("Prozent mageres Fleisch Packung B:");
		int prozentB = scan.nextInt();
		
		double kostenA = (preisA/prozentA)*100;
		double kostenB = (preisB/prozentB)*100;
		
		System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + kostenA);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + kostenB);
		
		if (kostenA > kostenB)
			System.out.println("Packung B ist preiswerter.");
		else 
			System.out.println("Packung A ist preiswerter.");
	}

}
