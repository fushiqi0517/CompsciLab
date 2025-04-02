public class leaveOut
{
    /* 4 MINUTES
    Given a string a and an int i, 
    return the string minus the character at 
    index i. Assume i will always be in bounds.  


    leaveOut("dog", 1) → dg
    leaveOut("hello", 3) → helo
    leaveOut("elephant", 7) → elephan
    
    */   
    
   public static String leaveOut(String a, int i)
   {
      //write your code in here
      String leaveOut = a.substring(0,i) + a.substring(i+1);
      return leaveOut;
      //Or... return a.substring(0,i) + a.substring(i+1);
   
   }
   
    
   //DO NOT MESS WITH CODE BELOW THIS LINE   
   public static void main (String[] args)
   {
      System.out.println(leaveOut( "dog",1 ) ) ; // dg
      System.out.println(leaveOut( "aplus",2 ) ) ; // apus
      System.out.println(leaveOut( "catgiraffe",3 ) ) ; // catiraffe
      System.out.println(leaveOut("hello", 3)) ;//helo
      System.out.println(leaveOut( "pluscat",4 ) ) ;//plusat
      System.out.println(leaveOut("elephant", 7) ) ;//elephan
      System.out.println(leaveOut( "code",2 ) ) ; //coe
      System.out.println(leaveOut( "wow",1 ) ) ;//ww
      System.out.println(leaveOut( "catsand",0 ) ) ;//atsand    
              
   }
} 