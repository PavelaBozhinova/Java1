
public class Artikel {

	double  einkaufspreis, verkaufspreis;
	String  artikelNr,bezeichnung;
	int lagerzeit; //in Monate
	final double  HANDELSSPANNE = 0.6  ; // 60 Prozent des Einkaufspreises
	final double  MWST          = 0.19 ; // 19 Prozent
	static int anzahl;
	
	public double berechneVerkaufspreis() {
		double verkaufspreis = einkaufspreis + HANDELSSPANNE + MWST;
		return verkaufspreis;
	}
	public void anzeigen() {
		Artikel.anzahl=Artikel.anzahl+1;
	}
	public Artikel() {
		
	}
	
	
	public Artikel(String art, String bz, double preis, double vpreis, int monat) {
		artikelNr = art;
		bezeichnung = bz;
		einkaufspreis = preis;
		lagerzeit = monat;
		verkaufspreis = vpreis;
		System.out.println(art + ""+ bz + " EK: "+ preis+" VK: " + vpreis + " Euro Lagerzeit: " + monat + " Monate");
		anzeigen();
	}
	
	

	
}
