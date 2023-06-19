import java.util.Scanner;

public class KarteTester {

	 public static void main ( String[] args )
	  {
	    String name;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Ihr Name");
	    name = scan.nextLine();
	    System.out.println("Ihr Geschlecht? 1 für Männlich, 0 für Weiblich.");
	    int sex=scan.nextInt();
	    

	    Feiertag   feiern = new Feiertag( name, sex);
	    feiern.gruss();

	    Karte  geb  = new Geburtstag( name, 21, sex );
	    geb.gruss();

	    Karte val = new Valentin( name, 7 , sex);
	    val.gruss();

	  }
	}
