package vouchers;

public class Menuclient {
	private static int in;
	public static void main(String[] args) {
		Menu m0 = new Menu();
		m0.printHeader();
		m0.printMenu();
		m0.getInput();
		in = m0.getInput();
		
		switch ( in )
		{
		case 1 : 
			System.out.println("1 is working");
		case 2 : 
			System.out.println("2 is working");
		case 3 :
			System.out.println("3 is working");
		}
	}

}
