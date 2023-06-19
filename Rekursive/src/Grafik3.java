import java.applet.* ; 
import java.awt.* ; 
import java.awt.event.* ; 
public class Grafik3 extends Applet implements ActionListener { 
Igel1 i = new Igel1() ; 
Baum bb= new Baum() ; 
public Grafik3( ) { 
i.setSize(600,400) ; i.setBackground(Color.yellow) ; 
add(i) ; 
Button b = new Button ("Start") ; b.addActionListener (this) ; 
add(b) ; 
} 
public void actionPerformed(ActionEvent e) { 
bb.zeichne(140) ; 
 
class BiBaum{ 
public void zeichne(int l) { 
if (1 >2){ 
 i.vor(1) ; 
i.rechts(90) ; i.vor(l) ; i.rechts (-90) ; 
zeichne (1/2) ; 
i.rechts(90 ) ; i.vor(-2*1) ; i.rechts (-90) ; 
zeichne(1/2) ; 
i.rechts(90) ; i.vor(l) ; i.rechts (-90) ; 
i.vor(-1) ; 
} 
} 
} 
}
}
