public class WordRunner
{
	public static void main(String[] args)
	{
      /*Look at the instructions (Word document) to see what the expected output should look like and make it happen.*/
      /*HINT: You only need to make ONE object*/
      Word test = new Word();
      
      test.setWord("chicken");
      System.out.println(test);
      System.out.println("num vowels == " + test.getNumVowels());
      System.out.println("num chars == " + test.getLength());
      System.out.println();
      
      test.setWord("alligator");
      System.out.println(test);
      System.out.println("num vowels == " + test.getNumVowels());
      System.out.println("num chars == " + test.getLength());
      System.out.println();
      
      test.setWord("elephant");
      System.out.println(test);
      System.out.println("num vowels == " + test.getNumVowels());
      System.out.println("num chars == " + test.getLength());
  	}
}