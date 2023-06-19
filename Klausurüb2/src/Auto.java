
public class Auto {
	
	//instanzvariable
	String Farbe;
	int Geschwindigkeit;
	static int anzahl;
	
	public void neuesAuto() {
		anzahl++;
	}
	public void fahren(){
		
	}	
	
	public void fahren(int g){
		System.out.println("Das Auto fährt vorwärts mit "+ g +"\n");

	}	
	
	public Auto() {
		Auto.anzahl++;
	}
	
	public Auto(String f) {
		this.Farbe=f;
		System.out.println("Die Farbe des Auto ist " + f);
		anzahl++;
	}
	
	public Auto(String f, int g) {anzahl++;
		this.Farbe=f;
		this.Geschwindigkeit=g;
		System.out.println("Die Farbe des Auto ist " + f);
		System.out.println("Die Geschwindigkeit des Auto ist " + g );

	
	
	
	}
}
