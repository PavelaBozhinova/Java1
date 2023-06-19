import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		double n, länge=0.0 , gesamt=0.0, n1=0;
		double durchschnitt=0.0, durchschnitt2, durchschnittQ, SD, summe2x;
		
		System.out.println("Geben sie N ein: ");
			n = scan.nextInt();
			
		while (n>länge) {
			System.out.println("Geben Sie wert von x ein: ");
			n1 = scan.nextInt();
			länge=länge+1;
			gesamt=gesamt+n1;
		
			
		}
		summe2x=(gesamt + (n1*n1))*2;
		durchschnitt = gesamt / n;
		durchschnitt2 = durchschnitt * durchschnitt;
		durchschnittQ = summe2x/durchschnitt2;
		SD = Math.sqrt(durchschnittQ - durchschnitt2);
		System.out.println("Die Summe von X*X ist: " + summe2x);
		System.out.println("Die Gesamt von x ist: " + gesamt );
		System.out.println("Die Durschschnitt ist: " + durchschnitt);
		System.out.println("Die Durschschnitt 2 ist: " + durchschnitt2);
		System.out.println("Die Durschschnitt Q ist: " + durchschnittQ);
		System.out.println("Die Standardabweichung ist: " + SD);
		
		
		
		
		
	}

}
