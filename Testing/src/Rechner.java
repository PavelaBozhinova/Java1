import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class Rechner extends JFrame implements ActionListener{
	JLabel heading		= new JLabel	("Rechner");
	JLabel Zahl1		= new  JLabel	("Zahl1");
	JTextField erste	= new JTextField(7);
	JLabel Zahl2		= new JLabel	("Zahl2");
	JPanel ha			= new JPanel();
	JPanel he			= new JPanel();
	JTextField zweite	= new JTextField(7);
	JRadioButton plus	= new JRadioButton ("+", false);
	JRadioButton minus	= new JRadioButton ("-", false);
	JPanel minusundplus	= new JPanel();
	JButton rechnen 	= new JButton	("Rechnen!");
	JLabel Ergebnis		= new JLabel	("Ergebnis");
	JTextField ergebnis = new JTextField(7);
	JPanel panel		= new JPanel();
	double e, a,b;
	
	public Rechner() {
		setTitle ("Rechner");
		setLayout( new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(heading);
		ha.add(Zahl1); ha.add(erste);
		he.add(Zahl2); he.add(zweite);
		minusundplus.add(plus); minusundplus.add(minus);// Panel
		add(ha);//panel von die Zahlen
		add(he);
		add(minusundplus);
		add(rechnen);
		add(Ergebnis);
		add(ergebnis);
		ergebnis.setEditable(false);
		panel.add(Ergebnis); panel.add(ergebnis);
		add(panel);
		rechnen.addActionListener(this);
		
		
	}
	public void reset() {
		plus.setSelected(false);
		minus.setSelected(false);
	}
	public void pluss() {
		if (plus.isSelected()) {
			e = a+b;
			
		}
		else if (minus.isSelected()) {
			e= a-b;
			
		}reset();
	}
	public void actionPerformed ( ActionEvent evt) {
		
		String IN;
		String usern;
		IN = erste.getText();
		usern = zweite.getText();
		a = Double.parseDouble(IN);
		b = Double.parseDouble(usern);
		
		
		pluss();
		ergebnis.setText(e+ "");
		repaint();
		
	}
	public static void main ( String[] args )
	  {
	    Rechner fatApp  = new Rechner() ;
	    fatApp.setSize(400,300);
	    fatApp.setVisible(true);
	  }
}
