
	import java.awt.* ;
	import java.awt.event.*;
	import javax.swing.*;

	public class IdealWeightglue extends JFrame implements ActionListener
	{
	  JRadioButton genderM, genderF;
	  ButtonGroup  genderGroup;
	  Box          genderBox;

	  JRadioButton heightA, heightB, heightC, heightD, heightE;
	  ButtonGroup  heightGroup;
	  Box          heightBox;

	  Box          buttonBox;

	  JTextField   resultText;
	  JLabel       resultLabl;
	  JPanel       resultPanel;
	  
	  static Double W = 0.0;
	   String Gender= "";
	  public IdealWeightglue()
	  {
	    setTitle( "Your Ideal Weight" );
	    setDefaultCloseOperation( EXIT_ON_CLOSE );

	    // Gender-Gruppe
	    genderM = new JRadioButton("Male", true );
	    genderF = new JRadioButton("Female", false );
	    genderGroup = new ButtonGroup();
	    genderGroup.add( genderM );
	    genderGroup.add( genderF );

	    genderBox = new Box( BoxLayout.Y_AXIS );
	    genderBox.add( new JLabel("Your Gender") );
	    genderBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
	    genderBox.add( genderM );
	    genderBox.add( genderF );
	    genderBox.add( Box.createRigidArea( new Dimension(1, 73) ) );
	    
	    genderM.addActionListener( this );
	    genderF.addActionListener( this );
	    
	    genderM.setActionCommand("genderM");
	    genderF.setActionCommand("genderF");

	    // Height-Gruppe
	    heightA = new JRadioButton("60 to 64 inches", true  );
	    heightB = new JRadioButton("64 to 68 inches", false );
	    heightC = new JRadioButton("68 to 72 inches", false );
	    heightD = new JRadioButton("72 to 76 inches", false );
	    heightE = new JRadioButton("76 to 80 inches", false );

	    heightGroup = new ButtonGroup();
	    heightGroup.add( heightA ); heightGroup.add( heightB );
	    heightGroup.add( heightC ); heightGroup.add( heightD );
	    heightGroup.add( heightE );

	    heightBox = new Box(BoxLayout.Y_AXIS);
	    heightBox.add( new JLabel("Your Height") );
	    heightBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
	    heightBox.add( heightA ); heightBox.add( heightB );
	    heightBox.add( heightC ); heightBox.add( heightD );
	    heightBox.add( heightE );
	    
	    heightA.addActionListener( this );
	    heightB.addActionListener( this );
	    heightC.addActionListener( this );
	    heightD.addActionListener( this );
	    heightE.addActionListener( this );
	    
	    
	    heightA.setActionCommand("heightA");
	    heightB.setActionCommand("heightB");
	    heightC.setActionCommand("heightC");
	    heightD.setActionCommand("heightD");
	    heightE.setActionCommand("heightE");
	    

	    // Button-Box
	    buttonBox = new Box( BoxLayout.X_AXIS );
	    buttonBox.add( Box.createHorizontalGlue() );
	    buttonBox.add( genderBox );
	    buttonBox.add( Box.createHorizontalGlue() );
	    buttonBox.add( heightBox );
	    buttonBox.add( Box.createHorizontalGlue() );

	    // Result-Panel
	    resultText  = new JTextField(7) ;
	    resultText.setEditable( false );
	    resultLabl  = new JLabel("Ideal Weight in Pounds");
	    resultPanel = new JPanel();
	    resultPanel.add( resultLabl );
	    resultPanel.add( resultText );

	    // Frame
	    setLayout( new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) );
	    add( buttonBox );
	    add( resultPanel );
	  }
	  
	  public void actionPerformed(ActionEvent e) {
		  
		  if (e.getActionCommand().equals("genderM")){
				 Gender = "M";
			 }
			 if (e.getActionCommand().equals("genderF")){
				 Gender = "F";
			 }
			  
			 	if (e.getActionCommand().equals("heightA") && Gender.equals("M")){
				  W=(double) ((((60+64)/2)*((60+64)/2))/28);
			 	}
				
			 	if (Gender.equals("M")) {
					  if (e.getActionCommand().equals("heightB") ){
						  W=(double) ((((64+68)/2) * ((64+68)/2))/28);}
					  if (e.getActionCommand().equals("heightC")){
						  W=(double) ((((68+72)/2)*((68+72)/2))/28);}
					  if (e.getActionCommand().equals("heightD") ){
						  W=(double) ((((72+76)/2)*((72+76)/2))/28);}
					  if (e.getActionCommand().equals("heightE") ){
						  W=(double) ((((76+80)/2)*((76+80)/2))/28);}}
					  
				if (Gender.equals("F")) {
					  if (e.getActionCommand().equals("heightA")){
						  W=(double) ((((60+64)/2)*((60+64)/2))/30);}
					  if (e.getActionCommand().equals("heightB")){
						  W=(double) ((((64+68)/2)*((64+68)/2))/30);}
					  if (e.getActionCommand().equals("heightC") ){
						  W=(double) ((((68+72)/2)*((68+72)/2))/30);}
					  if (e.getActionCommand().equals("heightD") ){
						  W=(double) ((((72+76)/2)*((72+76)/2))/30);}
					  if (e.getActionCommand().equals("heightE") ){
						  W=(double) ((((76+80)/2)*((76+80)/2))/30);}}
			 
		 
		  resultText.setText(String.valueOf(W));
		  
		  repaint();
			
		}

	public static void main ( String[] args )
	  {
		  IdealWeightglue weightApp  = new IdealWeightglue() ;
	    weightApp.setSize( 350, 250 );
	    weightApp.setResizable( false );
	    weightApp.setVisible( true );
	  }

	
	
	}
