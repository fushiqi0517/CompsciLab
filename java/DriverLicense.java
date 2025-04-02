import java.util.*;
import java.io.*;

public class DriverLicense
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("Lookup Driver License Information");
        System.out.println();
        System.out.println("Written by Helen Zhou");
        System.out.println();

        // Declare a variable called driversLicenseMap of the
        // type HashMap. The key should be a String, the value
        // should be a Person object. DO NOT new it yet.
        HashMap<String, Person> driversLicenseMap;

        // Now create the HashMap
        driversLicenseMap = new HashMap<>();

        // Create a Scanner object
        // You will read in the data from a file
        // called licenseData.txt
        Scanner input = new Scanner(new File("licenseData.txt"));

        // Read in the first line which is the number
        // of persons.
        int numPersons = input.nextInt();

        // Move the file cursor to the next line.
        input.nextLine();

        // Loop through each data set.
        for (int i = 0; i < numPersons; i++)
        {
            // Read in the:
            // firstName, lastName, driversLicense, and points
            String firstName = input.nextLine();
            String lastName = input.nextLine();
            String driversLicense = input.nextLine();
            int numPoints = input.nextInt();
            input.nextLine(); // flush the buffer

            // skip a line in the file
            input.nextLine();

            // Create a Person object
            Person person = new Person(firstName, lastName, numPoints);

            // Put the person object in the map
            // along with the driversLicense as the key.
            driversLicenseMap.put(driversLicense, person);
        }

        // Print out the keys and values to the map (driver licenses)
        System.out.println("Licenses");
        System.out.println(driversLicenseMap);
        System.out.println();
        System.out.println();

        // Create a Scanner object to read from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        while (true)
        {
            // Prompt the user to "Enter the drivers license: "
            System.out.print("Enter the drivers license: ");

            // Read in the driversLicense from the keyboard.
            // Make sure that you trim() the input.
            String driversLicense = keyboard.nextLine().trim();

            // See if the driversLicense is equal to "",
            // and if so, break out of the while loop.
            if (driversLicense.equals(""))
            {
                break;
            }

            // See if the driversLicense is in the map
            if (driversLicenseMap.containsKey(driversLicense))
            {
                // print out the driver's information

                // 1st, get the driver information from
                // the driversLicenseMap.
                Person driver = driversLicenseMap.get(driversLicense);

                // Now print out the information.

                // 1st, get the firstName from the driver object
                System.out.println("First Name: " + driver.getFirstName());

                // 2nd, get the lastName from the driver object
                System.out.println("Last Name:  " + driver.getLastName());

                // 3rd, get the driversLicense
                System.out.println("License #:  " + driversLicense);

                // 4th, get the points from the driver object
                System.out.println("Points:     " + driver.getPoints());

                // See if the driver points is greater than 6
                if (driver.getPoints() > 6)
                {
                    // Let the driver know that the license has
                    // been suspended.
                    System.out.println();
                    System.out.println("Your license is suspended!!!");
                }
                System.out.println();
                System.out.println();
                System.out.print("Press Enter to continue.");
                keyboard.nextLine().trim();
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("The license could NOT be found.");
                System.out.println();
                System.out.print("Press Enter to continue.");
                keyboard.nextLine().trim();
                System.out.println();
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Thank you for using the");
        System.out.println("Driver License lookup program!");
        System.out.println();
    } // end of method main

} // end of class Main // DriverLicense

// Write a class called Person.
// Do NOT make it public.
class Person
{
    // Declare your instance variables.
    // Make them private!
    // firstName (String), lastName (String),
    // and points (int)
    private String firstName;
    private String lastName;
    private int points;

    // Init constructor -
    // receives the firstName, lastName, and points,
    // and stores them in the instance variables
    public Person(String firstName, String lastName, int points)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    // Write a getFirstName() method
    public String getFirstName()
    {
        return firstName;
    }

    // Write a getLastName() method
    public String getLastName()
    {
        return lastName;
    }

    // Write a getPoints() method
    public int getPoints()
    {
        return points;
    }

    // Write a toString() method that returns
    // the firstName, a space, and the lastName
    // CALL THE getFirstName() method and the
    // getLastName() methods in your solution.
    public String toString()
    {
        return getFirstName() + " " + getLastName();
    }

} // end of class Person
