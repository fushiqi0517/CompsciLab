import java.util.*;

public class RomanNumbers
{
    public static void main( String args[] )
    {
        System.out.println("Roman Numbers");
        System.out.println();
        // PUT YOUR NAME ON THIS NOW!
        // NO NAME, NO CREDIT
        System.out.println("Written by Helen Zhou");
        System.out.println();

        // Create a new Roman object.
        // Call the default constructor
        Roman r = new Roman();

        // testing things
        // Key     I   V   X       L       C       D       M
        // Value   1   5   10      50      100     500     1000

        String roman = "IVXLCDM";
        for (int i = 0; i < 7; i++)
        {
            System.out.println(roman.substring(i, i+1) + " is " + r.getRomanDigitValue(roman, i) );
        }

        System.out.println();
        System.out.println("V is:    " + r.getRomanNumberAsInt( "V" ) );
        System.out.println("IV is:   " + r.getRomanNumberAsInt( "IV" ) );
        System.out.println("VI is:   " + r.getRomanNumberAsInt( "VI" ) );
        System.out.println("VIII is: " + r.getRomanNumberAsInt( "VIII" ) );
        System.out.println("XXIV is: " + r.getRomanNumberAsInt( "XXIV" ) );
        System.out.println("XLIX is: " + r.getRomanNumberAsInt( "XLIX" ) );
        System.out.println("CXL is:  " + r.getRomanNumberAsInt( "CXL" ) );
        System.out.println("DXL is:  " + r.getRomanNumberAsInt( "DXL" ) );
        System.out.println("MXL is:  " + r.getRomanNumberAsInt( "MXL" ) );
    } // end of method main
    
} // end of class Main // RomanNumbers


class Roman
{
    // instance variable
    private Map<String, Integer> map;

    // init constructor 
    public Roman()
    {
        // Create a new TreeMap with the Key as a String
        // and the value as an Integer
        map = new TreeMap<String, Integer>();

        /*
            Key     I   V   X       L       C       D       M
            Value   1   5   10      50      100     500     1000
        */
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }

    // Convert a Roman number string to an int
    public int getRomanNumberAsInt( String s )
    {
        int sum = 0;
        int digitValue = 0;
        int nextDigitValue = 0;

        for (int i = 0; i < s.length(); i++)
        {
            digitValue = map.get(s.substring(i, i + 1));

            if (i + 1 >= s.length())
            {
                nextDigitValue = 0;
            }
            else
            {
                nextDigitValue = map.get(s.substring(i + 1, i + 2));
            }

            if (digitValue < nextDigitValue)
            {
                sum -= digitValue;
            }
            else
            {
                sum += digitValue;
            }
        }

        return sum;
    }

    // for testing individual Roman digits
    public int getRomanDigitValue(String romanDigit, int i)
    {
        return map.get(romanDigit.substring(i, i+1));
    }

} // end of class Roman
