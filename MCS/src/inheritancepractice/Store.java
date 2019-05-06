//Nathan Frazier P685 #41
package inheritancepractice;

public abstract class Store {
	
	public final double SALES_TAX_RATE = 0.06;
	private String name;
	
	public Store(String name)
	{
		setName(name);
	}
	
	private String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return ("Name : " + name);
	}

}
