//Nathan Frazier program 55 pg 160
package programs;
import java.util.Scanner;
//import java.io.File;
public class FileExtension {

	public static void main(String[] args) {
		String extension;
		Scanner seebot = new Scanner(System.in);
		System.out.println("Input file name, including '.extension' ");
		String input = seebot.nextLine();
		int c = input.lastIndexOf(".");
		
		extension = input.substring(c);
		//because I keep forgetting, if input = hello, input.substring(3) would return "lo"
		System.out.println("This file extension is " + extension);
		seebot.close();
	}

}
