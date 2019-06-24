package randomshit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;

import org.apache.commons.codec.binary.Base64;
import org.json.*;
public class JSONlibtest {

	public static void main(String[] args) throws Exception {
		Auth auth = new Auth();
		String keyword = "";
		JSONlibtest jsontest = new JSONlibtest();
		String responsetxt = auth.assetRequest("A05550");
		jsontest.sift(responsetxt, keyword);
		
		

	}

	//BELOW METHOD TAKES THE RAW STRING FROM API AND EXTRACTS NESTED LOOP + REQUESTED DATA
	public void sift(String responsetxt, String keyword)
	{
		System.out.println("Feeding responsetext and keyword to JSONNY...");

			org.json.JSONObject obj = new JSONObject(responsetxt);
			org.json.JSONArray jsonArray = obj.getJSONArray("assets");
			for (int i = 0; i<jsonArray.length(); i++)
			{
				System.out.println("nested array is " + jsonArray.get(i));
			}
			System.out.println("Pulling data from nested array...");
			
			JSONObject pullnest = (JSONObject) jsonArray.get(0);
			
			System.out.println("New object pullnest created from data...");
			
			System.out.println("requested data " + pullnest.get(keyword));
			}
	}
