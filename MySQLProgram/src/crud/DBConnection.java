package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public void connect(String connect, String username, String password) {
		final String UN = username;
		final String PS = password;
		final String CONN = connect;
		
		Connection getConnection() throws SQLException {
			return DriverManager.getConnection(CONN, UN, PS);
		}
	}
}
