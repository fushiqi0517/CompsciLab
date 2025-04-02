import java.util.ArrayList;

public class SelfDivisors 
{           
    // Check if a number is a self divisor
    public static boolean isSelfDivisor(int number)
    {  
        int original = number;
        
        while (number > 0) {
            int digit = number % 10;
            
            // If digit is 0 or original number is not divisible by digit, return false
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            
            number = number / 10;
        }
        
        return true;
    }
    
    // Return the first 'num' self divisors starting from 'start'
    public static ArrayList<Integer> firstNumSelfDivisors(int start, int num)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        int current = start;
        
        while (count < num) {
            if (isSelfDivisor(current)) {
                result.add(current);
                count++;
            }
            current++;
        }
        
        return result;
    }
    
    // main method for testing only
    public static void main(String[] args) 
    {
        System.out.println("Self Divisors");
        System.out.println();
        System.out.println("My name is Helen Zhou"); // <-- Update with your name
        System.out.println();
        System.out.println();

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("12 is " + isSelfDivisor(12));
        System.out.println();
        System.out.println("start:12 num:3");
        ArrayList<Integer> nums = firstNumSelfDivisors(12, 3);
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("15 is " + isSelfDivisor(15));
        System.out.println();
        System.out.println("start:15 num:3");
        nums = firstNumSelfDivisors(15, 3);
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("15 is " + isSelfDivisor(15));
        System.out.println();
        System.out.println("start:15 num:6");
        nums = firstNumSelfDivisors(15, 6);
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("17 is " + isSelfDivisor(17));
        System.out.println();
        System.out.println("start:17 num:6");
        nums = firstNumSelfDivisors(17, 6);
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println();
        System.out.println();
    }
}
