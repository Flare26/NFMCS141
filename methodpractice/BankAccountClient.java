package methodpractice;
import java.util.Scanner;
public class BankAccountClient 
{
public static void main(String [] args)
	{
	Scanner scan = new Scanner(System.in);
	BankAccount myAccount = new BankAccount( 123456L, 0.0, 0.0, "Checking"); //Initialize these in the order a b c d
	System.out.println("How much would you like to deposit? (floating point): ");
	double amount = scan.nextDouble();
	double newBalance = myAccount.deposit(100.0);
	System.out.println("The new balance is" + myAccount.getBalance() );
	System.out.println("How much would you like to withdraw?");
	amount = scan.nextDouble();
	newBalance = myAccount.withdraw(amount);
	System.out.println("The new balance is " + myAccount.getBalance() );
	}


}