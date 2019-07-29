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

public class AGRAB0080 {

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
					AGRAB0080 window = new AGRAB0080();
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
	public AGRAB0080() {
		initialize();
	}
	
	
	public void searchFunction(boolean jmode) {
		Auth authorize = new Auth();
		try {
			
			//Start search button functionality...
			String textbox = textField.getText();
			
			String responsetext = authorize.assetRequest(textbox.replaceAll("\\s", ""));
			JSONArray apiarray = (JSONArray) JSONNY.getAPIArray(responsetext);
			System.out.println("API array length = " + apiarray.length());
			
			//This is where JID mode comes in
			
			if (jmode == true) {
				Auth authjid = new Auth();
				String JID = "[INVALID J-ID]";
				if (textbox.toUpperCase().charAt(0) != 'J')
					JOptionPane.showMessageDialog(null, "J-ID numbers must start with 'J'");
				if (textbox.toUpperCase().charAt(0) == 'J')
					JID = textbox.toUpperCase();
				System.out.println("User entered " + JID);
				long UID = authjid.getUIDfromJID(JID);
				String retex = authjid.getOwnedAssets(UID);
				JSONObject returnobj = new JSONObject(retex);
				JSONArray assetlist = returnobj.getJSONArray("assets");
				apiarray = assetlist;
				for (int i = 0; i < assetlist.length(); i++)
				{
					System.out.println(assetlist.get(i));
				}
			}
			
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
					
					JSONObject apireturn = new JSONObject(); //gets asset number return
					try {
					apireturn = new JSONObject(authorize.getRequester(t));
					} catch (FileNotFoundException e) {
						System.out.println("CAUGHT : Requester ID does not exist! Checking agents...");
						apireturn = new JSONObject(authorize.getAgent(t)); //returns agent into an object
					}
					System.out.println("requester return object = " + apireturn.toString());
					
					JSONObject reqobj = new JSONObject();
					try {
						reqobj = apireturn.getJSONObject("requester");
					} catch (JSONException e) {
						System.out.println("CAUGHT : Object is not requester! Checking for agent...");
						reqobj = apireturn.getJSONObject("agent");
					}
					
					String email = "[NO EMAIL]";
					try { email = reqobj.getString("primary_email");}
					catch(JSONException e) {
						System.out.println("'primary_email' NOT FOUND, searching simply 'email'...");
						email = reqobj.getString("email");
					}
					 requester =
							reqobj.getString("last_name")
							+ ", "
							+ reqobj.getString("first_name")
							+ " - ( "
							+ email +" )\n";
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
			if (count == 0 && textField.getText().toUpperCase().charAt(0) == 'J')
				JOptionPane.showMessageDialog(null, "To search a J-ID, check 'enable J-ID mode'");
			
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
		frame = new JFrame("A#/JID LOOKUP"); // Johnsburg Asset Grabber
		Dimension screenSize = new Dimension(800,420);
		frame.setMinimumSize(screenSize);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().setLayout(groupLayout);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textArea.setEditable(false);
		textArea.setText("J12 Asset/JID Search v0.8 beta - Nathan Frazier");
		scrollPane.setViewportView(textArea);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					searchFunction(jmode);
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String arg = textField.getText();
				searchFunction(jmode);
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
