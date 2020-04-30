package crud;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main {

	private static void createAndShowLoginGUI() {
        JFrame frame = new JFrame("Login Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Login gui = new Login();
        frame.getContentPane().add(gui);

        frame.pack();
        frame.setVisible(true);
    }
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	createAndShowLoginGUI();
	        }
	    });      	
	}
}
