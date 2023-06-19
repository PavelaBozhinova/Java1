import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in );
		
		int n;
		double summe = 0;
		
		System.out.println("Geben Sie n ein:");
		n = scan.nextInt();
		
				
		while (n>0) {
			
			summe = summe + 1.0 / n;
			n--;
		}
		System.out.println("Die Summe ist:" + summe);
	}

}
