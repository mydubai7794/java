package GraIterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class bookAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookAdmin frame = new bookAdmin();
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
	public bookAdmin() {
		setTitle("\u4F60\u597D\uFF0C\u56FE\u4E66\u7BA1\u7406\u5458");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u4E66\u520A");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u6DFB\u52A0\u7269\u7406\u4E66\u520A");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u4FEE\u6539\u7269\u7406\u4E66\u520A");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u5220\u9664\u7269\u7406\u4E66\u520A");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u4E66\u79CD");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u6DFB\u52A0\u4E66\u79CD");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u4FEE\u6539\u4E66\u79CD");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u5220\u9664\u4E66\u79CD");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("\u5E2E\u52A9");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("\u5173\u4E8E");
		menuBar.add(mnNewMenu_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}
