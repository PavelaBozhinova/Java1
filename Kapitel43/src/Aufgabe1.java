import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		String input;
		int n, vowels=0, consonants=0, characters=0, space=0 ;
		
		System.out.println("Write something: ");
		input = scan.nextLine();
		n=input.length();
		
		while((n-1)>=0) {
			
			
		
			switch(input.charAt(n-1)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowels++;
					break;
				case 'q':
				case 'w':
				case 'r':
				case 't':	
				case 'z':
				case 'p':	
				case 's':	
				case 'd':
				case 'f':	
				case 'g':
				case 'b':
				case 'h':
				case 'j':
				case 'k':
				case 'l':
				case 'y':
				case 'x':
				case 'c':
				case 'v':
				case 'n':
				case 'm':
					consonants++;
					break;
				case '.':
				case ',':
				case '-':
				case ';':
				case ':':
				case '!':
				case '?':
				case '"':
				case '+':
				case '(':
				case ')':
				case '_':
				case '&':
				case '$':
					characters++;
					break;
				case ' ':
					space++;
					break;
		}
		n--;}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
		System.out.println("Number of characters: " + characters);
		System.out.println("Number of space: " + space);
		
	}

}
