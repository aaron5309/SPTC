package sptc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class contains the main method to start the application. It also contains the driver and connection
 * information for the MySQL database.
 * @author Aaron
 *
 */
public class start {
	public static StudentInfoForm studentform;
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sptc", "root", "Drag0n01");
		studentform = new StudentInfoForm();

	}

	
}
