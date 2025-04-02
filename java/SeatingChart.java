import java.util.List;
import java.util.ArrayList;

public class SeatingChart 
{
	private Student[][] seats;
	
	public SeatingChart( List<Student> studentList, int rows, int cols) 
	{ 
   seats = new Student[rows][cols];
   int spot = 0;
   
   for(int c = 0; c < cols; c++)
   {
   	for(int r = 0; r < rows; r++)
   	{
   		if(spot < studentList.size())
   		{
   			seats[r][c] = studentList.get(spot);
   			spot++;
   		}
   		else
   			seats[r][c] = null;
   	}
   }
   	
	}  
    	
	public int removeAbsentStudents( int allowedAbsences )
	{
   int count = 0;

   for(int r = 0; r < seats.length; r++)
   {
   	for(int c = 0; c < seats[r].length; c++)
   	{
   		if(seats[r][c] != null)
   		{
   			if(seats[r][c].getAbsenceCount() > allowedAbsences)
   			{
   				seats[r][c] = null;
   				count ++;
   			}
   		}
   	}
   }
   
   return count;

	}   
    	
    
    //not part of the question, but helpful to see the students in the grid
    public String toString()
    {
    	String ret = "";
    	for( Student[] row : seats )
    	{
    		for( Student it : row )
    		{
    			if( it == null )
    				ret += String.format("%-9s","null");
    			else
    				ret += it;
    		}
    		ret += "\n";
    	}
    	return ret;
    }
    
}