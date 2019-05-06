//Nathan Frazier P687 #52
package inheritancepractice;
import java.text.DecimalFormat;
public abstract class Vacation {
	private double budget;
	private String destination;

	public Vacation()
	{
		destination = "TBD";
	}
	
	public Vacation(double budget, String destination)
	{
		setBudget(budget);
		this.destination = destination;
	}
	
	public double getBudget()
	{
		return budget;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	public void setBudget(double budget)
	{
	 if ( budget >= 0 )
	 {
		this.budget = budget; 
	 }
	}
	
	public void setDestination(String destination)
	{
		if (destination.length() > 0)
			this.destination = destination;
	}
	
	public abstract double checkBudget(); //Our abstract function
	
	public String toString()
	{
		DecimalFormat currency = new DecimalFormat("$#.00");
		return "\nBudget : " + currency.format(budget) +
		"\nDestination : " + destination;
	}
}
