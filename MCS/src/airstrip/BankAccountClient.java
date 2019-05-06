//Nathan Frazier

package airstrip;
import java.util.Scanner;
public class BankAccountClient 
{
	private static Scanner scan = new Scanner(System.in);
	
public static void main(String [] args)
	{
	
	BankAccount nathanAccount = new BankAccount( 123456L, 0.0, 0.0, "Checking"); //Initialize these in the order a b c d
	System.out.println("How much would you like to deposit? (floating point): ");
	double amount = scan.nextDouble();
	double newBalance = nathanAccount.deposit(amount);
	
	System.out.println("The new balance is " + nathanAccount.getBalance() );
	
	System.out.println("How much would you like to withdraw?");
	amount = scan.nextDouble();
	nathanAccount.withdraw(amount);
	
	System.out.println("The new balance is " + nathanAccount.getBalance() );
	newBalance = nathanAccount.getBalance();
	//Grab private variables and pass them to local
	
	long sAccountnumber = nathanAccount.getAccountNumber();
	
	double iEarned = nathanAccount.getInterestEarned();
	
	
	
	BankAccount samirAccount = new BankAccount( sAccountnumber, newBalance, iEarned, "Checking"  );
	
	System.out.println("Account1: " + nathanAccount.toString());
	System.out.println("Account2: " + samirAccount.toString());
	
	boolean isEqual = samirAccount.equals( nathanAccount );
	System.out.println(! isEqual );
	System.out.println("Thank you for using this program");
	

}

}