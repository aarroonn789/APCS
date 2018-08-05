/**
 * Name: Aaron H
 * Date: 7-30-18
 * Description: Tests Products
 */

import java.util.ArrayList;
import java.util.List;

public class ShopKeep
{
    public static void main(String args[])
    {
        //Organize in arraylist
        List<Product> products = new ArrayList<Product>();

        //instance of each product. Multiples of some products
        products.add(new Table("Dining Table", 500, false));
        products.add(new Table("Dining Table", 750, true));
        products.add(new Chair("Dining Chair", 100, false));
        products.add(new Chair("Dining Chair", 100, true));
        products.add(new Chair("Dining Chair", 100, false));
        products.add(new Food("Chicken Noodle Soup", 5));
        products.add(new Food("Chicken Noodle Soup", 5));
        products.add(new Food("Chicken Noodle Soup", 5));
        products.add(new Food("Hamburger", 5));
        products.add(new Food("Hamburger", 5));

        Food burrito1 = new Food("Burrito", 6);
        Food burrito2 = new Food("Burrito", 9);



        System.out.println("   ===  Inventory  ===   ");
        takeInventory(products, "Dining Table");
        takeInventory(products, "Chicken Noodle Soup");
        takeInventory(products, "Hamburger");


        //Test compareTo method
        System.out.println("\n\n   ===  Comparisons  ===   ");
        if(burrito1.compareTo(burrito2) > 0)
        {
            System.out.println("Burrito 1 costs more than burrito 2.");
        }
        else if(burrito1.compareTo(burrito2) == 0)
        {
            System.out.println("Burrito 1 costs as much as burrito 2.");
        }
        else
        {
            System.out.println("Burrito 1 costs less than burrito 2.");
        }
    }

    //Static method to take inventory
    public static void takeInventory(List<Product> products, String name)
    {
        int quantity = 0, totalCost = 0;
        for (Product product : products)
        {
            if(product.getName().equals(name))
            {
                quantity ++;
                totalCost += product.getCost();
            }
        }
        System.out.println(name + ": Quantity = " + quantity + ", Total cost = $" + totalCost);
    }
}
