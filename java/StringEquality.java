public class StringEquality
{
	String wordOne, wordTwo;

	public StringEquality(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}
   
  
	public String checkEqual( )
	{
		//YOUR CODE HERE (must use equals)
      if (wordOne.equals(wordTwo))
      return wordOne + " has the same letters as " + wordTwo;
      else
      return wordOne + " does not have the same letters as " + wordTwo;
      //
   }
   
   public String checkCompare( )
	{
		//YOUR CODE HERE (must use compereTo)
      if (wordOne.compareTo(wordTwo) == 0)
      return wordOne + " has the same letters as " + wordTwo;
      else
      return wordOne + " does not have the same letters as " + wordTwo;
   }


   
}