//Nathan Frazier P686 #49
package inheritancepractice;

public abstract class Vehicle {

	String owner = "";
	int wheels;
	
	public Vehicle (String name, int wheels)
	{
		owner = name;
		this.wheels = wheels;
	}
	
	
	public String toString()
	{
		return ">Owner : " + this.owner + " | >Wheels : " + this.wheels;
	}
}
