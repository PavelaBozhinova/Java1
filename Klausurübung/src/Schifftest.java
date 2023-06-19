
public class Schifftest {

	public static void main(String[] args) {
		
		Schiff Bella = new Schiff();
		Bella.fahren(554);
		Bella.fahren1();
		
		Schiff Titanik = new Schiff("Titanik");
		Titanik.fahren(3445);
		
		Schiff Victoria = new Schiff("Victoria",54);
		Victoria.fahren(234);
		
		
		System.out.println("Es gibt " + Schiff.anzahl+ " Schiffe");
	}

}
