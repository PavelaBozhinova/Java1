import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner ( System.in );
		int rechterv, linkerv, rechterh, linkerh;
	
		System.out.println("Reifendruck: rechter Vorderreifen");
		rechterv = scan.nextInt();
		System.out.println("Reifendruck: linker Vorderreifen");
		linkerv = scan.nextInt();
		System.out.println("Reifendruck: rechter Hinterreifen");
		rechterh = scan.nextInt();
		System.out.println("Reifendruck: linker Hinterreifen");
		linkerh = scan.nextInt();
		
		if ((rechterv == linkerv) && (rechterh == linkerh))
		System.out.println("Reifendruck ist OK");
		else
	    System.out.println("Reifendruck ist nicht in Ordnung!");
	}
	

}
