//Nathan Frazier P686 #49
package inheritancepractice;

public class MotorVehicle extends Vehicle {
	
	public double VL = 0;
	public double HP = 0;
	
	public MotorVehicle(String name, int wheels, double volume)
	{
		super(name, wheels);
		this.VL = volume;
		
	}
	
	public double countHorses()
	{
		this.HP = this.VL * this.wheels;
		return this.HP;
	}
	
	public String toString()
	{
		return super.toString() + " [Horsepower = " + HP + "]";
	}

}
