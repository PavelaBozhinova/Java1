import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.* ;


public class Klausur extends JFrame implements ActionListener
{
  
	JLabel heading = new JLabel ("Rechnen");
	JLabel Zahl1 = new JLabel ("Erste Zahl: ");
	JLabel Zahl2 = new JLabel ("Zweite Zahl");
	JTextField erste = new JTextField (7);
	JTextField zweite = new JTextField(7);
	JRadioButton plus = new JRadioButton ("+", false);
	JRadioButton minus = new JRadioButton ("-", false);
	JButton Button = new JButton ("Rechnen");
	JLabel Result = new JLabel ("The result is: ");
	JTextField res = new JTextField (7);
	
	
	JPanel a = new JPanel ();
	JPanel b = new JPanel();
	JPanel rButtons = new JPanel();
	JPanel Ergebnis = new JPanel();
	
	double x,y,e;
	
  //Anlegen von Vaiablen, Textfeldern, Labels und Button/Buttongruppen
 

  public Klausur()
  {
    setTitle( "besonders einfache Klausur" );
    setDefaultCloseOperation( EXIT_ON_CLOSE );
   
    setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
    
 
    
    add(heading);
    a.add(Zahl1); a.add(erste);
    b.add(Zahl2); b.add(zweite);
    rButtons.add(plus); rButtons.add(minus);
   
    Ergebnis.add(Result); Ergebnis.add(res);
    add(a);
    add(b);
    add(rButtons); add(Button);
    add(Ergebnis);
    
    res.setEditable(false);
    
    erste.addActionListener(this);
    zweite.addActionListener(this);
    plus.addActionListener(this);
    minus.addActionListener(this);
    Button.addActionListener(this);
    Button.setActionCommand("Rechne");
    
    //zum ActionListener hinzufügen und ActionCommand setzen
  

  }
    
  
  public void reset() {
	  plus.setSelected(false);
	  minus.setSelected(false);
  }
    public void actionPerformed( ActionEvent evt )
    {String act = evt.getActionCommand();
    
    String in1 = erste.getText();
    String in2 = zweite.getText();
    
    x = Double.parseDouble(in1);
    y = Double.parseDouble(in2);
    
    if (act.equals("Rechne")) {
    	if (plus.isSelected()) {
    		e = x+y;
    		res.setText(String.valueOf(e));
    		reset();
    	}
    	
    	else if (minus.isSelected()) {
    		e = x-y;
    		res.setText(String.valueOf(e));
    		reset();
    	}
    }
    	
    	}
    	
  
    
    
    public static void main ( String[] args )
    {
      Klausur rechner  = new Klausur() ;
      rechner.setSize( 700,200 );
      rechner.setVisible( true );
    }
  }
