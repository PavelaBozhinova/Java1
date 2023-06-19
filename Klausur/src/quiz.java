
public class quiz {
	public static void main(String[] args) {
		
	
	int row = 1;
	do
	{
	  int col = 1;
	  do
	  {
	    System.out.print( "*" );
	    col++ ; 
	  }
	  while ( col <= row );

	  System.out.println();
	  row++ ;
	}
	while ( row <= 3 ); 
}}
