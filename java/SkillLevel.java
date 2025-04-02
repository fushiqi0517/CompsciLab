// This program (SkillLevel is for Extra Credit)
// 120 points
//
//
// THIS IS DUE NO LATER THAN Tuesday, Sept. 10!!!!!!!!!!
// YOU MUST HAVE ALL OTHER LABS FINISHED OR NO CREDIT.
//
//
// FINISH ME
// My name is Helen Zhou

import java.util.*; // for the ArrayList
import java.io.*;   // for the reading of the file

public class SkillLevel 
{
  
  public static void printSkillLevels(int[] array, String comment)
  {
      for (int i = 0; i < 11; i++)
      {
          System.out.print(array[i] + " ");
      }
      
      System.out.println(comment);    
  }
  

  public static void readSkillLevels(Scanner scan, int[] array)
  {
      for (int i = 0; i < 11; i++)
      {
          array[i] = scan.nextInt();
      }
      scan.nextLine();    
  }

  public static int[] calculateDifference(int[] team1, int[] team2) {
      int[] difference = new int[11];
      for (int i = 0; i < 11; i++) {
          difference[i] = team1[i] - team2[i];
      }
      return difference;
  }

  public static int sumDifferences(int[] difference) {
      int sum = 0;
      for (int value : difference) {
          sum += value;
      }
      return sum;
  }
  
  // *****************************************************************  
  // *****************************************************************
  // *****************************************************************
  // method main  It all starts here *********************************
  // *****************************************************************
  // *****************************************************************
  // *****************************************************************
    public static void main(String[] args) 
    {  
       System.out.println();
       System.out.println("Extra credit lab - SkillLevel");
       System.out.println();
       
       // FINISH ME
       // print out your name
       System.out.println("My name is Helen Zhou");
       System.out.println();
       System.out.println();

       // This is a try-catch statement.
       // Your program will not crash, however
       // it may print out an error and then end. 
       try
       {
          // DO ALL OF YOUR CODING IN THIS TRY BLOCK.
        
          // Create a Scanner object
          // The Scanner object will contain the text from
          // the file skilllevel.dat
          Scanner scan = new Scanner(new File("skilllevel.dat"));
      
          int dataSets = scan.nextInt(); // Read in the number of datasets
          
          scan.nextLine(); // Move the file cursor to the next line
          
          for (int set = 1; set <= dataSets; set++)
          {
              // Arrays to store skill levels for each team
              int[] team1Offense = new int[11];
              int[] team1Defense = new int[11];
              int[] team2Offense = new int[11];
              int[] team2Defense = new int[11];
              
              // Read the skill levels for each team
              readSkillLevels(scan, team1Offense);
              readSkillLevels(scan, team1Defense);
              readSkillLevels(scan, team2Offense);
              readSkillLevels(scan, team2Defense);
              
              // Print out offense skill levels for both teams
              printSkillLevels(team1Offense, " Team 1 Offense");
              printSkillLevels(team2Offense, " Team 2 Offense");

              // Calculate the difference for offense and print it
              int[] offenseDifference = calculateDifference(team1Offense, team2Offense);
              printSkillLevels(offenseDifference, " Team 1 - Team 2");
              int offenseSum = sumDifferences(offenseDifference);
              System.out.println("Sum of Differences: " + offenseSum);
             
              
              // Determine the overall winner based on the sum of differences
              int totalSum = offenseSum;
              

              if (totalSum > 0) {
                  System.out.println("Team 1 is the most likely winner.");
              } else if (totalSum < 0) {
                  System.out.println("Team 2 is the most likely winner.");
              } else {
                  System.out.println("There is no clear likely winner.");
              }              
              System.out.println(); // Blank line between datasets
          }
       } // end of try block
       catch (Exception e)
       {
          System.out.println("Error reading in file skilllevel.dat");
       } // end of catch block

       System.out.println();
    } // end of main method
    
} // end of public class SkillLevel
