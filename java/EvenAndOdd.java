// Name - Helen Zhou

import java.util.*;
import static java.lang.System.*;

public class EvenAndOdd 
{
    public static void main(String[] args)
    {
        System.out.println("Parity Bits - Even Parity and Odd Parity");
        System.out.println();
        System.out.println("Written by Helen Zhou");
        System.out.println();
        System.out.println();

        boolean correct = isCorrect("000001100");
        if (correct)
        {
            System.out.println("000001100 is correct.");
            System.out.println("The number is " + getNumber("000001100"));
        }
        else
        {
            System.out.println("ERROR: 000001100 is NOT correct.");
        }
        System.out.println();

        correct = isCorrect("000001110");
        if (correct)
        {
            System.out.println("000001110 is correct.");
            System.out.println("The number is " + getNumber("000001110"));
        }
        else
        {
            System.out.println("ERROR: 000001110 is NOT correct.");
        }
        System.out.println();
    } // end of main

    
    public static boolean isCorrect(String theByte)
    {
        int countOnes = 0;

        
        for (int i = 0; i < 8; i++)
        {
            if (theByte.charAt(i) == '1')
            {
                countOnes++;
            }
        }

        
        boolean evenParity = (countOnes % 2 == 0);
        boolean parityBit = theByte.charAt(8) == '0';

        
        return evenParity == parityBit;
    } 

    
    public static int getNumber(String theByte)
    {
        int number = 0;

        
        for (int i = 0; i < 9; i++)
        {
            number = number * 2 + (theByte.charAt(i) - '0');
        }

        return number;
    } 
} // End of class