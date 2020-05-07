package crud;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {
	public static String DB_USER = "";
	public static String DB_PASS = "";
	
	private static void createAndShowLoginGUI() {
		Login loginGUI = new Login();
		loginGUI.setVisible(true);
    }
	
	public static void main(String[] args) {
		if (args.length == 2) {
		    DB_USER = args[0];
		    DB_PASS = args[1];
		}
		else {
		    DB_USER = "root";
		    DB_PASS = "";
		}
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	createAndShowLoginGUI();
	        }
	    });      	
	}
}
