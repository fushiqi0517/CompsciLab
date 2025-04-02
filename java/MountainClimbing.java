import java.util.*; // for the ArrayList

public class MountainClimbing {
    // Declare a variable called mountains which can
    // refer to an ArrayList of Mountain objects.
    // Do NOT forget the type of data. Make sure
    // to mark it as private.
    private ArrayList<Mountain> mountains;

    // given constructor
    public MountainClimbing() {
        // Create a new ArrayList which can contain
        // Mountain objects. Do NOT redeclare the
        // data type!
        mountains = new ArrayList<>();
    }

    // given addMountain method
    public void addMountain(Mountain mountain) {
        // Add this mountain to your mountains list.
        mountains.add(mountain);
    }

    // Returns an ArrayList that holds the largest mountain(s).
    public ArrayList<Mountain> getLargestMountain() {
        // create a new ArrayList that can hold Mountain objects
        ArrayList<Mountain> list = new ArrayList<>();

        // define a variable called largestHeight that will hold the largest mountain height so far
        int largestHeight = 0;

        // Loop through all the Mountain objects and see if we can find a mountain bigger than what we may have
        for (Mountain m : mountains) {
            // get the height of mountain m
            int height = m.getHeight();

            // see if height is greater than largestHeight
            if (height > largestHeight) {
                // We have a new largest mountain.
                list.clear();
                list.add(m);

                // update your largestHeight
                largestHeight = height;
            } else if (height == largestHeight) {
                // We have a tie for the largest mountain.
                list.add(m);
            }
        }

        // return this list of mountains (or maybe just 1)
        return list;
    }

    // Returns an ArrayList that holds the smallest mountain(s).
    public ArrayList<Mountain> getSmallestMountain() {
        // create a new ArrayList that can hold Mountain objects
        ArrayList<Mountain> list = new ArrayList<>();

        // find the smallest height in the list
        int smallestHeight = Integer.MAX_VALUE;

        // Loop through all the Mountain objects
        for (Mountain m : mountains) {
            // get the height of mountain m
            int height = m.getHeight();

            // see if height is less than smallestHeight
            if (height < smallestHeight) {
                // We have a new smallest mountain.
                list.clear();
                list.add(m);

                // update your smallestHeight
                smallestHeight = height;
            } else if (height == smallestHeight) {
                // We have a tie for the smallest mountain.
                list.add(m);
            }
        }

        // return this list of mountains (or maybe just 1)
        return list;
    }

    // Returns the average height of all mountains.
    public double getAvgMountainHeight() {
        // define a variable sum to hold the sum of all the mountain heights
        int sum = 0;

        // Loop through all the Mountain objects and add the height to your sum
        for (Mountain m : mountains) {
            sum += m.getHeight();
        }

        // return your sum divided by the number of mountains in your list.
        return (double) sum / mountains.size();
    }

    // toString method to return the mountain details
    public String toString() {
        return mountains.toString();
    }

    // given a main method to test it
    public static void main(String[] args) {
        MountainClimbing mountains = new MountainClimbing();

        System.out.println();
        System.out.println("Mountains");
        System.out.println();

        System.out.println("Written by Helen Zhou");
        System.out.println();

        mountains.addMountain(new Mountain("Mount Everest", 29));
        mountains.addMountain(new Mountain("Denali", 20));
        mountains.addMountain(new Mountain("Mount Logan", 19));
        mountains.addMountain(new Mountain("Mount Lucania", 17));
        mountains.addMountain(new Mountain("Mount Foraker", 17));
        mountains.addMountain(new Mountain("King Peak", 17));

        System.out.println("The height is given in 1000 feet. Example: 29 = 29000 feet");
        System.out.println();

        System.out.println("Largest Mountain(s) = " + mountains.getLargestMountain());
        System.out.println();
        System.out.println();

        System.out.println("Smallest Mountain(s) = " + mountains.getSmallestMountain());
        System.out.println();
        System.out.println();

        System.out.println("Average Mountain height = " + mountains.getAvgMountainHeight());
        System.out.println();
        System.out.println();
    }
}