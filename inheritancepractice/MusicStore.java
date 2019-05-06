//Nathan Frazier P685 #41
package inheritancepractice;

public class MusicStore extends Store {
	
	String address;
	int titles;
	
	public MusicStore(String name, String address, int titles)
	{
		super(name);
		this.address = address;
		this.titles = titles;
	}
	
	public String toString()
	{
		return ( super.toString() + "\nAddress : " + address + "\nAvailable Titles : " + titles + "\n" ) ;
	}

}
