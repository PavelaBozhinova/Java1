import  java.awt.* ;
import  java.awt.event.*  ;
import javax.swing.* ;
import java.text.*;



public class FatCalc2 extends 
JFrame implements ActionListener
{
		JLabel heading		= new JLabel 
				("Percent of Calories from Fat");
		JLabel fatLabel		= new JLabel 
				("Enter grams of Fat: ");
		JLabel calLabel		= new JLabel 
				("Enter total calories: ");
		JLabel perLabel 	= new JLabel 
				("Percent calories from fat: ");
		
		JTextField inFat	= new JTextField (8);
		JTextField inCal	= new JTextField (8);
		JTextField outPer	= new JTextField (8);
		JTextField outFat	= new JTextField (13);
		JButton 	doit 	= new JButton ("Do It!");
		double calories ;   
		double fatGrams ;   
		double percent ;    
	
  public FatCalc2()  
  { 
    setTitle ("Calories from Fat");
	setLayout ( new FlowLayout());
    add (heading );
    add (fatLabel);
    add (inFat   );
    add (calLabel);
    add (inCal	 );
    add (perLabel);
    add (outPer	 );
    add (outFat  );
    outPer.setEditable(false);
    outFat.setEditable(false);
    add ( doit	 );
    doit.addActionListener(this);
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
  }

  // Applikationsmethode
  	public void calcPercent()
  		{
  			percent = ( (fatGrams * 9) / calories ) * 100 ;
  		}
  
  	public void actionPerformed ( ActionEvent evt) 
	{
		String userIn;
		userIn		=inFat.getText();
		try {
		fatGrams	=Double.parseDouble(userIn);}
		catch (Exception ex) {
			inFat.setText("Zahl eingeben!");
		}
		userIn	=inCal.getText();
		try {
		calories=Double.parseDouble(userIn);}
		catch(Exception ex) {
			inCal.setText("Zahl eingeben!");
		}
		calcPercent();
		if (percent >=30) {
			outFat.setText("Zu viele Fettkalorien!");
		} else { 
			outFat.setText("Okay.");
		}
		
		outPer.setText(new DecimalFormat("#0.0##").format(Math.round(percent)) + "%" );
		
	}

  public static void main ( String[] args )
  {
    FatCalc2 fatApp  = new FatCalc2() ;
    fatApp.setSize(280,180);
    fatApp.setVisible(true);
  }
 

}