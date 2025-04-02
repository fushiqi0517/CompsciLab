// Program to find the 
// throwing percentage of a 
// quarterback.  This could also
// be the shooting percentage in basketball.


import java.util.*;


class Main4 {
  public static void main(String[] args) {

    // Create a Scanner object so that
    // you can get input from the user.
    // The variable kb will refer 
    // to the Scanner object.
    // System.in will be the parameter to 
    // pass to the constructor. It is a reference
    // to the code that knows how to read from
    // the keyboard.
    // The variable kb can be called kb,
    // or keyboard, or scan, or input,...
    // Variables should always 
    // start with a
    // lower case letter, 
    // and then you can use
    // more letters or digits or an _

   
    Scanner kb = new Scanner(System.in);

    // print out a title AND a blank5 line (15 points)
    // "Lab 4 - Throwing Percentage"
    // and 1 blank line
    System.out.print("Lab 4 - Throwing Percentage");
    System.out.println();


    //PUT YOUR NAME ON THIS! (5 points)
    //Helen Zhou
    System.out.println("My name is Helen Zhou");
    
    
    System.out.println();
    
    
    // Prompt the user to enter the
    // number of passes completed
    // (caught).
    // NOTE: Use print, NOT println()
    System.out.print("Enter the number of completed passes: ");
    
    // The user should enter the number
    // of passes completed.
    // The nextInt() method will read in
    // what the user typed, and will try
    // to convert the input into an int.
    int passesCompleted = kb.nextInt();
    kb.nextLine(); // flush the buffer

    
    // We prompt the user to 
    // enter the total number of 
    // passes thrown.  (5 points)
    // NOTE: Use print, NOT println()
    System.out.print("Enter the number of passes thrown: ");

    // The user should enter the
    // number of passes thrown.
    // We will convert the input 
    // to an int.  (5 points)
    int passesThrown = kb.nextInt();
    kb.nextLine(); // flush the buffer

    // Here we calculate the percentage
    // of completed passes.  Make sure
    // that your answer has a decimal part.
    double throwingPCT = (double)passesCompleted / passesThrown;

    // Skip a line before printing output
    System.out.println(); 

    // Finally, we print out the result.
    System.out.println("The throwing percentage is " + throwingPCT);

    // Skip a line before ending
    System.out.println();

  }
}


/*
Sample Run.
Throwing Percentage

My name is XXXXXXX XXXXXXX

Enter the number of completed passes: 5 (the user types in 5 and presses return)
Enter the number of passes thrown: 9 (the user types in 9 and presses return)

The throwing percentage is 0.5555555555555556

*/