public class BitsInAString 
{
  public static void main(String[] args) 
  {
    System.out.println("Hello Bit Counting");
    System.out.println();
    System.out.println("Written by Helen Zhou");
    System.out.println();
    System.out.println("We will be using 8 bit Strings");
    System.out.println();

    String number = "00010101";
    System.out.println("number =   " + number);
    System.out.println("number has " + countOnBits(number) + " on bits.");
    System.out.println("number is  " + flipBit(number, 4) + " after flipping bit 4");
    number = flipBit(number, 4);
    System.out.println("number is  " + getBase10Value(number) + " in base 10");
  }

  public static int countOnBits(String bits)
  {
    int count = 0;
    for (int i = 0; i < bits.length(); i++)
    {
      if (bits.charAt(i) == '1')
      {
        count++;
      }
    }
    return count;
  }

  public static String flipBit(String bits, int bitPosition)
  {
    char[] bitArray = bits.toCharArray();
    
    if (bitPosition >= 0 && bitPosition < bitArray.length)
    {
      if (bitArray[bitPosition] == '0')
      {
        bitArray[bitPosition] = '1';
      }
      else
      {
        bitArray[bitPosition] = '0';
      }
    }
    return new String(bitArray);
  }

  public static int getBase10Value(String number)
  {
    int value = 0;
    for (int i = 0; i < number.length(); i++)
    {
      value = value * 2 + (number.charAt(i) == '1' ? 1 : 0);
    }
    return value;
  }
}

/*
SAMPLE OUTPUT:
Hello Bit Counting

Written by XXXXX XXXXX

We will be using 8 bit Strings

number =   00010101
number has 3 on bits.
number is  00011101 after flipping bit 4
number is  29 in base 10
*/
