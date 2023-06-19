import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		double gewicht=1, gewicht1=0;
		
		while (gewicht >= 1) {
		System.out.println("Gewicht der Sendung: ");
		gewicht = scan.nextDouble();
	
		if (gewicht<=10 && gewicht>0) {
			System.out.println("Versandkosten: $3.0 ");}
		if (gewicht > 10) {
			gewicht1 = ((gewicht - 10) * 0.25) + 3.0;
			System.out.println("Versandkosten: $" + gewicht1);}
		if (gewicht == 0) {
			System.out.println("bye");
		}
		}
	}

}
