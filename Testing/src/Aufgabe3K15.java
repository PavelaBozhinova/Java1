import java.util.Scanner;

public class Aufgabe3K15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		String wort, wort2;
		String punkt = ".";
		int länge = 30;
		
		System.out.println("Geben Sie das erste Wort ein: ");
		wort = scan.nextLine();
		
		System.out.println("Geben Sie das zweite Wort ein: ");
		wort2 = scan.nextLine();
		
		länge = länge + ("." * länge);
		
		
		while (länge2 > 0) {
			while (länge > 0) {
				System.out.print(wort + (punkt * länge));
				länge = länge - 1;
			}
			System.out.print(wort2);
		
		}
			

	}

}
