public class digitAverager
{
   public double sumDigits( int number )
	{
		//write the implementation of the sumDigits method
     double sum = 0;
     int count = 0;
     double average=0;
     
     while (number > 0)
     {
      sum += number % 10;
      count ++;
      number = number/10;
     }
     
     average = sum/count;
  
	  return average;
	}
 
}