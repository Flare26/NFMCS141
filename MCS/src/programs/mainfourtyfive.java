package programs;

public class mainfourtyfive {
	public static void main(String[] args) {
		System.out.println(">Preparing to read file...");
	FourtyFive r = new FourtyFive();
	System.out.println("/r.openFile");
	r.openFile();
	System.out.println("/r.readFile");
	r.readFile(); 
	System.out.println("/r.closeFile");
	r.closeFile();
	System.out.println("{goodbye!}");
}
}
//Nathan Frazier mainfourtyfive, points to FourtyFive.java