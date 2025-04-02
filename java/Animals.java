import java.util.*; // or import java.util.ArrayList;

public class Animals
{
  public static void main(String [] ray)
  {
    System.out.println("Animals");
    System.out.println();
    // PUT YOUR NAME ON THIS
    System.out.println("Written by Helen Zhou");
    System.out.println();
    System.out.println();

    // Create an ArrayList that can hold Animal objects
    ArrayList<Animal> animals = new ArrayList<Animal>();

    Animal a = new Cow("Mooooo", 5, "Cow", 800, "Black and White");   
    animals.add(a);
    
    a = new Animal("Squeak", 2, "Mousy");   
    animals.add(a);

    a = new Bird("Chirp Chirp", 2, "Birdy", 5, "Red");    
    animals.add(a);

    // Loop through all the animals and print the info.
    // Use an indexed loop.
    System.out.println();
    System.out.println("Printing with a for indexed loop.");
    System.out.println("=================================");
    
    for(int i = 0; i < animals.size(); i++) {
      System.out.println(animals.get(i));
    }
    

    // Loop through all the animals and print the info.
    // Use a for each loop.
    System.out.println();
    System.out.println("Printing with a for each loop.");
    System.out.println("==============================");
    
    for(Animal animal : animals) {
      System.out.println(animal);
    }

    System.out.println();

    
  } // end of method Animals()
  
} // end of class Animals


// Write a class called Animal
class Animal 
{
    // Create 3 private instance variables
    // String noise, int age, String name
    private String noise;
    private int age;
    private String name;
    

    // Write an Animal init constructor with parameters
    // String noise, int age, String name
    public Animal(String noise, int age, String name) {
      this.noise = noise;
      this.age = age;
      this.name = name;
    }
    
    
    // Write 3 getter methods to retrieve the
    // values of noise, age, and name
    public String getNoise() {
      return noise;
    }
    
    public int getAge() {
      return age;
    }
    
    public String getName() {
      return name;
    }
    

    public String toString()
    {
      return "Name = " + getName() + "\n" +
             "Age in years = " + getAge() + "\n" +
             "I make a noise = " + getNoise() + "\n";
    }
}


// Write a class called Bird which inherits from Animal
class Bird extends Animal 
{
    // Define private variables 
    // double height, and String color
    private double height;
    private String color;


    // Write an init constructor for Bird
    public Bird(String noise, int age, String name, double height, String color) {
      super(noise, age, name);
      this.height = height;
      this.color = color;
    }
    
    
    // Write getter methods for height and color
    public double getHeight() {
      return height;
    }
    
    public String getColor() {
      return color;
    }
    
   
    public String toString()
    {
        return super.toString() + "Color = " + getColor() + "\n" +
               "Height in inches = " + getHeight() + "\n";
    }
  
} // end of class Bird


// Write a class called Cow which inherits from Animal
class Cow extends Animal 
{
    // Define private variables 
    // double weight, and String color
    private double weight;
    private String color;
    
    
    // Write an init constructor for Cow
    public Cow(String noise, int age, String name, double weight, String color) {
      super(noise, age, name);
      this.weight = weight;
      this.color = color;
    }


    // Write getter methods for weight and color
    public double getWeight() {
      return weight;
    }
    
    public String getColor() {
      return color;
    }
    
      


    public String toString()
    {
        return super.toString() + 
               "Color = " + getColor() + "\n" +
               "Weight in pounds = " + getWeight() + "\n";
    }
  
} // end of class Cow