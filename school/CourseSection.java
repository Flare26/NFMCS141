package school;

public class CourseSection {
	
	private static String MCS = "MCS 141"; //static makes it so methods can access
	private static String MCStimes = "Tu/Th, 1:00pm - 2:50pm";
	
	
	public static String getCourseName( String name )
	{
		name = MCS;
		return name;
	}
	
	public static String getCourseTimes( String schedule )
	{
		schedule = MCStimes;
		return schedule;
		
	}
	
	public static void getStuList( String stulist )
	{
		
	}
}
