import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVread {

	public static void main(String [] args) {
		System.out.println("looking for CSV...");
		String filename = "csvtest.csv";
		File file = new File(filename);
		
		try {
		Scanner scanbot = new Scanner(file);
		while (scanbot.hasNext()) {
			String data = scanbot.next();
			System.out.println(data + "***");
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
