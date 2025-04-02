public class parrotTrouble
{
   
   /* 3 min
   We have a loud talking parrot. The "hour" parameter is the current 
   hour time in the range 0..23. We are in trouble if the parrot is 
   talking and the hour is before 7 or after 20. 
   Return true if we are in trouble.   
   parrotTrouble(true, 6) → true 
   parrotTrouble(true, 7) → false 
   parrotTrouble(false, 6) → false
   */

   
   public static boolean parrotTrouble(boolean talking, int hour)
    {
        if (talking && (hour <7 || hour > 20))
        return true;
        else
        return false;
        
        //return talking && (hour <7 || hour > 20);
    }

   
   static public void main (String[] args)
   {
     System.out.println(parrotTrouble(true, 6));//true		    
     System.out.println(parrotTrouble(true, 7)); //false		    
     System.out.println(parrotTrouble(false, 6)); //false		    
     System.out.println(parrotTrouble(true, 21)); //true	
     System.out.println(parrotTrouble(false, 21));//false		    
     System.out.println(parrotTrouble(false, 20)); //false		    
     System.out.println(parrotTrouble(true, 23)); //true		    
     System.out.println(parrotTrouble(false, 23)); //false
     System.out.println(parrotTrouble(true, 20)); //false	    
     System.out.println(parrotTrouble(false, 12)); //false

   }
   
}