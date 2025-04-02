//THIS CLASS IS DONE FOR YOU
public class Student 
{
	private String name;
	private int absenceCount;
	
    public Student( String nm, int ac ) 
    {
    	name = nm;
    	absenceCount = ac;
    }  
    	
    public String getName()
    {
    	return name;
    }
    
    public int getAbsenceCount()
    {
    	return absenceCount;
    }  
    
    public String toString()
    {
    	return String.format("%-9s",(name + " " + absenceCount));
    }
}