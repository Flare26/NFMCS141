package randomshit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//Nathan Frazier Authorization token generator
//Spits out the syntax required for the freshdesk API, but base64 encoded

import org.apache.commons.codec.binary.Base64;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class Auth {

	public String apikey64;
	
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
		this.apikey64 = apikey;
	}
	
	public String assetRequest(String T)
	{
	//throw asset tag into constructor
	JSONParser parser = new JSONParser();
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
        
        String inputLine;
        while ((inputLine = in.readLine()) != null)
        //^While in.readLine() {Which is equal to string inputline} does not equal null...
        {              
            JSONObject a = (JSONObject) parser.parse(inputLine);
            
            Set s = a.keySet(); //java.util.set
            Set values = a.entrySet();
            
            Iterator i = s.iterator();//java.util.iterator
            while(i.hasNext())
            {
	            String key = (String) i.next();
	            Object value = (JSONArray) a.get(key);
	            //^ Jumps to next key and associated object in incoming JSON
	            System.out.println("Key = " + key + "\nAssociated data : " + value);
	            //System.out.println("Fetching data using JSON key... : " + a.get("agent_id") );
	            
            }
            
        }
        
        in.close();
        
    }//end of try
    catch (FileNotFoundException e) {
        e.printStackTrace();
        return "ERROR!";
    } catch (IOException e) {
        e.printStackTrace();
        return "ERROR!";
    } catch (ParseException e) {
        e.printStackTrace();
        return "ERROR!";
    }
    
    return "DONE!";
}
    
}//end of class

//Nathan Frazier
/*
 *This class takes my personal Freshworks API key and encodes it to the required base64 format.
 *It then sends the API key along with a request URL to the API, and parses the returned JSON object. 
 */
