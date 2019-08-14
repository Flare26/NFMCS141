import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SearchFunction {
	public void searchFunction(boolean jmode, JTextField textField, JTextPane textArea) {
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
				String requester = "[NO REQUESTER]";
				String email = "[NO EMAIL]";
				Object UID = "[NO ID]";
				String name = "[NO NAME]";
				String tag = "[NO A#]";
				String updatedat = "[UNKNOWN DATE]";
				String parentlocation = "[UNKNOWN LOCATION]";
				String desc = "[NO DESCRIPTION]";
				
				//ASSET FIELDS ARE FOUND HERE
				long displayID = objectArray[i].getLong("display_id");
				name = objectArray[i].getString("name");
				tag = objectArray[i].getString("asset_tag");
				 
				//JOptionPane.showMessageDialog(null, "Found : " + objectArray[i].getString("name"));
				
				//This marks the beginning of checking to see if there is a requester...
				boolean noid = objectArray[i].get("user_id").equals(null);
				//checks user_id of current object in a list of objects and is true if null
				
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
			
				
				if (! nodesc)
					desc = objectArray[i].getString("description");
				
				
				boolean nodate = objectArray[i].get("assigned_on").equals(null);
				
				if (! nodate)
				 updatedat = (String) objectArray[i].get("updated_at");
				
				//Instance LocationParse
				LocationHandler locationParse = new LocationHandler();
				
				parentlocation = locationParse.getAssignedSchool(displayID);
				
				results +=
						 "\nAssigned : " + requester //requester method can be consolidated
						+"\nA# : " + tag
						+ "\n\nAsset name : " + name
						+ "\nParent Location : " + parentlocation
						+ "\nUID : " +  UID
						+ "\nDISPLAY ID : " + displayID
						+"\nLast updated : " + updatedat
						+"\n\n* : " + desc 
						+ "\n----------------------\n";
						
			} //end of enhanced for loop
			textArea.setText("Showing ("+count+") result(s)!\n" + results);
			if (count == 0 && textField.getText().toUpperCase().charAt(0) == 'J')
				JOptionPane.showMessageDialog(null, "No result!!");
			
			//Output values to textArea;
			//...end of search button functionality	
		} catch (Exception g) {
			
			JOptionPane.showMessageDialog(null, "Error : Cannot find!");
			g.printStackTrace();
		}
	}
}
