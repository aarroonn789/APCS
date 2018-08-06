/**
 * Description: Create an implementation class to define an item in your store.
 * Author: Aaron H
 * Date 8-4-18
 */
public class StoreProduct {
    //Establish instance variables for the item's name, product number, price, and quantity currently in the store.
    private String name;
    private int productNumber, quantity;
    private double price;

    //Setup a constructor for an item that will initialize all the instance variables.
    public StoreProduct(String name, int productNumber, int quantity, double price)
    {
        this.name = name;
        this.productNumber = productNumber;
        this.quantity = quantity;
        this.price = price;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString - Format cost to include dollar sign and precision to 2 decimal places.
    public String toString() {
        return String.format("%-28s%-12d%-10d$%-10.2f", name, productNumber, quantity, price);
    }
}
