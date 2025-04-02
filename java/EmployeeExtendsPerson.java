import java.util.*;

class EmployeeExtendsPerson 
{
  public static void main(String[] args) 
  {
    System.out.println("Hello Employee extends Person");
    System.out.println();
    
    // FINISH ME
    // PUT YOUR NAME ON THIS!!!!!!!!!!!!!!!!!!!!!!
    System.out.println("Written by Helen Zhou");
    System.out.println();

    // Create an ArrayList of Person objects.
    ArrayList<Person> persons = new ArrayList<>();

    // Create a Person Object
    // by calling the default constructor.
    Person person = new Person();

    // Add this person to the ArrayList of Person objects.
    persons.add(person);

    // Create a Person Object by calling the 
    // init constructor.  
    person = new Person("Devon", 
                        "E", 
                        "Adams", 
                        "Blue", 
                        "Black"
                       );
    
    // Add this person to the end of the
    // ArrayList of Person objects.
    persons.add(person);

    // Create an Employee Object
    // by calling the default constructor.
    Employee employee = new Employee();
    
    // ADD THIS employee to the zero position of the list.
    persons.add(0, employee);

    // Create an Employee object.
    employee = new Employee("Maria", 
                            "E", 
                            "Adams", 
                            "Brown", 
                            "Black",
                            "762345",
                            70455.00
                           );

    // ADD THIS employee to the zero position of the list.
    persons.add(0, employee);

    // Sort these Person objects.
    // Use the Collections class.
    // It has a static sort() method that you can call.
    // You MUST PASS IT THE memory address
    // of your persons ArrayList.
    // REMEMBER with a static method, you can use
    // the name of the class.method.
    // The name of the class is Collections.
    Collections.sort(persons);

    System.out.println();
    System.out.println("******* for indexed loop ******");
    
    // Write a for indexed loop to print out all of the 
    // person Objects in the persons ArrayList.
    for (int i = 0; i < persons.size(); i++) {
      // Call the toString() method of this person.
      // Use the ArrayList get(index) method to get
      // your object.
      System.out.println(persons.get(i).toString());
    }
    
    System.out.println();
    System.out.println("******* for each loop ******");

    // Write a for each loop to print out all of the 
    // person Objects in the persons ArrayList.
    // NOTE: YOU CAN NOT USE THE variable person, since
    //       it is defined earlier.
    //       In a for each loop, the variable that will 
    //       receive 1 Person (or Employee) must be 
    //       defined with a type.
    for (Person p : persons) {
      // Call the toString() method of this person.
      System.out.println(p.toString());
    }
 
  } // end of method main

  
} // end of class Main


// Write the class Person which inherits from Object
// AND implements the Comparable interface.
// Use the generic Person
class Person implements Comparable<Person> 
{
  // Define the following variables all of
  // the type String in this order.  Remember the private!
  // firstName, middleName, lastName, eyeColor, hairColor
  private String firstName, middleName, lastName, eyeColor, hairColor;

  // Write a default constructor.
  public Person()
  {
    // Call the default constructor above.
    // It is not required, but is good practice!
    // Note that the super call MUST COME FIRST!
    super();

    // Now we will initialize your Person variables
    // all to "None" (done for you)
    this.firstName  = "None";
    this.middleName = "None";
    this.lastName   = "None";
    this.eyeColor   = "None";
    this.hairColor  = "None";
    
  } // end of default constructor Person

  
  // Write an init constructor.
  // Include parameters that will assign the correct value
  // to all instance variables above.  Remember, the parameters
  // are temporary variables, created when this constructor is
  // called (invoked, run, executed).
  public Person(String firstName, 
                String middleName, 
                String lastName, 
                String eyeColor, 
                String hairColor)
  {
    this.firstName  = firstName;
    this.middleName = middleName;
    this.lastName   = lastName;
    this.eyeColor   = eyeColor;
    this.hairColor  = hairColor;
  }

  public String getFullName()
  {
    return firstName + " " + middleName + " " + lastName;
  }

  public double getNetPay(double amountToDeduct)
  {
    // This method should be overridden in the next class
    return 0;
  } // end of method getNetPay()


  public int compareTo(Person other)
  {
    // compare by last name first, then first name
    // if the compareTo() method is less than 0,
    // return a negative -1
    // A negative number means that the caller (lastName)
    // comes before other.lastName in the alpha ordering.
    // if the compareTo() method is greater than 0,
    // return a positive 1
    // A positive number means that the caller (lastName)
    // comes after other.lastName in the alpha ordering
    
    if (lastName.compareTo(other.lastName) < 0)
      return -1;
    if (lastName.compareTo(other.lastName) > 0)
      return 1;

    // Now do the same for the first name
    // if the last names are the same.
    if (firstName.compareTo(other.firstName) < 0)
      return -1;
    if (firstName.compareTo(other.firstName) > 0)
      return 1;
    
    return 0;
  }

  // Write a toString() method
  public String toString()
  {
    return "Name:       " + getFullName() + "\n" +  // full name
           "Eye Color:  " + eyeColor + "\n" + 
           "Hair Color: " + hairColor + "\n";
  }
  
}


// Write a class called Employee that inherits from Person
class Employee extends Person
{
  // Declare variables called:
  // empID and grossPay
  // in this order.
  // String, double
  private String empID;
  private double grossPay;

  // Write a default constructor.
  public Employee()
  {
    // Call the default constructor above.
    // It is not required, but is good practice!
    // Note that the super call MUST COME FIRST!
    super();

    // Set the empID to "None"
    // Set the grossPay to 0.00
    this.empID = "None";
    this.grossPay = 0.00;
  }
  
  // Write a constructor.
  // Include all values for the super class and
  // all values for this class.
  // All values should be in the order declared,
  // starting with the super class variables.
  // firstName, middleName, lastName, eyeColor, hairColor
  // Followed by the variables for this class in the order
  // that they were declared.
  // empID, grossPay
  public Employee(String firstName, 
                  String middleName, 
                  String lastName, 
                  String eyeColor, 
                  String hairColor,
                  String empID,
                  double grossPay 
                 )
  {
    // REMEMBER, THE CALL TO super MUST COME FIRST!!!
    // ONCE THE super class initializes the super variables,
    // then this class can initialize empID, grossPay,
    // netPay.
    super(firstName, middleName, lastName, eyeColor, hairColor);
 
    this.empID = empID;
    this.grossPay = grossPay;
  } // end of constructor Employee 


  public double getNetPay()
  {
    return grossPay - grossPay * 0.40;
  } // end of method getNetPay()
  
  
  public String toString()
  {
    return super.toString() + 
           "empID    = " + empID + "\n" +
           "grossPay = " + grossPay + "\n" +
           "netPay   = " + getNetPay() + "\n";     
  } // end of method toString()

  
} // end of class Employee
