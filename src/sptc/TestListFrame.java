package sptc;

import javax.swing.JFrame;

/**
 * This class creates the JFrame for the test list GUI. Extends JFrame.
 * @author Aaron
 *
 */
public class TestListFrame extends JFrame {
	protected TestListPanel currentpanel;
	
	/**
	 * Constructor method. Calls the setupframe method.
	 */
	public TestListFrame(){
		
		currentpanel = new TestListPanel();
		setupframe();
	}
	
	/**
	 * Contains all the information needed to create the frame for the test list GUI.
	 */
	private void setupframe(){
		this.setSize(500, 400);
		this.setTitle("Available Test List");
		this.setLocationRelativeTo(null);
		this.setContentPane(currentpanel);
		this.setVisible(true);
	}
}
