package crud;

import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;


public class DatabaseMenu extends javax.swing.JFrame {

    public DatabaseMenu() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Main");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabelClose))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
        			.addGap(1)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
        );
        jPanel2.setLayout(null);
        
        JButton btnNewButton = new JButton("Insert");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					Connection con = DBConnect.getConnection();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		CreateEntry entry = new CreateEntry(bookNameField.getText(), aFirstNameField.getText(), aLastNameField.getText(), ISBNField.getText(), quantityField.getText(), yearField.getText(), publisherField.getText(), categoryField.getText());
        	}
        });
        btnNewButton.setFont(new Font("Rockwell", Font.PLAIN, 24));
        btnNewButton.setBounds(255, 651, 153, 37);
        jPanel2.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Update");
        btnNewButton_1.setFont(new Font("Rockwell", Font.PLAIN, 24));
        btnNewButton_1.setBounds(467, 651, 153, 37);
        jPanel2.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Delete");
        btnNewButton_2.setFont(new Font("Rockwell", Font.PLAIN, 24));
        btnNewButton_2.setBounds(679, 651, 153, 37);
        jPanel2.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("New");
        btnNewButton_3.setFont(new Font("Rockwell", Font.PLAIN, 24));
        btnNewButton_3.setBounds(896, 651, 153, 37);
        jPanel2.add(btnNewButton_3);
        
        JLabel lblNewLabel = new JLabel("ISBN");
        lblNewLabel.setForeground(Color.YELLOW);
        lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 17));
        lblNewLabel.setBounds(41, 351, 108, 29);
        jPanel2.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Quantity");
        lblNewLabel_1.setForeground(Color.YELLOW);
        lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 17));
        lblNewLabel_1.setBounds(41, 407, 108, 29);
        jPanel2.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Publisher");
        lblNewLabel_2.setForeground(Color.YELLOW);
        lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 17));
        lblNewLabel_2.setBounds(41, 463, 108, 29);
        jPanel2.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Year");
        lblNewLabel_3.setForeground(Color.YELLOW);
        lblNewLabel_3.setFont(new Font("Rockwell", Font.PLAIN, 17));
        lblNewLabel_3.setBounds(41, 519, 108, 29);
        jPanel2.add(lblNewLabel_3);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null, null, null, "", null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"ID", "Book Name", "Author", "Author First Name", "Author Last Name", "ISBN", "Quantity", "Publisher", "Year", "Category", "New column"
        	}
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(174);
        table.getColumnModel().getColumn(1).setPreferredWidth(163);
        table.getColumnModel().getColumn(2).setPreferredWidth(156);
        table.getColumnModel().getColumn(3).setPreferredWidth(166);
        table.getColumnModel().getColumn(4).setPreferredWidth(152);
        table.getColumnModel().getColumn(5).setPreferredWidth(162);
        table.getColumnModel().getColumn(6).setPreferredWidth(159);
        table.getColumnModel().getColumn(7).setPreferredWidth(172);
        table.getColumnModel().getColumn(8).setPreferredWidth(117);
        table.getColumnModel().getColumn(9).setPreferredWidth(149);
        table.setToolTipText("");
        table.setSurrendersFocusOnKeystroke(true);
        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBounds(365, 62, 821, 540);
        jPanel2.add(table);
        
        JLabel lblNewLabel_4 = new JLabel("Aythor last name");
        lblNewLabel_4.setForeground(Color.YELLOW);
        lblNewLabel_4.setFont(new Font("Rockwell", Font.PLAIN, 17));
        lblNewLabel_4.setBounds(41, 297, 140, 29);
        jPanel2.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Author first name");
        lblNewLabel_5.setForeground(Color.YELLOW);
        lblNewLabel_5.setFont(new Font("Rockwell", Font.PLAIN, 17));
        lblNewLabel_5.setBounds(41, 236, 140, 29);
        jPanel2.add(lblNewLabel_5);
        
        JLabel lblNewLabel_7 = new JLabel("Book name");
        lblNewLabel_7.setForeground(Color.YELLOW);
        lblNewLabel_7.setFont(new Font("Rockwell", Font.PLAIN, 17));
        lblNewLabel_7.setBounds(41, 121, 108, 29);
        jPanel2.add(lblNewLabel_7);
        
        JLabel lblNewLabel_9 = new JLabel("Category");
        lblNewLabel_9.setForeground(Color.YELLOW);
        lblNewLabel_9.setFont(new Font("Rockwell", Font.PLAIN, 17));
        lblNewLabel_9.setBounds(41, 569, 108, 29);
        jPanel2.add(lblNewLabel_9);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(463, 22, 723, 35);
        jPanel2.add(textField_10);
        
        JButton btnNewButton_4 = new JButton("Search");
        btnNewButton_4.setFont(new Font("Rockwell Condensed", Font.BOLD, 22));
        btnNewButton_4.setBounds(365, 21, 93, 37);
        jPanel2.add(btnNewButton_4);
        
        JLabel lblNewLabel_11 = new JLabel("Add book info");
        lblNewLabel_11.setForeground(Color.RED);
        lblNewLabel_11.setFont(new Font("Rockwell Condensed", Font.PLAIN, 32));
        lblNewLabel_11.setBounds(103, 22, 153, 29);
        jPanel2.add(lblNewLabel_11);
        
        bookNameField = new JTextField();
        bookNameField.setBounds(205, 119, 135, 37);
        jPanel2.add(bookNameField);
        bookNameField.setColumns(10);
        
        aFirstNameField = new JTextField();
        aFirstNameField.setColumns(10);
        aFirstNameField.setBounds(205, 236, 135, 37);
        jPanel2.add(aFirstNameField);
        
        aLastNameField = new JTextField();
        aLastNameField.setColumns(10);
        aLastNameField.setBounds(205, 297, 135, 37);
        jPanel2.add(aLastNameField);
        
        ISBNField = new JTextField();
        ISBNField.setColumns(10);
        ISBNField.setBounds(205, 351, 135, 37);
        jPanel2.add(ISBNField);
        
        quantityField = new JTextField();
        quantityField.setColumns(10);
        quantityField.setBounds(205, 407, 135, 37);
        jPanel2.add(quantityField);
        
        publisherField = new JTextField();
        publisherField.setColumns(10);
        publisherField.setBounds(205, 463, 135, 37);
        jPanel2.add(publisherField);
        
        yearField = new JTextField();
        yearField.setColumns(10);
        yearField.setBounds(205, 524, 135, 37);
        jPanel2.add(yearField);
        
        categoryField = new JTextField();
        categoryField.setColumns(10);
        categoryField.setBounds(205, 574, 135, 37);
        jPanel2.add(categoryField);
        getContentPane().setLayout(layout);

        pack();
    }

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
        
    }

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {
        
        this.setState(JFrame.ICONIFIED);
        
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabaseMenu().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private JTable table;
    private JTextField textField_10;
    private JTextField bookNameField;
    private JTextField aFirstNameField;
    private JTextField aLastNameField;
    private JTextField ISBNField;
    private JTextField quantityField;
    private JTextField publisherField;
    private JTextField yearField;
    private JTextField categoryField;
}