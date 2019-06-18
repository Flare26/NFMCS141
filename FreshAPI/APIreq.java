import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.codec.binary.Base64;

public abstract class APIreq {

	String api =  "johnsburg12.freshservice.com/api/v2/tickets";
	public APIreq()
	{
		
	}
	
	public void send()
	{
		System.out.println("Sending auth request...");
	}
	
	
	public void authorize()
	{
		try {
			String webPage = "https://johnsburg12.freshservice.com/api/v2/tickets";
			//String name = "nfrazier@johnsburg12.org";
			//String password = "Exodus15%";
			String apikey = "29D3QS0ZKyjLzCef3LB"+":X";
			
			//String authString = name + ":" + password;
			String authString = apikey;
			System.out.println("auth string: " + authString);
			//byte array that stores base64 encoded bytes of my API key
			byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
			String authStringEnc = new String(authEncBytes);
			System.out.println("Base64 encoded auth string: " + authStringEnc);

			URL url = new URL(webPage);
			URLConnection urlConnection = url.openConnection();
			urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
			InputStream is = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);

			int numCharsRead;
			char[] charArray = new char[2048];
			StringBuffer sb = new StringBuffer();
			while ((numCharsRead = isr.read(charArray)) > 0) {
				sb.append(charArray, 0, numCharsRead);
			}
			//String result = sb.toString();

			//System.out.println("*** BEGIN ***");
			//System.out.println(result);
			System.out.println("Data recieved and stored");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public String toString()
	{
		return api;
	}
	
}
