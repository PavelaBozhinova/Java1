import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
	
		int erstx, zweitx, ersty, zweity,  flaeche=1, xwert=1,  ywert=1;
		
		System.out.println("CAD Programm");
		
		while (xwert>=1 && ywert>=1 && flaeche>=1 ) {
		System.out.println("Erster Eckpunkt X-Koordinate:");
		erstx = scan.nextInt();
		
		System.out.println("Erster Eckpunkt Y-Koordinate:");
		ersty = scan.nextInt();
		
		System.out.println("Zweiter Eckpunkt X-Koordinate:");
		zweitx = scan.nextInt();
		
		System.out.println("Zweiter Eckpunkt Y-Koordinate:");
		zweity = scan.nextInt();
		
		if (erstx>=zweitx) {
			xwert = erstx - zweitx;
			System.out.println("Breite: " + xwert);}
		if (zweitx>erstx) {
			xwert = zweitx - erstx;
			System.out.println("Breite: " + xwert);}
		
		
		if (ersty>=zweity) {
			ywert = ersty - zweity;
			System.out.println("Hoehe: " + ywert);}
		if (zweity>ersty) {
			ywert = zweity - ersty;
			System.out.println("Hoehe: " + ywert);}
		System.out.println("Flaeche: " + xwert*ywert);
		
		if (xwert<1 || ywert<1) {
			System.out.println("bye");
		}
		}
		
			
		}
	}


