package school;

public class StuClient {

	public static void main(String[] args) {
		String stuname;
		String stugpa;
		String address;
		String phonenum;
		String urinfo = "Blank";
		
		stuname = "unknown"; //initialize a new name
		stuname = Student.getName(stuname); //set the new name from unknown, to whatever Student.getName returns
		//Student.getName needs (stuname) because that is the string that will get fed into it from this class
		System.out.println(stuname); //print stuname
		
		stugpa = "not enrolled";
		stugpa = Student.getGpa(stugpa);
		System.out.println(stugpa);
		
		address = "none";
		address = Student.getAddy(address);
		System.out.println(address);
		
		phonenum = "123-456-7890";
		phonenum = Student.getPhone(phonenum);
		System.out.println(phonenum);
		
		System.out.println( "Name: " + stuname + "\nAddress: " + address + "\nPhone #: " + phonenum + "\nGPA: " + stugpa );
		
	}

}
