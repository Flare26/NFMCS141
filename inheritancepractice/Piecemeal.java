//Nathan Frazier P687 #52
package inheritancepractice;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Piecemeal extends Vacation
{
private String [] items;
private double [] costs;
//private ArrayList<String> itemlist = new ArrayList<>();
//private ArrayList<Double> costlist = new ArrayList<>();

public Piecemeal()
{
	super();
	items = new String[10];
	costs = new double[10];
}

public Piecemeal (double budget, String destination, String [] items, double [] costs)
{
	super(budget, destination);
	this.items = new String[items.length];
	this.costs = new double[costs.length];
	
	//Copy items from parameter into this.items
	for (int i = 0 ; i < items.length; i++)
		this.items[i]=items[i];
	//Copy costs from parameter into this.costs
	for (int i = 0 ; i < costs.length; i++)
		this.costs[i]=costs[i];
}

//p456 line 151
public String[] getItems ()
{
	String [] temp = new String[ items.length ];
	for (int i = 0; i < items.length; i++ )
	temp[i] = items[i];
		return temp;

}

public double [] getCosts ()
{
	double [] temp = new double[ costs.length ];
	for (int i = 0; i < costs.length; i++ )
	temp[i] = costs[i];
	return temp;

}

public void setItems(String [] items)
{
	this.items = new String[items.length];
}

public void setCosts( double [] costs )
{
	this.costs = new double[costs.length];
	for ( int i = 0; i < costs.length; i++ )
	this.costs[i] = costs[i];
	
}

public String toString()
{
	String returnstr = "";
	DecimalFormat currency = new DecimalFormat("$0.00");
	for ( int i = 0; i < costs.length; i++)
		returnstr += "| Item : " + items[i] + " & Cost : " + currency.format(costs[i]) + " |"; 
		
		return super.toString()
				+ "\n" + returnstr;
}

public double checkBudget()
{
	double total = 0;
	for ( int i = 0; i < costs.length; i++)
		total += costs[i];
	
	return super.getBudget() - total;
}

}
