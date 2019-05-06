package methodpractice;

class AirportClient {

	public static void main(String[] args) 
	{
	Airport ord = new Airport("ord", 100);
	
	Airport mke = new Airport("O'Hare", 500);
	
	
	System.out.println("The number of gates for ORD is " + ord.getGates());
	System.out.println("The airport code for ord is: " + ord.getAirportCode());
	
	ord.setGates(500);
	ord.setAirportCode(("O'Hare"));
	
	System.out.println("The number of gates for ORD is " + ord.getGates());
	System.out.println("The airport code for ord is: " + ord.getAirportCode());
	
	if (ord.equals(mke))
		System.out.println("'ORD' and 'MKE' are equal");
	else
		System.out.println("'ORD' and 'MKE' are not equal");
	System.out.print(ord);
	}
 
}
