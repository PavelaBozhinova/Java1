import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
		System.out.println("Geben Sie die Spannung in Volt ein: ");
		int u = scan.nextInt();
		
		System.out.println("Geben Sie den Widerstand in Ohm ein: ");
		int r = scan.nextInt();
		
		double i = (u + 0.0)/r;
		System.out.println("Die Stromstärke ist: " + i + " Ampere" );
		
		
	}

}
