import java.util.Scanner;

public class Fakultät {
	public static void main(String[] args) {
	   
	System.out.print("Schreib ein Zahl: ");	
	Scanner scan = new Scanner(System.in);
	
	 int  a=0,b=1,c,i,counter=scan.nextInt();  
	 
	 System.out.print(a + " " + b);
	   
	 for(i=2;i<counter;++i)   
	 {    
	  c=a+b;    
	  System.out.print(" "+c);    
	  a=b;    
	  b=c;    
	 }  }  
	 
	  
}
	  
