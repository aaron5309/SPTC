package sptc;

import javax.swing.JFrame;

/**
 * This class creates the JFrame associated with the KTEA2 evaluation. Extends JFrame.
 * @author Aaron
 *
 */
public class Ktea2frame extends JFrame {

	private Ktea2panel currentpanel = new Ktea2panel();
	
	/**
	 * Constructor for frame. Calls setupframe method.
	 */
	public Ktea2frame(){
		setupframe();
	}
	
	/**
	 * This method contains all the required information to create the KTEA2 frame.
	 */
	private void setupframe(){
		this.setSize(650, 700);
		this.setTitle("KTEA2");
		this.setLocationRelativeTo(null);
		this.setContentPane(currentpanel);
		this.setVisible(true);
	}
}
