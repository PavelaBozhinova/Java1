import java.io.IOException;

public class Aufgabe3 {

	public static void main(String[] args) throws IOException
	  {
	    int[][] data = { {3, 2, 5},
	                   {1, 4, 4, 8, 13},
	                   {9, 1, 0, 2},
	                   {0, 2, 6, 3, -1, -8} };

	    
	    int summe=0;

	    
	    for ( int zeile=0; zeile < data.length; zeile++)
	    {
	     
	    	summe=0;
	      
	      for ( int spalte=0; spalte < data[zeile].length; spalte++)
	      {
	    	  summe+=data[spalte][zeile];
	      }

	      
	      System.out.println( summe );
	    }

	}

}
