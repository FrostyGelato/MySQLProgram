package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login extends javax.swing.JPanel {

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 873, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library System");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblNewLabel.setBounds(258, 78, 328, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(92, 242, 686, 2);
		frame.getContentPane().add(separator);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection cnct = DriverManager.getConnection("jdbc:mysql://localhost/school", "dumplings", "chup389Mb");
					String sql = "SELECT * FROM login where username=? and password=?";
					PreparedStatement pst = cnct.prepareStatement(sql);
					pst.setString(1, usernameField.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs = pst.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Login successful.");
						MainMenu menuPage = new MainMenu();
						setVisible(false);
						menuPage.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Login failed. Please try again.");
						usernameField.setText("");
						passwordField.setText("");
					}
					cnct.close();
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		loginButton.setBounds(342, 438, 153, 37);
		frame.getContentPane().add(loginButton);
		
		usernameField = new JTextField();
		usernameField.setBounds(269, 280, 296, 43);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(269, 361, 296, 43);
		frame.getContentPane().add(passwordField);
	}
}
