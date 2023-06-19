import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in );
		
		String confirm;
		double input;
		
		do 
		{
			System.out.print("Enter a number--> ");
			input = scan.nextDouble();
			confirm = scan.nextLine();
			if (input<0) {
			System.out.println(">>>number must be positive<<<");}
			
			if (input>0) {
			System.out.println("Square root of " + input + " is " + Math.sqrt(input));
			System.out.print("Do you wish to continue? (yes or no) --> ");
		      confirm = scan.nextLine();
		      if (confirm.equals("yes") || confirm.equals("no")) {
				System.out.print("");}
		      else {
				System.out.println(">>>Please respond with (yes or no)<<<");
				System.out.print("Do you wish to continue? (yes or no) --> ");
			      confirm = scan.nextLine();}
			}
		}
		while (input<0 || confirm.equals("yes"));
		if (confirm.equals("no")) {
			System.out.println("Bye");}
			
		
	}

}
