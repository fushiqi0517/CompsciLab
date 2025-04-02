import java.util.*;

public class WordsAndCountInMap
{
    public static void main(String args[])
    {
        System.out.println("Word Histogram");
        System.out.println();
      
        System.out.println("Written by Helen Zhou");
        System.out.println();

        // Create a WordHistogram object
        WordHistogram words = new WordHistogram();

        words.addToMap("cat");
        words.addToMap("mouse");
        words.addToMap("dog");
        words.addToMap("cat");
        words.addToMap("elephant");
        words.addToMap("elephant");
        words.addToMap("cat");
        words.addToMap("cat");
        words.addToMap("dog");
        words.addToMap("mouse");

        // Get all the words from words.
        ArrayList<String> wordList = words.getAllWords();

        // print out all the words in the wordList
        System.out.println(wordList.toString());
        System.out.println();

        // call the printHistogram() method and pass it the String "The Words".
        words.printHistogram("The Words");
        
        System.out.println();
        System.out.println("The largest value is: " + words.getLargestValue());
        System.out.println();
        
        System.out.println("Thank you for using the");
        System.out.println("word map program!");
        System.out.println();
    } // end of method main

} // end of class Main


// Create a class called WordHistogram.
class WordHistogram
{
    // Create an instance variable called map of the type TreeMap
    private TreeMap<String, Integer> map;

    // default constructor (to initialize your instance variable)
    public WordHistogram()
    {
        // Create a new TreeMap with the Key as a String and the value as type Integer
        map = new TreeMap<>();
    }

    public void addToMap(String word)
    {
        if (map.containsKey(word)) // does it contain word?
        {
            // add 1 to the count
            int count = map.get(word) + 1;
            // now put the word in the map with the value count
            map.put(word, count);
        }
        else
        {
            // The word is NOT in the map, so put the word in the map with a value of 1.
            map.put(word, 1);
        }
    }

    // Print the Histogram
    public void printHistogram(String title)
    {
        System.out.println(title);
        System.out.println();

        // Loop through all the keys (in alpha order).
        for (String word : map.keySet())
        {
            // get the count (value) of this word
            int count = map.get(word);
            
            String output = String.format("%-10s  ", word);
            
            // Write a for loop to add "X" to your output count times
            for (int i = 0; i < count; i++)
            {
                output += "X";
            }

            // println the output
            System.out.println(output);
        }
    }

    public ArrayList<String> getAllWords()
    {
        // Create an ArrayList to hold all the words (type String)
        ArrayList<String> allWords = new ArrayList<>();
        
        // Add all the words to the ArrayList.
        for (String word : map.keySet())
        {
            allWords.add(word);
        }
        
        // Return the ArrayList of all the words.
        return allWords;
    }

    public int getLargestValue()
    {
        // Find the highest number of times a word appears.
        int largest = Integer.MIN_VALUE;

        // Look through all the words in map to find the largest number
        for (String word : map.keySet())
        {
            if (map.get(word) > largest)
            {
                largest = map.get(word);
            }         
        }

        // return largest
        return largest;
    }

    public int getCountOfWord(String word)
    {
        // See if the map contains this word (the key),
        // and if so, return the count (an int)
        if (map.containsKey(word))
            return map.get(word);

        // otherwise return the value of 0
        return 0;
    }
}
