/*
 * Nathan Frazier - JSONNY alpha
 * I called this JSONNY so i could remember it but what this does is it takes the raw text
 * returned from from Auth.class methods and wraps them into JSON automatically depending on
 * what you are searching for 
 */
import org.json.*;
public class JSONNY {

	//BELOW METHOD TAKES THE RAW STRING FROM API AND EXTRACTS NESTED LOOP + REQUESTED DATA
	public static Object sift(String responsetxt, String keyword)
	{
		System.out.println("Feeding responsetext and keyword to JSONNY.sift...");

			org.json.JSONObject obj = new JSONObject(responsetxt);
			org.json.JSONArray jsonArray = obj.getJSONArray("assets");
			/*
		 	creates a JSONArray object within java
			using the only returned object 'assets', which contains a proper array
			*/
			for (int i = 0; i<jsonArray.length(); i++)
			{
				System.out.println("--JSONY found a nested object " + jsonArray.get(i));
			}
			System.out.println("Pulling data from nested array...");
			JSONObject targetobj = (JSONObject) jsonArray.get(0);
			
			System.out.println("New object created from data...");
			
			if (keyword == null)
				keyword = "EMPTYKEYWORD";
			System.out.println("Requesting data from keyword " + keyword);
			
			//HOW TO HANDLE NULL VALUES
			//NULL VALUES NEED TO BE CHECKED FOR IF AT ALL POSSIBLE
			Object o = targetobj.get(keyword);
			if (JSONObject.NULL.equals(o))
				o = (String) "[KEY IS NULL]";
				
			System.out.println("...requested data acquired!\n" + o.toString()+"\n");
			return o;
			}
	
	public static Object getAPIArray(String responsetxt) {
		org.json.JSONObject obj = new JSONObject(responsetxt);
		org.json.JSONArray jsonArray = obj.getJSONArray("assets");
		for (int i = 0; i<jsonArray.length(); i++)
		{
			System.out.println("--found nested object " + jsonArray.get(i));
		}
		
		return jsonArray;
	}
	
	
	}
