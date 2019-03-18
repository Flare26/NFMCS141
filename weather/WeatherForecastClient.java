/* WeatherForecast Client
   Anderson, Franceschi
*/
package weather;
public class WeatherForecastClient
{
  public static void main( String [] args )
  {
    WeatherForecast wf1 = new WeatherForecast( 23, "sunny" );
    WeatherForecast wf2 = new WeatherForecast( 200, "cloudy" );
    System.out.print( "The temperature of weather forecast #1 is " + wf1.getTemperature( ) );
    System.out.println( "F or " + wf1.fahrenheitToCelsius( ) + "C");
    System.out.println( "The sky condition of weather forecast #1 is " + wf1.getSky( ) );
    System.out.println( "Weather forecast #2 is " + wf2.toString( ) + "\n" );

    if ( wf1.isConsistent( ) )
      System.out.println( "weather forecast " + wf1 + " is consistent" );
    else
      System.out.println( "weather forecast " + wf1 + " is not consistent" );

    if ( wf2.isConsistent( ) )
      System.out.println( "weather forecast " + wf2 + " is consistent" );
    else
      System.out.println( "weather forecast " + wf2 + " is not consistent" );
    System.out.println( );

    if ( wf1.equals( wf2 ) )
      System.out.println( "Original weather forecasts #1 and #2 are identical" );
    else
      System.out.println( "Original weather forecasts #1 and #2 are different" );

    wf2.setTemperature( 23 );
    wf2.setSky( "sunny" );

    if ( wf1.equals( wf2 ) )
      System.out.println( "Original weather forecast #1 and modified weather forecast #2 are identical" );
    else
      System.out.println( "Original weather forecast #1 and modified weather forecast #2 are different" );

  }
}