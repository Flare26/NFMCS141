//Nathan Frazier PP415 #58
package mar19;

public class Course {
private String ccode;
private String cdesc;
private double credits;

public Course(String code, String desc, double cred)
{
	ccode = code;
	cdesc = desc;
	credits = cred;
}

public String getCcode()
{
	return ccode;
}

public String getCdesc()
{
	return cdesc;
}

public double getCredits()
{
	return credits;
}

public void setCredits(double newcred)
{
	credits = newcred;
}

public String toString()
{
	return ccode + " " + cdesc + " " + credits;
}

public boolean equals(Object obj) 
{ 
 
if (this == obj) 
        return true; 
      
    if(obj == null || obj.getClass()!= this.getClass()) 
        return false; 

    Course m = (Course) obj; 
     
    return (m.ccode == this.ccode && m.credits == this.credits); 
} 

}
