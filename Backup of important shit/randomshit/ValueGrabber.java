package randomshit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.codec.binary.Base64;
import org.json.*;

public class ValueGrabber {
	
	public static void main(String [] args)
	{
		ValueGrabber valuegrabber = new ValueGrabber();
		valuegrabber.setEncodedKey();
		valuegrabber.assetRequest("A05550");
		
	}

	private String apikey64;
	private JSONArray apiobj;
	
	public String getKeyVal (String inputline, JSONArray apireturn)
	{
		return "whososo";
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
		this.apikey64 = apikey;
	}
	
	private String assetRequest(String T)
	{
		
	String keystr = "Just us goons!";
	//throw asset tag into constructor
    String key64 = this.apikey64;
    System.out.println("key64 = " + key64);
    String tag = T;
    try {        
        URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/assets?query=\"asset_tag:" + tag +"\""); 
        // Double quote needed around asset_tag above, it reads v2/assets?query="asset_tag:tag" to the server else you get error 400
        System.out.println("Opening URLConnection & setting request properties...\n");
        URLConnection apiconn = fresh12.openConnection();
        //^ Create url object then create a connection object using the URL.openConnection()
        
        apiconn.setRequestProperty("Authorization", "Basic" + " " + key64); //Must follow Basic with the key
        BufferedReader in = new BufferedReader(new InputStreamReader(apiconn.getInputStream()));
        System.out.println("Created BufferedReader");
        String inputLine = in.readLine();
        System.out.println("inputLine = " + inputLine);
        
        //^ The API sends back a json array within a json array.
        JSONObject parsed = new JSONObject(inputLine);
        String value = parsed.getString("");
        System.out.println(value);
        JSONArray jsonarray = parsed.getJSONArray("assets");
       // Obj value2 = jsonarray.getString("display_id");
        System.out.println(jsonarray);
        System.out.println(value);
        

        
    }//end of try
    catch (FileNotFoundException e) {
        e.printStackTrace();
        return "ERROR!";
    } catch (IOException e) {
        e.printStackTrace();
        return "ERROR!";
    } catch (JSONException e) {
    	e.printStackTrace();
    }
    
	return keystr;  
}
	
}
