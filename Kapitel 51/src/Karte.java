
abstract class Karte
{
  String empfaenger;
  String anrede;
  
  Karte(){
	  
  }
  Karte( String empf, int sex){
	  empfaenger = empf;
	  
  }
  public abstract void gruss();
}

// deka novio klas pocnuva 

class Feiertag extends Karte
{
  public Feiertag( String empf , int sex){
	  super(empf,sex);
	  
    empfaenger = empf;
    
    if (sex == 1) 
		  anrede = "Lieber";
	  else 
		  anrede = "Liebe";
  }

  public void gruss(){
    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  
  
  }
}
