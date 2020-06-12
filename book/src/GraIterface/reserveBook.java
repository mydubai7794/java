package GraIterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class reserveBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reserveBook frame = new reserveBook();
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
	public reserveBook() {
		setTitle("\u56FE\u4E66\u9884\u5B9A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9884\u5B9A\u524D\u8BF7\u786E\u5B9A\u7D22\u4E66\u53F7\u5E76\u786E\u5B9A\u5F53\u524D\u56FE\u4E66\u5DF2\u7ECF\u88AB\u501F\u9605");
		lblNewLabel.setBounds(53, 33, 270, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7D22\u4E66\u53F7\uFF1A");
		lblNewLabel_1.setBounds(30, 91, 54, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(94, 92, 230, 30);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("\u9884\u5B9A");
		btnNewButton.setBounds(73, 175, 207, 42);
		contentPane.add(btnNewButton);
	}

}
