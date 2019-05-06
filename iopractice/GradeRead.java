package iopractice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class GradeRead {
	public static void main(String[] args) {
		FileReader file = new FileReader("C:/Users/nateb/eclipse-workspace/MCS/src/iopractice/testfile.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();
		while (line != null)
		{
			text += line;
			line = reader.readLine();
		}
		
		System.out.println(text);
	
		
	}

	
}
