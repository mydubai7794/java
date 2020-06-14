package GraIterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import textSQL.bbook;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class borrowBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					borrowBook frame = new borrowBook();
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
	public borrowBook() {
		setTitle("\u501F\u4E66");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u501F\u4E66\u53F7\u4EE5\u501F\u4E66\uFF0C\u501F\u4E66\u524D\u5148\u4F7F\u7528\u641C\u7D22\u529F\u80FD\u786E\u4FDD\u56FE\u4E66\u5B58\u5728\u4E14\u53EF\u501F\u51FA\uFF01");
		lblNewLabel.setBounds(33, 10, 379, 42);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(110, 81, 230, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 154, 230, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 232, 230, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u7D22\u4E66\u53F7\uFF1A");
		lblNewLabel_1.setBounds(33, 80, 54, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u501F\u4E66");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String text=textField.getText();
			String userName =textField_1.getText();
			String password =textField_2.getText();
			bbook bb = new bbook();
			try {
				bb.addrow("update user set age ='"+text+"' where user_name='"+userName+"'");
				bb.addrow("update book set numb =(numb-1) where id='"+text+"';");
				JOptionPane.showMessageDialog(null, "借书成功");
			} catch (ClassNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}

			}
		});
		btnNewButton.setBounds(111, 333, 207, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\u518D\u6B21\u8F93\u5165\u8D26\u53F7\uFF1A");
		lblNewLabel_2.setBounds(20, 154, 84, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u518D\u6B21\u8F93\u5165\u5BC6\u7801\uFF1A");
		lblNewLabel_2_1.setBounds(20, 239, 84, 23);
		contentPane.add(lblNewLabel_2_1);
		

	}
}
