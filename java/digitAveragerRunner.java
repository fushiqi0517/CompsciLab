public class digitAveragerRunner
{
	public static void main( String args[] )
	{
		//add test cases 
      digitAverager demo = new digitAverager();
      System.out.println("234 has a digit average of " + demo.sumDigits(234));
      System.out.println("10000 has a digit average of " + demo.sumDigits(10000));
      System.out.println("111 has a digit average of " + demo.sumDigits(111));
      System.out.println("9005 has a digit average of " + demo.sumDigits(9005));
      System.out.println("84645 has a digit average of " + demo.sumDigits(84645));
      System.out.println("8547 has a digit average of " + demo.sumDigits(8547));
      System.out.println("123456789 has a digit average of " + demo.sumDigits(123456789));
	}
}