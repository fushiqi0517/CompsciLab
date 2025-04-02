public class monkeyTrouble
{
   /* 2 min
   We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
   We are in trouble if they are both smiling or if neither of them is smiling. 
   Return true if we are in trouble.


   monkeyTrouble(true, true) → true
   monkeyTrouble(false, false) → true
   monkeyTrouble(true, false) → false */
   public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
    if (aSmile && bSmile)
    return true;
    if (!aSmile && !bSmile)
    return true;
    else
    return false;
    // return aSmile == bSmile;
    }

   
   static public void main (String[] args)
   {
     System.out.println( monkeyTrouble(true, true));//true		    
     System.out.println(monkeyTrouble(false, false)); //true		    
     System.out.println(monkeyTrouble(true, false)); //false		    
     System.out.println(monkeyTrouble(false, true)); //false	
   }
   
}
