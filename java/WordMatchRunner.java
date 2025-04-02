public class WordMatchRunner
{
   public static void main (String[] args)
   {
      WordMatch word = new WordMatch("concatenation");
      System.out.println(word.ﬁndBetterGuess("ten", "nation"));
      System.out.println(word.ﬁndBetterGuess("con", "cat"));
      word = new WordMatch("mississippi");
      System.out.println(word.ﬁndBetterGuess("iss", "issipp"));
      System.out.println(word.ﬁndBetterGuess("issipp", "mississippi"));
      
   }

/*Sample output:

nation
con
issipp
mississippi
*/

}