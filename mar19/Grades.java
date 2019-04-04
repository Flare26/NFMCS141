//Nathan Frazier PP415 #57
package mar19;

public class Grades {
	
private String coursename = "UNKNOWN";
private String coursegrade = "N/A";

public Grades(String name, String grade)
{
	coursename = name;
	coursegrade = grade;
}

	public void setCourseInfo()
	{
	String cname = "Math Computer Science";
	String g = "A-";
	coursename = cname;
	coursegrade = g;
	}
	
	public String getCname()
	{
		return coursename;
	}
	
	public String getCgrade()
	{
		return coursegrade;
	}
	
	public String toString()
	{
		String output = "Course: " + coursename + " Grade: " + coursegrade ;
		return output;
	}
	
	public boolean equals(Object o)
	{
		if ( o == this)
			return true;
		
		if ( ! ( o instanceof Grades) )
			return false;

		    Grades g = (Grades) o; 
		     
		    return (g.coursename == this.coursename && g.coursegrade == this.coursegrade); 
	}
}
