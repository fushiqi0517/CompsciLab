public class Sound
{
	/** the array of values in this sound; guaranteed not to be  null */
	private int[] samples;
	
	//Complete the constructor method
   public Sound( int[] vals )
	{
      samples = vals;
	}
	
	
	/** Changes those values in this sound that have an amplitude greater than  limit.
	*	Values greater than  limit are changed to  limit.
	*	Values less than  -limit are changed to  -limit.
	*	@param limit the amplitude limit
	*	Precondition:  limit =  0
	*	@return the number of values in this sound that this method changed  */	
	//PART A
	public int limitAmplitude(int limit)
	{	
		int count = 0;
      for (int i=0; i<samples.length;i++){
         if (samples[i] < -limit){
            samples[i] = -limit;
            count ++;
         }
         if (samples[i] > limit){
            samples[i] = limit;
            count ++;
         }
      }
      return count;
	}
	
	
	
	/** Removes all silence from the beginning of this sound.
	*	Silence is represented by a value of 0.
	*	Precondition:  samples contains at least one nonzero value
	*	Postcondition: the length of  samples reflects the removal of starting silence  */
	//PART B
	public void trimSilenceFromBeginning()
	{	
   int a = 0;
   for (int i=0; i<samples.length; i++){
      if(samples[i] == 0)
         a ++;
      if (samples[i] != 0)
         i = samples.length;
   }
   int[] newSamples = new int[samples.length - a];
   for (int z = 0; z<newSamples.length; z++){
      newSamples[z] = samples[z + a];
   }
   samples = newSamples;
	}
	
   //Should return all items in the array separated by a single space
	public String toString()
	{
   String output = "";
   for (int i = 0; i<samples.length; i++){
      output = output + samples[i] + " ";
   }
   return output;
	}
}