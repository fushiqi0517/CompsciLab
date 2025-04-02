import java.util.*;

public class SkyView
{
    
    private double [][] view;
    // Part A to be completed on the AP Exam
    // this is changed slightly from the AP Exam version
    // You copy the scanned array backwards row by row
    // For example:  If the values of scanned are 
    //  double [] scanned = {   0.3, 0.7, 0.8,
    //                          0.4, 1.4, 1.1,
    //                          0.2, 0.5, 0.1,
    //                          1.6, 0.6, 0.9 
    //  };
    // then view's rows should be:
    // 0.8  0.7  0.3
    // 1.1  1.4  0.4
    // 0.1  0.5  0.2
    // 0.9  0.6  1.6
    // etc.
    // Your code should work for different sized 2D arrays.
    // DO NOT HARD CODE the number of rows or columns
    // Constructor that fills the 2D array from the 1D array
    public SkyView(int numRows, int numCols, double [] scanned)
    {
        // Initialize the 2D array with the given number of rows and columns
        view = new double[numRows][numCols];
        
        // Fill the 2D array by copying values from the 1D array
        int index = 0; // to track position in the scanned array
        for (int r = 0; r < numRows; r++) {
                // For odd rows, copy values right to left
                for (int c = numCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[index];
                    index++;
                }
           
        }
    }
    
    // Method to calculate the average of a specific range in the 2D array
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0;
        int count = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
                count++;
            }
        }
        return sum / count;
    }
    
    // Overriding the toString method to return the 2D array as a formatted string
    public String toString()
    {
        String result = "";
        
        for (int r = 0; r < view.length; r++) {
            double sumOfRow = 0;
            
            for(int c = 0; c < view[r].length; c++) {   
                // Format the numbers and append to result
                result += String.format("%3.1f ", view[r][c]);
                
                // Add the value to the sum of the row
                sumOfRow += view[r][c];
            }
            
            // Append the sum of the row to the result
            result += String.format("%4.1f ", sumOfRow);
            
            // Add a new line after each row
            result += "\n";
        }
        
        return result;
    }   
    
    // Main method to test the implementation
    public static final void main(String [] args)
    {
        double [] scanned1 = {  0.3, 0.7, 0.8,
                                0.4, 1.4, 1.1,
                                0.2, 0.5, 0.1,
                                1.6, 0.6, 0.9 
                              };
        
        SkyView skyview = new SkyView(4,3,scanned1);
        
        System.out.println("SkyView Lab 18.2");
        System.out.println();

        System.out.println("Written by Helen Zhou");
        System.out.println();
        
        System.out.println(skyview); // calls toString() method
        System.out.println();

        double average = skyview.getAverage(1,2,0,1);
        System.out.println("Average="+average);
        System.out.println();
        System.out.println();
        
        
        double [] scanned2 = {  0.7, 0.3, 0.2,
                                1.1, 1.4, 1.5,
                                0.2, 0.5, 0.6,
                                1.6, 0.7, 0.8 
                              };
        
        skyview = new SkyView(4,3,scanned2);
        
        System.out.println(skyview); // calls toString() method
        System.out.println();
        System.out.println();

        average = skyview.getAverage(1,2,0,1);
        System.out.println("Average="+average);
        System.out.println();
        System.out.println();
    }
}
