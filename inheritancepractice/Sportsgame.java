//Nathan Frazier P684 #38
package inheritancepractice;

public class Sportsgame extends Game {
	public boolean cantie;
	public boolean teams;
	
	public Sportsgame (int ram, double ghz, double hdd, boolean tie, boolean team)
	{
		super(ram, ghz, hdd);
		System.out.println("Sportsgame constructor called! Passed parameters.");
		cantie = tie;
		teams = team;
		
	}
	
	public String toString()
	{
		System.out.println("Super toString() overwritten!");
		
		String msg = "null" ;
		String msg2 = "null" ;
		
		 if (cantie)
			  msg = "Ties ARE allowed";
		 else
			 msg = "Ties are NOT allowed";
			 
		if (teams)
			msg2 = "Teams ARE allowed";
			else
				msg2 = "Teams are NOT allowed";
			
		 
		 
		return this.specString() + "\n" + msg + "\n" + msg2;
	}

}
