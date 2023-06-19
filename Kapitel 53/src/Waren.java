
class Waren {
	  private String beschreibung;
	  private double preis;
	  private int anzahl;
	  
	  public Waren() {
	  }

	  public Waren( String beschreibung, double preis, int anzahl ){
	    this.beschreibung = beschreibung;
	    this.setPreis(preis);
	    this.setAnzahl(anzahl);
	  }

	  public void anzeigen(){
	    System.out.println( "Artikel: " + beschreibung +
	        " Preis: " + getPreis() + " Anzahl: " + getAnzahl()); }

	public double getPreis() {
		return preis;}

	public void setPreis(double preis) {
		this.preis = preis;}

	public int getAnzahl() {
		return anzahl;}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
}

class Lebensmittel extends Waren {

		double kalorien;

	  Lebensmittel( String beschreibung, double preis, double kalorien, int anzahl)
	  {
	    super( beschreibung, preis, anzahl );
	    this.kalorien = kalorien ;
	  }

	  public void anzeigen() {
	    super.anzeigen();
	    System.out.println( "Kalorien: " + kalorien ); }
	
	  interface Besteuerbar
	  {
	    final double STEUERSATZ = 0.06 ;
	    double berechneSteuer() ;
	  }
	}
class Spielwaren extends Waren implements Besteuerbar{
  int mindestalter;

  Spielwaren( String beschreibung, double preis, int mindestalter){
    super( beschreibung, preis, mindestalter );
    this.mindestalter = mindestalter;
  }

  public void anzeigen(){
    super.anzeigen();
    System.out.println( "Mindestalter: " + mindestalter );}

  public double berechneSteuer(double STEUERSATZ) {
    
	return getPreis() * STEUERSATZ ;
  }
}

class Buecher extends Waren implements Besteuerbar{
  String autor;

  Buecher( String beschreibung, double preis, String autor, int anzahl){
    super( beschreibung, preis, anzahl );
    this.autor  = autor ;
  }

  public void anzeigen(){
    super.anzeigen() ;
    System.out.println( "Autor: " + autor );
  }

  public double berechneSteuer(double STEUERSATZ){
    return getPreis() * STEUERSATZ ;
  }
}
