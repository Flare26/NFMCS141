import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
public class LocationHandler extends Auth {
	public ArrayList<JSONArray> arrayList = new ArrayList();
	
	JSONArray locations = new JSONArray();
	//Following will store location ID's
	long johnsburg_district_admin;
	long johnsburg_elementary_school;
	long johnsburg_junior_high_school;
	long johnsburg_high_school;
	long ringwood_primary_center;
	long IN_TRANSIT;
	long PREVIOUS_LOCATION;
	long CURRENT_LOCATION;
	
	//CONSTRUCTOR
	 LocationHandler() {
			johnsburg_district_admin = 5000178840L;
			johnsburg_elementary_school = 5000178841L;
			johnsburg_high_school =  5000178843L;
			johnsburg_junior_high_school = 5000178842L;
			IN_TRANSIT = 5000349147L;
		}

	public String getAssignedSchool(long DISPID) throws Exception {
		//make it work if we do not know what the ID after assets/ is
		//Auth.getCustomObject should include asset display ID v2/assets/dispid
		String result = "[NO RESULT]";
		if (DISPID != -420L) { //<-- VALIDATE DISPID
		LocationHandler test = new LocationHandler();
		System.out.println("-- BEGIN FINDING PARENT");
		System.out.println("Grabbing custom object");
		JSONObject asset = Auth.getCustomObject("assets/" + DISPID);
		System.out.println("Grabbed : " + asset.toString());
		JSONObject detials = asset.getJSONObject("asset");
		System.out.println("Object recieved!   -- " + asset.toString() + "\n" + detials.toString());
		long PLID = (Long) detials.get("location_id");
		System.out.println("PREVLOCATIONID = " + PLID);
		result = test.getParentLocation(PLID);
		System.out.println("FINAL VALUE = " + result );
		}
		return result;
		
	}
	
	public ArrayList set(long DISPID) throws Exception {
		//Auth auth = new Auth();
		JSONObject object1;
		
		object1 = (JSONObject) Auth.getCustomObject("assets/"+DISPID);
		JSONObject location = object1.getJSONObject("assets");
		
		return new ArrayList();
	}
	
	public JSONArray getLocationArray(long DISPID)
	{
		//initialize return variables, set default size
		JSONObject [] locationObjects = new JSONObject[420];
		JSONArray re = new JSONArray();
		return re;
	}
	
	public String getParentLocation(long PLID)//prev loc id
	{
		String parentlocation = "[LOCATION UNKNOWN]";
		int p = 0;
		long PALID; //Parent Location ID
		int sentinel = -1;
		int pg = 0;
		while (sentinel == -1)
		{
		//BEGIN WHILE LOOP
		try {
			
			
			String page = "?page="+pg;
			String query = "locations";
			if (pg > 0)
				query += page;
			JSONObject obj = getCustomObject(query);
			JSONArray locations = obj.getJSONArray("locations");
			
			for (int i = 1; i < locations.length(); i++) {
				//Cycles through each object in current page
				JSONObject current = (JSONObject) locations.get(i);
				System.out.println("# OF LOCATION ARRAY INDEXES = " + i + "# PAGE " + (pg+1));
				System.out.println("OBJECT " + current.toString());
				System.out.println("&&");
				if (current.getLong("id") == PLID)
				{
					System.out.println("********\nFOUND CURRENT CHROMEBOOK LOCATION\nSEARCHING FOR PARENT\n********");
					query = "locations";
					//reset query to search for singular
					JSONObject start = getCustomObject("locations/"+PLID);
					JSONObject obj2 = start.getJSONObject("location");
					System.out.println("CURRENT LOC. FOUND : " + obj.toString());
					System.out.println("@@ CURRENT LOC. NAME " + obj2.getString("name"));
					PALID = obj2.getLong("parent_location_id");
					JSONObject parent = getCustomObject("locations/"+PALID);
					System.out.println("^ PARENT LOC. FOUND AS : " + parent.toString());
					parentlocation = parent.getJSONObject("location").getString("name");
					System.out.println("@@ PARENT LOC. NAME " + parentlocation);
					
					p = pg+1;
					sentinel = 1;
				}
			}
			//Finished Current Page
			System.out.println("^^^END OF PAGE^^^");
			
			if (locations.length() < 1)
				sentinel = 0;
			pg++;
			//^ increments to the next page, then returns next page
			//	at the top when the while loop triggers until it finds a match
			
		}
		//END TRY
			
		catch (Exception e) {
			System.out.println("ERROR IN LOCATION PARSE");
			e.printStackTrace();
			sentinel = 1;
		} //END CATCH
		
		}
		if (sentinel == 1)
	System.out.println("FOUND MATCH | PG " + p + " |");
		//END WHILE LOOP (SENT MUST != -1)
	System.out.println("Found all locations.");
	return parentlocation;
	}
}


