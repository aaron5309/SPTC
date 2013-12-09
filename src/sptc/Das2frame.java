package sptc;

import javax.swing.JFrame;

/**
 * Creates the GUI frame for the DAS2 evaluation.
 * @author Aaron
 *
 */
public class Das2frame extends JFrame {
	
	protected Das2panel currentpanel;
	
	/**
	 * Constructor. Calls the setupframe method to create frame.
	 */
	public Das2frame() {
		currentpanel = new Das2panel();
		setupframe();
	}

	/**
	 * Contains the required information to setup the frame as needed. Designed to keep the constructor clean.
	 */
	private void setupframe(){
		this.setSize(500, 700);
		this.setTitle("DAS2");
		this.setLocationRelativeTo(null);
		this.setContentPane(currentpanel);
		this.setVisible(true);
	}
}
