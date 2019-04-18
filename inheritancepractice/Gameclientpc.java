//Nathan Frazier P684 #36
package inheritancepractice;

public class Gameclientpc {

	public static void main(String[] args) {
		System.out.println("[main] Initializing PCgame in main with custom parameters...");
		PCgame PCgame = new PCgame(1024, 2.0, 325.0);
		System.out.println("[main] Getting system requirements...");
		System.out.println(PCgame.toString());
	}

}
