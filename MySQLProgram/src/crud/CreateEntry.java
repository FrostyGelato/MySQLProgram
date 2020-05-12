package crud;

public class CreateEntry {
	public void CreateEntry(String bookName, String authorFirstName, String authorLastName, String ISBN, int quantity, int year, String publisher, String category) {
		String newEntry = "Insert into library (Book_name, Author_first_name, Author_last_name, ISBN, quantity, year, publisher, category)" + " values (?, ?, ?, ?, ?, ?, ?, ?)";
	}
}
