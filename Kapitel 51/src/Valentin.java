
class Valentin extends Karte {

	int kuesse;

	  public Valentin ( String empf, int k, int sex )
	  {super(empf,sex);
		  
	    empfaenger = empf;
	    kuesse     = k;
	    
		    if (sex == 1) 
				  anrede = "Lieber";
			  else 
				  anrede = "Liebe";
	  }
	  
	  
	  
	  public void gruss()
	  {
	    System.out.println(anrede +" " + empfaenger + ",\n");
	    System.out.println("herzliche Gruesse und Kuesse,\n");
	    for ( int j = 0; j < kuesse; j++ )
	      System.out.print("X");
	    System.out.println("\n\n");
  }
}
	