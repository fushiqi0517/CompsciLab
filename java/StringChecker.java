public class StringChecker
{
	private String word;//global variable

	public StringChecker() //default constructor method
	{
      word = ""; //initializing gobal variable to default value
	}

	public StringChecker(String s) //non-default constructor method
	{
      word = s; //initializing global variable to value stored in local variable s
	}

   public boolean findLetter(char c)
	{
      //your code here
     
      return word.indexOf(c)!= -1;
      
     
   }

	public boolean findSubString(String s)
	{
		// your code here
      String S = s;
      return word.indexOf(S) != -1;
      
	}

 	public String toString() //method to help print global variables 
 	{
 		return word+ "\n\n";
	}
}