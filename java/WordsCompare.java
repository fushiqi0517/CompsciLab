public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;
   //add code to each of the following methods
	public WordsCompare()
	{
   wordOne = "";
   wordTwo = "";
   compare = 0;
	}

	public WordsCompare(String one, String two)
	{
   wordOne = one; //what is the difference between this and the setWords method?
   wordTwo = two;
   compare = 0;
	}

	public void setWords(String one, String two)
	{
   wordOne = one;
   wordTwo = two;
	}
   
   public String toString()
	{
   if (compare > 0)
   return wordOne + " should be placed after " + wordTwo;
   else
   return wordOne + " should be placed before " + wordTwo;
	}

	public void compare()
	{
   compare = wordOne.compareTo(wordTwo);   
	}

}