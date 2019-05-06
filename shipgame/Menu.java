package shipgame;

public abstract class Menu {

	public Menu() {
		
	}
	
	public int getChoice()
	{
		Inputhandler handler = new Inputhandler();
		int handreturn = handler.getInput();
		return handreturn;
	}
	
}
