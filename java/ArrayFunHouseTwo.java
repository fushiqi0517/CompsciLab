import java.lang.System;
import java.lang.Math;

public class ArrayFunHouseTwo
{
	//goingUp() will return true if all numbers
	//in numArray are in increasing order
	//[1,2,6,9,23] returns true
	//[9, 11, 13, 8]  returns false
	public static boolean goingUp(int[] numArray)
	{
   int a = numArray[0];
	for(int i=0;i<numArray.length;i++)
   {
      if(numArray[i]<a)
         return false;
      a = numArray[i];
   }
   return true;   
	}

	//goingDown() will return true if all numbers
	//in numArray are in decreasing order
	//[31,12,6,2,1] returns true
	//[31, 20, 10, 15, 9] returns false
	public static boolean goingDown(int[] numArray)
	{
	int a = numArray[0];
	for(int i=0;i<numArray.length;i++)
   {
      if(numArray[i]>a)
         return false;
      a = numArray[i];
   }
   return true;
	}

	//getValuesBiggerThanX will return an array that contains
	//count number of values that are larger than parameter x
	//[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
	public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x)
	{
   int[] a = new int[count];
   int times = 0;
   int newArrayIndex = 0;
   for(int i = 0; i<numArray.length; i++)
   {
      if(times == count)
         return a;
      if(numArray[i]> x)
      {
         a[newArrayIndex] = numArray[i];
         times ++;
         newArrayIndex ++;
      }
   }
   return a;
	}
}