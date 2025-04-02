import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
//Lab 7 - make edits on lab 6     
// Name: Helen Zhou    
public class Student7Runner {
    public static void main(String[] args) {
        System.out.println("StudentRunner Version 2024");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        System.out.println("Unit 14 - Lab 7 V2024 Written by Helen Zhou");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // Create an Array to hold references to 4 Student objects.
        Student7[] students7 = null;
        int [] grades;
        
      
        try {
            // Read the input file
            Scanner scanner = new Scanner(new File("students.txt"));
           
            int numStudents = scanner.nextInt();
            scanner.nextLine();
            
            students7 = new Student7[numStudents];
             
            
            for (int k=0; k<numStudents; k++)
            {
                
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                // First part is the student's name
                String name = parts[0];

                // The rest are the grades, and convert them to integers
                grades = new int[parts.length - 1];
                for (int i = 1; i < parts.length; i++) {
                    grades[i - 1] = Integer.parseInt(parts[i]);
                }

                // Create a new Student7 object and store it in the array
                students7[k] = new Student7(name, grades);
                
                System.out.println(students7[k].getName());
                System.out.println(students7[k].getNumberOfGrades());
                
                
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        // Print student details
        for (int i = 0; i < students7.length; i++) {
            System.out.println("Name             = " + students7[i].getName());
            System.out.println("Sum              = " + students7[i].getSum());
            System.out.println("Number of grades = " + students7[i].getNumberOfGrades());
            System.out.printf("Average          = %.5f\n", students7[i].getAverage());
            System.out.printf("Average - Low    = %.5f\n", students7[i].getAverageMinusLow());
            System.out.println("Lowest grade     = " + students7[i].getLowestGrade());
            System.out.println("Highest grade    = " + students7[i].getHighestGrade());
            System.out.println();
            System.out.println();
        } // end of for i loop
    } // end of method main
} // end of class Student7Runner