
public class Testclient1 {

	public static void main(String [] args)
	{
		try {
		LocationHandler locationParse = new LocationHandler();
		long displayID = 2835L;
		String location = locationParse.getAssignedSchool(displayID);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
