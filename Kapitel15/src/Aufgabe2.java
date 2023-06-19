import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		String word;
		int length;
		
		System.out.print("Geben Sie ein wort ein: ");
		word = scan.nextLine();
		
		length = word.length();
		
		while (length > 0) {
			System.out.println(word);
		length = length - 1;
	}
	}
	
}
