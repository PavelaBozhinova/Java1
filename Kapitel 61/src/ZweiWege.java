import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class ZweiWege extends JFrame implements ActionListener
{
  JLabel heading  = new JLabel("Convert Fahrenheit und Celsius");
  JLabel inLabel  = new JLabel("Fahrenheit    ");
  JLabel outLabel = new JLabel("Celsius ");
  
  JButton FtoC = new JButton("F to C");
  JButton CtoF = new JButton("C to F");
  JButton Reset = new JButton("Reset");

  JTextField inFahr = new JTextField( 7 );
  JTextField outCel = new JTextField( 7 );

  int fahrTemp ;
  int celsTemp ;

  ZweiWege( String title )
  {
     super( title );
     setLayout( new FlowLayout() );
     
     inFahr.setActionCommand( "Fahrenh" );
     inFahr.addActionListener( this );
     
     outCel.setActionCommand("Celsi"); 
     outCel.addActionListener(this);
     
    //Buttons
     FtoC.addActionListener(this);
     CtoF.addActionListener(this);
     Reset.setActionCommand("Reset");
     Reset.addActionListener(this);
     
    

     add( heading );
     add( inLabel );
     add( outLabel );
     add( inFahr );
     add( outCel );
     add(FtoC);
     add(CtoF);
     add(Reset);

     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convert( int F ) {
    return ( (F-32) * 5 ) / 9; 
    }
   
  public int convert2 (int C) {
	return C*9/5 + 32; 
	}
  
  public void reset() {
	 outCel.setText("");
	 inFahr.setText("");
  }
  
  public void actionPerformed( ActionEvent evt)
  {  
	  String Act = evt.getActionCommand();
	       
	    
	   
	  if (inFahr.getText().length() != 0 && outCel.getText().length() == 0) {
	   String userIn = inFahr.getText() ; 
	   fahrTemp = Integer.parseInt( userIn );
	   userIn = outCel.getText();
	   celsTemp = convert(fahrTemp);
	     outCel.setText( celsTemp+"" );
	   	repaint();}
   

   else if (outCel.getText().length() != 0 && inFahr.getText().length() == 0) {
	   String userIn = outCel.getText() ;
	  celsTemp = Integer.parseInt( userIn ) ;
	   userIn = inFahr.getText();
	   fahrTemp = convert2( celsTemp );
	   inFahr.setText( fahrTemp+"" );
	   repaint();
   }
   
		  
   if (Act.equals("Reset")) {
		 reset();}
		  
    
  }

  public static void main ( String[] args )
  {
    ZweiWege   fahr  = new ZweiWege( "F to C" ) ;
   

    fahr.setSize( 200, 180 );
    fahr.setVisible( true );
    
  }

}