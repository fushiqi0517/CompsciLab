// Expression Checker

// Name - Helen Zhou


import java.util.Stack;
import java.util.Arrays;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
    public static void main ( String[] args )
    {
        System.out.println("Syntax Checker");
        System.out.println();
        System.out.println("Written by Helen Zhou");
        System.out.println();
        System.out.println();

        SyntaxChecker test = new SyntaxChecker("(abc(*def)");
        System.out.println(test);

        test.setExpression("[{}]");
        System.out.println(test);

        test.setExpression("[{]}");
        System.out.println(test);

        test.setExpression("[");
        System.out.println(test);

        test.setExpression("[{<()>}]");
        System.out.println(test);

        test.setExpression("{<html[value=4]*(12)>{$x}}");
        System.out.println(test);

        test.setExpression("[one]<two>{three}(four)");
        System.out.println(test);

        test.setExpression("car(cdr(a)(b)))");
        System.out.println(test);

        test.setExpression("car(cdr(a)(b))");
        System.out.println(test);
    }
}


// uncomment if you are using a separate file
// import java.util.Stack;
// import java.util.Arrays;
// import static java.lang.System.*;

class SyntaxChecker
{
    // Instance Variables (attributes, properties, fields, ...)
    private String exp;
    private Stack<String> symbols;

    // Constructor to init your instance variables
    // (attributes, properties, fields, ...)
    public SyntaxChecker(String s)
    {
        setExpression(s);
    }
    
    // a setter method 
    public void setExpression(String s)
    {
        // set the expression
        exp = s;
        
        // create the Stack that holds String objects
        symbols = new Stack<>();
    }

    public boolean checkExpression()
    {
        for (int i = 0; i < exp.length(); i++) 
        {
            String current = exp.substring(i, i + 1);
            
            // Push left symbols onto the stack
            if ( current.equals("(") || current.equals("[") || current.equals("{") || current.equals("<") ) 
            {
                symbols.push(current);
            } 
            // Handle right symbols by checking the stack
            else if ( current.equals(")") || current.equals("]") || current.equals("}") || current.equals(">") ) 
            {
                if (symbols.isEmpty()) 
                {
                    return false;
                }
                
                String top = symbols.pop();
                
                if ((current.equals(")") && !top.equals("(")) ||
                    (current.equals("]") && !top.equals("[")) ||
                    (current.equals("}") && !top.equals("{")) ||
                    (current.equals(">") && !top.equals("<"))                   
                    ) 
                {
                    return false;
                }
            }
        }
        
        // Return true if stack is empty (all symbols matched)
        return symbols.isEmpty();
    }

    public String toString()
    {
        if(checkExpression())
            return exp + " is correct.\n\n";
        return exp + " is incorrect.\n\n";
    }
}
