package package2;

import java.sql.*;

/*Loads the JDBC driver.
Establishes a connection to a MySQL database.
Prints "Connected to database successfully!" if the connection is successful.*/

public class JDBC1 {
	public static void main(String[] args) {

		Connection conn;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/school_project";
			String username = "root";
			String password = "Ajitsg@15";
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful");

		} catch (Exception e) {
			System.out.println("Somthing went wrong while connecting database please check");
			System.out.println(e);
		}
	}

}
