package crud;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends javax.swing.JFrame {

	private JFrame frame;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1192, 825);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(121, 656, 153, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBounds(333, 656, 153, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(545, 656, 153, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New");
		btnNewButton_3.setBounds(762, 656, 153, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(210, 347, 126, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 403, 126, 35);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(210, 459, 126, 35);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(210, 515, 126, 35);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ISBN");
		lblNewLabel.setBounds(21, 350, 108, 29);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setBounds(21, 406, 108, 29);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Publisher");
		lblNewLabel_2.setBounds(21, 462, 108, 29);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Year");
		lblNewLabel_3.setBounds(21, 518, 108, 29);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_3);
		
		table = new JTable();
		table.setBounds(345, 61, 800, 553);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Book_name", "Author_first_name", "Author_last_name", "ISBN", "Quantity", "Year", "Category", "Publisher"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(145);
		table.getColumnModel().getColumn(2).setPreferredWidth(240);
		table.getColumnModel().getColumn(3).setPreferredWidth(230);
		table.getColumnModel().getColumn(4).setPreferredWidth(148);
		table.getColumnModel().getColumn(5).setPreferredWidth(145);
		table.getColumnModel().getColumn(6).setPreferredWidth(139);
		table.getColumnModel().getColumn(7).setPreferredWidth(143);
		table.getColumnModel().getColumn(8).setPreferredWidth(140);
		table.setToolTipText("");
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		frame.getContentPane().add(table);
		
		textField_4 = new JTextField();
		textField_4.setBounds(210, 293, 126, 35);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(210, 232, 126, 35);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(210, 173, 126, 35);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(210, 117, 126, 35);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(210, 61, 126, 35);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Aythor last name");
		lblNewLabel_4.setBounds(21, 296, 140, 29);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Author first name");
		lblNewLabel_5.setBounds(21, 235, 184, 29);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Author");
		lblNewLabel_6.setBounds(21, 176, 108, 29);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Book name");
		lblNewLabel_7.setBounds(21, 120, 108, 29);
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ID");
		lblNewLabel_8.setBounds(21, 64, 108, 29);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(210, 566, 126, 35);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Category");
		lblNewLabel_9.setBounds(21, 568, 108, 29);
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 17));
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(443, 21, 702, 35);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Search");
		btnNewButton_4.setBounds(348, 20, 90, 37);
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		frame.getContentPane().add(btnNewButton_4);
	}
}

