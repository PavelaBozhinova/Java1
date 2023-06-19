import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class Fraktale extends JFrame implements ActionListener {
	Igel i = new Igel() ; 
	KochKurve kk= new KochKurve() ;
	
	
	public Fraktale()  { 
		
		setLayout(new FlowLayout());
		 
		JButton b = new JButton ("Start"); 
		b.addActionListener(this); 
		add(b); 		
	} 

	
	public void actionPerformed(ActionEvent e) {
		i.rechts(0); kk.zeichne(90);
	}
	
	class Igel {

		int xa = 500;
		int ya = 500;
		int phi = 0;
		double b = 0;
		
		public void vor(double d) {
			Graphics stift = getGraphics();
			int dx = (int) (d * Math.sin(b));
			int dy = (int) (d * Math.cos(b));
			int xe = xa + dx;
			int ye = ya - dy;
			stift.drawLine(xa, ya, xe, ye);
			xa = xe;
			ya = ye;
		}
		
		public void rechts(int Winkel) {
			phi = phi + Winkel;
			b = 2 * Math.PI * phi / 360;
		}
		
		public void links(int Winkel) {
			phi = phi + Winkel;
			b = 2 * Math.PI * phi / 360;
		}}
	
	class KochKurve {
		
		int xa = 600;
		int ya = 500;
		int phi = 0;
		double b = 0;
		
		public void zeichneQuadrat(double l){
		      for(double d=0;d<4;d++){
		        i.vor(l);
		        i.rechts(90);
		      }
		   }
		 
		   public void zeichne(double l){
		      zeichneQuadrat(l);
		      if(l>6){
		         i.vor(l);
		         i.links(-30);
		         zeichne(l*0.5*Math.sqrt(3));
		         i.rechts(90);
		         i.vor(l*0.5*Math.sqrt(3));
		         zeichne(l/2);
		         i.vor(-l*0.5*Math.sqrt(3));
		         i.links(-60);
		         i.vor(-l);
		      }
		   }
}
	
	public static void main(String[] args) {
		Fraktale test1 = new Fraktale();
		test1.setSize(1000, 1000);
		test1.setVisible(true);
	}

}
	

