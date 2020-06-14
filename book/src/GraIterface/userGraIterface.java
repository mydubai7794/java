package GraIterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class userGraIterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userGraIterface frame = new userGraIterface();
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
	public userGraIterface() {
		setTitle("\u501F\u9605\u8005\uFF0C\u4F60\u597D");
        JOptionPane.showMessageDialog(null, "你好，借阅者！");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//借书处理----------------------------------------------------------------		
		JButton btnNewButton = new JButton("\u501F\u4E66\u5904\u7406");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrowBook bor = new borrowBook();
				bor.setVisible(true);
			}
		});
		btnNewButton.setBounds(220, 69, 143, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u8FD8\u4E66\u5904\u7406");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				returnBook bor = new returnBook();
				bor.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(220, 162, 143, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u9884\u5B9A\u5904\u7406");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reserveBook bor = new reserveBook();
				bor.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(220, 256, 143, 46);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u56FE\u4E66\u68C0\u7D22");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					usersearch bor = new usersearch();
					bor.setVisible(true);
				} catch (ClassNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(120, 342, 372, 64);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(userGraIterface.class.getResource("/picture/background.jpg")));
		lblNewLabel.setBounds(0, 0, 736, 463);
		contentPane.add(lblNewLabel);
	

	}
}
