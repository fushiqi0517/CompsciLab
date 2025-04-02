import java.util.List;
import java.util.ArrayList;

public class Herd
{
	private ArrayList<Creature> list;
  /*complete the constructor method
    Should initialize the list*/
	public Herd()
	{
   list = new ArrayList<Creature>();
	}

	/*Complete the add method
     Should add a Creature to the list of size creatureSize*/
   public void add( int creatureSize )
	{
   list.add(new Creature(creatureSize));
	}

	/* method countBigOnes should return the count of
	    big creatures - use the isBig() Creature method
	*/
	public int countBigOnes()
	{
		//change the return to match the comments above
      int count = 0;
      for(int i =0; i < list.size(); i++)
      {
         if (list.get(i).isBig() == true)
            count ++;
      }
      return count;
	}

   /*Complete the toString method
     return the list*/

	public String toString()
	{
	   //change the return to match the comments above

   	return "" +list;
	}
}