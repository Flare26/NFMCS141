
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

//Nathan Frazier
//NOTE when making a query use \" to print quotes inside quotes, otherwise freshworks will return error 400
//I am just calling the URL object to the API "fresh12"

public class QueryTestBackup {
	static char sentinel = '*'; 
	static Inputhandler inputhandler = new Inputhandler();
	static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
    	System.out.println("Hello, welcome to QUERYTEST, which probably won't work correctly.");
    		//^ Create instance of an input handler, handles exceptions
        JSONParser parser = new JSONParser();
        String key64 = Auth.getEncodedKey();
        	//^ Acceses static method from Auth, probably could make this an abstract in future
        System.out.println("key64 = " + key64);
        
        try {
        	do {
        	
	        	//System.out.println("Please enter a valid asset tag >");
	        	//Scanner scan = new Scanner(System.in);
	        	//String tag = scan.next();
	        	//________________________
	        	String tag = inputhandler.parseInput("Please enter a valid asset tag >");
	            URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/assets?query=\"asset_tag:" + tag +"\""); 
	            //^ Double quote needed around asset_tag above, it reads v2/assets?query="asset_tag:tag" to the server else you get error 400
	            System.out.println("Opening URLConnection & setting request properties...");
	            System.out.println("SUP DUD");
	            URLConnection yc = fresh12.openConnection();
	            System.out.println("SUP DUD");
	            yc.setRequestProperty("Authorization", "Basic" + " " + key64); //Must follow Basic with the key
	            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	            System.out.println("SUP DUD");
	           
	            String inputLine;
	            while ((inputLine = in.readLine()) != null) {    
	            	 System.out.println("SUP DUD");
	                JSONObject a = (JSONObject) parser.parse(inputLine);
	                
	                Set s = a.keySet(); //java.util.set
	                Set values = a.entrySet();
	                System.out.println("SUP DUD");
	                Iterator i = s.iterator();//java.util.iterator
	                while(i.hasNext()){
	                String key = (String) i.next();
	                Object value = a.get(key);
	                System.out.println(key + " = "+ value);
	                System.out.println("SUP DUD");
	                }
	                System.out.println("SUP DUD");
	            } in.close();
	            System.out.println("Query again? (y/n)");
	            String q = scan.next();
	            q.toLowerCase();
	            sentinel = q.charAt(0);
        	} while (sentinel != 'n');
        }//end of try
        
        catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        } catch (ParseException e) {
                e.printStackTrace();
        }  
    }//end of main
}//end of class body