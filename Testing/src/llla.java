
public class llla {

	public static void main(String[] args) {
		
		int star = 1;
		int row = 1;
		do {
			System.out.print("*");
			star++;
			do {
				System.out.println("* ");
				row++;
			}
			while(row<star);
		}
		while(star<=4);
		
		
	}}