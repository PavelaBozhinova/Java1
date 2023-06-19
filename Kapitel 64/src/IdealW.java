import java.awt.* ;
	import java.awt.event.*;
	import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.w3c.dom.events.EventTarget;

	public class IdealW extends JFrame implements ActionListener, ChangeListener
	{
	  JRadioButton genderM, genderF;
	  ButtonGroup  genderGroup;
	  Box          genderBox;
	  JSlider	   slider;
	 
	  ButtonGroup  heightGroup;
	  Box          heightBox;

	  Box          buttonBox;

	  JTextField   resultText;
	  JLabel       resultLabl;
	  JPanel       resultPanel;
	  
	  double W, H2;
	  
	   String Gender= "";
	  public IdealW()
	  {
	    setTitle( "Your Ideal Weight" );
	    setDefaultCloseOperation( EXIT_ON_CLOSE );
	    
	    slider = new JSlider( JSlider.VERTICAL, 40, 80, 40);
	    slider.setMajorTickSpacing( 10 );
	    slider.setMinorTickSpacing(  1 );
	    slider.setPaintTicks( true );
	    slider.setPaintLabels( true );
	    slider.setPreferredSize( new Dimension(300,50) ) ;
	    
	    slider.setName("slider");
	    slider.addChangeListener(this);
	    
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
	    genderBox.add( Box.createRigidArea( new Dimension(1, 200) ) );
	    
	    genderM.addActionListener( this );
	    genderF.addActionListener( this );
	    
	    genderM.setActionCommand("genderM");
	    genderF.setActionCommand("genderF");

	    

	    heightGroup = new ButtonGroup();
	    

	    heightBox = new Box(BoxLayout.Y_AXIS);
	    heightBox.add( new JLabel("Your Height") );
	    heightBox.add(new JLabel("in Inches"));
	    heightBox.add( Box.createRigidArea( new Dimension(1, 1) ) );
	    heightBox.add(slider);
	    heightBox.add( Box.createRigidArea( new Dimension(180, 0) ) );
	    
	    

	    // Button-Box
	    buttonBox = new Box( BoxLayout.X_AXIS );
	    buttonBox.add( genderBox );
	    buttonBox.add( Box.createHorizontalGlue() );
	    buttonBox.add( heightBox );
	    buttonBox.add(new JLabel (" "));
	    genderBox.add(Box.createHorizontalGlue());
	   

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
	  
	  
	  
	  

	public void stateChanged(ChangeEvent evt) {
		 double e = slider.getValue();
		if (genderM.isSelected()) {

			  W = (e * e) / 28 ;
			  resultText.setText(Math.round(W) + "");}
		
	  
	  
	  else if (genderF.isSelected()) {
		  W = (e * e) / 30 ;}
		  resultText.setText(Math.round(W) + "");
		
		
	  }
	  public void actionPerformed(ActionEvent evtrt) {
		  
			
		}
	

	public static void main ( String[] args )
	  {
		  IdealW weightApp  = new IdealW() ;
	    weightApp.setSize( 250, 350 );
	    weightApp.setResizable( false );
	    weightApp.setVisible( true );
	  }

	
	
	
	}
