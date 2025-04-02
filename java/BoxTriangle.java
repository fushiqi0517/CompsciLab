public class BoxTriangle
{
       
    public void printBox( String word )
    {
       // print out the box word
       // use a for loop
       for (int i = 0; i < word.length(); i++)
         System.out.println(word);
         
       System.out.println();
            
    } 

       
    public void printTriangle( String word )
    {
       // print out the triangle word
       // use a for loop
       for (int i = 0; i < word.length(); i++)
       
         System.out.println(word.substring(0, i+1));
         
        System.out.println();
         

                         
    }
       
} 