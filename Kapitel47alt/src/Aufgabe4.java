
public class Aufgabe4 {

	public static void main(String[] args) {
		int[] array = new int[10];

		  // Array durchsuchen
		  for ( int index = 0; index < array.length; index++ )
		  {
			  array[ index ] = 3 * index ;
		  }
	      System.out.println(java.util.Arrays.toString(array));
	}

}
