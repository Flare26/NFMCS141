package recursion;

public class recursivedrome {
	
	public static void main(String [] args)
	{
		//Could have return from main with booleans
		
		String a = "goog";
		String b = "ba";
		String c = "hoorah";
		String d = "asciicsa";
		
		System.out.println(a + "\t= " + isPalindrome(a));
		System.out.println(b + "\t= " + isPalindrome(b));
		System.out.println(c + "\t= " + isPalindrome(c));
		System.out.println(d + "\t= " + isPalindrome(d));
	}
	

	public static String isPalindrome (String string)
	{
		if ( string.length() <= 2)
			return "Palindrome :)";
		else
		{
			if (string.charAt(0) == string.charAt(string.length() - 1))
				return isPalindrome(string.substring(1, string.length() - 1));
			else
				return "Not Palindrome :(";
		}
	}
	
}
