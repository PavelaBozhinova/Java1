import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		int ameilen = 0, ameilen1=1, emailen, gallonen;
		double mpg;
		System.out.println("Programm Meilen pro Galone");
		
		
			while (ameilen>=0){
				System.out.println("Anfangsstand Meilen:");
				ameilen = scan.nextInt();
			
				
					if (ameilen > 0) {
						System.out.println("Endtsand Meilen:");
						emailen = scan.nextInt();
		
						System.out.println("Gallonen:");
						gallonen = scan.nextInt();
		
						mpg = (emailen - ameilen)/gallonen;
						System.out.println("Meilen pro Gallone: " + mpg);
						ameilen--;
				
					}
					else
						System.out.println("bye");}
				}
			
			
	}


