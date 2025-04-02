import java.util.*;

public class StackingUpMethods
{
  // Create a Stack to hold the names of the 
  // current methods that are running.
  // Your Stack reference (pointer) should
  // be called stack.
  // The stack should hold String objects.
  Stack<String> stack = new Stack<>();

  public static void main(String[] args) 
  {
    System.out.println("Hello Method Calls!");
    System.out.println();
    System.out.println("Written by Helen Zhou");
    System.out.println();
    
    // Create a pointer (reference to this Main object)
    // Call your reference variable m.
    StackingUpMethods m = new StackingUpMethods();

    m.startMethod("Method 1");
    m.startMethod("Method 2");
    m.startMethod("Method 3");

    m.printStackMethods();
    System.out.println();

    m.printCurrentRunningMethod();
    System.out.println();

    m.startMethod("Method 4");
    m.startMethod("Method 5");

    m.printStackMethods();
    System.out.println();
    
    m.printCurrentRunningMethod();
    System.out.println();

    System.out.println(m.endMethod()); // ends the top method
    System.out.println();
    System.out.println(m.endMethod()); // ends the top method
    System.out.println();
    System.out.println(m.endMethod()); // ends the top method
    System.out.println();

    m.printStackMethods();
    System.out.println();

    m.printCurrentRunningMethod();
    System.out.println();
    
    System.out.println(m.endMethod()); // ends the top method
    System.out.println();
    System.out.println(m.endMethod()); // ends the top method
    System.out.println();
    System.out.println(m.endMethod()); // ends the top method
    System.out.println();

    m.printStackMethods();
    System.out.println();

    m.printCurrentRunningMethod();
    System.out.println();

  } // end of method main


  public void printCurrentRunningMethod()
  {
    // Print out the method that is currently running.
    // Do NOT remove it from the stack!!!
    // It should be the top element
    // If the program has ended (the stack is empty),
    // then print out:
    // "There is no current running method."
    // otherwise (else) print out:
    // "The current running method is ???????"
    if (stack.isEmpty())
    {
      System.out.println("There is no current running method.");
    }
    else
    {
      System.out.println("The current running method is " + stack.peek());
    }

  } // end of printCurrentRunningMethod()

  
  public void startMethod(String nameOfMethod)
  {
    System.out.println("Added method " + nameOfMethod);
    System.out.println();

    // Push nameOfMethod onto the stack.
    stack.push(nameOfMethod);
  } // end of startMethod()
  
 
  public String endMethod()
  {
    // See if the stack is empty, and if so,
    // return the String "The stack is now Empty."
    if (stack.isEmpty())
      return "The stack is now Empty.";

    // pop the stack
    String removedMethod = stack.pop();
    
    return "Removed method " + removedMethod;
  } // end of endMethod()

  
  public void printStackMethods()
  {
    System.out.println("Stack methods");
    System.out.println("=============");

    // Print out the stack of method 
    // calls from the top to the bottom.
    // DO NOT remove the items!!!
    // HINT: The Stack class has a get(index) method
    for (int i = stack.size() - 1; i >= 0; i--) {
      System.out.println(stack.get(i));
    }
    
    // See if the stack is empty.
    // If so, print out "The program has ended."
    if (stack.isEmpty())
    {
      System.out.println("The program has ended.");
    }
    
  } // end of method printStackMethods()

} // end of class Main
