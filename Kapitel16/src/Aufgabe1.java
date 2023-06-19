import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
	
		int wert, wert1, gesamt=0, länge; 
		
		System.out.println("Wie viele Integer sollen addiert werden: ");
		wert = scan.nextInt();
		länge = 0;
		
		while (wert>länge) {
			System.out.println("Geben Sie einen Integer ein:");
			wert1 = scan.nextInt();
			länge=länge+1;
			gesamt=gesamt+wert1;
		}
		System.out.print("Die Summe ist: " + gesamt);
			
		
		
	}

}
