//Nathan Frazier P685 #41
package inheritancepractice;

public class ClientP685 {

	public static void main(String [] args)
	{
		WebStore eBay = new WebStore("eBay", "https://www.ebay.com/", "Java");
		System.out.println(eBay.toString());
		
		MusicStore sirenRecords = new MusicStore("Siren Records", "3902 Main St, McHenry, IL 60050", 360);
		System.out.println(sirenRecords.toString());
		
		BikeStore bikeHaven = new BikeStore("Bike Haven", "Bikers of McHenry", 42);
		System.out.println(bikeHaven.toString());
	}
	
}
