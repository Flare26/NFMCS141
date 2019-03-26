//Nathan Frazier

package Methods;

import java.text.DecimalFormat;

public class Coins {
	
	public double total = 0;
	private static int quarters;
	private static int dimes;
	private static int nickels;
	private static int pennies;
	
	public Coins(int q, int d, int n, int p)
	{
		quarters = q;
		dimes = d;
		nickels = n;
		pennies = p;
	}
	
	
	public void setQ(int newcoins)
	{
		if (newcoins >= 0)
			quarters = newcoins;
		
	}
	
	public void setD(int newcoins)
	{
		if (newcoins >= 0)
			dimes = newcoins;
	}
	
	public void setN(int newcoins)
	{
		if (newcoins >= 0)
			nickels = newcoins;
	}
	
	public void setP(int newcoins)
	{
		if (newcoins >= 0)
			pennies = newcoins;
	}
	
	public double getTotal()
	{
		return total;	
	}
	
	public void setTotal()
	{
		total = quarters + dimes + nickels + pennies;
	}
	
	public int getQ()
	{
		return quarters;
	}
	
	public int getD()
	{
		return dimes;
	}
	
	public int getN()
	{
		return nickels;
	}
	
	public int getP()
	{
		return pennies;
	}
	
	public String toString()
	{
		return String.format("Q: %d / D: %d / N: %d / P: %d", quarters, dimes, nickels, pennies);
	}
	
	public String convert()
	{
		DecimalFormat wallet = new DecimalFormat("$ 0.00");
		double qu = quarters*0.25;
		double di = dimes*0.1;
		double ni = nickels*0.05;
		double pe = pennies*0.01;
		total = qu + di + ni + pe;
		
		return wallet.format(total) + " currently in wallet.";
	}
	
}
