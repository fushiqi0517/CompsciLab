// This class is given and must be completed
class Mountain {
    // Instance variables for name and height
    private String name;
    private int height;

    // Constructor
    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // toString method for testing results
    public String toString() {
        return name + " " + height;
    }
}