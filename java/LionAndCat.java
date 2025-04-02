import java.util.*; // or import java.util.ArrayList;

public class LionAndCat
{
  public static void main(String [] ray)
  {
    System.out.println("The Lion and the Cat");
    System.out.println();
    // PUT YOUR NAME ON THIS
    System.out.println("Written by Helen Zhou");
    System.out.println();
    System.out.println();

    // Create an ArrayList that can hold Animal objects
    ArrayList<Animal> animals = new ArrayList<Animal>();

    // Create an Animal object 
    // Call the constructor with the following arguments
    // "Neigh"   2    "Silver"    "Horse"
    Animal a = new Animal("Neigh", 2, "Silver", "Horse");  
        
    // Add this Animal object to the animals ArrayList
    animals.add(a);


    // Create a Cat Object
    // Call the constructor with the following arguments
    // "Meow"   5   "Misty"   "Cat"   12   "Black"
    a = new Cat("Meow", 5, "Misty", "Cat", 12, "Black");  

    // Add this Cat object to the animals ArrayList
    animals.add(a);

    
    // Create a Lion Object
    // Call the constructor with the following arguments
    // "Roar"   2   "Simba"   "Lion"   48   "Yellow"
    a = new Lion("Roar", 2, "Simba", "Lion", 48, "Yellow");

    // Add this Lion object to the animals ArrayList
    animals.add(a);


    
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("for indexed loop");
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    // Loop through all the animals and print the info.
    // Use an indexed loop.
    for(int i = 0; i < animals.size(); i++) {
      System.out.println(animals.get(i));
      System.out.println("*******************");
    }
    
    
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("for each loop");
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    
    // Loop through all the animals and print the info.
    // Use a for each loop.
    for(Animal animal : animals) {
      System.out.println(animal);
      System.out.println("*******************");
    }
    
    
    System.out.println();

    System.out.println();
    
  } // end of method main()
  
} // end of class LionAndCat


// Write a class called Animal
class Animal 
{
    // Create 4 private instance variables
    // String noise, int age, String name
    // and typeOfAnimal.
    private String noise;
    private int age;
    private String name;
    private String typeOfAnimal;
    

    // Write an Animal default 
    // constructor (NO PARAMETERS)
    public Animal() 
    {
      // init all instance variables to their
      // default values
      // this calls the constructor below to carry out this task.
      this("No noise given.", 0, "No name given.", "No type given.");
    }
  
    // Write an Animal init constructor with parameters
    // String noise, int age, String name, String typeOfAnimal
    public Animal(String noise, int age, String name, String typeOfAnimal) 
    {
      super(); // Optional but recommended.  Calls the Object constructor
      // init all instance variables to their
      // incoming values
      this.noise = noise;
      this.age = age;
      this.name = name;
      this.typeOfAnimal = typeOfAnimal;
    }
    
    
    // Write 4 getter (Accessor) methods to retrieve the
    // values of noise, age, name, typeOfAnimal
    // The names should be:
    // getNoise(), getAge(), getName() and getTypeOfAnimal()
    public String getNoise() {
      return noise;
    }
    
    public int getAge() {
      return age;
    }
    
    public String getName() {
      return name;
    }
    
    public String getTypeOfAnimal() {
      return typeOfAnimal;
    }


    public String talk()
    {
      return ("I am a " + getTypeOfAnimal() + "." + " I can " + getNoise() + ".");   
    }


    // Write a toString() method header
    public String toString() 
    {
      return "Name = " + getName() + "\n" +
             "Age in years = " + getAge() + "\n" +
             talk() + "\n";
    }
  
} // end of class Animal



// FINISH ME
// Write a class called Cat which inherits from Animal
class Cat extends Animal 
{
    // Define private variables 
    // double height, and String color
    private double height;
    private String color;
    
 
    // Write an init constructor for Cat
    // You should receive the noise, age, name,
    //     typeOfAnimal, height, and color
    public Cat(String noise, int age, String name, String typeOfAnimal, double height, String color) 
    {
      // Call the super init constructor and pass it
      // the

      //required parameters in the right
      // order!
      super(noise, age, name, typeOfAnimal);
      // init all instance variables to their
      // incoming values
      this.height = height;
      this.color = color;
    } // end of Cat init constructor
     
    
    
    // Write getter methods for height and color
    public double getHeight() {
      return height;
    }
    
    public String getColor() {
      return color;
    }
    

    // Write a method called run()
    // returns "I do NOT run very fast!"
    public String run() {
      return "I do NOT run very fast!";
    }
    
    
  
    public String talk()
    {
      return ("I am a " + getTypeOfAnimal() + "." + " I can " + getNoise() + ". " + run());   
    }
      
      
    // Write a toString() method header
    public String toString() 
    {
      // Call your toString() method of your parent class
      // Then get your color and height (call methods)
      return super.toString() + "Color = " + getColor() + "\n" +
               "Height in inches = " + getHeight() + "\n";
    }
  
} // end of class Cat



// Write a class called Lion which inherits from Cat
class Lion extends Cat 
{
    // FINISH ME
    // Write an init constructor for Lion
    // You should receive the noise, age, name,
    //     typeOfAnimal, height, and color
    // Call your super constructor
    public Lion(String noise, int age, String name, String typeOfAnimal, double height, String color) 
    {
      // Call the super constructor and pass it
      // the required parameters in the right
      // order!
      super(noise, age, name, typeOfAnimal, height, color);
    }


    // Write a method called run() that returns
    // "I run very fast!  I am a beast"
    public String run() {
      return "I run very fast!  I am a beast";
    }


    // Write a toString() method header
    public String toString() 
    {
      // call your toString() method from above to get the
      // instance variables (attributes, properties, fields, ...)
      return super.toString() + 
             "I am a big bad " + getTypeOfAnimal() + "!!!\n"; 
    }

} // end of class Lion