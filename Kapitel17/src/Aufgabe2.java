import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		double x, xsumme=1.0, n1;
		int n;
		
		System.out.println("Geben Sie x ein: ");
		x = scan.nextDouble();
		
		System.out.println("Geben sie n ein: ");
		n = scan.nextInt();
	    n1 =n;
	    
	    if (n<0) {
	    	System.out.println("n muss positiver Integer sein.");
	    }
	    else {
		while (n1>0){
		xsumme =xsumme * x;
		n1 --;
		}
		System.out.println(x + " hoch " + n + " ergibt: " + xsumme);
	}
	}
}
