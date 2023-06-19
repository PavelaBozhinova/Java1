
public class Meerschweinchen {
	
	//instanzvariablen
	String Rasse;
	double Bauchumfang;
	boolean vollgefressen;
	static int tieranzahl;
	
	
	//instanzmethode fressen
	public void fressen() {
		System.out.println("Das Meerschweinchen ist satt"+"\n");
		vollgefressen=true;
	}
	
	//Methode neuesTier 
	static void neuesTier() {
		//Klassenvariable tieranzahl
		Meerschweinchen.tieranzahl=Meerschweinchen.tieranzahl+1;
		}
	
	//constructor ohne parameter
	public Meerschweinchen() {
		Rasse = "Rosette";
		Bauchumfang = 25.0;
		System.out.println("Die Rasse ist "+ Rasse + " und Bauchumfang ist " + Bauchumfang);
		neuesTier();
	}
	
	
	public Meerschweinchen (String j) {
		Rasse = j;
		Bauchumfang= 25.0;
		System.out.println("Die Rasse ist "+ Rasse + " und Bauchumfang ist " + Bauchumfang);
		neuesTier();
	}
	
	
	public Meerschweinchen(String j, double x) {
		Rasse = j;
		Bauchumfang= x;
		System.out.println("Die Rasse ist "+ Rasse + " und Bauchumfang ist " + Bauchumfang);
		neuesTier();
	}
	
	
	
}
