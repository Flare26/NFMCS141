//Nathan Frazier PP415 #57 client
package mar19;

public class Gradesclient {

	public static void main(String[] args) {
		
		//Set up for testing equals
		Grades g0 = new Grades("", "");
		Grades g1 = new Grades("MTH 200", "B+");
		Grades g2 = new Grades("MTH 100", "B");
		Grades g3 = new Grades("Math Computer Science", "A-");
		
		//Used a mutator on one of them
		g0.setCourseInfo();
		
		System.out.println("Course name: "
				+ "\n" + g0.getCname()
				+ "\nGrade: "
				+ "\n" + g0.getCgrade() );
		System.out.println(g0.toString() + "\n" );
		
		System.out.println("Course name: "
				+ "\n" + g1.getCname()
				+ "\nGrade: "
				+ "\n" + g1.getCgrade() );
		System.out.println(g1.toString() + "\n" );
		
		//Testing each case 
		System.out.println("equals: " + g0.equals(g2) );
		System.out.println("equals: " + g1.equals(g2) );
		System.out.println("equals: " + g2.equals(g2) );
		System.out.println("equals: " + g0.equals(g3) );

	}

}
