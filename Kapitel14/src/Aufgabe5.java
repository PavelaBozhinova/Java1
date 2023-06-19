import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int toleranz = rechterv - linkerv;
		int toleranzh = rechterh - linkerh;
		
		if (rechterv>=35 && rechterv<=45 && linkerv>=35 && linkerv<=45 && rechterh>=35 && rechterh<=45 && linkerh>=35 && linkerh<=45) {
			if ((toleranz >= -3 && toleranz <= 3) && (toleranzh <= 3 && toleranzh >= -3))
				System.out.println("Reifendruck ist OK");
			else 
				System.out.println("Reifendruck ist nicht in Ordnung!");}
		else 
			System.out.println("Reifendruck ist nicht in Ordnung!");
			
		}
			
	}

