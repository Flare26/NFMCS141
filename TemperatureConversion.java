/* Temperature Conversion
   Anderson, Franceschi
   
   Nathan Frazier
*/
package programs; 
public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
	float div = (float) 5/9;
	float vid = (float) 9/5; //remember to ask why double did not work
	System.out.println(div);
	int num = 32;
	System.out.println(num);
			
      //***** 2.  declare temperature in Fahrenheit as an int 
	double FTEMP = 99.5;
	System.out.println(FTEMP);
	  		
      //***** 3. calculate equivalent Celsius temperature	
	  double converted = div*(FTEMP - num);
	  		
      //***** 4. output the temperature in Celsius
	   System.out.println("The temperature in C is "+converted);
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
		double reverse = (converted*vid)+num;
	   
				
      //***** 6. output Fahrenheit temperature to check correctness 
		
				System.out.println("The temperature in F is "+reverse);
   }
} 