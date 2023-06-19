import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Texttausch extends JFrame implements ActionListener
{

   JLabel inLabel     = new JLabel( "Erstes Wort: ") ;
   JTextField inText  = new JTextField( 10 );

   JLabel outLabel    = new JLabel( "Zweites Wort: " ) ;
   JTextField outText = new JTextField( 10 );
   
   JButton Enter = new JButton("Tausch");

   public Texttausch( String titel)      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() );
   

      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;
      add( Enter    ) ;
      
     
      Enter.addActionListener(this);
      inText.addActionListener( this );
      outText.addActionListener(this);
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

  
  public void actionPerformed( ActionEvent evt)
  {String wort = inText.getText();
 
  String wort2 = outText.getText();
 
  
  if(wort.equals(wort)) {
	  
	  outText.setText(wort);}
  
	  if (wort2.equals(wort2))
	    
	 
	  inText.setText(wort2);
  }

  public static void main ( String[] args )
  {
    Texttausch echo  = new Texttausch( "Texttausch" ) ;
    echo.setSize( 280, 130 );
    echo.setVisible( true );
  }
}

