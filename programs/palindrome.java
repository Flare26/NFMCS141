package programs;
//Nathan Frazier palindrome

	import java.util.Scanner;
	class palindrome
	{
	    public static void main(String[] args)
	    {
	       
	        Scanner seebot = new Scanner(System.in);
	        System.out.println("Enter a phrase you believe to be a palindrome:");
	        String str = seebot.nextLine();
	        
	        if(isPalindrome(str))
	            System.out.println(str + " is a palindrome!");
	        else
	            System.out.println(str + " is not a palindrome. Sorry!");
	    }
	    
	    //is a palindrome?
	    public static boolean isPalindrome(String s) //ask how str gets put into this s value here
	    {   
	        // String is palindrome
	        if(s.length() == 0 || s.length() == 1)
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))
	       
	            return isPalindrome(s.substring(1, s.length()-1)); //substring replaces old s with 1st and last chars deleted

	     
	        return false;
	        
	    }

	}