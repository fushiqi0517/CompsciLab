public class WordsCompareRunner
{
   public static void main( String args[] )
   {
      //all test cases are done for you
		WordsCompare test = new WordsCompare("abe","ape");
		test.compare();
      System.out.println(test);

		test.setWords("giraffe","gorilla");
		test.compare();
		System.out.println(test);

		test.setWords("one","two");
		test.compare();
		System.out.println(test);

		test.setWords("fun","funny");
		test.compare();
		System.out.println(test);

	   test.setWords("123","19");
		test.compare();
		System.out.println(test);

		test.setWords("193","1910");
		test.compare();
		System.out.println(test);

		test.setWords("goofy","godfather");
		test.compare();
		System.out.println(test);

		test.setWords("funnel","fun");
		test.compare();
		System.out.println(test);


	}
}