package randomshit;
import org.json.*;
public class JSONNY {

	//BELOW METHOD TAKES THE RAW STRING FROM API AND EXTRACTS NESTED LOOP + REQUESTED DATA
	public static Object sift(String responsetxt, String keyword)
	{
		System.out.println("Feeding responsetext and keyword to JSONNY...");

			org.json.JSONObject obj = new JSONObject(responsetxt);
			org.json.JSONArray jsonArray = obj.getJSONArray("assets");
			for (int i = 0; i<jsonArray.length(); i++)
			{
				System.out.println("nested array is " + jsonArray.get(i));
			}
			System.out.println("Pulling data from nested array...");
			JSONObject targetobj = (JSONObject) jsonArray.get(0);
			
			System.out.println("New object pullnest created from data...");
			
			if (keyword == null)
				keyword = "EMPTYKEYWORD";
			
			//HOW TO HANDLE NULL VALUES
			//NULL VALUES NEED TO BE CHECKED FOR IF AT ALL POSSIBLE
			Object o = targetobj.get(keyword);
			if (JSONObject.NULL.equals(o))
				o = (String) "NO VALUE";
				
			System.out.println("..requested data acquired!\n" + o.toString());
			return o;
			}
	}
