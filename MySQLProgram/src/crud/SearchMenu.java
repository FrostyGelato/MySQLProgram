package crud;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class SearchMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public SearchMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SANDMAN\\Pictures\\9wohhhwexfh21.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1204, 733);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library System");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 72));
		lblNewLabel.setBounds(324, 73, 557, 80);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(73, 169, 1071, 2);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(397, 241, 658, 35);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Search!");
		btnNewButton.setFont(new Font("Rockwell", Font.PLAIN, 24));
		btnNewButton.setBounds(238, 240, 153, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Search In Book Type:");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(142, 315, 249, 29);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select your book Type", "Fiction", "Magazine", "Text book", "Guid"}));
		comboBox.setFont(new Font("Agency FB", Font.PLAIN, 24));
		comboBox.setBounds(397, 312, 658, 35);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Library System Search Option:");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 24));
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(39, 413, 352, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Result Per Page: ");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("Rockwell", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(183, 465, 208, 29);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"25", "50", "75", "100"}));
		comboBox_1.setFont(new Font("Agency FB", Font.PLAIN, 24));
		comboBox_1.setBounds(376, 465, 65, 29);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("View Result:");
		lblNewLabel_3_1.setForeground(Color.YELLOW);
		lblNewLabel_3_1.setFont(new Font("Rockwell", Font.PLAIN, 24));
		lblNewLabel_3_1.setBounds(224, 509, 208, 29);
		contentPane.add(lblNewLabel_3_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Detailed");
		rdbtnNewRadioButton.setFont(new Font("Rockwell", Font.PLAIN, 24));
		rdbtnNewRadioButton.setBounds(376, 511, 135, 37);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Simple");
		rdbtnNewRadioButton_1.setFont(new Font("Rockwell", Font.PLAIN, 24));
		rdbtnNewRadioButton_1.setBounds(524, 511, 115, 37);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("V1.0.0 Developed by DP1 Computer Science");
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4.setBounds(350, 192, 573, 29);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Background");//background
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\SANDMAN\\Pictures\\9wohhhwexfh21.jpg"));//change the path to where the picture is 
		lblNewLabel_5.setBounds(0, 0, 1178, 662);
		contentPane.add(lblNewLabel_5);
	}
}