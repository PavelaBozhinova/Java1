
public class Merino extends Meerschweinchen
{
	
		static int tieranzahl;
		double haarl�nge;
		boolean scheu;
	
		public Merino() {
			Rasse = "Rosette";
			Bauchumfang=25.0;
			haarl�nge=8;
			scheu = true;
			System.out.println("Haarl�nge "+ haarl�nge + " und scheu " + scheu);
			
			
		}
		
		
		public Merino (String j) {
			Rasse = j;
			Bauchumfang= 25.0;
			System.out.println("Haarl�nge "+ haarl�nge + " und scheu " + scheu);
			
			
		}
		
		
		public Merino(String j, double x) {
			Rasse = j;
			Bauchumfang= x;
			System.out.println("Haarl�nge "+ haarl�nge + " und scheu " + scheu);
			
		}
		
		
		

}
