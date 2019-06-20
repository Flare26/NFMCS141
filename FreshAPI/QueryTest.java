w//Nathan Frazier
//I am just calling the URL object to the API "fresh12"
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//NOTE when making a query use \" to print quotes inside quotes, otherwise freshworks will return error 400

public class QueryTest {
   
    public static void main(String[] args) {
    	System.out.println("Hello, welcome to QUERYTEST, which probably won't work correctly");
        JSONParser parser = new JSONParser();
        String key64 = Auth.getEncodedKey();
        System.out.println("key64 = " + key64);
        try {        
        	System.out.println("Please enter a valid asset tag >");
        	Scanner scan = new Scanner(System.in);
        	String tag = scan.next();
            URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/assets?query=\"asset_tag:" + tag +"\""); 
            // Double quote needed around asset_tag above, it reads v2/assets?query="asset_tag:tag" to the server else you get error 400
            System.out.println("Opening URLConnection & setting request properties...");
            URLConnection yc = fresh12.openConnection();
            yc.setRequestProperty("Authorization", "Basic" + " " + key64); //Must follow Basic with the key
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
           
            String inputLine;
            while ((inputLine = in.readLine()) != null) {              
                JSONObject a = (JSONObject) parser.parse(inputLine);
                
                Set s = a.keySet(); //java.util.set
                Set values = a.entrySet();

                Iterator i = s.iterator();//java.util.iterator
                while(i.hasNext()){
                String key = (String) i.next();
                Object value = a.get(key);
                System.out.println(key + " = "+ value);
                }
                
                //Location will return as an ID. Need to search returned JSON string and snip id, then create another API request
                
                
                
                
                //System.out.println(inputLine);
                // Loop through each item
               /* for (Object o : a) {
                    JSONObject tutorials = (JSONObject) o;

                    Long id = (Long) tutorials.get("ID");
                    System.out.println("Post ID : " + id);

                    String title = (String) tutorials.get("post_title");
                    System.out.println("Post Title : " + title);

                    System.out.println("\nWow you got to the last line :D");
                } */
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }  
}