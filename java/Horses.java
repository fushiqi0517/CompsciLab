import java.util.*; // Scanner class
import java.io.*; // File object and io routines

public class Horses
{
  
  private Horse[] horses;
  
  
  // Constructor to create the horses array and
  // read in all the horses from a file.
  public Horses()
  {
    // Read in the horses and add them
    // to the list.
    // Create the list first using the file!
    
    try {
            Scanner fileScanner = new Scanner(new File("Horse.dat"));
            int numHorses = fileScanner.nextInt(); // Number of horses in the file
            horses = new Horse[numHorses];

            for (int i = 0; i < numHorses; i++) {
                String name = fileScanner.next();
                double weight = fileScanner.nextDouble();
                int age = fileScanner.nextInt();
                horses[i] = new Horse(name, weight, age);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    
  }
  
  public double getAverageHorseWeight()
  {
    // return the average of all the horse weights
     double totalWeight = 0;
        for (Horse horse : horses) {
            totalWeight += horse.getWeight();
        }
        return totalWeight / horses.length;
    
  }
  

  public double getAverageHorseAge()
  {
    // return the average of all the horse ages
    int totalAge = 0;
        for (Horse horse : horses) {
            totalAge += horse.getAge();
        }
        return (double) totalAge / horses.length;
    
  }


  public String getYoungestHorseName()
  {
    // return the name of the youngest horse
    int minAge = Integer.MAX_VALUE;
        String youngestHorse = "";
        for (Horse horse : horses) {
            if (horse.getAge() < minAge) {
                minAge = horse.getAge();
                youngestHorse = horse.getName();
            }
        }
        return youngestHorse;
    
  }

  public String getOldestHorseName()
  {
    // return the name of the oldest horse
    int maxAge = Integer.MIN_VALUE;
        String oldestHorse = "";
        for (Horse horse : horses) {
            if (horse.getAge() > maxAge) {
                maxAge = horse.getAge();
                oldestHorse = horse.getName();
            }
        }
        return oldestHorse;
    
  }

  
  // NOTE: Always look for what you are returning.
  //       Notice that you are returning an int,
  //       which is the position or location of the horse
  //       You should return the index of where you
  //       found the horse, or -1 if you did not find
  //       the horse.
  public int findHorseIndex(String name)
  {
   for (int i = 0; i < horses.length; i++) {
            if (horses[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1; // if not found
  }
    
    
 
  public String toString()
  {
    String result = "";
    
    // build a String that contains each Horse's
    // name, weight, and age.
    for (Horse horse : horses) {
            result += horse.toString() + "\n";
        }
        
    return result;
  }   
    
    
  public static final void main(String [] args)
  {
    System.out.println("Horses");
    System.out.println();
    
    //PUT YOUR NAME ON THIS
    System.out.println("Written by Helen Zhou");
    System.out.println();
    
    Horses barn = new Horses();
    
    // Prints out each horse's name, weight, age
    System.out.println(barn); // calls toString()
    System.out.println();
    System.out.println();
    
        System.out.println("The average weight is " + barn.getAverageHorseWeight());
        System.out.println();
        System.out.println("The average age is " + barn.getAverageHorseAge());
        System.out.println();
        System.out.println("Lady is in spot " + barn.findHorseIndex("Lady"));
        System.out.println();
        System.out.println("Duke is in spot " + barn.findHorseIndex("Duke"));
        System.out.println();
        System.out.println("The youngest horse is " + barn.getYoungestHorseName());
        System.out.println();
        System.out.println("The oldest horse is " + barn.getOldestHorseName());
        System.out.println();
        System.out.println("Mr. Ed is in spot " + barn.findHorseIndex("Mr. Ed"));
        System.out.println();
    
  }
} // end of class Horses