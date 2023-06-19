
public class Zoohandlung {
	public static void main(String args[])
	{
		
		Meerschweinchen Teddy = new Meerschweinchen();
		Teddy.fressen();
		Meerschweinchen Lola = new Meerschweinchen("Glatthar");
		Lola.fressen();
		Meerschweinchen Loki = new Meerschweinchen("Rex",23.5);
		Loki.fressen();
		
		
		Merino Nori = new Merino();
		Nori.fressen();
		Merino Daisy = new Merino("Glatthar");
		Daisy.fressen();
		Merino Leo = new Merino("Rex",27.0);
		Leo.fressen();
		
		System.out.println("Es gibt " + Meerschweinchen.tieranzahl + " Meerschweinchen");
		}
	}
