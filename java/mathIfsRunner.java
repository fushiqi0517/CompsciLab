//this class is done
public class mathIfsRunner
{
   public static void main(String args[])
   {
      mathIfs test = new mathIfs();
      
    System.out.println( test.doMath( 10, 20) );  
    System.out.println( test.doMath( 20, 10) ); 
    System.out.println( test.doMath( 20, 20) );
    System.out.println( test.doMath( 10, 10) ); 
    System.out.println( test.doMath( 0, 1) ); 
    System.out.println( test.doMath( 2, 0 ) );
   
   }
}