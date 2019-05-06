//Nathan Frazier P685 #43
package inheritancepractice;

public class BikeStore extends Store {
	
	int brands;
	String sponsor;
	
	public BikeStore(String name, String spon, int brands)
	{
		super(name);
		this.brands = brands;
		this.sponsor = spon;
	}
	
	public String toString()
	{
		return ( super.toString() + "\nSponsors : " + sponsor + "\nAvailable Brands : " + brands + "\n" ) ;
	}

}
