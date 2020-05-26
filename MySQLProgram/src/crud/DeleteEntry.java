package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEntry {

	public DeleteEntry(String entryID) {
		String entryToDelete = "delete from library where id = ?";
	    try (Connection conn = DBConnect.getConnection(); PreparedStatement stmt = conn.prepareStatement(entryToDelete);) {
	    	stmt.setString(1, entryID);
				
			stmt.execute();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
