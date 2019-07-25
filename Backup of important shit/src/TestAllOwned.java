//framework for doing a reverse lookup by student

import org.json.JSONArray;
import org.json.JSONObject;

public class TestAllOwned {
 private static long UID = 5001114340L;
 static Auth authorize = new Auth();
	public static void main(String[] args) throws Exception {
		
		String returntext = authorize.getOwnedAssets(UID);
		JSONObject returnobj = new JSONObject(returntext);
		JSONArray assetlist = returnobj.getJSONArray("assets");
		System.out.println(assetlist.get(0));

	}

}
