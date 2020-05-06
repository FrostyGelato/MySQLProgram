package crud;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {

	private static void createAndShowLoginGUI() {
		Login loginGUI = new Login();
		loginGUI.setVisible(true);
    }
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	createAndShowLoginGUI();
	        }
	    });      	
	}
}
