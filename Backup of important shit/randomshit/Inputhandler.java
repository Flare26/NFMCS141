package randomshit;

import java.util.Scanner;

public class Inputhandler {
	//parse input method takes a string that will display as a prompt, waitng for input
	
	public String getInput_prompt(String prompt, Scanner scan)
	{
		System.out.println("invoking getInput_prompt()...");
		System.out.println(prompt);
		String input = scan.next();
		String result = input;
		System.out.println("Input = " + result);
		return result;
	}
}
//This class takes a Prompt and a scanner being used in the main runtime.