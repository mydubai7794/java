package GraIterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class borrowBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 450, 300);
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
		
		JLabel lblNewLabel_1 = new JLabel("\u7D22\u4E66\u53F7\uFF1A");
		lblNewLabel_1.setBounds(33, 80, 54, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u501F\u4E66");
		btnNewButton.setBounds(86, 168, 207, 42);
		contentPane.add(btnNewButton);
	}
}
