//Nathan Frazier P685 #41
package inheritancepractice;

public class WebStore extends Store {
	
	String URL;
	String LANG;
	
	public WebStore(String name, String url, String lang) 
	{
		super(name);
		this.URL = url;
		this.LANG = lang;
	}
	
	public String toString()
	{
		
		return ( super.toString() + "\nURL : " + URL + "\nSource Language : " + LANG + "\n" ) ;
	}

}
