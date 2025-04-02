public class palindromeRunner 
{
   public static void main(String[] args) 
   {
      System.out.println(new palindrome("bob")); //true
      System.out.println(new palindrome("Racecar"));//true
      System.out.println(new palindrome("12345BOB54321"));//true
      System.out.println(new palindrome("madam"));//true
      System.out.println(new palindrome("123454321"));//true
      System.out.println(new palindrome("MADAM RACECAR"));//false
      System.out.println(new palindrome("A man, a plan, a canal, Panama"));//false
      System.out.println(new palindrome("computer"));//false
      System.out.println(new palindrome("false"));//false
      System.out.println(new palindrome("true"));//false
   }
}