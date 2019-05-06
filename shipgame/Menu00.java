package shipgame;

public class Menu00 extends Menu {
	
	public Menu00()
	{
		
	}
	
	public void printHeader()
	{
		System.out.println("/-----------------------/");
		System.out.println("|						|");
		System.out.println("|	Vouchers, please	|");
		System.out.println("|						|");
		System.out.println("'-----------------------'");
		
	}
	
	public void printOptions0()
	{
		
	}
	
	public int getChoice()
	{
		System.out.println("SUPER CURRENTLY OVERWRITTEN");
		Inputhandler handler = new Inputhandler();
		int handreturn = handler.getInput();
		return handreturn;
	}

}