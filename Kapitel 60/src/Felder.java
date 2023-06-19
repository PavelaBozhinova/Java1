import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Felder extends JFrame implements ActionListener
{

   JLabel inLabel     = new JLabel( "Erstes Wort: ") ;
   JTextField inText  = new JTextField( 10 );

   JLabel outLabel    = new JLabel( "Zweites Wort: " ) ;
   JTextField outText = new JTextField( 10 );
   
   

   public Felder( String titel)      // Konstruktor
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

  
  public void actionPerformed( ActionEvent evt)
  {String wort = inText.getText();
 
  String out = outText.getText();
  
  
  if(!evt.getSource().equals(inText)) {
	  
	  inText.setText(out);
	  
	  }
  
  else if(!evt.getSource().equals(outText)) {
	  outText.setText(wort); 
	  }
	  
  
  }

  public static void main ( String[] args )
  {
    Felder echo  = new Felder( "Echo für beide Felder" ) ;
    echo.setSize( 280, 100 );
    echo.setVisible( true );
  }
}

