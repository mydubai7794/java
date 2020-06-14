import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class dfa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dfa frame = new dfa();
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
	public dfa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		addWindowListener(new WindowAdapter(){
			   @Override
			   public void windowClosing(WindowEvent e) {
			     int   option=   JOptionPane.showConfirmDialog( 
			                  dfa.this, "确定退出系统? ", "提示 ",JOptionPane.YES_NO_CANCEL_OPTION); 
			      if(option==JOptionPane.YES_OPTION) 
			         if(e.getWindow()   ==   dfa.this) 
			         { 
			         System.exit(0); 
			         } 
			         else 
			         { 
			         return; 
			         
			         } 
			   }
			  });
			  
			 }
	}

