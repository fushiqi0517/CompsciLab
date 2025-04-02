//This class is done for you, but you still need to understand it
//It is fair game for questions
public class TriangleRunner
{
	public static void main( String[] args )
	{
		System.out.println("The Perimeter of a Triangle");
		System.out.println("\n"); 
      
      //test case 1
		Triangle test = new Triangle(3,3,3);
      
      System.out.println(test);
      test.calcPerimeter();
		System.out.println("Area = " + test.getArea() );      
      System.out.println("\n");
      
      //test case 2
      test.setSideA(7);
      test.setSideB(8);
      test.setSideC(9);
      
      System.out.println(test);
      test.calcPerimeter();
		System.out.println("Area = " + test.getArea() );      
      System.out.println("\n");
      
      //test case 3
      test.setSideA(10);
      test.setSideB(9);
      test.setSideC(11);
      
      System.out.println(test);
      test.calcPerimeter();
		System.out.println("Area = " + test.getArea() );

		
	}
}