package AirStrip;

public class BankAccount {
/*This account number (long)
 * The account balance (double)
 * The interest earned (double)
 * The type of bank account (String)
 * These let the constructor use the variables only in this class
 */
	private long aNumber;
	private double bal;
	private double iEarned;
	private String aType;
	public BankAccount() //parens are default constructor, only initializing non-numeric instance variables
	{
		aType = "Checking";
	}
	
	public BankAccount( long aNumber, double bal,
			double iEarned, String aType)
	{
		this.aNumber = aNumber; //These bridge the gap between the class and BankAccount instance
		this.bal = bal;
		this.iEarned = iEarned;
	} //Up until this point all of these were private. BankAccount makes them public with 'this'
	
	public long getAccountNumber() //public so all can see or call
	{
		return aNumber;
	}
	public double getBalance()
	{
		return bal;
	}
	public double getInterestEarned()
	{
		return iEarned;
	}
	
	public String getAccountType()
	{
		return aType;
	}
	
	public void setAccountNumber(long aNumber)
	{
		if (aNumber >= 0)
			this.aNumber = aNumber;
	}
	
	public void setBalance (double bal)
	{
		if (bal >= 0)
			this.bal = bal;
	}
	
	public void setInterestEarned(double iEarned) //Void needs to be there so it does not return anything 
	//on its own, and we can define what it returns
	{
		if (iEarned >=0)
		this.iEarned = iEarned;
	}
	
	public void setAccountType(String aType)
	{
		this.aType = aType;
	}
	
	public double deposit(double amount)
	{
		if (amount >= 0)
			bal += amount;
		return bal;
	}
	
	public double withdraw(double amount)
	{
		if (amount >= 0
				&& (bal - amount >= 0))
			return bal;
	}
	
	public String toString()
	{
		return "Account Number:" + aNumber
				+ "Account Balance: " + bal
				+ "Interest Earned: " +iEarned
				+ "Account Type: " + aType;
	}
	
	public boolean equals( Object o )
	{
		if ( ! ( o instanceof BankAccount))
			return false;
		else
		{
			BankAccount objBankAccount = (BankAccount) o; //typecast so we can compare values
			if (aNumber == objBankAccount.aNumber
					&& Math.abs(bal - objBankAccount.bal)  < 0.0001
					&& Math.abs(iEarned - objBankAccount.iEarned) < 0.0001
					&& aType.equals(objBankAccount.aType) ) //Used .equals() since aType is a String
return true; //This is our boolean return if we are comparing bank accounts
		}
	}
}
