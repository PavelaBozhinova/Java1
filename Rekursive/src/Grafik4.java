import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class Grafik4 extends JFrame implements ActionListener {
	Igel i = new Igel() ; 
	KochKurve kk= new KochKurve() ;
	
	
	public Grafik4()  { 
		
		setLayout(new FlowLayout());
		 
		JButton b = new JButton ("Start"); 
		b.addActionListener(this); 
		add(b); 		
	} 

	
	public void actionPerformed(ActionEvent e) {
		i.rechts(90); kk.zeichne(600);
	}
	
	class Igel {

		int xa = 300;
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
		
		int xa = 300;
		int ya = 500;
		int phi = 0;
		double b = 0;
		
		public void zeichne(double l) {
			if (l < 20 ) 
				i.vor(l) ; 
			
			else { 
			l=l/3; 
			zeichne(l) ;
			i.rechts (-60) ;
			zeichne(l) ;
			i.rechts(120) ; 
			zeichne(l) ;
			i.rechts (-60) ;
			zeichne (l) ; 
		}
	}}

	
	public static void main(String[] args) {
		Grafik4 test1 = new Grafik4();
		test1.setSize(1000, 1000);
		test1.setVisible(true);
	}
}
	

