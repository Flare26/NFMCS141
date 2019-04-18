//Nathan Frazier P684 #36
package inheritancepractice;

public class PCgame extends Game {
	
	public PCgame(int ram, double ghz, double hdd)
	{
		super(ram, ghz, hdd);
		System.out.println("Child constructor called! Passed parameters.");
	}

}
