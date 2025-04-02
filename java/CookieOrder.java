class CookieOrder {
    // Instance variables
    private String variety;  // The variety of the cookies
    private int numBoxes;    // The number of boxes ordered
    
    // Constructor
    public CookieOrder(String variety, int numBoxes) {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }
    
    // Getter for variety
    public String getVariety() {
        return variety;
    }
    
    // Getter for numBoxes
    public int getNumBoxes() {
        return numBoxes;
    }
    
    // toString method for easy printing
    public String toString() {
        return variety + " " + numBoxes;
    }
}