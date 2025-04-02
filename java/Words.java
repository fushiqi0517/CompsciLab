import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

   /*Complete the default constructor method
     Hint: Call the setWords method*/
	public Words()
	{
   words = new ArrayList<Word>();
   setWords("");
   }

   /*Complete the constructor method
     Hint: Call the setWords method*/
	public Words(String wordList)
	{
   words = new ArrayList<Word>();
   setWords(wordList);
	}

   /*setWords should fill the ArrayList with Word objects each of which will contain one word from wordList
    NOTE: Don't forget to initialize the global ArrayList
    HINT: Look at pigLatinConverter to see how you split up a String into individual words
    */
   public void setWords(String wordList)
	{
   int b = 0;
   for (int i=0; i < wordList.length(); i++)
   {
      if (i == wordList.length()-1)
            words.add(new Word(wordList.substring(b,i+1)));
      if(wordList.charAt(i)== ' '){
            words.add(new Word(wordList.substring(b,i)));
            b = i+1;}
   }
	}
   
	/*countWordsWithXChars should return the number of words in the list that contain size characters*/
	public int countWordsWithXChars(int size)
	{
		int count=0;

      for (int i = 0; i < words.size(); i++){
         if (words.get(i).getLength() == size)
            count ++;
      }


		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
   int sum = 0;
   for (int i = words.size()-1; i >=0; i--){
      if (words.get(i).getLength() == size){
         sum += words.get(i).getNumVowels();
         words.remove(i);
      }
   }
   return sum;
	}

   /*countWordsWithXVowels should return the number of words in the list that contain numVowels vowels*/
	public int countWordsWithXVowels(int numVowels)
	{
	int count=0;

   for (int i = 0; i < words.size(); i++){
      if (words.get(i).getNumVowels() == numVowels)
         count ++;
   }
   return count;
	}
	
   /*toString will print out the list*/
	public String toString()
	{
	   return words.toString();
	}
}