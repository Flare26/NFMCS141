//Nathan Frazier P684 #38
package inheritancepractice;

public class Gameclientsports {
	
	public static void main(String[] args) {
		System.out.println("[main] Initializing Sportsgame in main with custom parameters...");
		Sportsgame sportsgame = new Sportsgame(2048, 2.5, 1122.0, false, true);
		System.out.println("[main] calling child toString() ...");
		System.out.println(sportsgame.toString() );
	}

}
