import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		
		System.out.println("Geburtsjahr: ");
		int Gj = scan.nextInt();
		
		System.out.println("Aktuelles Jahr: ");
		int Aj = scan.nextInt();
		
		
		if (Aj - Gj >= 0 )
			System.out.println("Ihr Alter ist: " + (Aj - Gj));
		else
			System.out.println("Ihr Alter ist: " + ((Aj + 100) - Gj) );
		
		
		
	}

}
