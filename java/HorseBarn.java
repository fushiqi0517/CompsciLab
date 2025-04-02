import java.util.*;

public class HorseBarn // HorseBarn
{
    // Create a variable to refer to 
    // an ArrayList of Horse objects
    private ArrayList<Horse> horses;
    
    // constructor Main to create our 
    // ArrayList of Horse objects
    // and to put the horses in the barn.
    public HorseBarn() // HorseBarn
    {        
        // create a new ArrayList that can hold Horse objects
        horses = new ArrayList<Horse>();
        
        // name of horse, weight, age, stall number
        horses.add(new Horse("Trigger",1340,15.0,"1"));       
        horses.add(new Horse("No Name",0,0.0,"2"));
        horses.add(new Horse("No Name",0,0.0,"3"));
        horses.add(new Horse("No Name",0,0.0,"4"));
        horses.add(new Horse("No Name",0,0.0,"5"));
        horses.add(new Horse("Silver",1210,13.0,"The Palace"));
        horses.add(new Horse("No Name",0,0.0,"6"));
        horses.add(new Horse("No Name",0,0.0,"7"));
        horses.add(new Horse("Lady",1575,5.0,"The Tramp Room"));
        horses.add(new Horse("Patches",1350,17.0,"8"));
        horses.add(new Horse("Duke",1410,18.0,"9"));      
        horses.add(new Horse("No Name",0,0.0,"Champ's Room"));
        horses.add(new Horse("No Name",0,0.0,"The Suite"));
    }
    
    
    // part A
    // Find the stallName for the given horse name.
    // Return "No horse found." if the horse is NOT
    // in the list.
    public String findHorseStall(String horseName)
    {
        // Loop through the horses to find the stall name
        // that the given horse is in.
        for (Horse horse : horses) {
            if (horse.getName().equals(horseName)) {
                return horse.getStallName();
            }
        }
        return "No horse found.";
    } // end of method findHorseStall


    // part B
    // Find the horse name that is in the given stallNumber.
    // If the horse is not found,
    // Return "There is no horse in stall " + stallName + "."
    public String findHorseName(String stallName)
    {
        // loop through the horses to find the name of the 
        // horse in the given stall
        for (Horse horse : horses) {
            if (horse.getStallName().equals(stallName)) {
                return horse.getName();
            }
        }
        return "There is no horse in stall " + stallName + ".";
    } // end of method findHorseName
    
    
    // part C
    // return the average horse weight
    // ONLY count the horses, NOT the 
    // Blank stalls.
    public double findAverageHorseWeight()
    {
        int totalWeight = 0;
        int count = 0;
        
        for (Horse horse : horses) {
            if (!horse.getName().equals("No Name")) {
                totalWeight += horse.getWeight();
                count++;
            }
        }
        
        return (double) totalWeight / count;
    } // end of method findAverageHorseWeight
    

    // Show all the blank stalls
    public String getAllEmptyStalls()
    {
        String result = "";
        
        for (Horse horse : horses) {
            if (horse.getName().equals("No Name")) {
                result += horse.getStallName() + " ";
            }
        }
        
        return result;
    }   
    

    // Return a list of all the horses names only,
    // NOT the blank stalls
    // Return the names of the horses only!
    public String getAllHorseNames()
    {
        String result = "";
        
        for (Horse horse : horses) {
            if (!horse.getName().equals("No Name")) {
                result += horse.getName() + " ";
            }
        }
        
        return result;
    }   
    

    // Return a list of all the horses only,
    // NOT the blank stalls
    // Return all info about each horse!
    public String toString()
    {
        String result = "";
        
        // Loop through all the horses
        for (Horse horse : horses) {
            if (!horse.getName().equals("No Name")) {
                result += horse.toString() + "\n";
            }
        }
        
        return result;
    }   
    

    public static final void main(String [] args)
    {
      System.out.println("Horse Barn ArrayList");
      System.out.println();
       
      System.out.println("Written by Helen Zhou");
      System.out.println();
    
      HorseBarn barn = new HorseBarn();
        
      System.out.println("The Horse Names");
      System.out.println(barn.getAllHorseNames());
      System.out.println();

      System.out.println("Horse Information");
      System.out.println(barn.toString());
      System.out.println();


      System.out.println("Empty Stalls");
      System.out.println(barn.getAllEmptyStalls());
      System.out.println();

      System.out.println("find Trigger: "+barn.findHorseStall("Trigger"));
      System.out.println("find Silver:  "+barn.findHorseStall("Silver"));
      System.out.println("find Lady:    "+barn.findHorseStall("Lady"));
      System.out.println("find Patches: "+barn.findHorseStall("Patches"));
      System.out.println("find Duke:    "+barn.findHorseStall("Duke"));
      System.out.println("find Bob:     "+barn.findHorseStall("Bob"));
      System.out.println();


      System.out.println("find Horse in stall 1: "+barn.findHorseName("1"));
      System.out.println("find Horse in stall The Palace: "+barn.findHorseName("The Palace"));
      System.out.println("find Horse in stall The Tramp Room: "+barn.findHorseName("The Tramp Room"));
      System.out.println("find Horse in stall 21: "+barn.findHorseName("21"));
      System.out.println();

      System.out.println("The average weight is "+barn.findAverageHorseWeight());
      System.out.println();
    }
} // end of class Main \\ HorseBarn


