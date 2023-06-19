import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		System.out.println("Anzahl der schrauben: ");
		int Schraube = scan.nextInt();
		final int Schraubenpreis = 5;
		
		System.out.println("Anzahl der Muttern: ");
		int Mutter = scan.nextInt();
		final int Mutterpreis = 3;
		
		System.out.println("Anzahl der unterlegscheibe: ");
		int Unterlegscheibe = scan.nextInt();
		final int Untpreis = 1;
		
		if (Mutter < Schraube)
			System.out.println("Kontrollieren Sie Ihre Bestellung!");
		else
			System.out.println("Die Bestellung ist okay.");
		
		int Gesamt = (Schraube*Schraubenpreis) + (Mutter*Mutterpreis) + (Unterlegscheibe*Untpreis);
		System.out.println("Gesamtbetrag: " + Gesamt);
	}

}
