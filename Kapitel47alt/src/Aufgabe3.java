
public class Aufgabe3 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

	    // Daten umkehren
	    for ( int j = 0; j < array[j]; j++)
	    {int item = array[j];
	   
	     array[j] = array[array.length - j - 1];
	    array[array.length - j - 1] = item;
	    
	    }

	    // neuen Daten ausgeben
	    for ( int j = 0; j < array.length; j++)
	    {
	    
	    	
	    }
	    System.out.println(java.util.Arrays.toString(array));

	}

}
