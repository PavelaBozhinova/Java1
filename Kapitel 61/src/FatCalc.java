import  java.awt.* ;
import  java.awt.event.*  ;
import javax.swing.* ;


public class FatCalc extends 
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
		
		JTextField inFat	= new JTextField (7);
		JTextField inCal	= new JTextField (7);
		JTextField outPer	= new JTextField (7);
		JTextField outFat	= new JTextField (7);
		JButton 	doit 	= new JButton ("Do It!");
		double calories ;   
		double fatGrams ;   
		double percent ;    
		
  public FatCalc()  
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
   
    outPer.setEditable(false);
    outFat.setEditable(false);
    add ( doit );
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
		
		outPer.setText(Math.round(percent) + "%");
		
	}

  public static void main ( String[] args )
  {
    FatCalc fatApp  = new FatCalc() ;
    fatApp.setSize(280,180);
    fatApp.setVisible(true);
  }
 

}