//Nathan Frazier - agrab v00.5
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.json.JSONArray;
import org.json.JSONObject;

public class AGRAB0050 {


	private JFrame frame;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane sp;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AGRAB0050 window = new AGRAB0050();
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
	public AGRAB0050() {
		initialize();
	}
	
	public void searchFunction(String textfield) {
		Auth authorize = new Auth();
		try {
			
			//Start search button functionality...
			String textbox = textField.getText();
			
			String responsetext = authorize.assetRequest(textbox.replaceAll("\\s", ""));
			JSONArray apiarray = (JSONArray) JSONNY.getAPIArray(responsetext);
			System.out.println("API array length = " + apiarray.length());
			
			JSONObject [] objectArray = new JSONObject [apiarray.length()];
			int count = 0;
			for (int i = 0; i < apiarray.length(); i++)
			{
				System.out.println("--RUNTIME OBJECTS " + apiarray.get(i));
				objectArray[i] = (JSONObject) apiarray.get(i);
				count++;
			}
			//Copies each returned json object into an object array in order
			
			String results = "";
			for (int i = 0; i < apiarray.length(); i++) {
				//JOptionPane.showMessageDialog(null, "Found : " + objectArray[i].getString("name"));
				String name = objectArray[i].getString("name");
				String tag = objectArray[i].getString("asset_tag");
				String requester = "[NO REQUESTER]";
				
				//This marks the beginning of checking to see if there is a requester...
				boolean noid = objectArray[i].get("user_id").equals(null);
				//checks user_id of current object in a list of objects and is true if null
				Object UID = "[NO ID]";
				if (! noid)
					//only true if the api sends back a user_id
				{
					long t = ((Long) objectArray[i].get("user_id"));
					//this turns the text into an object and pulls out the object inside of it.
					System.out.println("user_id detected! " + t);
					UID = t;
					JSONObject apireturn = new JSONObject(authorize.getRequester(t));
					System.out.println("requester return object = " + apireturn.toString());
					org.json.JSONObject reqobj = apireturn.getJSONObject("requester");
					
					 requester =
							reqobj.getString("last_name")
							+ ", "
							+ reqobj.getString("first_name")
							+ " - ("
							+ reqobj.getString("primary_email")+")\n";
				}
				
				boolean nodesc = objectArray[i].get("description").equals(null);
				String desc = "[NO DESCRIPTION]";
				
				if (! nodesc)
					desc = objectArray[i].getString("description");
				
				String updatedat = "[UNKNOWN DATE]";
				boolean nodate = objectArray[i].get("assigned_on").equals(null);
				
				if (! nodate)
				 updatedat = (String) objectArray[i].get("updated_at");
				
				results +=
						 "\nAssigned to : " + requester
						+ "\nAsset name : " + name
						+ "\nA# : " + tag
						+ "\nUID : " +  UID
						+"\nLast updated : " + updatedat
						+"\n\n* : " + desc 
						+ "\n----------------------\n";
						
			} //end of enhanced for loop
			textArea.setText("Showing ("+count+") result(s)!\n" + results);
			
			//Output values to textArea;
			//...end of search button functionality	
		} catch (Exception g) {
			
			JOptionPane.showMessageDialog(null, "Error : Cannot find!");
			g.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Test Build");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(scroll);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false); //turns off editing in the text area

		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String arg = textField.getText();
				searchFunction(arg);
			}
		});
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String arg = textField.getText();
				searchFunction(arg);
			}
		});
		
		JToggleButton tglbtnUserSearch = new JToggleButton("Search Owner [OFF]");
		tglbtnUserSearch.setEnabled(false);
		tglbtnUserSearch.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		tglbtnUserSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnUserSearch.isSelected()) {
					tglbtnUserSearch.setText("Show owner [ON]");
				
				} else
				{
				
				}
				
			}
		});
		
		sp = new JScrollPane();
		
		JLabel label = new JLabel("A-Grab v00.50 DEV");
		
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(sp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(409)
									.addComponent(tglbtnUserSearch))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE))))
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(sp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
					.addGap(57)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearch))
					.addGap(38)
					.addComponent(tglbtnUserSearch)
					.addGap(44)
					.addComponent(label))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
