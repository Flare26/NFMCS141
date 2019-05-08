//Nathan Frazier P686 #49
package inheritancepractice;

public class Bicycle extends Vehicle {
	
	public Bicycle(String name, int wheels)
	{
		super (name, wheels);
	}

	public String toString()
	{
		return super.toString() + " [Bicycle]";
	}
}
