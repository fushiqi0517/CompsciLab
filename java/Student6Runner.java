// Lab Unit 14 Array References, Lab 6
import java.util.Arrays;
      
// FINISH ME
// Name: Helen Zhou

public class Student6Runner
{
   
   public static void main( String args[] )
   {
      System.out.println("StudentRunner Version 2024");
      System.out.println(); // prints a blank line
      System.out.println(); // prints a blank line

      // FINISH ME
      //PUT YOUR NAME ON THIS!
      System.out.println("Unit 14 - Lab 6 V2024 Written by Helen Zhou");
      System.out.println(); // prints a blank line
      System.out.println(); // prints a blank line

      // Create an Array to hold references 
      // (pointers/memory addresses) to 4 Student objects.
      Student[] students = new Student[4];
      
      int [] vals1 = {90,85,95,77,88};
      Student stu = new Student("Billy Bob",vals1);
      students[0] = stu;
      
 
      int [] vals2 = {100,100,99};
      stu = new Student("Sally Smith",vals2);
      students[1] = stu;


      int [] vals3 = {100,100,100};
      stu = new Student("Sam Smith",vals3);
      students[2] = stu;


      int [] vals4 = {50,100,100,100};
      stu = new Student("Tim Smith",vals4);
      students[3] = stu;


      // use i for your lcv (loop control variable)
      // i is often times used for the index
      for (int i = 0; i < students.length; i++)
      {
        // print out "Name             = " plus the name 
        System.out.println("Name             = " + students[i].getName());
          
        // print out "Sum              = " plus the sum 
        System.out.println("Sum              = " + students[i].getSum());

        // print out "Number of grades = " plus the
        // number of grades 
        // ???????
        
        // NOTE: printf("some string with %.5f", float value here)
        //       System.out.println("Answer = %.4f\n", 3.14159);
        System.out.println("Number of grades = " + students[i].getNumberOfGrades());
        //       printf("string with percent symbol(s)", var, var, ...)
        //       Example: printf("(%d,%d)",x, y)
        //       %f for a float or a double number
        //       %d for an int number
        //       %s for a String
        //       %c for a character
        //       %b for a boolean
        
        System.out.printf("Average          = %.5f\n" , students[i].getAverage()); 
       
        // print the average - lowest grade
        // rounded to 5 decimal positions
        System.out.printf("Average - Low    = %.5f\n" , students[i].getAverageMinusLow());   
        
        // print out "Lowest grade     = " plus the
        // lowest grade 
        System.out.println("Lowest grade     = " + students[i].getLowestGrade());  

        // print out "Highest grade    = " plus the
        // highest grade 
        System.out.println("Highest grade    = " + students[i].getHighestGrade());


        // print two blank lines
        System.out.println();
        System.out.println();
        
      } // end of for i loop
              
   } // end of method main
     
} // end of class StudentRunner - Unit 14, Lab 6

/*
StudentRunner Version 2024


Unit 14 - Lab 6 version 2024 Written by xxxxx xxxxx


Name             = Billy Bob
Sum              = 435
Number of grades = 5
Average          = 87.00000
Average - Low    = 89.50000
Lowest grade     = 77
Highest grade    = 95


Name             = Sally Smith
Sum              = 299
Number of grades = 3
Average          = 99.66667
Average - Low    = 100.00000
Lowest grade     = 99
Highest grade    = 100


Name             = Sam Smith
Sum              = 300
Number of grades = 3
Average          = 100.00000
Average - Low    = 100.00000
Lowest grade     = 100
Highest grade    = 100


Name             = Tim Smith
Sum              = 350
Number of grades = 4
Average          = 87.50000
Average - Low    = 100.00000
Lowest grade     = 50
Highest grade    = 100

*/