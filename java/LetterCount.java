public class LetterCount
{
	private String[] wordRay;

	public LetterCount(String[] sent)
	{
     //fill in the constructor
     wordRay = sent;
	}

	public int countWords( int num )
	{
		//countWords should return the number of Strings larger than num
      int count = 0;
      for (int i = 0; i < wordRay.length; i++){
         if(wordRay[i].length() > num)
            count ++;
      }
      return count;
  	}
   
   public String toString( )
	{
		//calling toString should print out the array
      String a = "";
      for (int i = 0; i < wordRay.length; i++)
         a = a + wordRay[i] + " ";
      return a;
  	}

}