package crud;

import java.sql.*;

public class UpdateEntry {
	
	public void update(String ID, String Book_name, String Author_first_name, String Author_last_name, String ISBN, String quantity, String year, String publisher, String category) {
		String entry = "REPLACE INTO library (ID, Book_name, Author_first_name, Author_last_name, ISBN, quantity, year, publisher, category)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try (Connection conn = DBConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(entry);
			) {
			stmt.setString(1, ID);
			stmt.setString(2, Book_name);
			stmt.setString(3, Author_first_name);
			stmt.setString(4, Author_last_name);
			stmt.setString(5, ISBN);
			stmt.setString(6, quantity);
			stmt.setString(7, year);
			stmt.setString(8, publisher);
			stmt.setString(9, category);
				
			stmt.execute();
		} catch (Exception e) {
			
		}
	}
}
