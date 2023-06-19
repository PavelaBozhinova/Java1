
public class Schiff {
	
	//instanzvariablen
	static int anzahl;
	boolean mitMotor;
	double knoten;
	
	
	public double getknoten() {
		return this.knoten;
	}
	
	public void setknoten(double x) {
		this.knoten=x;
	}
	
	public void fahren1(){
		System.out.println("Das Schiff fährt mit vorwärts");
		
	}
	
	
	//Instanzmethode
	public void fahren(double h) {
		knoten = h;
		System.out.println("Das Schiff fährt mit " + knoten + " Knoten vorwärts");
	
	}
	
	//KLassenvariable
	public void getAnzahl(int x) {
		anzahl = x;
	}
	
	//Klassenmethode
	public void moreSchiffe() {
		Schiff.anzahl=Schiff.anzahl+1;
	}
	
	//konstruktoren
	public Schiff() {
		moreSchiffe();
		
	}
	
	public Schiff(String j) {
	String Herstellernamens = j;
	System.out.println("Der Name ist " + Herstellernamens);
	moreSchiffe();
	}
	
	public Schiff(String j, double x) {
		String Herstellernamens =j;
		double Zuladung =x;
		System.out.println("Der Name ist " + Herstellernamens+ " und es Ladet " + Zuladung);
		moreSchiffe();
	}
}
