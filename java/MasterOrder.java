import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
    // A list to store the cookie orders
    private List<CookieOrder> orders;
    
    // Constructor
    public MasterOrder() {
        // Create a new ArrayList of CookieOrder objects
        orders = new ArrayList<>();
    }
    
    // Method to add a new order
    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }
    
    // Part A: Calculate the total number of boxes
    public int getTotalBoxes() {
        int total = 0;
        for (CookieOrder order : orders) {
            total += order.getNumBoxes(); // Sum up the number of boxes
        }
        return total;
    }
    
    // Part B: Remove all orders of a specific variety and return the total boxes removed
    public int removeVariety(String cookieVar) {
        int boxesRemoved = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getVariety().equals(cookieVar)) {
                boxesRemoved += orders.get(i).getNumBoxes();
                orders.remove(i);
                i--; // Adjust index after removal to avoid skipping elements
            }
        }
        return boxesRemoved;
    }
    
    // toString method to print the list of orders
    public String toString() {
        return orders.toString();
    }
    
    // Main method for testing
    public static void main(String[] args) {
        System.out.println("An ArrayList of CookieOrder objects\n");
        
        // PUT YOUR NAME ON THIS
        System.out.println("My name is Helen Zhou\n");
        
        MasterOrder theOrders = new MasterOrder();
        
        // Adding some orders
        theOrders.addOrder(new CookieOrder("Chocolate Chip", 1));
        theOrders.addOrder(new CookieOrder("Shortbread", 5));
        theOrders.addOrder(new CookieOrder("Macaroon", 2));
        theOrders.addOrder(new CookieOrder("Chocolate Chip", 3));
        
        // Test for part A
        System.out.println("Total Boxes Before = " + theOrders.getTotalBoxes() + "\n");
        
        // Test for part B
        System.out.println("Order List Before = " + theOrders.toString() + "\n\n\n");
        
        System.out.println("**********  Removing Chocolate Chip  **********\n");
        
        System.out.println("Boxes Removed = " + theOrders.removeVariety("Chocolate Chip") + "\n");
        
        System.out.println("Total Boxes After = " + theOrders.getTotalBoxes() + "\n");
        System.out.println("Order List After  = " + theOrders.toString() + "\n\n\n");
    }
}

