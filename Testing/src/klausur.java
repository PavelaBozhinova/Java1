

public class klausur {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < data[i]; i++) 
			{int item = data[i];
			data[i]=data[data.length - i - 1];
			data[data.length - i - 1] = item;
			
		}
		System.out.println(java.util.Arrays.toString(data));
	}

}
