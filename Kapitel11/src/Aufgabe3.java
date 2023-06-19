import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		
		System.out.println("Geben Sie x ein: ");
		int x = scan.nextInt();
		
		System.out.println("Geben Sie y ein: ");
		int y = scan.nextInt();
		
		double Durchschnitt = (x+y)/2;
		double HMittel = 2 / (1.0 / x + 1.0 / y);
		
		System.out.println("Arithmetisches Mittel: " + Durchschnitt );
		System.out.println("Harmonisches Mittel: " + HMittel );
		
	}

}
