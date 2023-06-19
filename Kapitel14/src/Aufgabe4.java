import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );

		int rechterv, linkerv, rechterh, linkerh;

		
		System.out.println("Reifendruck: rechter Vorderreifen");
		rechterv = scan.nextInt();
		if   (!(rechterv>=35 && rechterv<=45)) 
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs!");
		
		System.out.println("Reifendruck: linker Vorderreifen");
		linkerv = scan.nextInt();
		if (!(linkerv>=35 && linkerv<=45)) 
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs!");
		
		System.out.println("Reifendruck: rechter Hinterreifen");
		rechterh = scan.nextInt();
		if (!(rechterh>=35 && rechterh<=45)) 
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs!");
		
		System.out.println("Reifendruck: linker Hinterreifen");
		linkerh = scan.nextInt();
		if (!(linkerh>=35 && linkerh<=45)) 
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs!");
		
		
		if (rechterv == linkerv && rechterh == linkerh) {
		if (rechterv>=35 && rechterv<=45 && linkerv>=35 && linkerv<=45 && rechterh>=35 && rechterh<=45 && linkerh>=35 && linkerh<=45) 
			System.out.println("Reifendruck ist OK.");
			else 
			System.out.println("Der Reifendruck ist nicht in Ordnung!");}
		else 
			System.out.println("Der Reifendruck ist nicht in Ordnung!");
	}
	}

