package sptc;
/**
 * This class creates the student object. Contains all required information for a student's evaluation.
 * @author Aaron
 *
 */
public class Student {
	
	//needed variables
	private int studentNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String gender;
	private String birthdate;
	private String testdate;
	private String evaluator;
	private String parentName;
	private String phoneNumber;
	private String age;
	
	/**
	 * Student no arg constructor
	 */
	public Student(){
		
	}
	/**
	 * Constructor with arguments.
	 * @param number			Student's id number. Used for database storage as well.
	 * @param first				Student's first name.
	 * @param middle			Student's middle name.
	 * @param last				Student's last name.
	 * @param streetAddress		Student's home address (number and street name).
	 * @param city1				Student's home city.
	 * @param state1			Student's home state.
	 * @param zip				Student's home zipcode.
	 * @param gender1			Student's gender.
	 * @param bday				Student's birthday.
	 * @param testday			Date of student's evaluation.
	 * @param tester			Name of Evaluator.
	 * @param parent			Student's parent/guardian's name.
	 * @param phone				Parent/Guardian phone number.
	 * @param age1				Student's age.
	 */
	public Student(int number, String first, String middle, String last, String streetAddress, String city1, String state1,
			String zip, String gender1, String bday, String testday, String tester, String parent, String phone,
			String age1){
		this.studentNumber = number;
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
		this.street = streetAddress;
		this.city = city1;
		this.state = state1;
		this.zipcode = zip;
		this.gender = gender1;
		this.birthdate = bday;
		this.testdate = testday;
		this.evaluator = tester;
		this.parentName = parent;
		this.phoneNumber = phone;
		this.age = age1;
		
	}
	
	//setters
	/**
	 * Setter for student number.
	 * @param number1	Student's id number.
	 */
	public void setStudentNumber(int number1){
		studentNumber = number1;
	}
	
	/**
	 * Setter for student's first name.
	 * @param firstname1	Student's first name.
	 */
	public void setFirstName(String firstname1){
		firstname1 = firstName;
	}
	
	/**
	 * Setter for student's middle name.
	 * @param middlename1	Student's middle name.
	 */
	public void setMiddleName(String middlename1){
		middlename1 = middleName;
	}
	
	/**
	 * Setter for student's last name.
	 * @param lastname1	Student's last name.
	 */
	public void setLastName(String lastname1){
		lastname1 = lastName;
	}
	
	/**
	 * Setter for student's address (home number and street name).
	 * @param address1	Student's home address information (number and address name).
	 */
	public void setAddress(String address1){
		street = address1;
	}
	
	/**
	 * Setter for student's city.
	 * @param city1	Student's city name.
	 */
	public void setCity(String city1){
		city = city1;
	}
	
	/**
	 * Setter for student's state (2 letter abbreviation).
	 * @param state1	Student's state abbreviation.
	 */
	public void setState(String state1){
		state = state1;
	}
	
	/**
	 * Setter for student's zipcode.
	 * @param zip1	Student's zipcode
	 */
	public void setZipcode(String zip1){
		zipcode = zip1;
	}
	
	/**
	 * Setter for student's gender.
	 * @param gender1	Student's gender.
	 */
	public void setGender(String gender1){
		gender = gender1;
	}
	
	/**
	 * Setter for student's birthday.
	 * @param birth1	Student's birthday. Database requires this to be entered yyyy-mm-dd.
	 */
	public void setBirthdate(String birth1){
		birthdate = birth1;
	}
	
	/**
	 * Setter for student's date of evaluation.
	 * @param test1	Date of student's evaluation. Database requires this to be entered yyyy-mm-dd.
	 */
	public void setTestdate(String test1){
		testdate = test1;
	}
	
	/**
	 * Setter for Evaluator's name.
	 * @param eval1	Evaluator's name.
	 */
	public void setEvaluator(String eval1){
		evaluator = eval1;
	}
	
	/**
	 * Setter for parent/guardian's name.
	 * @param parent1	Parent/Guardian's name.
	 */
	public void setParentname(String parent1){
		parentName = parent1;
	}
	
	/**
	 * Setter for Parent/Guardian phone number.
	 * @param phone1	Parent/Guardian phone number.
	 */
	public void setPhone(String phone1){
		phoneNumber = phone1;
	}
	
	/**
	 * Setter for student's age.
	 * @param age1	Student's age.
	 */
	public void setAge(String age1){
		age = age1;
	}
	
	//Getters
	/**
	 * Getter for student's number.
	 * @return	Student's number (int)
	 */
	public int getStudentNumber(){
		return studentNumber;
	}
	/**
	 * Getter for student's first name.
	 * @return	Student's first name (String)
	 */
	public String getFirstname(){
		return firstName;
	}
	
	/**
	 * Getter for student's middle name.
	 * @return	Student's middle name (String)
	 */
	public String getMiddlename(){
		return middleName;
	}
	
	/**
	 * Getter for student's last name.
	 * @return	Student's last name (String)
	 */
	public String getLastname(){
		return lastName;
	}
	
	/**
	 * Getter for student's address.
	 * @return	Student's address (house number and street name - String)
	 */
	public String getAddress(){
		return street;
	}
	
	/**
	 * Getter for student's city.
	 * @return	Student's city (String)
	 */
	public String getCity(){
		return city;
	}
	
	/**
	 * Getter for student's state (2 letter abbreviation).
	 * @return	Student's state (2 letter abbreviation.
	 */
	public String getState(){
		return state;
	}
	
	/**
	 * Getter for student's zipcode.
	 * @return	Student's zipcode
	 */
	public String getZipcode(){
		return zipcode;
	}
	
	/**
	 * Getter for student's gender.
	 * @return	Student's gender
	 */
	public String getGender(){
		return gender;
	}
	
	/**
	 * Getter for student's birthday.
	 * @return	Student's birthday (date)
	 */
	public String getBirthdate(){
		return birthdate;
	}
	
	/**
	 * Getter for student's date of evaluation.
	 * @return	Student's evaluation date (date)
	 */
	public String getTestdate(){
		return testdate;
	}
	
	/**
	 * Getter for evaluator's name.
	 * @return	Evaluator's name
	 */
	public String getEvaluator(){
		return evaluator;
	}
	
	/**
	 * Getter for parent/guardian's name.
	 * @return	Parent/Guardian's name
	 */
	public String getParentname(){
		return parentName;
	}
	
	/**
	 * Getter for parent/guardian's phone number.
	 * @return	Parent/Guardian phone number
	 */
	public String getPhone(){
		return phoneNumber;
	}
	
	/**
	 * Getter for student's age.
	 * @return	Student's age
	 */
	public String getAge(){
		return age;
	}
	
	
}
