// Name - Helen Zhou
// YOU MUST USE A Set to solve this problem.

import java.io.*; // input output classes
import java.util.*; // Scanner class and others
import static java.lang.System.*;

public class MathSetRunner
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("MathSet");
        System.out.println();
        System.out.println("Written by Helen Zhou");
        System.out.println();
        
        // Read in the file and put the data in a Scanner object
        // Create a new Scanner object and pass to the constructor
        // a new File object with the data file name.
        Scanner file = new Scanner(new File("mathset.dat"));
        
        // read in the number of data sets as an int
        int numDataSets = file.nextInt();
        
        // move the file cursor to the next line
        file.nextLine();
        
        for (int dataSet = 1; dataSet <= numDataSets; dataSet++)
        {
            // reads in the first data set as a String
            // and moves the file cursor to the next line 
            String one = file.nextLine();
            
            // reads in the second data set as a String
            // and moves the file cursor to the next line 
            String two = file.nextLine();
            
            // we create our MathSet object and pass it the
            // data (String one and String two)
            MathSet mSet = new MathSet(one, two);
            
            // Now we will print out the union, etc.
            System.out.println(mSet); // this is the same as mSet.toString()
            System.out.println("union - " + mSet.union());
            System.out.println("intersection - " + mSet.intersection());
            System.out.println("difference A-B - " + mSet.differenceAMinusB()); 
            System.out.println("difference B-A - " + mSet.differenceBMinusA()); 
            System.out.println("===================");
            System.out.println();

        } // for loop for each data set
    } // end of method main
} // end of class Main

class MathSet
{
    // Instance Variables 
    private TreeSet<Integer> setOne;
    private TreeSet<Integer> setTwo;

    public MathSet(String str1, String str2)
    {
        // Create TreeSet objects that hold Integer objects
        setOne = new TreeSet<>();
        setTwo = new TreeSet<>();

        // Put the data from each String into each TreeSet
        // Call fillSet(some set, some String)
        fillSet(setOne, str1);
        fillSet(setTwo, str2);
    }

    public void fillSet(TreeSet<Integer> set, String str)
    {
        // Scanner to hold the String str and extract numbers one by one
        Scanner input = new Scanner(str);

        while (input.hasNextInt())
        {
            // get the next int and add it to the set
            Integer num = input.nextInt();
            set.add(num);
        }
    } // end of method fillSet()

    public Set<Integer> union()
    {
        // Create a new set for union and add all elements from setOne and setTwo
        TreeSet<Integer> unionSet = new TreeSet<>(setOne);
        for (Integer num : setTwo)
        {
            unionSet.add(num);
        }
        return unionSet;
    }

    public Set<Integer> intersection()
    {
        // Create a set for intersection, adding only elements in both sets
        TreeSet<Integer> intersectionSet = new TreeSet<>();
        for (Integer num : setOne)
        {
            if (setTwo.contains(num))
            {
                intersectionSet.add(num);
            }
        }
        return intersectionSet;
    }

    public Set<Integer> differenceAMinusB()
    {
        // Create a set for difference A - B
        TreeSet<Integer> aminusb = new TreeSet<>();
        for (Integer num : setOne)
        {
            if (!setTwo.contains(num))
            {
                aminusb.add(num);
            }
        }
        return aminusb;
    }

    public Set<Integer> differenceBMinusA()
    {
        // Create a set for difference B - A
        TreeSet<Integer> bminusa = new TreeSet<>();
        for (Integer num : setTwo)
        {
            if (!setOne.contains(num))
            {
                bminusa.add(num);
            }
        }
        return bminusa;
    }

    public String toString()
    {
        return "Set one " + setOne + "\n" + "Set two " + setTwo;
    }
}  // end of class MathSet
