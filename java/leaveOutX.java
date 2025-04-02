public class leaveOutX
{
    /* 4 MINUTES
    Given a string s and an char c, 
    return the string minus the first occurance of c. 
    Assume c will always be in the string.  


    leaveOut("dog", 'o') → dg
    leaveOut("hello", 'l') → helo
    leaveOut("elephant", 'e') → lephant
    
    
    */   
    
   public static String leaveOut(String s, char c)
   {
      //write your code in here
      
    return s.substring(0,s.indexOf(c)) + s.substring(s.indexOf(c)+1);
   }
   
    
   //DO NOT MESS WITH CODE BELOW THIS LINE   
   public static void main (String[] args)
   {
      System.out.println(leaveOut( "dog",'o' ) ) ; // dg
      System.out.println(leaveOut( "aplus",'l' ) ) ; // apus
      System.out.println(leaveOut( "catgiraffe",'g' ) ) ; // catiraffe
      System.out.println(leaveOut("hello", 'l')) ;//helo
      System.out.println(leaveOut( "pluscat",'c' ) ) ;//plusat
      System.out.println(leaveOut("elephant", 'e') ) ;//lephant
      System.out.println(leaveOut( "code",'e' ) ) ; //cod
      System.out.println(leaveOut( "house",'s' ) ) ;//houe
      System.out.println(leaveOut( "catsand",'a' ) ) ;//ctsand    
              
   }
} 