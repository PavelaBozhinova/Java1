import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
	
		int wert, wert1, gesamt=0, l�nge; 
		
		System.out.println("Wie viele Integer sollen addiert werden: ");
		wert = scan.nextInt();
		l�nge = 0;
		
		while (wert>l�nge) {
			System.out.println("Geben Sie einen Integer ein:");
			wert1 = scan.nextInt();
			l�nge=l�nge+1;
			gesamt=gesamt+wert1;
		}
		System.out.print("Die Summe ist: " + gesamt);
			
		
		
	}

}
