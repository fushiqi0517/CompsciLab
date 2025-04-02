import java.util.*;

// Assignment #3

// Your name goes here
// Helen Zhou

public class Main3
{
  // There are no instance variables for this assignment
   
  // Remember that static methods are loaded into
  // RAM memory at the start of a run.  The 1 and
  // only 1 method is in RAM memory from start to
  // stop.
  
  // They are not stored in the object.

  // DO NOT USE THE BUILT IN METHODS
  // USE LOOPS AND/OR IF STATEMENTS

  public static boolean isEven(int x)
  {
   if(x%2 ==0)
      return true;
   return false;
  }
   

  public static boolean isOdd(int x)
  {
   if(x%2 != 0)
      return true;
   return false;
  }
 

  public static int countEvens(int [] list)
  {
   int count = 0;
   
   for(int num:list)
   {
      if(isEven(num))
         count ++;
   }
    return count;
  }


  public static int [] getListOfEvens(int [] list)
  {
    // get the number of even numbers in list
    int evenCount = countEvens(list);

    // create a new array to hold all of the even numbers
    int [] evenList = new int[evenCount];

    // add all of the even numbers to evenList
    int i = 0;
    for (int x : list)
    {
       // if x is even then
       //   evenList[i] receives the value of x
       //   add 1 to i
       if(isEven(x))
       {
          evenList[i]=x;
          i++;
       }

    }

    // return the evenList
    return evenList;
  }


  public static int countOdds(int [] list)
  {
   int count = 0;
   
   for(int num:list)
   {
      if(isOdd(num))
         count ++;
   }
    return count;
  }

  public static int [] getListOfOdds(int [] list)
  {
    // get the number of odd numbers in list
    int oddCount = countOdds(list);

    // create a new array to hold all of the odd numbers
    int [] oddList = new int[oddCount];

    // add all of the odd numbers to oddList
    int i = 0;
    for (int x : list)
    {
  
       if(isOdd(x))
       {
          oddList[i]=x;
          i++;
       }

    }

    // return the oddList
    return oddList;
  }


  public static int countRange(int [] list, int start, int stop)
  {
    // count the number of numbers in the range
    // from start to stop inclusive
    int count = 0;

    for (int x : list)
    {
       // see if x is greater than or equal to start AND
       // x is less than or equal to stop
       //   add 1 to count
       if(x>=start && x<=stop)
         count ++;
    }
    
    // return your count
    return count;
  }

  public static int [] getListOfRangeValues(int [] list, int start, int stop)
  {
    // get the number of numbers in the range 
    int rangeCount = countRange(list, start, stop);

    // create a new array to hold all of the range numbers
    int [] rangeList = new int[rangeCount];


    // add all of the range numbers to rangeList
    int i= 0;
    for(int x:list)
    {
      if(x>=start && x<=stop)
      {
         rangeList[i]=x;
         i++;
      }   
    }

    // return the rangeList
    return rangeList;
  }


  public static void printList(int [] list)
  {
    // Write a for loop to print out each number in the
    // list separated by 2 spaces.  The numbers should
    // all be printed on the same line.
    // DO NOT USE Arrays.toString()
    for(int x:list)
    {
        // print out the value + "  "
        System.out.print(x + "  ");
        
    }


    // Move the cursor down to the next line
    System.out.println();

  }


  public static void main(String [] args)
  {
    // Remember that an Array does NOT have any methods (although it 
    // does inheritant a few).  It does have a length public variable.
    // NOTE: You can NOT change the length of an array at runtime.

    int [] list1 = {70, 80, 85, 74, 56, 100, 92, 87};
       
    int [] list2 = new int[10];
    list2[0] = 73;
    list2[1] = 95;
    list2[2] = 99;
    list2[3] = 83;
    list2[4] = 100;
    list2[5] = 100;
    list2[6] = 99;
    list2[7] = 90;
    list2[8] = 77;
    list2[9] = 57;
      
       
    System.out.println("ArraysReview3");
    System.out.println();
    System.out.println("My name is Helen Zhou");
    System.out.println();
    System.out.println();


    System.out.println("List of All list1 Numbers: ");
    printList(list1);    
    System.out.println();
    System.out.println("List of Evens: ");
    int [] array = getListOfEvens(list1);
    printList(array);  
    System.out.println();
    System.out.println("List of Odds: ");
    array = getListOfOdds(list1);
    printList(array);  
    System.out.println();
    System.out.println("List of Numbers between 90-100 inclusive: ");
    array = getListOfRangeValues(list1,90,100);
    printList(array);  
    System.out.println();
    System.out.println("List of Numbers below 70: ");
    array = getListOfRangeValues(list1,0,69);
    printList(array);  
    System.out.println();
    System.out.println("=====================");
    System.out.println();

    System.out.println("List of All list2 Numbers: ");
    printList(list2);    
    System.out.println();

    System.out.println("List of Evens: ");
    array = getListOfEvens(list2);
    printList(array);  
    System.out.println();
    System.out.println("List of Odds: ");
    array = getListOfOdds(list2);
    printList(array);  
    System.out.println();
    System.out.println("List of Numbers between 90-100 inclusive: ");
    array = getListOfRangeValues(list2,90,100);
    printList(array);  
    System.out.println();
    System.out.println("List of Numbers below 70: ");
    array = getListOfRangeValues(list2,0,69);
    printList(array);  
    System.out.println();

  } // end of method main


} // end of class Main


/*
ArraysReview3

My name is xxxxxx xxxxxx


List of All list1 Numbers: 
70  80  85  74  56  100  92  87

List of Evens: 
70  80  74  56  100  92 

List of Odds: 
85  87 

List of Numbers between 90-100 inclusive: 
100  92

List of Numbers below 70: 
56  

=====================

List of All list2 Numbers: 
73  95  99  83  100  100  99  90  77  57

List of Evens: 
100  100  90

List of Odds: 
73  95  99  83  99  77  57

List of Numbers between 90-100 inclusive: 
95  99  100  100  99  90  

List of Numbers below 70:
57

*/