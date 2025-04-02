import java.util.*;

public class StudentInformation
{
    public static void main( String args[] )
    {
      System.out.println("Student Information");
      System.out.println();
      System.out.println("Written by Helen Zhou");
      System.out.println();

      // Create a StudentInfo object.
      // Call the default constructor
      StudentInfo students = new StudentInfo();

      // Create an ArrayList of Student objects.
      ArrayList<Student> allStudents = students.getAllStudents();
      
      // Print out all the students by calling the
      // toString() method of allStudents.
      System.out.println(allStudents);
      System.out.println();

      // Create a Scanner object and pass it System.in
      // so that we can read from the keyboard.
      Scanner input = new Scanner(System.in);

      while (true)
      {
        // Prompt the user to 
        // Enter the student id (press return to quit): 
        // Use print and NOT println
        System.out.print("Enter the student id (press return to quit): ");

        // Read in the id that the user types in.
        // Make sure that you read in the entire line 
        // (use nextLine())
        // Remember that the Scanner reference is input
        String id = input.nextLine();
          
        System.out.println();

        // if they just pressed the return key with no data,
        // then we will break out of the loop.
        // (see if the id is equal to the "")
        if (id.equals(""))
        {
            break;
        }

        // Get the Student object from the map called students
        Student student = students.get(id);

        // if we do not find the student id in the map,
        // then we will print out a message that we could
        // not find the id
        if (student == null)
        {
            System.out.println("id " + id + " could not be found.");
        }
        else
        {
          System.out.println("Student Information");
            
          // We will println the id = ?????
          System.out.println("id = " + id);

          // We will println the student by calling
          // the toString() method of this student
          System.out.println(student);
        }

        System.out.println();
        System.out.println();
      }

      System.out.println("Thank you for using the");
      System.out.println("Student Information program!");
      System.out.println();
      input.close(); // this closes the Scanner
    } // end of method main

} // end of class Main // Student Info in a Map


// Create a class called StudentInfo.
// Do NOT mark it as public.
class StudentInfo
{
    // FINISH ME
    // Create an instance variable called map of the type
    // HashMap with a String key (5 digit id number) 
    // and Student value type.
    // Make your variable private!
    private HashMap<String, Student> map;

    // init constructor!!!! 
    // (to initialize your instance variable)
    public StudentInfo()
    {
        // Create a new HashMap with the Key as a String
        // and the value as type Student.
        map = new HashMap<String, Student>();

        // put the Student id number and the Student object
        // into the map

        Student student = new Student("34786", "Bill", "Windows", 100);
        map.put("34786", student);

        student = new Student("55782", "Tim", "Fry", 92);
        map.put("55782", student);

        student = new Student("67452", "Mark", "Zuckerburger", 95);
        map.put("67452", student);

    }

    // Write the method getAllStudents().
    // It should return an ArrayList of Student objects
    public ArrayList<Student> getAllStudents()
    {
        // Create a new ArrayList that can 
        // hold Student objects.
        ArrayList<Student> allStudents = new ArrayList<Student>();

        // Use a for each loop to loop through 
        // all the keys (id) in the map.
        // The key is the id number (type String).
        // You will need to call the maps keySet()
        // method to get a set of all the keys (id)
        for (String key : map.keySet())
        {
           // Now get the student object from the map
           Student student = map.get(key);

           // Now add the student object to the ArrayList 
           allStudents.add(student);
        }

        // return your ArrayList
        return allStudents;
    }

    
    public Student get(String id)
    {
       // See if the map contains this student id (the key),
       // and if so, return the Student object
       if (map.containsKey(id))
         return map.get(id);
       // otherwise return the null value
       return null;
    }

} // end of class StudentInfo


class Student
{
    // instance variables (properties, attributes, fields,global variables)
    // Define three instance variables.
    // Mark them all as private.
    private String id;
    private String firstName;
    private String lastName;
    private double gpa;

    // init constructor
    public Student(String id, 
                   String firstName, 
                   String lastName, 
                   double gpa)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String toString()
    {
        return "\nid:   "+ id +"\nName: " + firstName + " " + lastName + "\ngpa = " + gpa + "\n";
    }

} // end of class Student
