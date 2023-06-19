
public class Sonderposten extends Artikel{

	int rabatt;
	static int anzahl;
	
	public double berechneVerkaufspreis() {
		double verkaufspreis = einkaufspreis + HANDELSSPANNE + MWST;
		return verkaufspreis;
		 	
		 }
	
		
	public Sonderposten(String art, String bz, double preis, double vpreis, int monat) {
		super(art, bz, preis, vpreis, monat);
		
		
		double r;
		if (lagerzeit >=12) {
			rabatt=30;
		    r = (vpreis * rabatt)/100;
		}
			
		else {
			rabatt=10;
			r = (vpreis * rabatt)/100;
			}
		System.out.println("\n"+"Sonderposten: ");	
		
		System.out.println(art + ""+ bz + " EK: "+ preis+" VK: " + (vpreis-r) + " Euro Lagerzeit: " + monat + " Monate");
		System.out.println("VK alt: " + vpreis + " Euro Rabatt: " + rabatt + "%");
	anzeigen();
	}
	
	public void anzeigen() {
		Artikel.anzahl=Artikel.anzahl+1;
		
	}	
	}


