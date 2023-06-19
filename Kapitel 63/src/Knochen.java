import java.awt.* ;
	import java.awt.event.*;
	import javax.swing.*;

	public class Knochen extends JFrame implements ActionListener
	{
	  JRadioButton genderM, genderF;
	  ButtonGroup  genderGroup;
	  Box          genderBox;

	  JRadioButton heightA, heightB, heightC, heightD, heightE;
	  ButtonGroup  heightGroup;
	  Box          heightBox;
	  
	  JRadioButton schmal, normal, stark;
	  ButtonGroup  KnochenbauGroupe ;
	  Box          KnochenbauBox;

	  Box          buttonBox;

	  JTextField   resultText;
	  JLabel       resultLabl;
	  JPanel       resultPanel;
	  
	  static Double W = 0.0 , KB = 0.0;
	  String Gender= "";
	  public Knochen()
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
	    
	    // Knochenbau-Gruppe
	    schmal = new JRadioButton("slim", true );
	    normal = new JRadioButton("normal", false );
	    stark = new JRadioButton("heavy", false );
	    KnochenbauGroupe = new ButtonGroup();
	    KnochenbauGroupe.add( schmal );
	    KnochenbauGroupe.add( normal );
	    KnochenbauGroupe.add( stark );
	    
	    KnochenbauBox = new Box(BoxLayout.Y_AXIS);
	    KnochenbauBox.add( new JLabel("Your bone structure") );
	    KnochenbauBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
	    KnochenbauBox.add( schmal );
	    KnochenbauBox.add( normal );
	    KnochenbauBox.add( stark ); 
	    KnochenbauBox.add( Box.createRigidArea( new Dimension(1, 55) ) );
	    
	    schmal.addActionListener( this );
	    normal.addActionListener( this );
	    stark.addActionListener( this );
	    
	    schmal.setActionCommand("schmal");
	    normal.setActionCommand("normal");
	    stark.setActionCommand("stark");
	    
	    // Button-Box
	    buttonBox = new Box( BoxLayout.X_AXIS );
	    buttonBox.add( Box.createHorizontalGlue() );
	    buttonBox.add( genderBox );
	    buttonBox.add( Box.createHorizontalGlue() );
	    buttonBox.add( heightBox );
	    buttonBox.add( Box.createHorizontalGlue() );
	    buttonBox.add( KnochenbauBox );
	    buttonBox.add( Box.createHorizontalGlue() );
	    
	    // Result-Panel
	    resultText  = new JTextField(7) ;
	    resultText.setEditable( false );
	    resultLabl  = new JLabel("Ideal Weight");
	    resultPanel = new JPanel();
	    resultPanel.add( resultLabl );
	    resultPanel.add( resultText );

	    // Frame
	    setLayout( new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) );
	    add( buttonBox );
	    add( resultPanel );
	  }
	  
	  public void actionPerformed(ActionEvent e) {
		 
		 if (e.getActionCommand().equals("schmal")) {
			 KB = 0.95; }
		 if (e.getActionCommand().equals("stark")) {
			 KB = 1.05; } 
		 if (e.getActionCommand().equals("normal")) {
			 KB = 1.0;}
		 
		  
		 if (e.getActionCommand().equals("genderM")){
			 Gender = "M"; }
		 if (e.getActionCommand().equals("genderF")){
			 Gender = "F"; }
		  
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
		 
			  
		  resultText.setText(String.valueOf((W*KB)));
		  
		  repaint();
			
		}

	 
	public static void main ( String[] args )
	  {
		  Knochen weightApp  = new Knochen() ;
	    weightApp.setSize( 450, 225 );
	    weightApp.setResizable( false );
	    weightApp.setVisible( true );
	  }

	
	
	}
