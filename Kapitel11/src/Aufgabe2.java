import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		
		System.out.println("Geben Sie die Anzahl der Sekunden ein: ");
		double z = scan.nextDouble();
		double G = 9.81;
		double e = (1.0/2.0) * G*z*z;
		
		
		System.out.println("Die Entfernung e beträgt: " + e + " Meter");
		
	}

}
