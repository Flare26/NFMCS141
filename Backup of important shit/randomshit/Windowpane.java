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
import javax.swing.JTextPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPanel;

public class Windowpane {

	private JFrame frame;
	private JTextField txtTypescanAValid;
	private JPanel panel;
	private JTextPane txtpnNathanFrazier;
	private JTextPane txtpnAssetGrabber;
	private JLabel lblTypescanJAsset;

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
				Auth authorize = new Auth();
				try {
					String responsetext = authorize.assetRequest(txtTypescanAValid.getText());
					
					String name =(String) JSONNY.sift(responsetext, "name");
					String assignedto =(String) JSONNY.sift(responsetext, "user_id");
					String usetype =(String) JSONNY.sift(responsetext, "usage_type");
					JOptionPane.showMessageDialog(null, "Name : " + name + "\nAssigned to : " + assignedto
					+ "\nUsage type : " + usetype);
				
				} catch (Exception g) {
					
					JOptionPane.showMessageDialog(null, "ERROR");
					g.printStackTrace();
				}
				
			}
		});
		frame.getContentPane().add(btnINeedTo, BorderLayout.SOUTH);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		
		lblTypescanJAsset = new JLabel("Type/Scan J12 Asset # in above field ^ ");
		panel.add(lblTypescanJAsset);
		
		txtpnNathanFrazier = new JTextPane();
		txtpnNathanFrazier.setText("Nathan Frazier");
		panel.add(txtpnNathanFrazier);
		
		txtpnAssetGrabber = new JTextPane();
		txtpnAssetGrabber.setText("Asset Grabber - v 0.1");
		panel.add(txtpnAssetGrabber);
	}

}
