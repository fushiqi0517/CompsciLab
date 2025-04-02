import java.util.Scanner;
public class MathFunHouse
{
  public static void main (String[] args) 
  {
      //Part 0: Set-up
      //Make your Scanner object here; name it "key"
      Scanner key = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = key.nextLine();
      System.out.println("Welcome, " + name + "!");
      System.out.println(" ");
 	   
      //Part 1: Slope of a Line
      System.out.print("Enter the x1, x2, y1, y2 coordinates seperated by spaces: ");
      int x1 = key.nextInt();
      int x2 = key.nextInt();
      int y1 = key.nextInt();
      int y2 = key.nextInt();
      double slope = (double)(y2 - y1)/(x2 - x1);
      System.out.println("The slope is " + slope);
      System.out.println(" ");
      
      //Part 2: Perimeter of a Rectangle
      int length = (int)(Math.random()*10)+1;
      int width = (int)(Math.random()*16)+5;
      System.out.println("The random numbers generated are " + length + " and " + width);
      int area = (2*length) + (2*width);
      System.out.println("The perimeter of the rectangle is " + area);
      System.out.println(" ");
            
      //Part 3: Area of a Trapezoid
      System.out.print("Enter the first base, second base, and height seperated by spaces: ");
      int b1 = key.nextInt();
      int b2 = key.nextInt();
      int h = key.nextInt();
      double TraArea = ((b1 + b2)*h)/2.0;
      System.out.println("The area of the trapezoid is " + TraArea);
      System.out.println(" ");
            
      //Part 4: Volume of a Cone
      System.out.print("Enter the radius and the height seperated by spaces: ");
      int radius = key.nextInt();
      int heightC = key.nextInt();
      double Volume = (double)(Math.PI) * Math.pow(radius,2) * heightC/3;
      System.out.println("The volume of the cone is " + Volume);
      System.out.println(" ");

      
      //Part 5: Surface area of a Cube
      System.out.print("Enter the height: ");
      double HeightCube = key.nextInt();
      double AreaCube = (Math.pow(HeightCube,2))*6;
      System.out.println("The surface area of the cube is " + AreaCube);
      System.out.println(" ");
            
      //Bonus (optional): Hypotenuse
      System.out.print("Enter side A and side B: ");
      int A = key.nextInt();
      int B = key.nextInt();
      double Hypotenuse = (double)Math.sqrt((Math.pow(A,2)) + (Math.pow(B,2)));
      System.out.println("The hypotenuse of the triangle is " + Hypotenuse);
      System.out.println(" ");

   }
}