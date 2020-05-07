package crud;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {
	public static final String DB_USER;
	public static final String DB_PASS;
	
	private static void createAndShowLoginGUI() {
		Login loginGUI = new Login();
		loginGUI.setVisible(true);
    	}
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Please provide the db user + password to run the program:\njava -jar <jarfile> <username> <password>");
			System.exit(1);
		} else {
			this.DB_USER = args[0];
			this.DB_PASS = args[1];
		}
		
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	createAndShowLoginGUI();
	        }
	    });      	
	}
}
