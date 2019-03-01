package programs;  
//Nathan Frazier Multiplication Table

public class table {
	public static void main(String[] args) {

	System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9 \n------------------------------------------------------------------");
	int i;
	int SENT = 9;
	for (i=1; i <= SENT; i++) {
		System.out.println(i*1+"\t"+i*2+"\t"+i*3+"\t"+i*4+"\t"+i*5+"\t"+i*6+"\t"+i*7+"\t"+i*8+"\t"+i*9);
		
	}
	System.out.println("\n...Finished!");
	System.exit(0);
	
	}
}
