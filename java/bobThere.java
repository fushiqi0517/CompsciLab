public class bobThere
{
   /*Return true if the given string contains a "bob" string, 
   but where the middle 'o' char can be any char.


   bobThere("abcbob")) // true
   bobThere("b9b")) // true
   bobThere("bac")) // false   */
   
   public static boolean bobThere(String str) 
   {
    for (int i =0; i < str.length()-2; i++)
    {
      if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
      return true;
    }
    return false;
   }
   
   
   
   
   public static void main(String args[])
   {
      System.out.println(bobThere("abcbob")); // true		
      System.out.println(bobThere("b9b")); // true		
      System.out.println(bobThere("bac")); // false		
      System.out.println(bobThere("bbb")); // true		
      System.out.println(bobThere("abcdefb")); // false		
      System.out.println(bobThere("123abclbcdbabxyz")); // true		
      System.out.println(bobThere("b12")); // false		
      System.out.println(bobThere("b1b")); // true		
      System.out.println(bobThere("b12b1b")); // true		
      System.out.println(bobThere("bbc")); // false		
      System.out.println(bobThere("bbb")); // true		
      System.out.println(bobThere("bb")); // false		
      System.out.println(bobThere("b")); // false
   }
}