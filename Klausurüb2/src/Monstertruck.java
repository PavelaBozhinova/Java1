
public class Monstertruck extends Auto{
	
	int reifengr��e;
	double l�nge;
	
	public Monstertruck() {
		
		
	}
	public Monstertruck(String f, int g, int rg) {
		super(f, g);
		this.reifengr��e = rg;
		System.out.println("Reifengr��e "+ rg);
		
	}
	public Monstertruck(String f, int g,int rg, double l) {
		super(f,g);
		this.reifengr��e = rg;
		this.l�nge = l;
		System.out.println("Reifengr��e "+ rg + " und l�nge " + l);
		
	}
}
