import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonFrame2 extends JFrame implements ActionListener
{
  JButton rotB, grünB, blauB, grauB; // Referenz auf ein Button Objekt

  // Konstruktor von ButtonFrame2
  ButtonFrame2(String title)
  {
    super( title );                   // den JFrame Konstruktor aufrufen
    setLayout( new FlowLayout() );    // den Layoutmanager setzen

    // construct a Button
    rotB = new JButton("Rot");
    grünB = new JButton("Grün");
    blauB = new JButton("Blau");
    grauB = new JButton("Grau");
    
    rotB.setActionCommand("rot");
    grünB.setActionCommand("grün");
    blauB.setActionCommand("blau");
    grauB.setActionCommand("grau");
    

    // das ButtonFrame2-Objekt als Listener für den JButton registrieren
    rotB.addActionListener( this );
    grünB.addActionListener( this );
    blauB.addActionListener( this );
    grauB.addActionListener( this );

    add(rotB);                   // JFrame den Button hinzufügen
    add(grünB);
    add(blauB);
    add(grauB);
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   
  }

  public void actionPerformed( ActionEvent evt)
  {
	  if (evt.getActionCommand().equals("rot"))
    getContentPane().setBackground( Color.red );
	  if (evt.getActionCommand().equals("grün"))
    getContentPane().setBackground( Color.green ); 
	  if (evt.getActionCommand().equals("blau"))
    getContentPane().setBackground( Color.blue ); 
	  if (evt.getActionCommand().equals("grau"))
    getContentPane().setBackground( Color.gray ); // den Hintergrund des Frames ändern
    repaint();  // das System aufforden den Bildschirm zu zeichnen.
  }
}

public class Buttons
{
  public static void main ( String[] args )
  {
    ButtonFrame2 frm = new ButtonFrame2("Klicken Sie auf einen Button");

    frm.setSize( 300, 150 );
    frm.setVisible( true );
  }
}