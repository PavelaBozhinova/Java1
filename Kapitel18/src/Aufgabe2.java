import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		int ubereich, obereich, daten=1, gesamti=0, gesamta=0;
		
		System.out.println("Bereiche addieren");
		
		System.out.println("Untergrenze des Bereichs: ");
		ubereich = scan.nextInt();
		
		System.out.println("Obergrenze des Bereichs: ");
		obereich = scan.nextInt();
		
		while (daten>=1) {
			System.out.println("Daten eingeben: ");
				daten = scan.nextInt();
			if (daten >= ubereich && daten <= obereich) {
				gesamti = daten + gesamti;}
				
			else {
					gesamta = daten + gesamta;}}
					System.out.println("Summe der Werte innerhalb des Bereichs: " + gesamti);
					System.out.println("Summe der Werte auserhalb des Bereichs: " + gesamta);
				
				
			
		}

	}


