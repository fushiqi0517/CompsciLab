public class box
{
   /*Given a number, size, print a box made out of * and #.
   Start with size amount of * and 1 #, then decrease the * 
   while simultaneously increaseing the #. See the sample below. 


   box(3)); //***#
            //**##	
            //*###
            
   HINT: You will need to use 2 inner loops and 1 outer loop.
   1 inner loop for the * and the other for the #

   */
   public static String box( int size )
	{
   String a = "";
    for (int i=0; i<size; i++)
    {
      for (int j= size-i; j>0; j--)
      {
      a+= "*";
      }
      for (int z = 0; z <= i; z++)
      {
      a+= "#";
      }
      a+= "\n";
    }
    return a;
	}
   public static void main(String args[])
   {
      System.out.println(box(3) ); //***#
                                   //**##	
                                   //*###
                                                
      System.out.println(box(7)); //*******#
                                  //******##		
                                  //*****###
                                  //****####
                                  //***#####
                                  //**######
                                  //*#######
                                              	
                                               
      System.out.println(box(4)); //****#
                                  //***##
                                  //**###
                                  //*####	
                                               	  
      }
}