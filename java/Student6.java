import java.util.Arrays;

// Lab Unit 14 Array References, Lab 6
// StudentRunner.java and Student.java
      
// FINISH ME
// Name: Helen

class Student
{
 // instance variables 
 // Define a String variable called name
 // Make it private!
 private String name;
 
 // Define a variable of the type array of int
 // and call it grades
 // Make it private!
 private int[] grades;
 
 
 // init constructor
 public Student(String name, int[] grades)
 {
    // Init your instance variables from 
    // the incoming parameter data.
    // REMEMBER:
    // use this.name for the instance variable name
    // use this.grades for the instance variable grades
    // (since the parameters have the same name as)
    // (the instance variables (best practices))

    this.name = name;
    this.grades = grades;
   
   
 }
 
 
 public void setGrade(int spot, int grade)
 {
    // make sure that spot is inbounds (spot is the index)
    // spot needs to be between 0 and LT grades.length

    // store grade in the spot position of grades

    if (spot >= 0 && spot < grades.length) 
    {
         grades[spot] = grade;
    }
     
     
 }

 
 public String getName()
 {
    return name;
 }
 
 
 public int getSum()
 {
    // create a sum variable and set it to 0
    int sum = 0;
     
     
    // loop through the grades to find the sum
    for(int item:grades)
    {
      sum += item;
    }
    

     
    // return your sum
    return sum;
 }
 
 
 public int getNumberOfGrades()
 {
    // return the number of grades stored in grades
    return grades.length;
 
 }
 
 
 public double getAverage()
 {
    // call a method to get the sum and divide by 
    // the number of grades in the list
    // Don't lose your fractional part
    return getSum()/(double)getNumberOfGrades();
 }

 
 public double getAverageMinusLow()
 {
    // call a method to get the sum 
    // call a method to get the lowest grade
    // return (sum - lowest grade) / (number of grades - 1)
    // Don't lose your fractional part
    return (getSum()-getLowestGrade())/(double)(getNumberOfGrades()-1);
 }
 
 
 public int getHighestGrade()
 {
    // find the largest number in the grades list 
    // and return it!  Loop through the grades array.
   
    // create a highest variable and set it to Integer.MIN_VALUE or
    // set it to grades[0]
    int highest = grades[0];
 
     
    // loop through the grades to find the highest grade
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] > highest)
         highest = grades[i];
    }

   
   
    // return your highest grade
    return highest;

 }
 
 
 public int getLowestGrade()
 {
    // find the lowest number in the grades list 
    // and return it!
   
    // create a lowest variable and 
    // set it to Integer.MAX_VALUE or
    // set it to grades[0]
    int lowest = grades[0];

        
     
    // loop through the grades to find the lowest 
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] < lowest)
         lowest = grades[i];
    }
   
    
    // return the lowest grade
    return lowest;


 }
 
 
 public String toString()
 {
    // call a method to get the name
    return  name + " - " + Arrays.toString(grades);
 }
 
} // end of class Student