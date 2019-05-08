package iopractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HomeClient {

	public static void main(String[] args) {
		
		Home h1 = new Home(4, 500.00, true);
		Home h2 = new Home(3, 370.00, false);
		Home h3 = new Home(3, 600.00, true);
		Home h4 = new Home(2, 420.00, true);
		Home h5 = new Home(8, 1200.00, true);
		
		String fileName = "homes.bin";
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fileName));
			ostream.writeObject(h1);
			ostream.writeObject(h2);
			ostream.writeObject(h3);
			ostream.writeObject(h4);
			ostream.writeObject(h5);
			ostream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Objects written to file " + fileName); 
		
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fileName));
			Home h = (Home) istream.readObject();
			System.out.println("Rooms = " + h.rooms + " | Footage^2 = " + h.footage + " | Has basement = " + h.hasBasement);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
