import java.util.Arrays;
public class LetterCountRunner
{
	public static void main(String args[])
	{	
		String[] test = {"Computer","science","is","the", "best", "course"};
      
      LetterCount a = new LetterCount(test);
      int num = 4;
      System.out.println("The array has " +a.countWords(num)+" Strings larger than "+num);
      num = 3;
      System.out.println("The array has " +a.countWords(num)+" Strings larger than "+num);
      num = 0;
      System.out.println("The array has " +a.countWords(num)+" Strings larger than "+num);
      System.out.println(a);
      
  	}
}