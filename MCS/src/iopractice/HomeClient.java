//Nathan Frazier P779 #60
package iopractice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HomeClient {

	public static void main(String[] args) {
		
		int n = 0;
		String fileName = "homes.bin";
		System.out.println("Constructing objects...");
		
		Home h1 = new Home(4, 500.00, true);
		Home h2 = new Home(3, 370.00, false);
		Home h3 = new Home(3, 600.00, true);
		Home h4 = new Home(2, 420.00, true);
		Home h5 = new Home(8, 1200.00, true);
		
		try {
			System.out.println("Attempting to write objects to file...");
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fileName));
			ostream.writeObject(h1);
			ostream.writeObject(h2);
			ostream.writeObject(h3);
			ostream.writeObject(h4);
			ostream.writeObject(h5);
			ostream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Objects written to file " + fileName); 
		
		try {
			
			System.out.println("Reading from file " + fileName);
			
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fileName));
			boolean cont = true;
			while (cont)
			{

				System.out.println("\nReading next object...");
				Home h = (Home) istream.readObject();
				System.out.println(h.toString());
				n++;
			}

			istream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			//IOException also handles EOFExcepion for the stream. Just read until EOF is thrown.
			System.out.println("No data to read! :  " + e.getMessage());
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println(n + " objects read sucessfully");
			System.out.println("Closing...");
			System.exit(0);	
		}
	}

}
