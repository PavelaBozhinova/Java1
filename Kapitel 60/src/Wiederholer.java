import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Wiederholer extends JFrame implements ActionListener
{

   JLabel inLabel     = new JLabel( "Geheimes Wort: ") ;
   JTextField inText  = new JTextField( 10 );

   JLabel outLabel    = new JLabel( "Richtig oder Falsch?: " ) ;
   JTextField outText = new JTextField( 10 );

   public Wiederholer( String titel)      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() );
   

      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;

      inText.addActionListener( this );
      outText.addActionListener(this);
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

  
  	int counter=0;
  public void actionPerformed( ActionEvent evt)
  {
  
  
	  String wort = inText.getText();
	  String rof ; //richtig oder falsch
    
    	if (wort.equals("Katze")) { 
    		rof = "Richtig";
    }
    	
    	else {
    		counter++;
    		rof = "Falsch";}
    	
    	if (wort.equals("")) {
    		rof = "Fehler";
    	}
    			if (counter == 3) {
    				System.exit(0);}
    				outText.setText(rof);
    				evt.getActionCommand();
    			
  }

  public static void main ( String[] args )
  {
    Wiederholer echo  = new Wiederholer( "Ratespiel" ) ;
    echo.setSize( 300, 100 );
    echo.setVisible( true );
  }
}