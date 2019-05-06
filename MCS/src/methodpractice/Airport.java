/* Airport class
   Anderson, Franceschi
   
   Nathan Frazier
*/
package methodpractice;
public class Airport
{
  // 1. ***** Define the instance variables  *****
  //  airportCode is a String
  //  gates is an integer
  private String airportCode;
  private int gates;
  

  // 2. ***** Write this method *****
  // Default constructor:
  // method name: Airport
  // return value:  none
  // parameters: none
  // function: sets the airportCode to an empty String
  public Airport()
  {
	airportCode = "unknown"; //ask
  }
  
  
  
  // 3. ***** Write this method *****
  // Overloaded constructor:
  // method name: Airport
  // return value: none
  // parameters:  a String startAirportCode and an int startGates
  // function:
  //      calls the the setAirportCode method,
  //      passing startAirportCode parameter;
  //      calls the setGates method, passing startGates parameter
  public Airport (String startAirportCode, int startGates) {
  airportCode = startAirportCode;
  gates = startGates;
  }
  
  
  // 4. ***** Write this method *****
  // Accessor method for the airportCode instance variable
  // method name: getAirportCode
  // return value: String
  // parameters: none
  // function: returns airportCode
 public String getAirportCode()
 {
	 return airportCode;
 }
 
 

  // 5. ***** Write this method *****
  // Accessor method for the gates instance variable
  // method name: getGates
  // return value: int
  // parameters: none
  // function: returns gates
  
  public int getGates()  //Accessor method
  {
	  return gates;
  }
  
  
  // 6. ***** Write this method *****
  // Mutator method for the airportCode instance variable
  // method name: setAirportCode
  // return value: void
  // parameters: String newAirportCode
  // function: assigns airportCode the value of the
  //       newAirportCode parameter
  public void setAirportCode(String newAirportCode) //Mutator method
  {
	  airportCode = newAirportCode;
  }
  
  
  
  // 7. ***** Write this method *****
  // Mutator method for the gates instance variable
  // method name: setGates
  // return value:  void
  // parameters: int newGates
  // function: validates the newGates parameter.
  //   if newGates is greater than or equal to 0,
  //       sets gates to newGates;
  //       otherwise, does not change value of gates
  
  public void setGates(int newGates) //This must be public VOID not int
  {
	  if ( newGates >= 0 )
		  gates = newGates;
  }
  
  public String toString()
  {
	  return ("Airport Code is: " + airportCode
			  + "\nNumber of gates: " + gates);
  }
  
  public boolean equals(Object o)
  {
	  if (! (o instanceof Airport))
		  return false;
	  else
	  {
		  Airport objAirport = (Airport) o;
		  if (airportCode.equals (objAirport.airportCode)
				  && gates == objAirport.gates)
				  return true;
		  else
			  return false;
		  
	  }
  }
}
