public class VowelBox
{
   public static void makeBox( String s)
	{
    //your code here
    String vowels = "AEIOUaeiou";
    int vowelCount = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            if (vowels.indexOf(s.charAt(i)) != -1) 
            {
                vowelCount++;
            }
        }

        for (int a = 0; a < vowelCount; a++) 
        {
            System.out.println(s);
        }
        System.out.println();
    }  
 

   public static void main ( String[] args )
	{
   
   //why can we call makeBox without using an object?
   //because both method static
		makeBox("hippo");
      makeBox("abcd");
      makeBox("Mississippi");
      makeBox("x");
      makeBox("chicken");
      
	}

}