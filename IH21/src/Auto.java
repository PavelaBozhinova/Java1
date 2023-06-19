
public class Auto {


		String Farbe;
		int Hubraum;
		double Hoechstgeschwindigkeit;
		double geschwindigkeit;
		static int anzahl=0;
		
		
		public void neuesAuto() {
			Auto.anzahl=Auto.anzahl+1;
		}
		public Auto()
		{
			
			Farbe="Weiﬂ";
			Hubraum=234;
			System.out.println("Farbe ist "+ Farbe);
			System.out.println("Hubraum ist " + Hubraum);
		}
		public Auto(String x)
		{
		Farbe=x;
		Hubraum=234;	
		System.out.println("Farbe ist "+ Farbe);
		System.out.println("Hubraum ist " + Hubraum);
		}
		
		public Auto(String x, int var)
		{
		Farbe=x;
		Hubraum=var;	
		System.out.println("Farbe ist "+ Farbe);
		System.out.println("Hubraum ist " + Hubraum);
		}
		
		public void fahren()
		{
			System.out.println
			("Das Auto faehrt mit " + geschwindigkeit +" km/h vorwaerts.");
	}
		public void fahren1() {
			System.out.println
			("Das Auto faehrt vorwaerts.");
	
		}
		protected void finalize()
		{
		Auto.anzahl=Auto.anzahl-1;
		}
		
}
