
public class Aufgabe2 {

	public static void main(String[] args) {
		int[] array = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int max1, max2;
	    // Variablen f�r die zwei gr��ten Elemente deklarieren und initialisieren
		max1 = array[5];
		max2 = array[7];

	    // die zwei gr��ten Elemente berechnen
	    for ( int index = 0 ; index < array.length; index++)
	    { if (array[index]>max1)
	    	max1 = array[index];
	   if (array.length>max1)
	    	max2 = array[index];
	    			
	    }

	    // die zwei gr��ten Elemente ausgeben
	    System.out.println( "Die zwei gr��ten Elemente sind: " + max1 + " und " + max2 );
	}

}
