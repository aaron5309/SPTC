package sptc;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class is the JPanel insert for the Student information frame. Extends JPanel.
 * @author Aaron
 *
 */
@SuppressWarnings("serial")
public class StudentInfoPanel extends JPanel {
	private JTextField txtStudentnumber;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	private JTextField txtLastName;
	private JTextField txtStreetAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZipcode;
	private JTextField txtGender;
	private JTextField txtBirthdate;
	private JTextField txtTestdate;
	private JTextField txtEvaluator;
	private JTextField txtParentname;
	private JTextField txtPhonenumber;
	private JTextField txtAge;
	protected File studentfile;
	protected static HistoryForm hisform;
	
	/**
	 * Constructor method. Calls the setuppanel method.
	 */
	public StudentInfoPanel() {
		setuppanel();
	}
	
	/**
	 * Contains all the required information for the student information GUI JPanel.
	 */
	private void setuppanel(){
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblStudentNumber = new JLabel("Student Number");
		add(lblStudentNumber);
		
		txtStudentnumber = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtStudentnumber, -3, SpringLayout.NORTH, lblStudentNumber);
		springLayout.putConstraint(SpringLayout.WEST, txtStudentnumber, 6, SpringLayout.EAST, lblStudentNumber);
		add(txtStudentnumber);
		txtStudentnumber.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		springLayout.putConstraint(SpringLayout.WEST, lblFirstName, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, lblStudentNumber, 0, SpringLayout.WEST, lblFirstName);
		springLayout.putConstraint(SpringLayout.SOUTH, lblStudentNumber, -17, SpringLayout.NORTH, lblFirstName);
		add(lblFirstName);
		
		txtFirstName = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtFirstName, -3, SpringLayout.NORTH, lblFirstName);
		springLayout.putConstraint(SpringLayout.WEST, txtFirstName, 37, SpringLayout.EAST, lblFirstName);
		add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblMiddlename = new JLabel("MiddleName");
		springLayout.putConstraint(SpringLayout.WEST, lblMiddlename, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFirstName, -20, SpringLayout.NORTH, lblMiddlename);
		add(lblMiddlename);
		
		txtMiddleName = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtMiddleName, -3, SpringLayout.NORTH, lblMiddlename);
		springLayout.putConstraint(SpringLayout.WEST, txtMiddleName, 29, SpringLayout.EAST, lblMiddlename);
		add(txtMiddleName);
		txtMiddleName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		springLayout.putConstraint(SpringLayout.WEST, lblLastName, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblMiddlename, -22, SpringLayout.NORTH, lblLastName);
		add(lblLastName);
		
		txtLastName = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtLastName, 39, SpringLayout.EAST, lblLastName);
		springLayout.putConstraint(SpringLayout.NORTH, lblLastName, 3, SpringLayout.NORTH, txtLastName);
		add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblStreetAddress = new JLabel("Street Address");
		springLayout.putConstraint(SpringLayout.WEST, lblStreetAddress, 10, SpringLayout.WEST, this);
		add(lblStreetAddress);
		
		txtStreetAddress = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtStreetAddress, 14, SpringLayout.EAST, lblStreetAddress);
		springLayout.putConstraint(SpringLayout.SOUTH, txtLastName, -21, SpringLayout.NORTH, txtStreetAddress);
		springLayout.putConstraint(SpringLayout.NORTH, txtStreetAddress, -3, SpringLayout.NORTH, lblStreetAddress);
		add(txtStreetAddress);
		txtStreetAddress.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		springLayout.putConstraint(SpringLayout.SOUTH, lblStreetAddress, -21, SpringLayout.NORTH, lblCity);
		springLayout.putConstraint(SpringLayout.WEST, lblCity, 10, SpringLayout.WEST, this);
		add(lblCity);
		
		txtCity = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtCity, -3, SpringLayout.NORTH, lblCity);
		springLayout.putConstraint(SpringLayout.WEST, txtCity, 78, SpringLayout.EAST, lblCity);
		add(txtCity);
		txtCity.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		springLayout.putConstraint(SpringLayout.SOUTH, lblCity, -21, SpringLayout.NORTH, lblState);
		springLayout.putConstraint(SpringLayout.WEST, lblState, 10, SpringLayout.WEST, this);
		add(lblState);
		
		txtState = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtState, 69, SpringLayout.EAST, lblState);
		springLayout.putConstraint(SpringLayout.SOUTH, txtState, -56, SpringLayout.SOUTH, this);
		add(txtState);
		txtState.setColumns(10);
		
		JLabel lblZipcode = new JLabel("ZipCode");
		springLayout.putConstraint(SpringLayout.SOUTH, lblState, -16, SpringLayout.NORTH, lblZipcode);
		springLayout.putConstraint(SpringLayout.WEST, lblZipcode, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblZipcode, -22, SpringLayout.SOUTH, this);
		add(lblZipcode);
		
		txtZipcode = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtZipcode, 13, SpringLayout.SOUTH, txtState);
		springLayout.putConstraint(SpringLayout.WEST, txtZipcode, 53, SpringLayout.EAST, lblZipcode);
		add(txtZipcode);
		txtZipcode.setColumns(10);
		
		JLabel lblStudentInformationForm = new JLabel("Student Information Form");
		springLayout.putConstraint(SpringLayout.WEST, lblStudentInformationForm, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblStudentInformationForm, 500, SpringLayout.WEST, this);
		lblStudentInformationForm.setVerticalAlignment(SwingConstants.TOP);
		lblStudentInformationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentInformationForm.setFont(new Font("Tahoma", Font.PLAIN, 25));
		springLayout.putConstraint(SpringLayout.NORTH, lblStudentInformationForm, 0, SpringLayout.NORTH, this);
		add(lblStudentInformationForm);
		
		JLabel lblGender = new JLabel("Gender");
		springLayout.putConstraint(SpringLayout.NORTH, lblGender, 0, SpringLayout.NORTH, lblStudentNumber);
		springLayout.putConstraint(SpringLayout.WEST, lblGender, 47, SpringLayout.EAST, txtStudentnumber);
		add(lblGender);
		
		txtGender = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtGender, -3, SpringLayout.NORTH, lblStudentNumber);
		add(txtGender);
		txtGender.setColumns(10);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		springLayout.putConstraint(SpringLayout.WEST, lblBirthdate, 0, SpringLayout.WEST, lblGender);
		springLayout.putConstraint(SpringLayout.SOUTH, lblBirthdate, 0, SpringLayout.SOUTH, lblFirstName);
		add(lblBirthdate);
		
		txtBirthdate = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, txtGender, 0, SpringLayout.EAST, txtBirthdate);
		springLayout.putConstraint(SpringLayout.NORTH, txtBirthdate, -3, SpringLayout.NORTH, lblFirstName);
		add(txtBirthdate);
		txtBirthdate.setColumns(10);
		
		JLabel lblTestDate = new JLabel("Test Date");
		springLayout.putConstraint(SpringLayout.WEST, lblTestDate, 0, SpringLayout.WEST, lblGender);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTestDate, 0, SpringLayout.SOUTH, lblMiddlename);
		add(lblTestDate);
		
		txtTestdate = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, txtBirthdate, 0, SpringLayout.EAST, txtTestdate);
		springLayout.putConstraint(SpringLayout.NORTH, txtTestdate, -3, SpringLayout.NORTH, lblMiddlename);
		add(txtTestdate);
		txtTestdate.setColumns(10);
		
		JLabel lblEvaluator = new JLabel("Evaluator");
		springLayout.putConstraint(SpringLayout.WEST, lblEvaluator, 0, SpringLayout.WEST, lblGender);
		springLayout.putConstraint(SpringLayout.SOUTH, lblEvaluator, 0, SpringLayout.SOUTH, lblLastName);
		add(lblEvaluator);
		
		txtEvaluator = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, txtTestdate, 0, SpringLayout.EAST, txtEvaluator);
		springLayout.putConstraint(SpringLayout.NORTH, txtEvaluator, -3, SpringLayout.NORTH, lblLastName);
		add(txtEvaluator);
		txtEvaluator.setColumns(10);
		
		JLabel lblParentName = new JLabel("Parent Name");
		springLayout.putConstraint(SpringLayout.WEST, lblParentName, 0, SpringLayout.WEST, lblGender);
		springLayout.putConstraint(SpringLayout.SOUTH, lblParentName, 0, SpringLayout.SOUTH, lblStreetAddress);
		add(lblParentName);
		
		txtParentname = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtEvaluator, 0, SpringLayout.WEST, txtParentname);
		springLayout.putConstraint(SpringLayout.NORTH, txtParentname, -3, SpringLayout.NORTH, lblStreetAddress);
		add(txtParentname);
		txtParentname.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		springLayout.putConstraint(SpringLayout.NORTH, lblPhoneNumber, 0, SpringLayout.NORTH, lblCity);
		springLayout.putConstraint(SpringLayout.WEST, lblPhoneNumber, 0, SpringLayout.WEST, lblGender);
		add(lblPhoneNumber);
		
		txtPhonenumber = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, txtParentname, 0, SpringLayout.EAST, txtPhonenumber);
		springLayout.putConstraint(SpringLayout.WEST, txtPhonenumber, 6, SpringLayout.EAST, lblPhoneNumber);
		springLayout.putConstraint(SpringLayout.SOUTH, txtPhonenumber, 0, SpringLayout.SOUTH, lblCity);
		add(txtPhonenumber);
		txtPhonenumber.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		springLayout.putConstraint(SpringLayout.WEST, lblAge, 0, SpringLayout.WEST, lblGender);
		springLayout.putConstraint(SpringLayout.SOUTH, lblAge, 0, SpringLayout.SOUTH, txtState);
		add(lblAge);
		
		txtAge = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, txtAge, 0, SpringLayout.SOUTH, lblState);
		springLayout.putConstraint(SpringLayout.EAST, txtAge, 0, SpringLayout.EAST, txtGender);
		add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnContinue = new JButton("Continue");
		springLayout.putConstraint(SpringLayout.SOUTH, btnContinue, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnContinue, -10, SpringLayout.EAST, this);
		add(btnContinue);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtStudentnumber, txtFirstName, txtMiddleName, txtLastName, txtStreetAddress, txtCity, txtState, txtZipcode, txtGender, txtBirthdate, txtTestdate, txtEvaluator, txtParentname, txtPhonenumber, txtAge, btnContinue}));
		
		btnContinue.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Student currentStudent = new Student(Integer.parseInt(txtStudentnumber.getText()), txtFirstName.getText(), txtMiddleName.getText(),
						txtLastName.getText(), txtStreetAddress.getText(), txtCity.getText(), txtState.getText(), txtZipcode.getText(), 
						txtGender.getText(), txtBirthdate.getText(), txtTestdate.getText(), txtEvaluator.getText(), 
						txtParentname.getText(), txtPhonenumber.getText(), txtAge.getText());
				
				try {
					toDatabase(currentStudent);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		});
		
		
	}
	
	/**
	 * Sends student information to the MySQL database. If successful, then calls makeDoc method.
	 * @param cs		Current Student (student)
	 * @throws ClassNotFoundException	required exception database connection
	 * @throws SQLException		required exception for database connection
	 */
	private void toDatabase(Student cs) throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sptc", "root", "Drag0n01");
			Statement updateStudent = connection.createStatement();
			updateStudent.executeUpdate("INSERT into Student (idStudent, firstname, middlename, lastname, street, "
					+ "city, state, zipcode, gender, birthday, testdate, evaluator, parentname, phone, age) values ('"
					+ (cs.getStudentNumber())  + "', '" + cs.getFirstname() + "', '" + cs.getMiddlename() + "', '" + cs.getLastname() 
					+ "', '" + cs.getAddress() + "', '" + cs.getCity() + "', '" + cs.getState() + "', '" + cs.getZipcode() + "', '" 
					+ cs.getGender() + "', '" + cs.getBirthdate() + "', '" + cs.getTestdate() + "', '" + cs.getEvaluator() + "', '" 
					+ cs.getParentname() + "', '" + cs.getPhone() + "', '" + cs.getAge() + "');");
			try {
				makeDoc(cs);
			} catch (Docx4JException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	/**
	 * Creates the document for a new student based on the student's name. If successful, opens History form.
	 * @param cs		Current student (student)
	 * @throws Docx4JException	required exception for using docx4j library.
	 */
	private void makeDoc(Student cs) throws Docx4JException{
		try {
			DocHandler.createDoc(cs);
			hisform = new HistoryForm();
			start.studentform.setVisible(false);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
