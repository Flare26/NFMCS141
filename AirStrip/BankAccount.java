//Nathan Frazier
package airstrip;

public class BankAccount {
/*This account number (long)
 * The account balance (double)
 * The interest earned (double)
 * The type of bank account (String)
 * These let the constructor use the variables only in this class
 */
	//These 4 fields get initialized in order a b c d respectively
	private long aNumber;
	private double bal;
	private double iEarned;
	private String aType;
	
	public BankAccount() //parens are default constructor, only initializing non-numeric instance variables
	{
		this.aType = "Checking"; //for all new BankAccount type will be Checking.
	}
	
	public BankAccount( long aNumber, double bal,
			double iEarned, String aType) //For all new BankAccount these numbers will be expected.
	{
		this.aNumber = aNumber; //These bridge the gap between the class and BankAccount instance
		this.bal = bal;
		this.iEarned = iEarned;
	} //Up until this point all of these were private. BankAccount makes them public with 'this'
	//ACCESSORS
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
	//MUTATOR
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
			this.bal += amount; //adds balance to amount ant sets amount equal to that new #
		return bal;
	}
	
	public double withdraw(double amount)
	{
		if (amount >= 0
				&& (bal - amount >= 0))
		{
			this.bal = bal - amount;
			return bal;
		} else
		{
			return bal;
		}
	}
	
	public String toString()
	{
		return "Account Number:" + aNumber
				+ "Account Balance: " + bal
				+ "Interest Earned: " +iEarned
				+ "Account Type: " + aType;
	}
	
	/*

	 
	public boolean equals( Object o )
	{
		BankAccount objBankAccount = (BankAccount) o; //typecast so we can compare values
		
		if ( ! ( o instanceof BankAccount)) //this should always return false (i think)
		{
			
			return false;
			
		} 
		else
		{
			
		}
		if (aNumber == objBankAccount.aNumber
					&& Math.abs(bal - objBankAccount.bal)  < 0.0001
					&& Math.abs(iEarned - objBankAccount.iEarned) < 0.0001
					&& aType.equals(objBankAccount.aType) 
					)
		{
			return true;
		}
					
					//Used .equals() since aType is a String
 
		}
		
		*/
	
	}
	

