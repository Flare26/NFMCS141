//Nathan Frazier In-Class 24
package exceptionpractice;

public class ScoreException extends IllegalArgumentException
{

  ScoreException(String message)
  {
      super(message);
  }

}