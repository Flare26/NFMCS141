

import java.util.Scanner;

public class Inputhandler {
	//parse input method takes a string that will display as a prompt, waitng for input
	
	public String prompt(String prompt, Scanner scan)
	{
		System.out.println("Inputhandler.prompt(says)...");
		System.out.println(prompt);
		String input = scan.next();
		String result = input;
		System.out.println("Input = " + result);
		return result;
	}
}
//This class takes a Prompt and a scanner being used in the main runtime.