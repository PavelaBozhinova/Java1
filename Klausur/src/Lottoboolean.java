import java.util.Random;

public class Lottoboolean {

	public static void main(String[] args) {
		Random rand = new Random();
		
		boolean zahl[]=new boolean[50];
		int z�hler = 0;
		for(int i=1; i==50; i++ )
		{ zahl[i]=false;
		}
			
		while(z�hler<7)
		{int nummer = rand.nextInt(49);
		
			if(zahl[nummer]!=true&&nummer!=0)
				zahl[nummer]=true;
				z�hler++;	
		}
		
		for 
		
			System.out.println(java.util.Arrays.toString(zahl));
	}

}
