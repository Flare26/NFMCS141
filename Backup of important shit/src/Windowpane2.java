//Nathan Frazier - Asset Grab v0.8b
import java.awt.EventQueue;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Windowpane2 {
	
	//private long dispID = -420L;
	private boolean jmode = false;
	private boolean staffmode = false; //a07440 - matt border
	private JFrame frame;
	private JTextField textField;
	JTextPane textArea = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windowpane2 window = new Windowpane2();
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
	public Windowpane2() {
		initialize();
		
	}
	SearchFunction searchFunction = new SearchFunction();

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = new Dimension(800,420);
		
		JScrollPane scrollPane = new JScrollPane();
		JButton btnSearch = new JButton("SEARCH");
		frame = new JFrame("A#/JID LOOKUP"); // Johnsburg Asset Grabber
		frame.setMinimumSize(screenSize);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textArea.setEditable(false);
		textArea.setText("J12 Asset/JID Search v0.8 beta - Nathan Frazier");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		frame.getContentPane().setLayout(groupLayout);
		
		scrollPane.setViewportView(textArea);
		btnSearch.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					searchFunction.searchFunction(jmode, textField, textArea);
			}
		});
		//Action Listener Created
		textField = new JTextField();
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String arg = textField.getText();
				
			}
		});
		
	
		
		JCheckBox chckbxJidMode = new JCheckBox("J-ID Mode");
		chckbxJidMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jmode = !jmode;
				if (jmode == true)
					System.out.println("Johnsburg ID mode enabled! ( J###### )");
				if (jmode == false)
					System.out.println("Johnsburg ID mode DISABLED");
					
			}
		});
	
		
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSearch)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxJidMode, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSearch)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxJidMode))
					.addContainerGap(82, Short.MAX_VALUE))
		);
		
	}
}
