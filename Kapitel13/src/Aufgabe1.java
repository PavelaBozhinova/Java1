import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		double preis, expzuschlag, versandp, versandp2, gesamt, gesamt2;
		
		System.out.print("Geben Sie den Artikel ein: ");
		String artikel = scan.nextLine();
		
		System.out.print("Geben Sie den Preis ein: ");
		preis = scan.nextDouble();
		
		System.out.print("Expressversand (0==nein, 1==ja): ");
		int expversand = scan.nextInt();
		
		System.out.println("Rechnung");
		System.out.println(artikel + ": " + preis);
		 expzuschlag = 5.0;
		 versandp = 2.0 + expzuschlag;
		 versandp2 = 3.0 + expzuschlag;
		 gesamt = versandp + preis;
		 gesamt2 = versandp2 + preis;
		
		
		if (expversand == 1) {
		if (preis == 10.0) {
			System.out.println("Versand: " + versandp);
			System.out.println("Gesamt: " + gesamt);
		}
		if (preis >= 10.0) {
			System.out.println("Versand: " + versandp2);
			System.out.println("Gesamt: " + gesamt2);
		}
		}
			
	}

}
