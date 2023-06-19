
public class Monstertruck extends Auto{
	
	int reifengröße;
	double länge;
	
	public Monstertruck() {
		
		
	}
	public Monstertruck(String f, int g, int rg) {
		super(f, g);
		this.reifengröße = rg;
		System.out.println("Reifengröße "+ rg);
		
	}
	public Monstertruck(String f, int g,int rg, double l) {
		super(f,g);
		this.reifengröße = rg;
		this.länge = l;
		System.out.println("Reifengröße "+ rg + " und länge " + l);
		
	}
}
