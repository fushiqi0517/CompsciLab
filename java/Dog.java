//This class is complete
//DO NOT MAKE ANY CHANGES
public class Dog 
{
    private int theAge;
    private String theName;
    
    public Dog(int a, String n) 
    {
    	theAge = a;
    	theName = n;
    } 
    	 
    public String getName()
    {
    	return theName;
    }
    
    public int getAge()
    {
    	return theAge;
    }
    
    public void setName(String n)
    {
    	theName = n;
    }
    
    public void setAge(int n)
    {
    	theAge =n;
    }
    	    	
    public String toString()
    {
    	return "" + theAge + " " + theName;
    }  
}