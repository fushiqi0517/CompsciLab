public class Creature implements Comparable
{
	private int size;

   /*Complete the default constructor method*/
	public Creature() 
   {
   size = 0;
	}
   
   /*Complete the constructor method*/
	public Creature(int girth) 
   {
   size = girth;
  	}
   
   /*Complete the set method*/
	public void setSize(int girth)
	{
   size = girth;
	}

	/*
	 * method isBig should return true if size > 75
	 * method isBig should return false if size <= 75
	*/
	public boolean isBig()
	{
		//change the return to match the comments above
		return size > 75;
	}
   
   /*
	 * method equals compares the sizes of the current Creature to obj
	 * returns true if the sizes are equal and false otherwise
    * obj is a blank object, you need to cast it as a Creature object --> (Creature) obj
	*/

	public boolean equals(Object obj)
	{
		//change the return to match the comments above 
      Creature bob = (Creature) obj;
		return size == bob.size ;//why without()?
	}

	 /*
	 * method equals compares the sizes of the current Creature to obj
	 * returns 1 if the size of the current Creature is greater than the size of obj
    * returns -1 if the size of the current Creature is smaller than the size of obj
    * returns 0 if they are the same
    * obj is a blank object, you need to cast it as a Creature object --> (Creature) obj
    * you can access an instance variable by using a dot reference --> Creature.size
	*/
   public int compareTo(Object obj)
	{
		//change the return to match the comments above
      Creature bob = (Creature) obj;
    
      if(size > bob.size)
         return 1;
      if(size < bob.size)
         return -1;
      else
         return 0;
  	}
   
   /*Complete the toString method
     return the size of the Creature*/
	public String toString() {
		//change the return to match the comments above
      return "" + size;
	}
}