package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import crud.Main;

public class DBConnect {
	private static final String CONN = "jdbc:mysql://localhost/school";
	private static final String USERNAME = Main.DB_USER;
	private static final String PASSWORD = Main.DB_PASS;
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
	}
}
