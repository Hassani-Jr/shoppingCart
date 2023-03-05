public class itemToPurchase {
    private String itemName , itemDescription ;
    private double itemPrice;
    private int itemQuantity;

    public itemToPurchase(){
        itemName = "none";
        itemDescription = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }
    public itemToPurchase(String itemName, String itemDescription, double itemPrice, int itemQuantity){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
// Setters and Getters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
// Displays the item ,quantity ,and it's price equalling to subTotal
    public void printItemCost(){
        double subTotal = itemQuantity * itemPrice;
        System.out.print(itemName + " " + itemQuantity + " @ " + itemPrice + " = " + subTotal);
    }
    // Prints the item name and description

    public void printItemDescription(){
        System.out.print(itemName + ": " + itemDescription);
    }
}
