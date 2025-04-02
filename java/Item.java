// Define a class called Item
class Item
{
    // Instance variables
    private String barcode;
    private String itemName;
    private double price;
    private int inventory;
    private double taxRate;

    // Constructor
    public Item(String barcode, String itemName, double price, int inventory, double taxRate)
    {
        this.barcode = barcode;
        this.itemName = itemName;
        this.price = price;
        this.inventory = inventory;
        this.taxRate = taxRate;
    } 

    // Getter for barcode
    public String getBarcode()
    {
        return barcode;
    } 

    // Getter for itemName
    public String getItemName()
    {
        return itemName;
    }

    // Getter for price
    public double getPrice()
    {
        return price;
    }

    // Getter for inventory
    public int getInventory()
    {
        return inventory;
    }

    // Setter for inventory
    public void setInventory(int inventory)
    {
        this.inventory = inventory;
    }

    // Getter for tax
    public double getTax()
    {
        return price * taxRate;
    }

    // toString method
    public String toString()
    {
        return "\n" + barcode + " " + itemName;
    }
}    // END OF class Item