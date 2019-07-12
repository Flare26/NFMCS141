import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField txtHitMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtHitMe = new JTextField();
		txtHitMe.setText("hit me");
		txtHitMe.setBounds(87, 155, 96, 20);
		frame.getContentPane().add(txtHitMe);
		txtHitMe.setColumns(10);
		
		JButton btnOuch = new JButton("ouch");
		btnOuch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Program output goes here!");
			}
		});
		btnOuch.setBounds(136, 43, 89, 23);
		frame.getContentPane().add(btnOuch);
	}
}
