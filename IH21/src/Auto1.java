
public class Auto1 {
	
	String Farbe;
	int Hubraum;
	double Hoechstgeschwindigkeit;
	double geschwindigkeit;
	static int anzahl=0;
	
	public Auto1()
	{
	System.out.println("Es gebt ein neues Auto \n");
	Auto1.anzahl=Auto1.anzahl+1;
	}
	public Auto1(String j) {
		this.Farbe= j;
		Auto1.anzahl=Auto1.anzahl+1;
	}
	public Auto1(String j, int x) {
		this.Farbe= j;
		this.Hubraum= x;
		Auto1.anzahl=Auto1.anzahl+1;
	}
	public void fahren(double h) {
		System.out.println("Das Auto f�hrt mit " + geschwindigkeit + " km/h vorw�rts");
	}
	public void fahren 

}
