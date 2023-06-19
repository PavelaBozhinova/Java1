
public class Autotest {

	public static void main (String args[]) {
		
		Auto wagen_1 = new Auto ( ) ; 
		
		wagen_1.fahren(80); 
		
		Auto wagen_2 = new Auto ( "orange" ) ;
		wagen_2.fahren( 30 ) ; 
		Auto wagen_3 = new Auto ( "rot" , 50 ) ; 
		
		wagen_3.fahren() ;
		
		Monstertruck Ford = new Monstertruck();
		Ford.fahren(90);
		Monstertruck Fordy = new Monstertruck("white ", 50, 45);
		Fordy.fahren(80);
		Monstertruck Forde = new Monstertruck("blue" , 50 ,67,55.5);
		Forde.fahren(70);
		
		System.out.println ( "Das Auto hat die Farbe " + wagen_2.Farbe) ;
		System.out.println("Schiffe " + Auto.anzahl);
		
	}
}
