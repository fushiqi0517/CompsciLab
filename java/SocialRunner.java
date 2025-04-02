public class SocialRunner
{
	public static void main( String args[] )
	{
		//make a Social object
         //make sure you look at the constructor to make sure your parameters match
         
         
      //make test cases for each of the SS numbers in the sample data on the instruction document
      //for each test case you will need to call the chopAndAdd method followed by the toString
         //keep in mind which method call(s) will need to be placed in a print statement and why
         //remember that there are two ways to call the toString method, either one is fine in this case.
      Social demo = new Social("456-56-2345");
      demo.chopAndAdd();
      System.out.println(demo);
      
      Social demo1 = new Social("121-12-1200");
      demo1.chopAndAdd();
      System.out.println(demo1);
      
      Social demo2 = new Social("102-2-1212");
      demo2.chopAndAdd();
      System.out.println(demo2);
      
      Social demo3 = new Social("000-00-0000");
      demo3.chopAndAdd();
      System.out.println(demo3);
      
      Social demo4 = new Social("000-00-000");
      demo4.chopAndAdd();
      System.out.println(demo4);
      
      Social demo5 = new Social("175-99 5656");
      demo5.chopAndAdd();
      System.out.println(demo5);

      
      
	}
}