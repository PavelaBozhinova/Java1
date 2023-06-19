import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Farbkreis extends JFrame implements ActionListener{

	 JButton color; // Referenz auf ein Button Objekt

	  // Konstruktor von ButtonFrame2
	  Farbkreis(String title)
	  {
	    super( title );                   // den JFrame Konstruktor aufrufen
	    setLayout( new FlowLayout() );    // den Layoutmanager setzen

	    // construct a Button
	    color = new JButton("Rot");
	    color = new JButton("Gr�n");
	    color = new JButton("Blau");
	    color = new JButton("Grau");
	    
	    color.setActionCommand("rot");
	    color.setActionCommand("gr�n");
	    color.setActionCommand("blau");
	    color.setActionCommand("grau");
	    

	    // das ButtonFrame2-Objekt als Listener f�r den JButton registrieren
	    color.addActionListener( this );
	   
	    add(color);                   // JFrame den Button hinzuf�gen
	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   
	  }

	  public void actionPerformed( ActionEvent evt)
	  {
		  if (evt.getActionCommand().equals("rot"))
	    getContentPane().setBackground( Color.red );
		  if (evt.getActionCommand().equals("gr�n"))
	    getContentPane().setBackground( Color.green ); 
		  if (evt.getActionCommand().equals("blau"))
	    getContentPane().setBackground( Color.blue ); 
		  if (evt.getActionCommand().equals("grau"))
	    getContentPane().setBackground( Color.gray ); // den Hintergrund des Frames �ndern
	    repaint();  // das System aufforden den Bildschirm zu zeichnen.
	  }
	}

	public class FarbenB
	{
	  public static void main ( String[] args )
	  {
	    Farbkreis frmm = new Farbkreis("Farbkreis");

	    frmm.setSize( 200, 100 );
	    frmm.setVisible( true );
	  }
	}