//Nathan Frazier coins client
package Methods;

public class CoinsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coins c1 = new Coins(2, 2, 2, 200); //this is where you access that constructor we wrote into Coins.java
		//System.out.println( c1.getQ() );
		System.out.println(c1.toString());
		System.out.println(c1.convert());
	}

}
