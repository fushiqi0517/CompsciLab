import java.util.Stack;
import java.util.Scanner;

public class PostFixRunner
{
    public static void main(String[] args)
    {
        System.out.println("Postfix Expressions");
        System.out.println();
        System.out.println("Written by Helen Zhou");
        System.out.println();

        PostFix test = new PostFix("2 7 + 1 2 + +");
        test.solve();
        System.out.println(test);

        test.setExpression("1 2 3 4 + + +");
        test.solve();
        System.out.println(test);

        test.setExpression("9 3 * 8 / 4 +");
        test.solve();
        System.out.println(test);

        test.setExpression("3 3 + 7 * 9 2 / +");
        test.solve();
        System.out.println(test);

        test.setExpression("9 3 / 2 * 7 9 * + 4 -");
        test.solve();
        System.out.println(test);

        test.setExpression("5 5 + 2 * 4 / 9 +");
        test.solve();
        System.out.println(test);

        test.setExpression("5 5 + 2 * 4 / 9");
        test.solve();
        System.out.println(test);

        test.setExpression("5 5 + 2 * 4 / 9 + + +");
        test.solve();
        System.out.println(test);

        test.setExpression("5 5 + 2 * 4 # 9 +");
        test.solve();
        System.out.println(test);
    }
}

class PostFix
{
    private Stack<Double> stack; // Stack to hold numbers
    private String expression; // The postfix expression
    private String error; // Error message if any

    public PostFix()
    {
        setExpression("2 3 +");
    }

    public PostFix(String exp)
    {
        setExpression(exp);
    }

    public void setExpression(String exp)
    {
        stack = new Stack<>(); // Initialize the stack
        error = ""; // Clear error
        expression = exp; // Set the expression
    }

    public void solve()
    {
        Scanner scan = new Scanner(expression); // Parse the expression
        while (scan.hasNext())
        {
            if (scan.hasNextDouble())
            {
                double x = scan.nextDouble(); // Read the number
                stack.push(x); // Push to stack
            }
            else
            {
                if (stack.size() < 2) // Ensure at least 2 numbers to operate on
                {
                    error = "Error in stack size.";
                    return;
                }

                String op = scan.next(); // Get operator
                double rightOperand = stack.pop(); // Pop right operand
                double leftOperand = stack.pop(); // Pop left operand

                // Perform operation
                switch (op)
                {
                    case "+":
                        stack.push(leftOperand + rightOperand);
                        break;
                    case "-":
                        stack.push(leftOperand - rightOperand);
                        break;
                    case "*":
                        stack.push(leftOperand * rightOperand);
                        break;
                    case "/":
                        if (rightOperand == 0) {
                            error = "Error: Division by zero.";
                            return;
                        }
                        stack.push(leftOperand / rightOperand);
                        break;
                    default:
                        error = "Error Invalid Operator.";
                        return;
                }
            }
        }

        if (stack.size() != 1) // Ensure the stack has exactly one element
        {
            error = "Error. The stack size is not 1.";
        }
    }

    public String toString()
    {
        if (stack.size() == 1 && error.equals(""))
            return expression + " = " + stack.peek();
        else
            return expression + " = " + error;
    }
}
