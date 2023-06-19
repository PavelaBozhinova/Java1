import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		int monat=1;
		double schulden=1000, saldo=1, betrag, gesamt=0; 
		
		System.out.println("Geben Sie den monatlichen Betrag ein: ");
		betrag = scan.nextDouble();
		
		while (saldo>0) {
			System.out.print("Monat: " + monat);
			monat = monat + 1;
			
			saldo = ((schulden*1.5)/100) + schulden-betrag;
			schulden = schulden - betrag;
			schulden = saldo;
			
			System.out.print("		Saldo: " + saldo);
			
		gesamt = gesamt + betrag;
		System.out.print("		Gesamtbetrag: " + gesamt);
		System.out.println();
		}
		
	}

}
