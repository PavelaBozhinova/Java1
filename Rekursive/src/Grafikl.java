import java.applet.* ;
import java.awt.* ;
import java.awt.event.* ;
public class Grafikl extends Applet implements ActionListener {

	Igel1 i = new Igel1() ;
	Quadrat qu= new Quadrat() ;
	
	public Grafikl() {
		i.setSize(400,400) ; add(i) ;
		Button b = new Button ("Start") ;
		b.addActionListener(this ) ;
		add(b) ;
	}
	public void actionPerformed(ActionEvent e) {
		qu.zeichne(4) ;
	}
	class Quadrat{
		public void zeichne(int n) {
			if (n>0){
				i.Links(50); 
				i.Rechts (90) ;
				zeichne (n-1) ;
			}
		}
	}
} 
