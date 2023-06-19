import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		String file = ".dat" , name;
		
		do 
		{
			System.out.print("input file: ");
			name = scan.nextLine();
			file = scan.findInLine(name);
			if (name.equals(name+file)) {
				System.out.println("OK");}
			
		}
		while (name.equals(name + file));
		
	}

}
