import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		int zahl, zahl1; 
		
		System.out.println("Anfagszahl der Sterne ");
		zahl = scan.nextInt();
		
		while (zahl>0) {
			
		zahl1 = zahl;
		
			while (zahl1>0) {
				System.out.print("*");
				zahl1--;
		
		}
		System.out.println("");
		zahl--;	
	}}
 
}
