package crud;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class dbMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	// Create the frame.
	public dbMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1192, 825);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(112, 649, 153, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBounds(324, 649, 153, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(536, 649, 153, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New");
		btnNewButton_3.setBounds(753, 649, 153, 37);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(201, 340, 126, 35);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(201, 396, 126, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(201, 452, 126, 35);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(201, 508, 126, 35);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("ISBN");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(12, 343, 108, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(12, 399, 108, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Publisher");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(12, 455, 108, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Year");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(12, 511, 108, 29);
		contentPane.add(lblNewLabel_3);
		
		table = new JTable();
		table.setToolTipText("");
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(336, 54, 800, 553);
		contentPane.add(table);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(201, 286, 126, 35);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(201, 225, 126, 35);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(201, 166, 126, 35);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(201, 110, 126, 35);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(201, 54, 126, 35);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_4 = new JLabel("Aythor last name");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(12, 289, 140, 29);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Author first name");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(12, 228, 184, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Author");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(12, 169, 108, 29);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Book name");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(12, 113, 108, 29);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ID");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(12, 57, 108, 29);
		contentPane.add(lblNewLabel_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(201, 559, 126, 35);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_9 = new JLabel("Category");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(12, 561, 108, 29);
		contentPane.add(lblNewLabel_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(434, 14, 702, 35);
		contentPane.add(textField_10);
		
		JButton btnNewButton_4 = new JButton("Search");
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_4.setBounds(339, 13, 90, 37);
		contentPane.add(btnNewButton_4);
	}

}
