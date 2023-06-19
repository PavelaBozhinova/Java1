import java.util.Scanner;

public class Aufgabee4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Geben Sie ein double ein: ");
		double x = scan.nextDouble();
		double loge;
		loge = Math.log(x)/Math.log(2);
		System.out.println("Der Zweierlogarithmus von " + x + " ist " + loge);
	}

}
