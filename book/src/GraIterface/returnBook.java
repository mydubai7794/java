package GraIterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class returnBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					returnBook frame = new returnBook();
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
	public returnBook() {
		setTitle("\u8FD8\u4E66");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u7D22\u4E66\u53F7\uFF1A");
		lblNewLabel_1.setBounds(24, 88, 54, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(86, 88, 230, 30);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("\u8FD8\u4E66");
		btnNewButton.setBounds(74, 172, 207, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u8FD8\u4E66\u524D\u8BF7\u786E\u5B9A\u7D22\u4E66\u53F7\uFF0C\u5E76\u4E14\u5F53\u524D\u8D26\u6237\u5DF2\u501F\u9605");
		lblNewLabel.setBounds(64, 36, 235, 24);
		contentPane.add(lblNewLabel);
	}

}
