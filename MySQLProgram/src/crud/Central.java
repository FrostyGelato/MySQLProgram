package crud;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Central {

	private static void createAndShowLoginGUI() {
		Login2 gui = new Login2();
		gui.setVisible(true);
    }
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	createAndShowLoginGUI();
	        }
	    });      	
	}
}
