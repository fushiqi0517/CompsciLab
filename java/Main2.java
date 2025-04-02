import java.util.*;

// Assignment #2

// Your name goes here
// Helen Zhou

public class Main2
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
    if (x % 2 == 0)
      return true;
    return false;
  }
   

  public static boolean isOdd(int x)
  {
   if(x%2 != 0)
      return true;
   return false;
   
  }


  public static boolean isPositive(int x)
  {
    if(x>0)
      return true;
    return false;
  }

  public static boolean isNegative(int x)
  {
    if(x<0)
      return true;
    return false;
  }
   
  public static boolean isZero(int x)
  {
    if(x == 0)
      return true;
    return false;
  }

  // DO NOT COUNT -1 VALUES
  public int countEvens(int [] list)
  {
    int count = 0;
    for(int i = 0; i<list.length; i++)
    {
      if(list[i]%2 == 0)
         count++;
    }

    return count;
  }

  // DO NOT COUNT -1 VALUES
  public int countOdds(int [] list)
  {
    int count = 0;
    for(int i = 0; i<list.length; i++)
    {
      if(list[i]%2 != 0 && list[i]!= -1)
         count++;
    }
    
    return count;
  }

  // NOTE: Do not include -1 values
  public static int getSum(int [] list)
  {
    int sum = 0;

    for(int i = 0; i<list.length; i++)
    {
      if(list[i]==-1)
         ;
      else
        sum += list[i];
    }
    return sum;
  }

  // NOTE: Do not include -1 values at the end
  public static int getLength(int [] list)
  {
    for (int i=list.length-1; i>-1; i--)
    {
      if (list[i] == -1)
          ;
      else
          return i+1;
    }

    return list.length;
  }
 
  
  // This method finds the average of the numbers in list.
  // Precondition: The list has at least 1 element
  // Postcondition: The average of the numbers in the list
  //                is returned as a double.
  // NOTE: When you divide an int by an int, you lose.
  //       You may want to use a type cast. (double) 
  public static double getAverage(int [] list)
  {
   double sum = getSum(list);
  
   return sum/getLength(list);
  } 


  // This method counts the number of numbers in the
  // list that are greater than or equal (GTE) to num.
  public static int countGTE(int [] list, int num)
  {
   int count = 0;
   for (int i=0; i<list.length; i++)
   {
      if(list[i] >= num)
         count++;
   }
    return count;
  }


  // This method counts the number of numbers in the
  // list that are equal to num.
  // USE a for each loop.
  public static int countEqualTo(int [] list, int num)
  {
    int count = 0;

    for (int x : list)
    {
      if(x==num)
         count++;
    }


    return count;
  }

  
  // This method finds the smallest number in list.
  // Precondition: The list has at least 1 element.
  // Postcondition: The smallest number in the list
  //                is returned as an int (GT -1).
  
  // NOTE: DO NOT COUNT THE -1 ELEMENTS.
  
  public static int getSmallest(int [] list)
  {
    int smallest = list[0];

    for(int i = 1; i<list.length; i++)
    {
      if(list[i]<smallest && list[i]!= -1)
         smallest = list[i];
    } 

    return smallest;
  }

  // This method finds the largest number in list.
  // Precondition: The list has at least 1 element.
  // Postcondition: The largest number in the list
  //                is returned as an int.
  public static int getLargest(int [] list)
  {
    int largest = list[0];
    
    for(int i = 1; i<list.length; i++)
    {
      if(list[i]>largest)
         largest = list[i];
    }


    return largest;
  }


  // This method counts the numbers in the
  // list that are in the range from to to inclusive.
  // Precondition: The list has at least 1 element.
  // Postcondition: The count of the numbers in the list
  //                that are in the range from to to (inclusive)
  //                is returned as an int.
  // USE a for each loop
  public static int getRange(int [] list, int from, int to)
  {
    int count = 0;
    
    for (int i=0; i<getLength(list); i++)
    {
      if (list[i] >= from)
        if (list[i] <= to)
          count++;
    }

    return count;

  }


  public static void main(String [] args)
  {
    int [] list1 = {70, 80, 85, 74, 56, 100};
       
    // Remember that an Array does NOT have any methods (although it 
    // does inheritant a few).  It does have a length public variable.
    // NOTE: You can NOT change the length of an array at runtime.
    int [] list2 = new int[100];
    list2[0] = 73;
    list2[1] = 95;
    list2[2] = 99;
    list2[3] = 83;
    list2[4] = 100;
    list2[5] = 100;
    list2[6] = 99;
    
    // DO NOT USE THESE VALUES
    // THESE WILL BE UNUSED SPOTS
    for (int i=7; i<list2.length; i++)
    {
      list2[i] = -1;
    }
       
       
    System.out.println("ArraysReview2");
    System.out.println();
    //PUT YOUR NAME ON THIS ASSIGNMENT!!!
    System.out.println("My name is Helen Zhou");
    System.out.println();
    System.out.println();


    // isEven?  
    System.out.println("Is 5 even? "+ isEven(5));          
    System.out.println("Is 6 even? "+ isEven(6));          
    System.out.println("Is 7 even? "+ isEven(7));          
    System.out.println("Is 8 even? "+ isEven(8));          
    System.out.println(); 

    // isOdd?  
    System.out.println("Is -5 odd? "+ isOdd(-5));          
    System.out.println("Is  6 odd? "+ isOdd(6));          
    System.out.println("Is  7 odd? "+ isOdd(7));          
    System.out.println("Is  8 odd? "+ isOdd(8));          
    System.out.println(); 

    // isPositive?  
    System.out.println("Is -5 positive? "+ isPositive(-5));          
    System.out.println("Is  6 positive? "+ isPositive(6));          
    System.out.println(); 

    // isNegative?  
    System.out.println("Is -5 negative? "+ isNegative(-5));          
    System.out.println("Is  6 negative? "+ isNegative(6));          
    System.out.println(); 

    // isZero
    System.out.println("Is -5 zero? "+ isZero(-5));          
    System.out.println("Is  0 zero? "+ isZero(0));          
    System.out.println(); 

    System.out.println("list1="+Arrays.toString(list1));
    System.out.println("list2="+Arrays.toString(list2));
    System.out.println();

    // getSum
    System.out.println("Sum of list1: "+ getSum(list1));          
    System.out.println("Sum of list2: "+ getSum(list2));          
    System.out.println(); 

    // getAverage
    System.out.println("Average of list1: "+ getAverage(list1));  
    System.out.println("Average of list2: "+ getAverage(list2));  
    System.out.println(); 

    // countGTE
    System.out.println("GTE 90 of list1: "+ countGTE(list1,90));  
    System.out.println("GTE 70 of list2: "+ countGTE(list2,70));  
    System.out.println(); 

    // countEqualTo
    System.out.println("= to 100 in list1: "+ countEqualTo(list1,100)); 
    System.out.println("= to  90 in list2: "+ countEqualTo(list2,90)); 
    System.out.println(); 

    // getSmallest
    System.out.println("smallest in list1: "+ getSmallest(list1)); 
    System.out.println("smallest in list2: "+ getSmallest(list2)); 
    System.out.println(); 

    // getLargest
    System.out.println("largest in list1: "+ getLargest(list1)); 
    System.out.println("largest in list2: "+ getLargest(list2)); 
    System.out.println(); 

    // countRange
    System.out.println("70-100 in list1: "+ getRange(list1,70,100)); 
    System.out.println("70-100 in list2: "+ getRange(list2,70,100)); 
    System.out.println(); 



  } // end of method main


} // end of class Main

/*
ArraysReview2

My name is xxxxxx xxxxxx


Is 5 even? false
Is 6 even? true
Is 7 even? false
Is 8 even? true

Is -5 odd? true
Is  6 odd? false
Is  7 odd? true
Is  8 odd? false

Is -5 positive? false
Is  6 positive? true

Is -5 negative? true
Is  6 negative? false

Is -5 zero? false
Is  0 zero? true

list1=[70, 80, 85, 74, 56, 100]
list2=[73, 95, 99, 83, 100, 100, 99, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]

Sum of list1: 465
Sum of list2: 649

Average of list1: 77.5
Average of list2: 92.71428571428571

GTE 90 of list1: 1
GTE 70 of list2: 7

= to 100 in list1: 1
= to  90 in list2: 0

smallest in list1: 56
smallest in list2: 73

largest in list1: 100
largest in list2: 100

70-100 in list1: 5
70-100 in list2: 7
*/