package crud;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	boolean successfulLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernameField = new JTextField();
		usernameField.setBounds(299, 288, 253, 42);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(299, 372, 253, 42);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
						setVisible(false);
						dbMenu mainMenu = new dbMenu();
						mainMenu.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Login failed. Please try again.");
						usernameField.setText("");
						passwordField.setText("");
					}
					cnct.close();
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton.setBounds(366, 444, 137, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Library System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(325, 116, 185, 52);
		contentPane.add(lblNewLabel);
	}
}
