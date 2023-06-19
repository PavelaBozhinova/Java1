
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grafikbaum extends JFrame implements ActionListener {
	BiBaum baum = new BiBaum();JButton b1;
	
	public Grafikbaum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new JButton("Button");
		setLayout(new FlowLayout());
		add(b1);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		baum.zeichne(140);
	}
	
	class BiBaum {
		int xa = 500;
		int ya = 500;
		int phi = 0;
		double b = 0;
		
		public void vor(double l) {
			Graphics stift = getGraphics();
			int dx = (int) (l * Math.sin(b));
			int dy = (int) (l * Math.cos(b));
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
			phi = phi - Winkel;
			b = 2 * Math.PI * phi / 360;
		}
		
		public void zeichne(double l) {
			if (l > 1) {
			
				vor(l);
				zeichne(l/2); rechts(180); vor(l);rechts(60);
				
				vor(l);
				zeichne(l/2); rechts(180); vor(l); rechts(60);
				
				vor(l);
				zeichne(l/2); rechts(180); vor(l); rechts(60);
				
	//andere lösung aber bisschen seitwärts
//				vor(l);
//				zeichne(l/2); vor(-2*l); rechts(120); vor(2*l); links(120);
//				
//				vor(2*1);
//				zeichne(l/2); links(60); vor(2*l); links(60); vor(2*l);	rechts(120);
//				
//				zeichne(l/2); rechts(60); vor(2*l); links(60);
//				
				
				
			}
		}
	}
	
	public static void main(String[] args) {
		Grafikbaum test1 = new Grafikbaum();
		test1.setSize(1000, 1000);
		test1.setVisible(true);
	}
}
