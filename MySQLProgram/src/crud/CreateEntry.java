package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateEntry {
	public CreateEntry(String bookName, String authorFirstName, String authorLastName, String ISBN, String quantity, String year, String publisher, String category) {
		String newEntry = "Insert into library (Book_name, Author_first_name, Author_last_name, ISBN, quantity, year, publisher, category)" + " values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try (Connection conn = DBConnect.getConnection(); PreparedStatement stmt = conn.prepareStatement(newEntry);) {
			stmt.setString(1, bookName);
			stmt.setString(2, authorFirstName);
			stmt.setString(3, authorLastName);
			stmt.setString(4, ISBN);
			stmt.setString(5, quantity);
			stmt.setString(6, year);
			stmt.setString(7, publisher);
			stmt.setString(8, category);
				
			stmt.execute();
		} catch (Exception e) {
				
		}
	}
}
