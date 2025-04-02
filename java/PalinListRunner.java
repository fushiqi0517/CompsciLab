import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalinListRunner
{
    public static void main ( String[] args )
    {
        System.out.println("Palindrome List Checker");
        System.out.println();
        System.out.println("Written by Helen Zhou");
        System.out.println();
        System.out.println();

        PalinList test = new PalinList("one two three two one");
        System.out.println(test.getList() + " " + (test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n");

        test = new PalinList("m o m");
        System.out.println(test.getList() + " " + (test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n");

        test = new PalinList("d a d");
        System.out.println(test.getList() + " " + (test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n");

        test = new PalinList("comp sci is sci comp");
        System.out.println(test.getList() + " " + (test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n");

        test.setList("1 2 3 4 5 one two three four five");
        System.out.println(test.getList() + " "+(test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n");

        test.setList("a b c d e f g x y z g f h");
        System.out.println(test.getList() + " "+(test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n");

        test.setList("racecar is racecar");
        System.out.println(test.getList() + " "+(test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n");
        
        test.setList("1 2 3 a b c c b a 3 2 1");
        System.out.println(test.getList() + " "+(test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n"); 
        
        test.setList("chicken is a chicken");
        System.out.println(test.getList() + " "+(test.isPalin()?"is a palinlist.":"is not a palinlist.")+"\n");             
    }
    
}  // end of class Main (PalinListRunner)


class PalinList
{
    // Instance Variables 
    private String list;
    private Queue<String> queue;
    private Stack<String> stack;

    // default constructor 
    public PalinList()
    {
        setList("I love to code code to love I");
    }

    // init constructor 
    public PalinList(String list)
    {
        setList(list);
    }

    public void setList(String list)
    {
        this.list = list;

        // create a LinkedList that can hold String objects
        queue = new LinkedList<String>();

        // create a Stack that can hold String objects
        stack = new Stack<>();

        // We will put the list of words into a Scanner object
        Scanner scan = new Scanner(list);
    
        // while scan has a next element
        while (scan.hasNext())
        {
          // get the next word from scan
          String word = scan.next();

          // add the word to the queue
          queue.add(word);

          // add the word to the stack (use push)
          stack.push(word);
        } // end of while has next
        
    } // end of method

    public boolean isPalin()
    {
        // while your queue is NOT empty and 
        // your stack is NOT empty
        while (!queue.isEmpty() && !stack.isEmpty())
        {
           // deque your queue
           String s1 = queue.remove();

           // pop your stack
           String s2 = stack.pop();

           // see if s1 and s2 are the same
           if (!s1.equals(s2))
             return false;
        } // end of while 

        // Return true if all elements matched
        return true;
    } // end of method isPalin()

    // gets the palin list with double quotes around it
    public String getList()
    {
      return "\"" + list + "\"";
    }

    // Write a toString() method
    // returns the list of words
    public String toString()
    {
        return list;
    }
} // end of class PalinList
