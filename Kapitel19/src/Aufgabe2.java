
public class Aufgabe2 {

	public static void main(String[] args) {
		
		
		double monat=0, wirkstoff=100, wirkstoff1=0.0;
		System.out.println("Monat: " + monat+ "   Wirkstoffgehalt: " + wirkstoff);
		
		while (wirkstoff >= 50) {
			monat = monat + 1;
			System.out.print("Monat: " + monat);
				
			wirkstoff1 = wirkstoff - ((wirkstoff*4.0)/100.0);
			wirkstoff = wirkstoff1;
			
			if (wirkstoff > 50)
				System.out.println("   Wirkstoffgehalt: " + wirkstoff);
			else 
				System.out.println("   Wirkstoffgehalt: " + wirkstoff + " ABGELAUFEN");
		}
		
	}

}
