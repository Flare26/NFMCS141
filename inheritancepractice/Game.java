//Nathan Frazier P684 #36
package inheritancepractice;

public class Game {
public int minRAM = -1; //Megabytes
public double minGHz = -2.0; //GigaHertz
public double minHDD = -300; //Megabytes

public Game(int ram, double ghz, double hdd)
{
	System.out.println("Super constructor called! (They want their data back)");
	minRAM = ram;
	minGHz = ghz;
	minHDD = hdd;
}

public String toString()
{
	return "[inherited01] | RAM : " + minRAM + " | Processor Speed : " + minGHz + " GHz | Storage Space : " + minHDD + " MB";
}

public String specString() //So I can still call an inherited method in Sportsgame since we wrote our own tostring
{
	return "[inherited02] | RAM : " + minRAM + " | Processor Speed : " + minGHz + " GHz | Storage Space : " + minHDD + " MB";
}
}

