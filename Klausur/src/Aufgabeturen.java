
public class Aufgabeturen {

	public static void main(String[] args) {
		
		boolean[] turen = new boolean[101];
		int zahl;
		for(int i=1; i<turen.length; i++) {
			
			zahl = 0; 
			
			for (int schritt=1; zahl<101; schritt++) {
				zahl = schritt * i;
				if (zahl<=100) 
					turen[zahl]=!turen[zahl];
				else
					break;
		}}
		for(int offen=0; offen<turen.length;offen++)
			if(turen[offen]==true)
		System.out.println(offen);
		}

	}
