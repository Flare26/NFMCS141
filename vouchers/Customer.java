package vouchers;
//Nathan Frazier, this class sets up Customer info
public class Customer {
	
	
	private String NAME;
	
	
	private int AGE;
	private int FT;
	private int INCH;
	private int LBS;
	private double SHOE;


	public static void main ( String [] args ) //this main method is for testing purpose only
	{
		Customer TL38 = new Customer("Troy Leonard", 38, 6, 4, 251, 12.5);
		System.out.println( TL38.toString() );
		
		
	}
	
	public Customer( String name, int age, int ft, int inch, int lbs, double shoe) //Creates customer
	{
		
		
		
		NAME = name;
		AGE = age;
		FT = ft;
		LBS = lbs;
		
		INCH = inch;
		SHOE = shoe;
		
	}

	public String getName()
	{
		return NAME;
	}
	
	public int getAge()
	{
		return AGE;
	}
	
	public int getFeet()
	{
		return FT;
	}
	
	public int getINCH()
	{
		return INCH;
	}
	
	public double getShoesize()
	{
		return SHOE;
	}
	
	public int getLbs()
	{
		return LBS;
	}
	
	
	public String toString()
	{
		return NAME + "\tAGE: " + AGE + "\tFT : " + FT + "\tIN : " + INCH + "\tSIZE : " + SHOE + "\tLBS : " + LBS;
	}
	
}
