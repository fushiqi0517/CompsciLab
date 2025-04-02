import java.util.Arrays;
public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed for this lab
   
   //look at the instructions for sample output for each method you need to write
   
	//getSum() will return the sum of the numbers from start to stop inclusive
   //Use a for loop to traverse the array (you can use an indexed loop or a for each loop)
	public static int getSum(int[] numArray, int start, int stop)
	{
		int sum = 0;
      if(stop > numArray.length-1)
            stop = numArray.length-1;
      for(int i = start; i <= stop; i++)
      {
         sum += numArray[i];
      }
      return sum;
         
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int count = 0;
      for(int i = 0; i < numArray.length; i++)
      {
         if (val == numArray[i])
            count += 1;
      }
      return count;
	}
   
   public static int[] removeVal(int[] numArray, int val)
	{
		int count = getCount(numArray,val);
      
      int e =0;
      int[] newnumArray = new int[numArray.length -count];
      for (int item : numArray)
      {
         if(item != val)
         {
            newnumArray[e] = item;
            e++;
         }
      }
      return newnumArray;
	}
}