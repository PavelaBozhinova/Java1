import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Button extends JFrame implements ActionListener
{
  JButton color; 
  int counter =0;
 
  Button(String title)
  {
    super( title ); 
    
    setLayout( new FlowLayout() );    
    color = new JButton("Farben");
  

    color.addActionListener( this );
    add(color);                  
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   
  }
 
	  
  
  public void actionPerformed( ActionEvent evt)
  {
	  if (counter == 0) {
		  getContentPane().setBackground( Color.magenta );
		  counter++;}
	  else if (counter == 1) {
		  getContentPane().setBackground( Color.cyan );
		  counter++;}
	  else if (counter == 2) {
		  getContentPane().setBackground( Color.pink );
		  counter++;}
	  else  {
		  getContentPane().setBackground( Color.blue );
		  counter=0; }
	  
			  }
}

public class Farbenkreis
{
  public static void main ( String[] args )
  {
    Button frm = new Button("Farben");

    frm.setSize( 200, 100 );
    frm.setVisible( true );
  }
}