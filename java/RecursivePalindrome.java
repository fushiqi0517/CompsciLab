public class RecursivePalindrome {
    private static int start, end;

    public static String removeBlanks(String str) 
    {
       
        if (str.length() == 0) 
        {
            return "";
        }

        
        if (str.charAt(0) == ' ') 
        {
            return removeBlanks(str.substring(1));
        }
        return str.charAt(0) + removeBlanks(str.substring(1));
    }

    public static boolean isPalindrome(String str) 
    {
      
        String cleanedStr = removeBlanks(str).toLowerCase();

        if (cleanedStr.length() == 1) 
        {
            return true;
        }

        String one = cleanedStr.substring(0, 1);
        String two = cleanedStr.substring(cleanedStr.length() - 1);

        if (one.equals(two)) 
        {
            return isPalindrome(cleanedStr.substring(1, cleanedStr.length() - 1));
        }
        return false;  
        
    }

    public static void main (String[] args)
    {
     String[] arr = new String[] {"racecar", "A santa lived as a devil at NASA", "hello world"};
     for(String word: arr)
     {
      start = 0;
      end = word.length()-1;
      System.out.println(isPalindrome(word));
      /* Expected output:
         true
         true
         false
      */

     }
   }
}