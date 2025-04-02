import java.util.*;

// Define a class called Main
public class ItemCode 
{
    // This method will print most of the Item objects in
    // the ArrayList.     
    public static void printItems(ArrayList<Item> items)
    {
        // print out each item's name, price, and tax to be paid
        // use a for each loop
            
        for (Item item : items)
        {            
            // Print this item's name, price, tax to be paid,
            // and the barcode.
            System.out.println("Item Name  : " + item.getItemName());
            System.out.println("Item Price : " + item.getPrice());
            System.out.println("Item Tax   : " + item.getTax());
            System.out.println("barcode    : " + item.getBarcode());
                
            // See if this item is low on inventory (less than 5)
            if (item.getInventory() < 5)
            {
              // print out the message Low Inventory.  Items left: ?
              System.out.println("Low Inventory. Items left: " + item.getInventory());
              System.out.println("");
            }    
            
            // print a blank line
            System.out.println();
        } // end of for each item loop
    } // end of function or method

    // This method will search for the given
    // barcode and see if it finds an Item
    // object with this barcode.  If so, it
    // returns the Item, else it returns
    // null.
    public static Item searchForItemByBarcode(ArrayList<Item> items, String barcode)
    {
        // Use a for each loop to loop through the items.
        for (Item item : items)
        {
            // We are looking for the item's barcode
            // to see if it is equal to barcode.
            if (item.getBarcode().equals(barcode))
            {
              // We found it!  So, return the item.
              return item;
            }
        } // end of for each Item item loop
        
        // We did not find it :(
        return null; // we did not find the item with this barcode
    } // end of method searchForItemByBarcode        

    public static void main(String[] args) 
    {
        System.out.println("Hello Grocery Store!");
        System.out.println();
        
        System.out.println("Written by Helen Zhou");
        
        System.out.println();

        // Create a new Scanner object.
        Scanner input = new Scanner(System.in);

        // Create a new ArrayList of Item objects
        ArrayList<Item> items = new ArrayList<>();

        // We will now add Item objects to our list of items. 

        // Create a new Item object.    
        Item item = new Item("78645", "Bread", 3.99, 55, 0.0825);
        items.add(item);
        
        // Create a new Item object.    
        item = new Item("79644", "Campbell's Vegetable Soup 8 oz", 2.49, 3, 0.0825);
        items.add(item);
        
        // Create a new Item object.    
        item = new Item("79645", "Amy's Vegetable Soup 8 oz", 2.37, 2, 0.0825);
        items.add(item);

        // Create a new Item object.    
        item = new Item("79688", "Amy's Vegetable Soup 12 oz", 3.49, 12, 0.0825);
        items.add(item);

        System.out.println("Items We Sell");
        System.out.println();
        // Call your printItems method and pass it 
        // the list of items.
        printItems(items);
        System.out.println();

        double totalCost = 0.0;
        double totalTax = 0.0;

        while (true)
        {
            System.out.println();
            
            // prompt the user to "Enter the barcode: "
            System.out.print("Enter the barcode: ");

            // Read in what the user typed!
            String barcode = input.nextLine();

            // See if barcode is empty
            if (barcode.equals(""))
            {
                System.out.println();
                break; // break out of the loop
            }

            System.out.println();

            // Call your searchForItemByBarcode method
            item = searchForItemByBarcode(items, barcode);
        
            // What if we could not find it?
            if (item == null)
            {
                System.out.println("The item " + barcode + " could not be found!");
                System.out.println("Please try again.");
                System.out.println();
                continue; // go to top of loop
            }

            // Update your totalCost.
            totalCost += item.getPrice();
        
            // Update the totalTax that you have to pay
            totalTax += item.getTax();
        
            // Update the inventory by subtracting 1
            item.setInventory(item.getInventory() - 1);
 
            // We will print this item's itemName, price, tax,
            // and the totalCost so far.
            System.out.printf("Item: %-15s\n", item.getItemName());
            System.out.printf("Cost: %5.2f\n", item.getPrice());
            System.out.printf("Tax:  %5.2f\n", item.getTax());
            System.out.printf("Total Cost: %.2f\n", totalCost);
        } // END of while true

        double finalBill = totalCost + totalTax;
        
        System.out.printf("Total cost :  %5.2f\n", totalCost);
        System.out.printf("Total tax  :  %5.2f\n", totalTax);
        System.out.printf("Final Bill :  %5.2f\n", finalBill);

        System.out.println();
        System.out.println("Thank you for shopping at The Best Store!");
        System.out.println();
    } // end of main method
} // end of Main class