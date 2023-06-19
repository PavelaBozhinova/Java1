
public class Aufgabe2 {

	public static void main(String[] args) {
		int[] array = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int max1, max2;
	    // Variablen für die zwei größten Elemente deklarieren und initialisieren
		max1 = array[5];
		max2 = array[7];

	    // die zwei größten Elemente berechnen
	    for ( int index = 0 ; index < array.length; index++)
	    { if (array[index]>max1)
	    	max1 = array[index];
	   if (array.length>max1)
	    	max2 = array[index];
	    			
	    }

	    // die zwei größten Elemente ausgeben
	    System.out.println( "Die zwei größten Elemente sind: " + max1 + " und " + max2 );
	}

}
