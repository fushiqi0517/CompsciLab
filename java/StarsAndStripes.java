public class StarsAndStripes //leave class name the same
{
   private String name; //global variable
   
   public StarsAndStripes(String one) //constructor method
   {
      name = one; //initialize the global variable to value stored in local variable one
      System.out.println("Lab3.1 - StarsAndStripes");
      printTwoBlankLines();
      
    
	   System.out.println("Written by "+ name);
      printTwoBlankLines();
   }


   public void printTwentyStars()
   {
   	  // your code here
        System.out.println("********************");
   	  
   }

   public void printTwentyDashes()
   {
   	 // your code here
       System.out.println("--------------------");
   	  
   }

   public void printTwoBlankLines()
   {
   	  // your code here
        System.out.println("                    \n                    ");

      
   }
   
   public void printASmallBox()
   {		
     	  //your code here
        //the small box should have 4 lines of dashes
        //and 3 lines of stars 
        //See sample output
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        
        
     
      
   }
 
   public void printABigBox()
   { 	
   	  // your code here
        //the big box should callprintASmallBox() to make a big box
        //see sample output
        printASmallBox();
        printASmallBox();
      
      
      
   }   
}