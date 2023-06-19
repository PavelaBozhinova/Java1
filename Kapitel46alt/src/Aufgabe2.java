
public class Aufgabe2 {

	public static void main(String[] args) {
		int[] arr = {13, -4, 82, 17};
	    int[] doppelt = {0, 1, 2, 3};

	    System.out.println( "Urspruengliches Array: "
	        + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] );

	    for (int i=0; i<4; i++ )
	    		doppelt[i] = arr[i]*2;
	    
			// Konstruieren Sie ein Arrayobjekt für doppelt.

	    // Stellen Sie Werte in doppelt, die zweimal so groß sind
	    // als ihre entsprechenden Werte in arr

	    System.out.println( "Neues Array: "
	        + doppelt[0] + " " + doppelt[1] + " " + doppelt[2] + " " + doppelt[3] );
	}

}
