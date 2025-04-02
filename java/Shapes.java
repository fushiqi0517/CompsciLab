// Inheritance and Polymorphism
// Polymorphism is the ability of a general object that 
// behaves like a specific object at run time.
// Overriding a method or overloading a method.
//
// Overriding  - Creating a Method in a subclass with the
//               same name and parameters as the super class method.
// Overloading - Creating a Method in a class with the
//               same name (but something different in the 
//               parameter list) as another method in the class.

import java.util.*;

class Shapes {
  public static void main(String[] args) 
  {
    System.out.println("Shapes 2025 - Due Tuesday, March 25, 2025");
    System.out.println();
    System.out.println();
    
    // PUT YOUR NAME ON THIS
    System.out.println("Written by Helen Zhou");
    System.out.println();

    // Create an ArrayList of Shape objects
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    // We will add some Shape objects to our 
    // shapes ArrayList
    Shape shape = new Rectangle("Rectangle",3,5);
    shapes.add(shape);

    // Create a Rectangle object with the name
    // "Rectangle", a width of 5, and a height of 4
    shape = new Rectangle("Rectangle", 5, 4);
    shapes.add(shape);

    // Create a Triangle object with the name
    // "Triangle", a base of 5, and a height of 8
    shape = new Triangle("Triangle", 5, 8);

    // Add this shape to the shapes ArrayList
    shapes.add(shape);

    // Create a Trapezoid object with the name
    // "Trapezoid", a base1 of 5, a base2 of 8,
    // and a height of 7
    shape = new Trapezoid("Trapezoid", 5, 8, 7);

    // Add this shape to the shapes ArrayList
    shapes.add(shape);

    // Create a Parallelogram object with the name
    // "Parallelogram", a base of 5,
    //  and a height of 7
    shape = new Parallelogram("Parallelogram", 5, 7);

    // Add this shape to the shapes ArrayList
    shapes.add(shape);

    // Loop through the shapes ArrayList and call
    // each shape's draw() method using an index.
    for (int i = 0; i < shapes.size(); i++)
    {
      shapes.get(i).draw();        
    }

    // Loop through the shapes ArrayList and call
    // each shape's draw() method using a for each loop.
    for (Shape temp : shapes)
    {
      temp.draw();        
    }
    
  } // end of method main
  
} // end of class Shapes

// Write a class called Shape
class Shape
{
  private String name; // Rectangle, Triangle, etc.
  private int height;
  private int base; // width or base

  // Constructor Shape
  public Shape(String name,
               int base, // or width or base or base1
               int height // or length
              )
  {
    this.name = name;
    this.base = base;
    this.height = height;
  }  

  public String getName()
  {
    return name;
  }

  public int getWidth() // or base
  {
    return base;
  }

  public int getHeight()
  {
    return height;
  }

  public int getBase()
  {
    return base;
  }

  public int getBase1() // or base
  {
    return base;
  }

  public int getLength() // or height
  {
    return height;
  }

  // this should be overriden in your subclass  
  public double getArea()
  {
    return 0;
  }

  // tells what you would draw if graphical
  // We will actually just tell them what we
  // would draw ("Triangle or Rectangle or ...")
  // You should override this method in your subclass
  // We will also show the attributes and area.
  public void draw()
  {
    // this should stay blank
    // You should override this in your subclass
  }

} // end of class Shape

// create a class called Rectangle which
// inherits from Shape
class Rectangle extends Shape
{
  // No additional instance variables are needed

  // Write a Rectangle constructor with 3 parameters
  // name, width, and height
  // Call the Shape constructor using super.
  public Rectangle(String name, int width, int height)
  {
    // Call the super constructor (in Shape) and pass it
    // name, width, and height
    super(name, width, height);  
  }

  public void printName()
  {
    System.out.println("Shape: " + getName());
  }
  
  public double getArea()
  {
    // length * width (stored in Shape)
    return getLength() * getWidth();    
  }

  public void draw()
  {
    System.out.println(getName());
    System.out.println("=========");    
    System.out.println("Length : " + getLength());
    System.out.println("Width  : " + getWidth());
    System.out.println("Area   : " + getArea() + " square units.");
    System.out.println();
    System.out.println();    
    
  }
} // end of class Rectangle

// create a class called Triangle which
// inherits from Shape
class Triangle extends Shape
{
  // No additional instance variables are needed

  // Write a Triangle constructor with 3 parameters
  // name, base, height
  // String, int, int
  // Call the Shape constructor using super.
  public Triangle(String name, int base, int height)
  {
    // Call the super constructor and pass it
    // name, base, and height
    super(name, base, height);   
  }

  public void printName()
  {
    System.out.println("Shape: " + getName());
  }
  
  public double getArea()
  {
    // half of the base * height
    return 0.5 * getBase() * getHeight();    
  }

  public void draw()
  {
    System.out.println(getName());
    System.out.println("=========");    
    System.out.println("Base.  : " + getBase());
    System.out.println("Height : " + getHeight());
    System.out.println("Area   : " + getArea() + " square units.");
    System.out.println();
    System.out.println();    
    
  } // end of method draw()
  
} // end of class Triangle

// create a class called Trapezoid which
// inherits from Shape
class Trapezoid extends Shape
{
  // We need a base 2
  private int base2;

  // Write a Trapezoid constructor with 4 parameters
  // name, base1, base2, height
  // Call the Shape constructor using super.
  public Trapezoid(String name, int base1, int base2, int height)
  {
    super(name, base1, height);
    this.base2 = base2;
  }

  public void printName()
  {
    System.out.println("Shape: " + getName());
  }

  public int getBase2()
  {
    return base2;
  }

  public double getArea()
  {
    return 0.5 * (getBase1() + getBase2()) * getHeight();    
  }

  public void draw()
  {
    System.out.println(getName());
    System.out.println("=========");    
    System.out.println("Base 1 : " + getBase1());
    System.out.println("Base 2 : " + getBase2());
    System.out.println("Height : " + getHeight());
    System.out.println("Area   : " + getArea() + " square units.");
    System.out.println();
    System.out.println();    
    
  } // end of method draw()
  
} // end of class Trapezoid

// Parallelogram
// create a class called Parallelogram which
// inherits from Shape
class Parallelogram extends Shape
{
  // Write a Parallelogram constructor with 3 parameters
  // name, base and height
  // Call the Shape constructor using super.
  public Parallelogram(String name, int base, int height)
  {
    super(name, base, height);
  }

  public void printName()
  {
    System.out.println("Shape: " + getName());
  }

  public double getArea()
  {
    return getBase() * getHeight();    
  }

  public void draw()
  {
    System.out.println(getName());
    System.out.println("==============");    
    System.out.println("Base   : " + getBase());
    System.out.println("Height : " + getHeight());
    System.out.println("Area   : " + getArea() + " square units.");
    System.out.println();
    System.out.println();    
    
  } // end of method draw()
  
} // end of class Parallelogram