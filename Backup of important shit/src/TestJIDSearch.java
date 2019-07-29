import org.json.JSONArray;
import org.json.JSONObject;

public class TestJIDSearch {
	
		 
		 static Auth authorize = new Auth();
			public static void main(String[] args) throws Exception {
				
				//returns JSONArray
				String JID = "j260080";
				System.out.println("User entered " + JID);
				long UID = authorize.getUIDfromJID(JID);
				String responsetext = authorize.getOwnedAssets(UID);
				JSONObject returnobj = new JSONObject(responsetext);
				JSONArray assetlist = returnobj.getJSONArray("assets");
				for (int i = 0; i < assetlist.length(); i++)
				{
					System.out.println(assetlist.get(i));
				}
				//return assetlist;
			}

		}

	
	
