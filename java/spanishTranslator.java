// English to Spanish Translator
import java.util.*;

class spanishTranslator {
  public static void main(String[] args) {
    System.out.println("English to Spanish Translator");
    System.out.println();

    // Please PUT YOUR NAME ON THIS ASSIGNMENT
    System.out.println("Written by Helen Zhou");
    System.out.println();
    System.out.println();

    // Create a Scanner object and pass it
    // System.in to read from the keyboard.
    Scanner input = new Scanner(System.in);

    // Create an EnglishToSpanish object.
    // Call the default constructor.
    EnglishToSpanish translator = new EnglishToSpanish();

    // Call the translator's printEnglishWords()
    // method to print the words.
    translator.printEnglishWords();

    while (true) {
      // Prompt the user to 
      // "Enter the English word: "
      System.out.print("Enter the English word: ");

      // Read in the English word from the keyboard.
      String englishWord = input.nextLine();

      // Call the trim() method of the String class
      // which will cut off any white space from
      // the ends.
      englishWord = englishWord.trim();

      // See if the englishWord is empty,
      // and if so, break out of the loop.
      if (englishWord.isEmpty()) {
        break;
      }

      // Find the Spanish word.
      // Ask the translator to run the method
      // getSpanishWordFor()
      // and send to the method the englishWord.
      String spanishWord = translator.getSpanishWordFor(englishWord);

      System.out.println();

      // print out:
      // "The Spanish word is " and
      // then the Spanish word
      System.out.println("The Spanish word is " + spanishWord);

      System.out.println();
      System.out.println();
    }

    System.out.println();
    System.out.println("Thanks for using the English to Spanish Translator.");
    System.out.println();

    System.out.println(translator.map.toString());

    System.out.println();
  }
}

class EnglishToSpanish // OR CHOOSE ANOTHER LANGUAGE
{
  // Define a TreeMap variable called map that
  // will be able to refer to a TreeMap that can
  // contain:
  // English words (keys) and the corresponding
  // Spanish words (values).  Note that the
  // keys are of type String and the
  // value is of type String.
  public TreeMap<String, String> map;

  // Write the default constructor
  public EnglishToSpanish() {
    // Create a TreeMap that maps a String
    // to another String.
    map = new TreeMap<>();

    // ADD MORE WORDS
    // (at least 10 words)
    map.put("car", "coche");
    map.put("hat", "sombrero");
    map.put("apple", "manzana");
    map.put("house", "casa");
    map.put("tree", "árbol");
    map.put("water", "agua");
    map.put("sun", "sol");
    map.put("moon", "luna");
    map.put("star", "estrella");
    map.put("book", "libro");
  } // end of constructor EnglishToSpanish()

  public String getSpanishWordFor(String englishWord) {
    // Check and see if your map contains the
    // value of the key englishWord.
    // If so, ask the map to get you the value
    // of the englishWord and then return it.
    // otherwise return "not found"
    if (map.containsKey(englishWord)) {
      // Get the value of the key englishWord
      // and return it.
      return map.get(englishWord);
    } else {
      // return the message "not found"
      return "not found";
    }
  } // end of method getSpanishWordFor()

  public void printEnglishWords() {
    System.out.println("English Words");

    // Loop through all the keys (English words) and
    // print out each one.
    for (String key : map.keySet()) {
      System.out.println(key);
    }
    System.out.println();
  } // end of method printEnglishWords()

  public String toString() {
    // Ask the map to return a String 
    return map.toString();
  } // end of method toString()
} // end of class EnglishToSpanish
