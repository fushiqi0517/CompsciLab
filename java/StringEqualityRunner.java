public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//make a StringEquality object (make sure you look at the constructor method and pass in the appropriate variable(s))

      //use the object you just made to call the checkEqual method (make sure you print the method call in order to get an output)

      //use the object you just made to call the checkCompare method (make sure you print the method call in order to get an output)
      StringEquality demo = new StringEquality("hello" , "goodbye");
      System.out.println(demo.checkEqual());

      StringEquality demo1 = new StringEquality("one" , "two");
      System.out.println(demo1.checkCompare());
      
      StringEquality demo2 = new StringEquality("three" , "four");
      System.out.println(demo2.checkEqual());

      StringEquality demo3 = new StringEquality("TCEA" , "UIL");
      System.out.println(demo3.checkCompare());
      
      StringEquality demo4 = new StringEquality("State" , "Champions");
      System.out.println(demo4.checkEqual());

      StringEquality demo5 = new StringEquality("ABC" , "ABC");
      System.out.println(demo5.checkCompare());
      
      StringEquality demo6 = new StringEquality("ABC" , "CBA");
      System.out.println(demo6.checkEqual());

      StringEquality demo7 = new StringEquality("Same" , "Same");
      System.out.println(demo7.checkCompare());

	}
} 