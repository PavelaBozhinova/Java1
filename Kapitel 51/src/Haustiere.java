
  abstract class Haustiere {
	
	String name;
	double futtervorrat;
	int    anzahlTage; // gibt die Anzahl Tage aus, die der Futtervorrat reicht
	
	
	
	public Haustiere() {
		}
	
	public Haustiere(String n, double futter) {
		name=n;
		futtervorrat=futter;
	}
	
	public void fuettern(){
		}
	
 }
	
 		class Katze extends Haustiere {
 			
 			String haltung;
 			
public void sprich() {
			System.out.println("Miau!");
			}
		  
		public Katze(String n, double futter, int halt) {
			super(n, futter);
			
			if (halt == 1) {
				haltung = "Wohnung";
			}
			 if (halt == 2) {
				 haltung = "Artgerecht";
			 }
			
			name=n;
			futtervorrat=futter; 
			
			while (futtervorrat > 0.0) {
				System.out.println( name  + ": "+ futtervorrat );
			futtervorrat=futtervorrat-0.5;
			anzahlTage++;}
			}
		
		
		public void friss() {
		}
		
		public void anzeigen(){
		System.out.println("(Haltung: " + haltung + ") Der Vorrat für " + name + " reicht " + anzahlTage +" Tage. \n");
	}

}
 		class Hund extends Haustiere {
 			
 			String kategorie;

	public Hund(String n, double futter, int kat) {
		super(n,futter);
		
		if (kat == 1) {
			kategorie="Kleinhunde";}
			if (kat == 2) {
				kategorie="Mittelgrosse Hunde"; }
			if (kat == 3) {
				kategorie="Große Hunde";
			}
		
		name=n;
		futtervorrat=futter; 
		
		while (futtervorrat > 0.0) {
			System.out.println( name  + ": "+ futtervorrat );
		futtervorrat=futtervorrat-1.0;
		anzahlTage++;}
		
	}

	public void sprich() {
		System.out.println("Wuff!");
	}

	public void friss() {
		
		
	}
	public void anzeigen(){
		System.out.println("(Kategorie: " + kategorie + ") Der Vorrat für " + name + " reicht " + anzahlTage +" Tage. \n");
	
		// zeigt den Namen des Haustiers an und wie viele Tage der Futtervorrat reicht
	}

}


