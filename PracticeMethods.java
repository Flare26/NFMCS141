package programs;
/* Chapter 3 Programming Activity 2
   Calling class methods
   Anderson, Franceschi
   
   Nathan Frazier 
*/
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
// ***** 1. add your import statements here

public class PracticeMethods
{
  public static void main( String [] args )
  {
    //*****
    // 2.  a. Create a Scanner object to read from the keyboard
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    // Your code goes here
    Scanner seebot = new Scanner(System.in);
   System.out.println("Hello! What is your name?");
   String input = seebot.nextLine();
   int a;
   a = input.length();
   System.out.println("There are "+a+" characters in your name!");
    
    //*****
    // 3.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Declare a constant for the current year.
    //     c. Calculate and print the age the user will be this year.
    //     d. Declare a constant for average life expectancy,
    //            set its value to 78.94.
    //     e. Calculate and print the percentage
    //            of the user's expected life they've lived.
    //        Use the DecimalFormat class to format the percentage 
    //            to one decimal place
    // your code goes here
   System.out.println("What year were you born?");
   int z = seebot.nextInt();
   DecimalFormat percent = new DecimalFormat("0.00%");
   int y = 2019;
   int cy = 2019 - z;
   System.out.println("You are about "+cy+" years old. Wow!");
   double LE = 78.94;
   double p = cy / LE ; 
   System.out.println("You have fufilled approx. "+percent.format(p)+" of your life. Feel old yet?");
   
   
   
        
    //*****
    // 4.  a. Generate a secret random integer between 1 and 20
    //     b. Skip a line, then ask the user for a guess.
    //     c. Print a message telling the user the secret number
    //         and how far from the number the user's guess was 
    //         (hint: use Math.abs)
    // your code goes here

   Random rand = new Random();
   int n = rand.nextInt(20);
   n += 1;
  
   System.out.println("I've just thought of a number between 1-20. Please guess a number.");
   int g = seebot.nextInt();
   System.out.println("Thanks! The number I chose was "+n+". Your guess was "+(Math.abs(g - n))+" numbers away! Goodbye.");
   
   System.exit(0);
  }
}