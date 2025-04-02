// Explanation of the import statement
// java is a folder on your computer
// util is a folder inside of the java folder
// The * means that we have access to all classes
//     inside the util folder.
import java.util.*; // for the ArrayList and Scanner
import java.io.*;   // for File and input routines

public class Basketball // Basketball 
{
    // Declare a variable called players which can refer to an ArrayList of Player objects.    
    private ArrayList<Player> players;
    
    // Define a default constructor
    // Same name as the class and no parameters
    public Basketball()
    {
      // Create a new ArrayList which can contain Player objects.
      players = new ArrayList<>();
    } // end of method
    
    // Add a Player to the players list
    public void addPlayer(Player player)
    {
      players.add(player); // Add this player to your players list
    } // end of method
    
    // Gets the total number of points scored for all players.
    public int getTotalPointsScored()
    {
      int totalPointsScored = 0;

      // Loop through all the Player objects 
      for (Player player : players)
      {
          int pointsScored = player.getPointsScored();
          totalPointsScored += pointsScored;
      }

      return totalPointsScored;
    } 
    
    // Returns a list of Player objects that have the highest number of points scored
    public ArrayList<Player> getPlayersWithMostPointsScored()
    {
      ArrayList<Player> list = new ArrayList<>();
      int mostPointsScored = 0;

      // Loop through all the Player objects (from players)
      for (Player player : players)
      {
          int pointsScored = player.getPointsScored();

          if (pointsScored > mostPointsScored)
          {
            list.clear(); // We have a new leader
            list.add(player);
            mostPointsScored = pointsScored;
          }
          else if (pointsScored == mostPointsScored)
          {
            list.add(player); // Tie for the most points
          }
      }
      return list;
    } 
    
    // Calculates the average number of points scored
    public double getAvgNumberOfPointsScored()
    {
      if (players.isEmpty()) {
        return 0;
      }
      
      double totalPoints = getTotalPointsScored();
      return totalPoints / players.size();
    } 
    
    // Return the list of players as a string
    public String toString()
    {
      return players.toString();
    }
    
    // Main method to test the class
    public static void main(String[] args) throws Exception 
      {
         Basketball basketball = new Basketball(); // Change from Main to Basketball
         
         System.out.println();
         System.out.println("Basketball Players");
         System.out.println();
         System.out.println("Written by Helen Zhou");
         System.out.println();
      
         // Read in from a file the Basketball players and their points scored in a game.
         File file = new File("players.dat");  // The file containing player data
         Scanner scanner = new Scanner(file);
      
         // Skip the first line (the number of players)
         if (scanner.hasNextLine()) {
             scanner.nextLine(); // Skip the first line
         }
      
         // Now process the rest of the file
         while (scanner.hasNextLine()) {
             String name = scanner.nextLine(); // Read player name
             if (scanner.hasNextLine()) {
                 int points = Integer.parseInt(scanner.nextLine()); // Read player points
                 // Add a new Player object to the list
                 basketball.addPlayer(new Player(name, points));
             }
         }
         scanner.close();
      
         System.out.println("The players:");
         System.out.println(basketball.toString());
         System.out.println();
      
         // Test for part a - get the total number of points scored
         System.out.println("The total number of points scored:");
         System.out.println(basketball.getTotalPointsScored());       
         System.out.println();
         
         // Test for part b - get the players with the most points scored
         System.out.println("The player(s) with the most points scored:");
         System.out.println(basketball.getPlayersWithMostPointsScored());       
         System.out.println();
      
         // Test for part c - get the average number of points scored
         System.out.println("The average number of points scored:");
         System.out.println(basketball.getAvgNumberOfPointsScored());       
         System.out.println();
      } 
} 