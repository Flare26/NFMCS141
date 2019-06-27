package randomshit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Windowpane {

	private JFrame frame;
	private JTextField txtTypescanAValid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windowpane window = new Windowpane();
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
	public Windowpane() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtTypescanAValid = new JTextField();
		txtTypescanAValid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		frame.getContentPane().add(txtTypescanAValid, BorderLayout.NORTH);
		txtTypescanAValid.setColumns(10);
		
		JButton btnINeedTo = new JButton("I need to be hit");
		btnINeedTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "That really hurt!");
				String asset = txtTypescanAValid.getText();
				Auth authorize = new Auth();
				try {
					String id = "null";
					String responsetext = authorize.assetRequest(txtTypescanAValid.getText());
					
					String name =(String) JSONNY.sift(responsetext, "name");
					String assignedto =(String) JSONNY.sift(responsetext, "user_id");
					JOptionPane.showMessageDialog(null, "name : " + name + "\nAssigned to : " + assignedto);
				
				} catch (Exception g) {
					
					JOptionPane.showMessageDialog(null, "ERROR");
					g.printStackTrace();
				}
				
			}
		});
		frame.getContentPane().add(btnINeedTo, BorderLayout.CENTER);
	}

}
