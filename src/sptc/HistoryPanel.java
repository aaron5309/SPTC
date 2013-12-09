package sptc;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.SpringLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import org.docx4j.openpackaging.exceptions.Docx4JException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

/**
 * This class creates the GUI panel for the History Frame. Extends JPanel.
 * @author Aaron
 *
 */
public class HistoryPanel extends JPanel {

	private Student cs = DocHandler.getStudent();
	private String filename = DocHandler.getStudentFile();
	private String history;
	protected static TestListFrame testframe;
	
	/**
	 * Constructor. Calls the setuppanel method where all information is stored. This was designed to help
	 * create a cleaner constructor.
	 */
	public HistoryPanel(){

		setuppanel();
	}
	
	/**
	 * This method contains all the required components for the History GUI JPanel. Also includes an anonymous
	 * inner class connected to the button which sends the correct template to the moddoc method based on the
	 * user's information.
	 */
	private void setuppanel(){
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblIsTheStudents = new JLabel("Is the Student's history considered normal?");
		springLayout.putConstraint(SpringLayout.EAST, lblIsTheStudents, -10, SpringLayout.EAST, this);
		lblIsTheStudents.setFont(new Font("Tahoma", Font.PLAIN, 22));
		springLayout.putConstraint(SpringLayout.WEST, lblIsTheStudents, 10, SpringLayout.WEST, this);
		add(lblIsTheStudents);
		
		JLabel lblStudentHistory = new JLabel("Student History");
		springLayout.putConstraint(SpringLayout.NORTH, lblIsTheStudents, 53, SpringLayout.SOUTH, lblStudentHistory);
		springLayout.putConstraint(SpringLayout.NORTH, lblStudentHistory, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblStudentHistory, 65, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblStudentHistory, 115, SpringLayout.WEST, this);
		lblStudentHistory.setFont(new Font("Tahoma", Font.PLAIN, 32));
		add(lblStudentHistory);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnYes, 20, SpringLayout.SOUTH, lblIsTheStudents);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnYes, 100, SpringLayout.WEST, this);
		rdbtnYes.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnYes.setActionCommand("Yes");
		add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNo, 0, SpringLayout.NORTH, rdbtnYes);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNo, 112, SpringLayout.EAST, rdbtnYes);
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNo.setActionCommand("No");
		add(rdbtnNo);
		
		ButtonGroup historygroup = new ButtonGroup();
		historygroup.add(rdbtnNo);
		historygroup.add(rdbtnYes);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 22));
		springLayout.putConstraint(SpringLayout.SOUTH, btnContinue, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnContinue, -54, SpringLayout.EAST, this);
		add(btnContinue);
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand() == ("Yes")) {
					history = System.getProperty("user.dir") + "/templates/history yes.docx";	
				}
				else {
					history = System.getProperty("user.dir") + "/templates/history no.docx";
				}
				try {
					DocHandler.modDoc(cs, filename, history);
					testframe = new TestListFrame();
					StudentInfoPanel.hisform.setVisible(false);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Docx4JException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
	}
		
}

