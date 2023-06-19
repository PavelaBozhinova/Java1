
public class Aufgabe4 {

	public static void main(String[] args) {
		int[] arrA   = { 13, -22,  82,  17};
	    int[] arrB   = {  12,   47,   -57,   8};
	    int[] summe    = {  0,   0,   0,   0};
	    
	    // Stellen Sie Werte in arrB, so dass die Summe der Werte
	    // der entsprechenden Slots von arrA und arrB 25 ist.

	    for (int i=0; i<4; i++)
	    	summe[i] = arrA[i] + arrB[i]; 



	    System.out.println( "arrA: "
	        + arrA[0] + " " + arrA[1] + " " + arrA[2] + " " + arrA[3] );

	    System.out.println( "arrB: "
	        + arrB[0] + " " + arrB[1] + " " + arrB[2] + " " + arrB[3] );

	    System.out.println( "Summe:  "
	        + (arrA[0]+arrB[0]) + " " + (arrA[1]+arrB[1]) + " "
	        + (arrA[2]+arrB[2]) + " " + (arrA[3]+arrB[3]) );
	}

}
