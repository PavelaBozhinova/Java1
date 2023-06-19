
public class AutoTest {
	public static void main(String args[])
	{
		Auto Mazda = new Auto();
		Mazda.fahren();
		Mazda.fahren1();
		Mazda.Hoechstgeschwindigkeit=200;
		Mazda.geschwindigkeit=35;
		
		Auto Audi = new Auto("Pink");
		Audi.fahren();
		Audi.fahren1();
		Audi.geschwindigkeit=220;
		
		Auto BMW = new Auto("Schwarz",274);
		BMW.fahren();
		BMW.fahren1();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
