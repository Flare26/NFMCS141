
//Nathan Frazier Authorization token generator
//Spits out the syntax required for the freshdesk API, but base64 encoded

import org.apache.commons.codec.binary.Base64;
 
public class Auth {

	public static String getEncodedKey()
	{
		System.out.println("Calling Auth.getEncodedKey()");
		String apikey = "29D3QS0ZKyjLzCef3LB"+":X";
		System.out.println("Auth string: " + apikey);
		byte [] encodedkey = Base64.encodeBase64(apikey.getBytes()); //encodeBase64 requires an array of bytes
		apikey = new String(encodedkey); //Takes array and invokes toString()
		System.out.println("Encoded auth string : " + apikey);
		return apikey;
	}
	
}
