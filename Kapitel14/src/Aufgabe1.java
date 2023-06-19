import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		
		System.out.println("Geben sie ihr Girokonto Guthaben ein: ");
		int Girokonto = scan.nextInt();
		
		System.out.println("Geben sie ihr Sparkonto Guthaben ein: ");
		int Sparkonto = scan.nextInt();
		double Gebühr = 0.15;
		
		if (Girokonto >= 1000 || Sparkonto >= 1500) 
			System.out.println("Keine Scheckgebühr wird erhoben."); 
		else 
			System.out.println("Eine Gebühr von " + Gebühr + " wird erhoben."); 
		
		
	}

}
