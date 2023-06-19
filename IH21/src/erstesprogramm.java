//Schreiben sie ein javaprogramm dass ein 2d feld vom typ int ... 
//füllen sie dieses feld mit zahlen fon 1-100. Lassen sie das feld als quadrat ausgeben 
//mit 10 zahlen pro zeile dann werden alle slots mit eine schleife quadriert und wieder als ein
public class erstesprogramm {

	public static void main(String[] args) {
		int[][] array = new int[11][11];
		int y=1;
		for(int i=0; i<10; i++) {
			for(int ind=0; ind<10; ind++) {
				array[i][ind]=y;
				y++;
				System.out.print(array[i][ind]+" ");
				if (array[i][ind] % 10 ==0) {
				System.out.println(" ");
			
			}
			
			}
		}
		
	}
}
		
		

	


