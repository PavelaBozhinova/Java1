import java.awt.* ;
	import java.awt.event.*;
	import javax.swing.*;

	public class Rechnen extends JFrame implements ActionListener
	{
		JLabel heading = new JLabel ("Rechner");
		JLabel Zahl1	= new JLabel(" Zahl 1: ");
		JTextField in1 = new JTextField(7);
		JLabel Zahl2	= new JLabel(" Zahl 2: ");
		JTextField in2 = new JTextField(7);
		JRadioButton plus = new JRadioButton("+", false);
		JRadioButton minus = new JRadioButton("-", false);
		
		JTextField Result = new JTextField(7);
		
		JButton Button = new JButton ("Rechnen");
		JPanel panel = new JPanel();
		JPanel panelerg = new JPanel();
		JPanel a = new JPanel();
		JPanel b = new JPanel();
		JLabel ResultLabl = new JLabel("Ergebnis: ");
		
		int e;
		int x;
		int res = 0;
		
		Rechnen()
		{
			
			setTitle("Rechner");
			
			 setLayout( new BoxLayout(getContentPane(), BoxLayout.Y_AXIS) );
			 setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			 
			 add(heading);
			 a.add(Zahl1);a.add(in1); 			 
			 b.add(Zahl2); b.add(in2);

			 panelerg.add(plus);
			 panelerg.add(minus);
			 
			 add(a); add(b);
			
			 
			 add(panelerg);
			 add(Button);add(panel);
			 panel.add(ResultLabl);
			 panel.add(Result); 
			
			
			in1.addActionListener(this);
			in2.addActionListener(this);
			plus.addActionListener(this);
			minus.addActionListener(this);
			
			
			Button.addActionListener(this);
			Button.setActionCommand("rechne");
			
			Result.setEditable(false);
			

		}
		
	
		public void reset() {
			plus.setSelected(false);
			minus.setSelected(false);
		}
		
		public void actionPerformed(ActionEvent evt) {
			String Act = evt.getActionCommand();
			
			String input = in1.getText();
			e = Integer.parseInt(input);
			
			String output = in2.getText();
			x = Integer.parseInt(output);
			
			
			if (Act.equals("rechne")) {
				if (plus.isSelected() ) {
				res=e + x ;
				Result.setText(String.valueOf(res));
				reset();
				}
				
				else if (minus.isSelected()) {
					res=e - x ;
					Result.setText(res+"");
					reset();
					}
			}
			
    }
		
			
		
		public static void main ( String[] args )
		  {
			  Rechnen calc  = new Rechnen() ;
		    calc.setSize( 350, 325 );
		 
		    calc.setVisible( true );
		  
		  }
	}
