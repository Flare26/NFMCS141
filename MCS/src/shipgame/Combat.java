package shipgame;
//import java.util.Scanner;
public class Combat {
	public boolean playerisdead = false;
	Playership p1 = new Playership(10, 1, 1, 15.0, 0.0); //hull lvl wep shield exp
	Enemyship e1 = new Enemyship(1, 0);  //level type
	int playerwep = p1.getWeapon(); //reads what weapon player is using and puts it into combat

	public void runCombat()
	{
		while (! playerisdead)
		{
		int choice = 1337;
		printCombatdisplay();
		//choice = Inputhandler.getInput();
		
		
		
		
		
		
		
		}
		System.out.println("\n{ Your ship has been destroyed }");
	}
	
	public void printCombatdisplay()
	{
		System.out.println("---------------");
		System.out.println("[1] Fire Cannon");
		System.out.println("[2] Repair Module");
	}
	
}
