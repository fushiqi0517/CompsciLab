import java.util.*;
import java.io.*;

public class EncryptString2D 
{
    public static void printString(String string, String header)
    {       
        System.out.println("*******************************************");
        System.out.println();
        
        // Print out the header
        System.out.println(header);
        
        System.out.println();

        // Print out the String
        System.out.println(string);
        
        System.out.println();
        System.out.println();       
    } 


    public static void main(String[] args) 
    {
        // Write your name
        System.out.println();
        System.out.println("PUT YOUR NAME ON THIS BELOW!!!");
        System.out.println("My name is Helen Zhou");
        System.out.println();
        System.out.println();
    
        // Create a new StringEncryptDecrypt object.
        StringEncryptDecrypt str = new StringEncryptDecrypt();
        
        // Print the TranslationArray
        str.printTranslationArray();
            
        // Create a Scanner object to read from the keyboard
        Scanner scan = new Scanner(System.in);
        
        // Create a variable called finished of type boolean
        boolean finished = false;
        
        while (!finished)
        {
            try
            {
                System.out.println();
                System.out.println();

                System.out.print("Enter a String to be encrypted: ");
            
                // Read in the String from the keyboard
                String string = scan.nextLine();

                // Change the String to all uppercase
                string = string.toUpperCase();

                // See if the string is equal to "QQ" and if so, break out of the loop.
                if (string.equals("QQ"))
                    break;
            
                // Print out the String that you read in
                printString(string, "Original String");

                // Call the setString method of str
                str.setString(string);

                // Call str.getString() and print it out
                String readableString = str.getString();
                printString(readableString, "str.getString()");
            
                // Call the encrypt() method of str
                str.encrypt();

                // Call getString() and print the encrypted string
                String encryptedString = str.getString();
                printString(encryptedString, "Encrypted String");

                // Set str to hold encryptedString, then decrypt and print
                str.setString(encryptedString);
                str.decrypt();
                String decryptedString = str.getString();
                printString(decryptedString, "Decrypted String");
                            
            }   
            catch (Exception e)
            {
                // If an error occurred in the try block, print out e.getMessage()
                System.out.println(e.getMessage());
            }
        } 
        
        System.out.println();
        System.out.println();
    } 
} 



interface StringEncryptDecryptInterface
{
    public abstract void setString(String str);       
    public abstract String getString();
    
    void encrypt();
    void decrypt();
    
    public abstract String toString();
}


class StringEncryptDecrypt implements StringEncryptDecryptInterface
{
    private String str; 
    private char[][] translationArray;  

    // Default constructor
    public StringEncryptDecrypt()
    {
        this(" ");
    }

    // Init constructor
    public StringEncryptDecrypt(String str)
    {
        setString(str);
        buildTranslationArray();
    }

    // Interface methods
    public void setString(String str) {
        this.str = str;
    }

    public String getString() {
        return str;
    }

    public void encrypt() {
        str = encrypt(str);
    }

    public void decrypt() {
        str = decrypt(str);
    }

    public String toString() {
        return "Current String: " + str;
    }

    // Build the translation array
    private void buildTranslationArray()
    {
        translationArray = new char[9][6];
        
        char ch = 'A';  
        char ch2 = 'Z'; 
        
        for (int r = 0; r < 9; r++)
        {
            for (int c = 0; c < 6; c+=2)
            {
                translationArray[r][c] = ch;
                translationArray[r][c+1] = ch2;
                
                ch++;
                ch2--;
            }
        }

        translationArray[8][4] = ' ';
        translationArray[8][5] = (char)(ch+1);
    }

    public void printTranslationArray()
    {
        for (int r = 0; r < 9; r++)
        {
            for (int c = 0; c < 6; c++)
            {
                System.out.print(translationArray[r][c] + " ");
            }
            System.out.println();
        }           
    }
    
    private char getCharacterEncrypted(char ch)
    {
        for (int r = 0; r < 9; r++)
        {
            for (int c = 0; c < 6; c+=2)
            {
                if (translationArray[r][c] == ch)
                {
                    return translationArray[r][c+1];
                }
            }
        }
        return '?';
    }

    private char getCharacterDecrypted(char ch)
    {
        for (int r = 0; r < 9; r++)
        {
            for (int c = 1; c < 6; c+=2)
            {
                if (translationArray[r][c] == ch)
                {
                    return translationArray[r][c-1];
                }
            }
        }
        return '?';
    }

    private String encrypt(String s)
    {
        String output = "";
        for (int i = 0; i < s.length(); i++)
        {
            output += getCharacterEncrypted(s.charAt(i));    
        }
        return output;
    }
        
    private String decrypt(String s)
    {
        String output = "";
        for (int i = 0; i < s.length(); i++)
        {
            output += getCharacterDecrypted(s.charAt(i));  
        }
        return output;
    }
}
