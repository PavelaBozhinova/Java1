import java.util.Scanner;

public class Aufgabe3K15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		String wort, wort2;
		String punkt = ".";
		int l�nge = 30;
		
		System.out.println("Geben Sie das erste Wort ein: ");
		wort = scan.nextLine();
		
		System.out.println("Geben Sie das zweite Wort ein: ");
		wort2 = scan.nextLine();
		
		l�nge = l�nge + ("." * l�nge);
		
		
		while (l�nge2 > 0) {
			while (l�nge > 0) {
				System.out.print(wort + (punkt * l�nge));
				l�nge = l�nge - 1;
			}
			System.out.print(wort2);
		
		}
			

	}

}
