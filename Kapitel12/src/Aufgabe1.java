import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		System.out.println("Geben Sie den Gesamtbetrag ein: ");
		int Gesamtbetrag = scan.nextInt();
		int Discount = Gesamtbetrag - (Gesamtbetrag/10);
		if (Gesamtbetrag >= 1000)
			System.out.println("Discountpreis: " + Discount);
		else
			System.out.println("Kein Discount!");
		
	}

}
