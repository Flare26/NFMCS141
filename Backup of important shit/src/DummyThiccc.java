
import java.util.Scanner;
import org.json.JSONObject;
//Nathan Frazier
//Uses ApachePut as a prototype
//Creates instance of ApachePutfiield to take a single field as input and an API end
//API URL NODE : "https://johnsburg12.freshervice.com/api/v2/" + apiEndpoint
// API URL ENDPOINT : apiNode + "assets/displayID"
//AUTH SCHEME : username:password || apikey:x
public class DummyThiccc {
	
	static String field = "description"; //changeable
	static String value = "";
	static long displayID = 0;
	//3420 for reference ^
	static Scanner seebot = new Scanner(System.in);
	
	public static void main(String [] args) {
		//Initialize
		JSONObject asset = null;
		JSONObject details = null;
		
		System.out.println("Welcome to the dummythicc feature test!\n(Integer) Enter Asset DisplayID ---> ");
		displayID = seebot.nextInt();

		System.out.println("Thank you! displayID = " + displayID);
		
		try {
			//create new Auth to generate dev API key
		Auth auth = new Auth();
		asset = auth.getCustomObject("assets/"+displayID+".json");
		details = (JSONObject) asset.get("asset");
		value = details.getString(field);
		System.out.println("Enter new data : {");
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		scan.close();
		
		//Update local copy & delete fields that throw errors
		details.put(field, in); 
		details.remove("id");
		details.remove("display_id");
		details.remove("created_at");
		details.remove("author_type");
		details.remove("updated_at");
		//Update API Object
		asset.put("asset", details);
		System.out.println("% Local copy == " + asset.toString());
		
		//START PUT REQUEST
		JSONObject outbound = new JSONObject(asset.toString());
		
		System.out.println("Attempting REST : PUT ...");
		ApachePutfield restPut = new ApachePutfield(outbound, ("assets/"+displayID), "29D3QS0ZKyjLzCef3LB", "X");
		int code = restPut.put(restPut.CLIENT_CONTEXT);
		System.out.println("--REST : PUT EXECUTED ---> | "+ code + " |");
		if (code == 200)
			System.out.println("!!! SUCCESS !!!");
		//ASSET SHOULD BE UPDATED
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
