package programs;
//page 86 number 51 Nathan Frazier
public class chaptertwofiftyone {
//we will have to make use of unicode subscripts
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s11 = "a3+b3=c3";
		s11 = s11.replaceAll("3", "\u00b3"); //string.replaceall(*, *) replaces all '3'  with unicode 
		System.out.println(s11);
		
		
		
	}

}
