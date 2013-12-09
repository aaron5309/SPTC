package sptc;

import javax.swing.JFrame;
/**
 * This class creates the frame for the student information panel. Extends JFrame.
 * @author Aaron
 *
 */
@SuppressWarnings("serial")
public class StudentInfoForm extends JFrame {

	private StudentInfoPanel currentpanel;
	
	/**
	 * Constructor method. Calls setupframe method.
	 */
	public StudentInfoForm(){
		
		currentpanel = new StudentInfoPanel();
		
		setupframe();
	}
	
	/**
	 * This method contains all the information required for the student information frame.
	 */
	private void setupframe(){
		this.setSize(500, 400);
		this.setTitle("Student Information Form");
		this.setLocationRelativeTo(null);
		this.setContentPane(currentpanel);
		this.setVisible(true);
		
	}
	
	/**
	 * Closes this frame. Designed to be called by another object to close this frame.
	 */
	public void close(){
		setVisible(false);
	}
}
