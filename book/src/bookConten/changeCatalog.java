package bookConten;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GraIterface.adminAddUser;
import bookSQL.modSQL;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;



public class changeCatalog extends JFrame {
	String theTitle="变更图书种类";
	String theWord="确认变更";
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminAddUser frame = new adminAddUser();
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
	
	public changeCatalog() {
		setTitle(theTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(115, 31, 171, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u7D22\u4E66\u53F7\uFF1A");
		lblNewLabel.setBounds(57, 30, 48, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5206\u7C7B\u540D\u79F0\uFF1A");
		lblNewLabel_1.setBounds(49, 89, 68, 30);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 90, 171, 30);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton(theWord);
//添加时间响应----------------------------------------------------------
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=textField.getText();
				String password=textField_1.getText();
				try {
					modSQL mod = new modSQL();
				    mod.addrow(userName, password,"1","UPDATE book SET type='"+password+"' WHERE id='"+userName+"';");
				    JOptionPane.showMessageDialog(null, "变更种类成功！");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(49, 179, 266, 23);
		contentPane.add(btnNewButton);
	}

}