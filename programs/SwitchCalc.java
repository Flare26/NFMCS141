package programs;
// English Language Calculator p260 #55 Nathan Frazier
import java.util.Scanner;
import java.text.*;
public class SwitchCalc {
	

	public static void main(String[] args) {
Scanner seebot = new Scanner(System.in);
double fp1, fp2;
char c; //REMEMBER in order to declare a character it HAS to be a single letter otherwise it thinks it's a string and you get a conflict

seebot = new Scanner(System.in);
//sets up output format:
DecimalFormat twoDecimals = new DecimalFormat( "#,###,###.##");
System.out.println("{Welcome to Nathan's Simple Calculator}");
//Print Menu
System.out.println("Operation Menu: ");
System.out.println("'+' addition");
System.out.println("'*' multiplication");
System.out.println("'-' subtraction");
System.out.println("'/' division");
System.out.println("'^' exponential [# to the #]");
System.out.println("{enter positive integers}");
System.out.println("Enter first number [0-9]");
fp1 = seebot.nextDouble();

System.out.println("Enter operation [check menu]");

c = seebot.next().charAt(0); 


System.out.println("Enter second number [0-9]: ");
fp2 = seebot.nextInt();

if (((fp1+fp2)>=19)||((fp1+fp2)<=-10))
{
	System.out.println("You entered digits which are not between [0-9]");
}

switch (c)
{
case '+':
System.out.println("The sum of "+fp1+" plus "+fp2+" equals: "+(fp1+fp2));
	break;

case '-':
	System.out.println("The difference of "+fp1+" minus "+fp2+" equals: "+(fp1-fp2));
	break;

case '*':
	System.out.println("The product of "+fp1+" multiplied by "+fp2+" equals: "+(fp1*fp2));
	break;
	
case '/':
	System.out.println("The quotient of "+fp1+" div. by "+fp2+" equals: "+(fp1/fp2));
	break;
	
case '^':
	System.out.println("The result of "+fp1+" to the "+fp2+" power equals: "+Math.pow(fp1, fp2));
	break;
	
default:
	System.out.println("You have entered an invalid operator. GoOdByE");
	break;
}

}
}