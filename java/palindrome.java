public class palindrome
{
   private boolean palindrome;
	private String str;
	
	palindrome(String s)
	{
		str = s;
		palindrome = isPalindrome(); 
	}
   
	/**
   * precondition:   str is not null
   *	               palindrome is true or false
   * Postcondition: returns a string in the format:
   *			   	  String:		value of str
   *				     Palindrome:	value of palindrome
   */
	public String toString()
	{
		/* to be redefined in part (a) */
      return "String: " + str + "\n" + "Palindrome: " + palindrome;
	}
	
   /**
   *  Precondition:   str is not null	
   *  Postcondition:  returns true if str is a palindrome, and false otherwise
   */		
	private boolean isPalindrome()
	{
		/* to be implemented in part (b) */
      String a = str.toUpperCase();
      for (int i = 0; i < a.length()/2; i++)
      {
         if (a.charAt(i) != a.charAt(a.length() - i - 1))
            return false;
    
      }
      return true;
	}	

}