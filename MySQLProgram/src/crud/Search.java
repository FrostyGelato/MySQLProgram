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
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;


public class Search extends javax.swing.JFrame {

    public Search() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
    }

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
        jLabel2.setText("Search");

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
        
        JLabel lblNewLabel = new JLabel("Library System");
        lblNewLabel.setForeground(Color.ORANGE);
        lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 72));
        lblNewLabel.setBounds(343, 66, 557, 80);
        jPanel2.add(lblNewLabel);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(92, 162, 1071, 2);
        jPanel2.add(separator);
        
        JButton btnNewButton = new JButton("Search!");
        btnNewButton.setFont(new Font("Rockwell", Font.PLAIN, 24));
        btnNewButton.setBounds(257, 233, 153, 37);
        jPanel2.add(btnNewButton);
        
        JLabel lblNewLabel_1 = new JLabel("Search In Book Type:");
        lblNewLabel_1.setForeground(Color.YELLOW);
        lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 24));
        lblNewLabel_1.setBounds(161, 308, 249, 29);
        jPanel2.add(lblNewLabel_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Book Type", "Guid", "Magazine", "Text Book", "Fiction"}));
        comboBox.setFont(new Font("Agency FB", Font.PLAIN, 24));
        comboBox.setBounds(416, 305, 658, 35);
        jPanel2.add(comboBox);
        
        JLabel lblNewLabel_2 = new JLabel("Library System Search Option:");
        lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
        lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 24));
        lblNewLabel_2.setBackground(Color.GRAY);
        lblNewLabel_2.setBounds(58, 406, 352, 29);
        jPanel2.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Result Per Page: ");
        lblNewLabel_3.setForeground(Color.YELLOW);
        lblNewLabel_3.setFont(new Font("Rockwell", Font.PLAIN, 24));
        lblNewLabel_3.setBounds(202, 458, 208, 29);
        jPanel2.add(lblNewLabel_3);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"25", "50", "75", "100"}));
        comboBox_1.setFont(new Font("Agency FB", Font.PLAIN, 24));
        comboBox_1.setBounds(395, 458, 65, 29);
        jPanel2.add(comboBox_1);
        
        JLabel lblNewLabel_3_1 = new JLabel("View Result:");
        lblNewLabel_3_1.setForeground(Color.YELLOW);
        lblNewLabel_3_1.setFont(new Font("Rockwell", Font.PLAIN, 24));
        lblNewLabel_3_1.setBounds(243, 502, 208, 29);
        jPanel2.add(lblNewLabel_3_1);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Detailed");
        rdbtnNewRadioButton.setFont(new Font("Rockwell", Font.PLAIN, 24));
        rdbtnNewRadioButton.setBounds(395, 504, 135, 37);
        jPanel2.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Simple");
        rdbtnNewRadioButton_1.setFont(new Font("Rockwell", Font.PLAIN, 24));
        rdbtnNewRadioButton_1.setBounds(543, 504, 115, 37);
        jPanel2.add(rdbtnNewRadioButton_1);
        
        JLabel lblNewLabel_4 = new JLabel("V1.0.0 Developed by DP1 Computer Science");
        lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
        lblNewLabel_4.setBounds(369, 185, 573, 29);
        jPanel2.add(lblNewLabel_4);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(416, 233, 658, 37);
        jPanel2.add(textArea);
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
}