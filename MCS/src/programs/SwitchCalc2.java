package programs;
// p237-239 Nathan Frazier
import java.util.Scanner;
import java.text.*;
public class SwitchCalc2 {
	private static Scanner seebot;

	public static void main(String[] args) {
double fp1, fp2;
String operation;
seebot = new Scanner(System.in);
//sets up output format:
DecimalFormat twoDecimals = new DecimalFormat( "#,###,###.##");
//Welcome message
System.out.println("{Welcome to Nathan's Calculator}");

//read the operands
System.out.println("Enter first operand: ");
fp1 = seebot.nextDouble();
System.out.println("Enter second operand: ");
fp2 = seebot.nextDouble();

//Print Menu
System.out.println("\n Operations are: "
		+ "\n\t ADD or + for addition"
		+ "\n\t SUBTRACT or - for subtraction"
		+ "\n\t MULTIPLY or * for multiplication"
		+ "\n\t DIVIDE or / for division");
System.out.println("Enter your selection: ");
operation = seebot.next();
operation = operation.toUpperCase();
//Switch time 
switch (operation)
{
case "ADD":
case "+":
	System.out.println("The sum is "+twoDecimals.format(fp1+fp2)); 
	break;
case "SUBTRACT":
case "-":
	System.out.println("The difference is "+ twoDecimals.format(fp1-fp2));
	break;
case "MULTIPLY":
case "*":
	System.out.println("The product is "+ twoDecimals.format(fp1*fp2));
	break;
case "DIVIDE":
case "/":
	if (fp2 == 0)
		System.out.println("Dividing by 0 is not allowed");
	else
	System.out.println("The quotient is "+twoDecimals.format(fp1/fp2));
	
	break;
default:
	System.out.println(operation+" ERROR INVALID INPUT");
}


}
}