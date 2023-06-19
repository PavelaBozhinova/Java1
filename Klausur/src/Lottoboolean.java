import java.util.Random;

public class Lottoboolean {

	public static void main(String[] args) {
		Random rand = new Random();
		
		boolean zahl[]=new boolean[50];
		int zähler = 0;
		for(int i=1; i==50; i++ )
		{ zahl[i]=false;
		}
			
		while(zähler<7)
		{int nummer = rand.nextInt(49);
		
			if(zahl[nummer]!=true&&nummer!=0)
				zahl[nummer]=true;
				zähler++;	
		}
		
		for 
		
			System.out.println(java.util.Arrays.toString(zahl));
	}

}
