import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		
		System.out.println("Geben Sie der Anzahl der Posten ein: ");
		int anzahl = scan.nextInt();
		
		System.out.println("Geben Sie der Erhitzungszeit für einen Posten ein: ");
		int zeit = scan.nextInt();
		
		double erhitzungszeit2 = zeit + (zeit / 2.0);
		double erhitzungszeit3 = zeit * 2.0;
		
		
		if (anzahl == 1) {
			System.out.println("Empfohlene Erhitzungszeit: " + zeit);}
		
		if (anzahl == 2) {
			System.out.println("Empfohlene Erhitzungszeit: " + erhitzungszeit2 ); }
			
		if (anzahl == 3) {
			System.out.println("Empfohlene Erhitzungszeit: " + erhitzungszeit3 ); }
			
		if (anzahl > 3) {
			System.out.println("Erhitzen ist nicht empfohlen!"); }
		
	}		

}
