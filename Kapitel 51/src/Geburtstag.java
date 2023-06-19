
 class Geburtstag extends Karte{

	int alter;

	  public Geburtstag ( String empf, int jahre, int sex )
	  {super(empf,sex);
	    empfaenger = empf;
	    alter = jahre;
	    
	    if (sex == 1) 
			  anrede = "Lieber";
		  else 
			  anrede = "Liebe";
	    
	  }

	  public void gruss()
	  {
	    System.out.println(anrede + " " + empfaenger + ",\n");
	    System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
	  }
	}
