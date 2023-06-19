
public class Merino extends Meerschweinchen
{
	
		static int tieranzahl;
		double haarlänge;
		boolean scheu;
	
		public Merino() {
			Rasse = "Rosette";
			Bauchumfang=25.0;
			haarlänge=8;
			scheu = true;
			System.out.println("Haarlänge "+ haarlänge + " und scheu " + scheu);
			
			
		}
		
		
		public Merino (String j) {
			Rasse = j;
			Bauchumfang= 25.0;
			System.out.println("Haarlänge "+ haarlänge + " und scheu " + scheu);
			
			
		}
		
		
		public Merino(String j, double x) {
			Rasse = j;
			Bauchumfang= x;
			System.out.println("Haarlänge "+ haarlänge + " und scheu " + scheu);
			
		}
		
		
		

}
