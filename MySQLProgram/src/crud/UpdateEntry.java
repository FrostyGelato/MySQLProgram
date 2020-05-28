package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateEntry {

	public UpdateEntry(String id, String bookName, String authorFirstName, String authorLastName, String ISBN, String quantity, String year, String publisher, String category) {
		String entryToUpdate = "REPLACE into library(ID, Book_name, Author_first_name, Author_last_name, ISBN, quantity, year, publisher, category) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try (Connection conn = DBConnect.getConnection(); PreparedStatement stmt = conn.prepareStatement(entryToUpdate);) {
			stmt.setString(1, id);
			stmt.setString(2, bookName);
			stmt.setString(3, authorFirstName);
			stmt.setString(4, authorLastName);
			stmt.setString(5, ISBN);
			stmt.setString(6, quantity);
			stmt.setString(7, year);
			stmt.setString(8, publisher);
			stmt.setString(9, category);
				
			stmt.execute();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
