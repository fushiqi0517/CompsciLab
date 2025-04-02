public class PrimeFactorsRunner
{
  
    public static void main ( String[] args )
    {
        PrimeFactors bob = new PrimeFactors(7);
        
        System.out.println("7 is " + bob.isPrime() + " prime.");
        System.out.println(bob);
        System.out.println();
        
        PrimeFactors cool = new PrimeFactors(26);
        
        System.out.println("26 is " + cool.isPrime() + " prime.");
        System.out.println(cool); 
        System.out.println();

         PrimeFactors ap = new PrimeFactors(260);
        
        System.out.println("260 is " + ap.isPrime() + " prime.");
        System.out.println(ap);
        System.out.println();
        
        PrimeFactors cs = new PrimeFactors(2);
        
        System.out.println("2 is " + cs.isPrime() + " prime.");
        System.out.println(cs);
        System.out.println();
  
      
    } 
    
}