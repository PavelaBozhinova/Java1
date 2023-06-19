import java.awt.* ;
	import java.awt.event.*;
	import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.w3c.dom.events.EventTarget;

	public class CookieCalculator extends JFrame implements ActionListener, ChangeListener
	{
		JLabel h = new JLabel ("Wie hungrig sind Sie (1-10): ");
		JLabel au = new JLabel ("Wie lecker sieht das Gebaeck aus (1-10): ");
		JLabel ar = new JLabel ("Wie gut riecht das Gebaeck (1-10): ");
		
		
		JSlider sliderh = new JSlider (JSlider.HORIZONTAL, 1,10,1);
		JSlider sliderau = new JSlider (JSlider.HORIZONTAL, 1,10,1);
		JSlider sliderar = new JSlider (JSlider.HORIZONTAL, 1,10,1);
		
		JTextField res = new JTextField(20);
		JPanel ress = new JPanel();
		
		public CookieCalculator(){
			setDefaultCloseOperation( EXIT_ON_CLOSE );   
		    setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		    
		    add(h); add(sliderh);
		    add(au); add(sliderau);
		    add(ar); add(sliderar);
		    
		    ress.add(res); add(ress);
		    
		    sliderh.setMajorTickSpacing( 1 );
		    sliderh.setPaintTicks( true );
		    sliderh.setPaintLabels( true );
		    sliderh.addChangeListener(this);
		    
		    sliderau.setMajorTickSpacing( 1 );
		    sliderau.setPaintTicks( true );
		    sliderau.setPaintLabels( true );
		    sliderau.addChangeListener(this);
		    
		    sliderar.setMajorTickSpacing( 1 );
		    sliderar.setPaintTicks( true );
		    sliderar.setPaintLabels( true );
		    sliderar.addChangeListener(this);
		    
		    res.setEditable(false);
			
		}
		public void stateChanged(ChangeEvent evt) {
			int h = sliderh.getValue();
			int au = sliderau.getValue();
			int ar = sliderar.getValue();
			
			if((h + au + ar) > 15) {
				res.setText("Gebaeck kaufen!");
			}
			else
				res.setText("Setzen Sie Ihren Einkauf fort.");
		}
		
		 public void actionPerformed(ActionEvent evtrt) {
			  
				
			}
		
		public static void main ( String[] args )
		  {
			 CookieCalculator cookie  = new CookieCalculator() ;
		    cookie.setSize( 400, 250 );
		    cookie.setResizable( false );
		    cookie.setVisible( true );
		  }

	}