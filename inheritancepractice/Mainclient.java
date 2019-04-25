//Nathan Frazier P684 #36 & #38 MAIN CLASS
package inheritancepractice;

public class Mainclient {
	
	public static void main( String [] args )
	{
		System.out.println("[main] Initializing game objects with custom parameters...\n");
		PCgame pcgame = new PCgame(1024, 2.0, 325.0);
		Sportsgame sportsgame = new Sportsgame(2048, 2.5, 1122.0, false, true);
		System.out.println("\n[main] calling child toString() methods...");
		System.out.println("\nPC--> " + pcgame.toString() + "\n\nSportsgame--> " + sportsgame.toString() );
		System.out.println("\n[main] Done!");
		
	}

}
