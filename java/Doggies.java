import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog objects of the approriate size
		pups = new Dog[size];
     // pups = newArry;
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
      Dog a = new Dog(age, name);
      if(spot < pups.length)
         pups[spot] = a;
         		
	}

    
	public String getNameOfOldest()
	{
       
		//return the name of the oldest dog
      String name = "";
      for (int i = 1; i < pups.length; i++)
         if (pups[i].getAge() > pups[i-1].getAge())
            name = pups[i].getName();
      return name;
	}
 
   	public String getNameOfYoungest()
	{
      String name = "";
		for (int i = 1; i < pups.length; i++)
         if (pups[i].getAge() < pups[i-1].getAge())
            name = pups[i].getName();
      return name;
	}

   //this method is done for  you
	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}