import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in );
		
		String wort, wort2;
 		int punkt;
		
		
		System.out.println("Geben Sie das erste Wort ein: ");
		wort = scan.nextLine();
		
		System.out.println("Geben Sie das zweite Wort ein: ");
		wort2 = scan.nextLine();
		
		punkt = 30-(wort.length()+wort2.length());
		
		System.out.print(wort);
		
		while(punkt>0) {
			System.out.print(".");
			punkt--;
		
		}
		System.out.print(wort2);
}
}