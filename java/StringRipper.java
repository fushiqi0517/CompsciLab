public class StringRipper
{
    /*
	 method getFirstChunk() should return
	 all letters up to the first @ sign
    Make sure you check the return type
	 */

   public static String getFirstChunk(String a)
   {
     //your code here
     return a.substring(0,a.indexOf("@"));
   }
   
   
   //Do not change anything below this line
	public static void main( String args[] )
   {
      // method calls
		System.out.println(getFirstChunk("elephants@are@big"));    
      System.out.println(getFirstChunk("computer@science")); 
      System.out.println(getFirstChunk("dogs@are@smarter@than@cats"));   
      System.out.println(getFirstChunk("chickens@are@kewl")); 
       
   }
}