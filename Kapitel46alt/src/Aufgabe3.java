
public class Aufgabe3 {

	public static void main(String[] args) {
		
		int[] arrA   = { 13, -22,  82,  17};
	    int[] arrB   = {-12,  24, -79, -13};
	    int[] summe    = {  0,   0,   0,   0};

	    // Addieren Sie die Werte der entsprechenden Slots von arrA und arrB,
	    // und stellen Sie das Ergebnis in den entsprechenden Slot von summe.

	    for (int i = 0; i<4; i++)
	    	summe[i] = arrA[i] + arrB[i]; 


	    System.out.println( "Summe: "
	        + summe[0] + " " + summe[1] + " " + summe[2] + " " + summe[3] );
	}

}
