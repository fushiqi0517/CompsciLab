// define a class called Horse
class Horse
{
  // Use private for each instance variable.
  private String name;
  private int weight;
  private double age;
  private String stallName;

  // Constructor
  public Horse(String name, int weight, double age, String stallName)
  {
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.stallName = stallName;
  }
  
  // Getter for name
  public String getName() {
    return name;
  }

  // Getter for weight
  public int getWeight() {
    return weight;
  }

  // Getter for age
  public double getAge() {
    return age;
  }

  // Getter for stallName
  public String getStallName() {
    return stallName;
  }
  
  // toString method
  public String toString() {
    return getName() + " " + getWeight() + " " + getAge() + " " + getStallName();
  }
} // end of class Hors
