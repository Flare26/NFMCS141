//Nathan Frazier P687 #52
//This class must use checkBudget() since it's an inherited abstract method.
package inheritancepractice;
import java.text.DecimalFormat;
public class All_Inclusive extends Vacation{
private String brand;
private int rating;
private double price;

public All_Inclusive() 
{
	super(); //default superclass constructor
	brand = "null";
}

public All_Inclusive(double budget, String destination, String brand, int rating, double price)
{
	super(budget, destination);
	this.brand = brand;
	setRating(rating);
	setPrice(price);
}

public String getBrand()
{
	return brand;
}

public int getRating()
{
	return rating;
}

public double getPrice()
{
	return price;
}

public void setRating(int rating)
{
	if (rating >=0 && rating <= 5)
	{
		this.rating = rating;
	} else {this.rating = 9999;}
}

public void setPrice(double price)
{
	if (price >= 0)
	this.price = price;
}

public String toString()
{
	DecimalFormat currency = new DecimalFormat("$#.00");
	DecimalFormat rating = new DecimalFormat("0.0");
	return super.toString()
			+ "\nBrand : " + brand
			+ "\nRating : " + rating.format(this.rating)
			+ "\nPrice : " + currency.format(this.price);	
}

public double checkBudget() //Our abstract function
{
	if ( price <= super.getBudget() )
		return ( super.getBudget() - price );
	else
		return ( super.getBudget() - price );
}

/*
public boolean equals(Object o)
{
	if (! (instanceof All_Inclusive) ) //instanceof is an operator, compares memory layout (fields,ect)
		return false;
	else
	{
		All_Inclusive objAllinc = (All_Inclusive) o;
		if (super.get)
	}	

}
*/

} //EQUALS MODEL ON 377, 375 @ override, 
