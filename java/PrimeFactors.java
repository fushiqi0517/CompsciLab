public class PrimeFactors
{
    private String factors;
    private int num;
    
    //complete the constructor method
    public PrimeFactors(int a)
    {
    num = a;
    factors = "";
      
    }
    
    //if the string is prime return an empty string
    //if the sting is not prime return "NOT"
    //set the global variable equal to all the factors
    public String isPrime()
    {
      
      for (int i = 1; i <= num; i++)
         if (num % i == 0)
            factors += i + " ";
      
      if (factors.length() == 4) // "4" because for each rotation length increases by 2 (i and " ")
         return "";
      else
         return "NOT";
         
    }     
    
    public String toString( )
    {
      return "The factors are " + factors;
    } 
}    
    
