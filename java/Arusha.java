import java.io.*;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Arusha {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("arusha.dat"));
        int T = Integer.parseInt(br.readLine().trim()); 
        
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < T; t++) 
        {
            String[] input = br.readLine().split(" ");
            String S = input[0]; // The string to manipulate
            String I = input[1]; // The instruction sequence

            char direction = I.charAt(0); // 'L' or 'R'
            int rotations = Integer.parseInt(I.substring(1)); // Number of rotations

            rotations %= S.length();

            if (direction == 'L') 
            {
                S = leftRotate(S, rotations);
            } else if (direction == 'R') 
            {
                S = rightRotate(S, rotations);
            }

            result.append(S).append("\n");
        }

        System.out.print(result.toString());
    }

    // Perform left rotation using a queue
    private static String leftRotate(String s, int rotations) 
    {
        Queue<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) 
        {
            queue.add(c);
        }

        for (int i = 0; i < rotations; i++) 
        {
            char first = queue.poll(); // Remove the first character
            queue.add(first);          // Add it to the end
        }

        StringBuilder rotatedString = new StringBuilder();
        for (char c : queue) 
        {
            rotatedString.append(c);
        }

        return rotatedString.toString();
    }

    // Perform right rotation using a stack
    private static String rightRotate(String s, int rotations) 
    {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) 
        {
            stack.push(c);
        }

        for (int i = 0; i < rotations; i++) 
        {
            char last = stack.pop(); 
            stack = reverseStack(stack); 
            stack.push(last); 
            stack = reverseStack(stack);
        }

        StringBuilder rotatedString = new StringBuilder();
        for (char c : stack) 
        {
            rotatedString.append(c);
        }

        return rotatedString.toString();
    }

    private static Stack<Character> reverseStack(Stack<Character> stack) 
    {
        Stack<Character> reversed = new Stack<>();
        while (!stack.isEmpty()) 
        {
            reversed.push(stack.pop());
        }
        return reversed;
    }
}
