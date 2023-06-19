import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
		System.out.println("Geben Sie das Wechselgeld ein: ");
		int Cent = scan.nextInt();
		
		int Dollar = Cent/100;
		int Quarter = 25;
		int Dime = 10;
		int Nickel = 5;
		
		Quarter = Cent - 100*25;
	
		System.out.println("Das Wechselgeld ist " + Dollar + " Dollar, " + Quarter + " Quarter, " + Dime + " Dime, " + Nickel + " Nickel, "  + Cent + " Cent.");
		
	
	}

}
