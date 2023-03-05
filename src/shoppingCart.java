import java.util.ArrayList;
/**
 * (Use Javadoc tags to document your code too.
 *
 * Wissam Hassani (6232604)
 *
 *  Title:(shoppingCart)
 *
 * Semester:COP2210 - Fall 2022
 * Professor's Name: Prof. Charters
 *   Description of Program’s Functionality: Creates items using a class and storing
 *   the items within an array list
 *    This program demonstrates the use of loops and array list
 *    The main logic of the program is asking the user a menu of items and adding,removing,
 *    displaying , or modifying items
 *
 */
public class shoppingCart {
    private String customerName, currentDate;
    private ArrayList<itemToPurchase> cartItems;

    public shoppingCart(){
        customerName = "none";
        currentDate = "January 1, 2022,";
        cartItems = new ArrayList<itemToPurchase>();
    }

    public shoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<itemToPurchase>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    // Adds a new item to the end of the arr list
    public void addItem (itemToPurchase anItem){
        cartItems.add(anItem);
    }
    // Removes an item in the arrlist by using a for loop to iterate through the
    // list and finding the itemName then removing the item from the list
    // if item not found and it is the end of the arrlist displays not found
    public void removeItem(String itemName){
        boolean itemFound = false;
            for (int i =0; i < cartItems.size();i++){
                if (itemName.equalsIgnoreCase(cartItems.get(i).getItemName())){
                    cartItems.remove(cartItems.get(i));
                    itemFound = true;
                }
                if(!itemFound && i == cartItems.size() - 1){
                    System.out.println("Item not found in cart. Nothing removed.");
                }
            }
        }
        // Same logic as removeItem except the quantity is changed
    public void modifyItem(itemToPurchase anItem){
        boolean itemFound = false;
        for (int i = 0;i < cartItems.size();i++) {
            if (anItem.getItemName().equalsIgnoreCase(cartItems.get(i).getItemName())) {
                cartItems.get(i).setItemQuantity(anItem.getItemQuantity());
                itemFound = true;
            }
            if(!itemFound && (i == cartItems.size() - 1)){
                System.out.println("Item not found in cart. Nothing removed.");
            }
        }
    }
    // Adds all the quantities in the cart
    public int getNumItemsInCart(){
        int sum = 0;
        for (itemToPurchase cartItem : cartItems) {
            sum += cartItem.getItemQuantity();
        }
        return sum;
    }
    // same logic as numItemsOfCarts except multiplies itemPrice bhy itemQuantity
    public double getCostOfCart(){
        double cost = 0;
        for (itemToPurchase cartItem : cartItems) {
            cost += cartItem.getItemPrice() * cartItem.getItemQuantity();
        }
        return cost;
    }
// Prints all the quantity of items in the cart if the list is empty then displays it empty
    public void printTotal(){
        System.out.println(customerName +"'s Shopping Cart - " + currentDate);
        if (getNumItemsInCart() > 0){
        System.out.println("Number of items: " + getNumItemsInCart());
            for (itemToPurchase cartItem : cartItems) {
                cartItem.printItemCost();
                System.out.println();
            }
            System.out.println("Total: " + getCostOfCart());

        }
        else {
            System.out.println("SHOPPING CART IS EMPTY");
        }
    }

    public void printDescription(){
        System.out.println(customerName +"'s Shopping Cart - " + currentDate);
        System.out.println("Item Descriptions");
        for (itemToPurchase cartItem: cartItems){
            cartItem.printItemDescription();
        }

    }


}
