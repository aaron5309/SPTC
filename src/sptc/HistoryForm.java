package sptc;

import javax.swing.JFrame;

/**
 * Class designed to create the JFrame for the History GUI. Extends JFrame.
 * @author Aaron
 *
 */
public class HistoryForm extends JFrame {

	HistoryPanel currentpanel = new HistoryPanel();
	
	/**
	 * Frame constructor. Calls the setupframe method.
	 */
	public HistoryForm() {
		setupframe();
	}

	/**
	 * This method contains all the required setup information to create the JFrame.
	 */
	private void setupframe(){
		this.setSize(460,300);
		this.setLocationRelativeTo(null);
		this.setTitle("History Form");
		this.setContentPane(currentpanel);
		this.setVisible(true);
	}
}
