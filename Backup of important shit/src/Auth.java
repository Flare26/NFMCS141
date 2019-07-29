//Nathan Frazier Authorization token generator - alpha
/*
 * This class encodes my API key and can return raw api strings with .assetRequest()
 * .getRequester returns an object 'requester' with the users information. user_id needed as a long
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;




import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
//import org.json.*;
import org.json.JSONObject;
 
public class Auth {

	private String apikey64;
	
	public Auth()
	{
		setEncodedKey();
		//apikey64 is set as soon as program loads
	}
	
	private void setEncodedKey()
	{
		System.out.println("Constructor called setEncodedkey()");
		String apikey = "29D3QS0ZKyjLzCef3LB"+":X";
		System.out.println("API auth string : " + apikey);
		byte [] encodedkey = Base64.encodeBase64(apikey.getBytes()); //encodeBase64 requires an array of bytes
		apikey = new String(encodedkey); //Takes array and invokes toString()
		System.out.println("Encoded auth string : " + apikey + 
				"\nKey encoded and set succesfully!");
		apikey64 = apikey;
	}
	
	public String assetRequest(String T) throws Exception
	{
	//throw asset tag into constructor
	String key64 = apikey64;
	System.out.println("key64 = " + key64);
    
    String tag = T;
        URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/assets?query=\"asset_tag:" + tag +"\""); 
        // Double quote needed around asset_tag above, it reads v2/assets?query="asset_tag:tag" to the server else you get error 400
        System.out.println("Opening URLConnection & setting request properties...\n URL : " + fresh12.toString());
        URLConnection apiconn = fresh12.openConnection();
        //^ Create url object then create a connection object using the URL.openConnection()
        
        apiconn.setRequestProperty("Authorization", "Basic" + " " + key64); //Must follow Basic with the key
        BufferedReader in = new BufferedReader(new InputStreamReader(apiconn.getInputStream()));
        System.out.println("Created BufferedReader.");
        String inputLine = in.readLine();
        //String inline = inputLine;
        System.out.println("String from API = " + inputLine);
        return inputLine;
        //^ The API sends back a json array within a json array.
        //JSONObject parsed = new JSONObject(inputLine);
        
}
	
	public String getRequester(long UID) throws Exception {
		
		String key64 = apikey64;
		System.out.println("key64 = " + key64);
	    
	    long userid = UID;
	        URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/requesters/" + userid); 
	        // Double quote needed around asset_tag above, it reads v2/assets?query="asset_tag:tag" to the server else you get error 400
	        System.out.println("Opening URLConnection & setting request properties...\n");
	        URLConnection apiconn = fresh12.openConnection();
	        //^ Create url object then create a connection object using the URL.openConnection()
	        
	        apiconn.setRequestProperty("Authorization", "Basic" + " " + key64); //Must follow Basic with the key
	        BufferedReader in = new BufferedReader(new InputStreamReader(apiconn.getInputStream()));
	        System.out.println("Created BufferedReader");
	        String responsetext = in.readLine();
	        //String inline = inputLine;
	        System.out.println("text response = " + responsetext);
	        
	        //^ The API sends back a json array within a json array.
	        //JSONObject parsed = new JSONObject(inputLine);
	        //So this function returns an object in the form of a string (responsetext)
	        return responsetext;
	}
	
	public String getAgent(long UID) throws Exception {
		
		String key64 = apikey64;
		System.out.println("key64 = " + key64);
	    
	    long userid = UID;
	        URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/agents/" + userid); 
	        // Double quote needed around asset_tag above, it reads v2/assets?query="asset_tag:tag" to the server else you get error 400
	        System.out.println("Opening URLConnection & setting request properties...\n");
	        URLConnection apiconn = fresh12.openConnection();
	        //^ Create url object then create a connection object using the URL.openConnection()
	        
	        apiconn.setRequestProperty("Authorization", "Basic" + " " + key64); //Must follow Basic with the key
	        BufferedReader in = new BufferedReader(new InputStreamReader(apiconn.getInputStream()));
	        System.out.println("Created BufferedReader");
	        String responsetext = in.readLine();
	        //String inline = inputLine;
	        System.out.println("text response = " + responsetext);
	        
	        //^ The API sends back a json array within a json array.
	        //JSONObject parsed = new JSONObject(inputLine);
	        //So this function returns an object in the form of a string (responsetext)
	        return responsetext;
	}
	
	public String getOwnedAssets(long UID) throws Exception {
		String key64 = apikey64;
		URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/assets?query=\"user_id:" + UID +"\""); 
        // Double quote needed around asset_tag above, it reads v2/assets?query="asset_tag:tag" to the server else you get error 400
        System.out.println("Opening URLConnection & setting request properties...\n");
        URLConnection apiconn = fresh12.openConnection();
        //^ Create url object then create a connection object using the URL.openConnection()
        
        apiconn.setRequestProperty("Authorization", "Basic" + " " + key64); //Must follow Basic with the key
        BufferedReader in = new BufferedReader(new InputStreamReader(apiconn.getInputStream()));
        System.out.println("Created BufferedReader");
        String responsetext = in.readLine();
        //String inline = inputLine;
        System.out.println("text response = " + responsetext);
        return responsetext;
	}
	
	public long getUIDfromJID(String JID) throws Exception
	{
		String key64 = apikey64;
		URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/requesters?email=" + JID + "@johnsburg12.org");
		System.out.println("Opening URLConnection & setting request properties...\n");
		URLConnection apiconn = fresh12.openConnection();
		apiconn.setRequestProperty("Authorization", "Basic" + " " + key64);
		BufferedReader in = new BufferedReader(new InputStreamReader(apiconn.getInputStream()));
		JSONObject student = new JSONObject(in.readLine());
		System.out.println(student.toString());
		JSONArray jsonarray = student.getJSONArray("requesters");
		System.out.println(jsonarray.toString());
		JSONObject jobj = jsonarray.getJSONObject(0);
		
		long UID = jobj.getLong("id");
		return UID;
	}
    
}//end of class

//Nathan Frazier
/*
 *This class takes my personal Freshworks API key and encodes it to the required base64 format.
 *It then sends the API key along with a request URL to the API, and parses the returned JSON object. 
 */
