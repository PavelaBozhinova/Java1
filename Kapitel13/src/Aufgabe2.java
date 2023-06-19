import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		
		System.out.print("Geben Sie die Lufttemperatur ein: ");
		double tLuft = scan.nextDouble();
		
		System.out.print("Geben Sie die Dampftemperatur ein: ");
		double tDampf = scan.nextDouble();
		
		double effizienz = 1.0 - tLuft / tDampf;
		
		if (tDampf >= 373) {
			System.out.println("Die Effizienz beträgt: " + effizienz);
		}
		if (tDampf < 373) {
			System.out.println("Die Effizienz beträgt: 0");
		}
	}

}
