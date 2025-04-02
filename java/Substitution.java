import java.util.*; // for Scanner and ArrayList
import java.io.*;   // for file input

public class Substitution
{
    public static void main(String[] args) throws IOException
    {
        // Print out your name
        System.out.println("Helen Zhou");

        // Create a new Scanner object to read from the file
        Scanner input = new Scanner(new File("numOfPlayer.dat")); // reads in the data file

        // Read in the first line from the file and convert it to an int
        // This number is the number of data sets in the file
        int numberOfDatasets = input.nextInt();
        input.nextLine(); // Move cursor to the next line

        // Loop through all the data sets
        for (int i = 0; i < numberOfDatasets; i++)
        {
            // Read in the starting players
            String[] playersStr = input.nextLine().split(" ");
            int[] players = new int[5];
            for (int j = 0; j < 5; j++) {
                players[j] = Integer.parseInt(playersStr[j]);
            }

            // Read in the substitutions and split them
            String[] substitutions = input.nextLine().split(" ");

            // Process each substitution
            for (String sub : substitutions)
            {
                String[] parts = sub.split("-");
                int outPlayer = Integer.parseInt(parts[0]); // player leaving
                int inPlayer = Integer.parseInt(parts[1]);  // player entering

                // Replace the player who is leaving with the new player
                for (int j = 0; j < 5; j++)
                {
                    if (players[j] == outPlayer)
                    {
                        players[j] = inPlayer;
                        break;
                    }
                }
            }

            // Sort the players array
            Arrays.sort(players);

            // Print the output in the required format
            for (int j = 0; j < 5; j++)
            {
                if (j > 0) System.out.print(" ");
                System.out.print(players[j]);
            }
            System.out.println(); // Move to the next line for the next dataset
        }

        input.close(); // Close the file
    }
}