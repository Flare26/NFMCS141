//Nathan Frazier
//Get the data from a JSON object array
//I am just calling the URL object to the API "fresh12"
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTEST {
   
    public static void main(String[] args) {
    	System.out.println("Hello, welcome to JSONTEST, which probably won't work correctly");
        JSONParser parser = new JSONParser();
        String key64 = Auth.getEncodedKey();
        System.out.println("(21) key64 = " + key64);
        try {        
            URL fresh12 = new URL("https://johnsburg12.freshservice.com/api/v2/assets/3810"); // URL to Parse
            System.out.println("(24) Opening URLConnection & setting request properties...");
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