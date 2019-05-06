//Nathan Frazier In-Class 24
package exceptionpractice;
import javax.swing.JOptionPane;
public class UseScoreException {
	
	public static void main(String [] args)
	{
		int x = 1;
	
		do {
			try {
				String input = JOptionPane.showInputDialog("Enter test score (0-100)");
				System.out.println("> " + input);
				int in = Integer.parseInt(input);
				if ( in < 0 || in > 100 )
					throw new ScoreException("ScoreException, triggered by if ()");
				x = 0; 
				System.out.println("Score accepted!");
				}
			//End of try
			catch (ScoreException e) //Exceptions are treated as regular object types
			{
				System.out.println("[ScoreException]  (# must be 0-100) | Error : " + e.getMessage());
			}
			catch (NumberFormatException e) //parseInt generates a NumberFormatException
			{
				System.out.println("[NumberFormatException] (must be a whole #) "
						+ "| Error : " + e.getMessage());
			}
		
			} //End of do-while
		while (x == 1);
	}

}
