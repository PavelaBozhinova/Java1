
public class aufgabe03 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	   

	    // die Daten von array in umgekehrter Reihenfolge nach ziel kopieren
	    for ( int j = 0; j < array[j]; j++)
	    {int item = array[j];
	    array[j] = array[array.length - j - 1];
	    array[array.length - j - 1] = item;

	    }

	  
	    System.out.println(java.util.Arrays.toString(array));
	}

}
