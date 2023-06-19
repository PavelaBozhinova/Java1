import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		int n, qsumme=0, ksumme=0;
		
		System.out.println("Geben Sie n ein: ");
		n = scan.nextInt();
		
		while(n>0) {
			
			qsumme = qsumme + (n*n);
			ksumme = ksumme + (n*n*n);
			n--;
			}
			
		System.out.println("Die Quadratsumme ist: "+ qsumme);
		System.out.println("Die Kubiksumme ist: "+ksumme);
		
		
	}

}
