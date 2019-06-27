package randomshit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


//Nathan Frazier Authorization token generator
//Spits out the syntax required for the freshdesk API, but base64 encoded

import org.apache.commons.codec.binary.Base64;
import org.json.*;
 
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
        System.out.println("Opening URLConnection & setting request properties...\n");
        URLConnection apiconn = fresh12.openConnection();
        //^ Create url object then create a connection object using the URL.openConnection()
        
        apiconn.setRequestProperty("Authorization", "Basic" + " " + key64); //Must follow Basic with the key
        BufferedReader in = new BufferedReader(new InputStreamReader(apiconn.getInputStream()));
        System.out.println("Created BufferedReader");
        String inputLine = in.readLine();
        String inline = inputLine;
        System.out.println("text response = " + inputLine);
        
        //^ The API sends back a json array within a json array.
        JSONObject parsed = new JSONObject(inputLine);
        return inputLine;
}
    
}//end of class

//Nathan Frazier
/*
 *This class takes my personal Freshworks API key and encodes it to the required base64 format.
 *It then sends the API key along with a request URL to the API, and parses the returned JSON object. 
 */
