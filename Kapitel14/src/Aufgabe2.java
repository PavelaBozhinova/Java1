import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in );
		
		System.out.println("Geben Sie ihr Gewicht ein: ");
		int Gewicht = scan.nextInt();
		
		if (Gewicht>=235 && Gewicht<=265)
			System.out.println("Sie sind zugelassen! ");
		else
			System.out.println("Sie sind NICHT zugelassen!");
		
	}

}
