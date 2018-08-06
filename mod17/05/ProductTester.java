/**
 * Description: Tests and sorts StoreProduct objects
 * Author: Aaron H
 * Date 8-4-18
 */
public class ProductTester {

    //Declare an array of at least 10 StoreProducts.
    private static StoreProduct[] storeProducts = {
            new StoreProduct("Crucial 1TB M.2 SSD", 1, 17, 199.99),
            new StoreProduct("WD 256GB M.2 SSD", 3, 24, 109.99),
            new StoreProduct("Seagate 3TB HDD", 7, 14, 74.99),
            new StoreProduct("Intel i7-7700K", 8, 22, 329.99),
            new StoreProduct("Intel i5-7600K", 2, 14, 250.99),
            new StoreProduct("Intel i9-7900X", 6, 7, 999.00),
            new StoreProduct("Gigabyte GTX 1080Ti", 4, 18, 699.99),
            new StoreProduct("Corsair Crystal 570X Case", 5, 12, 179.98),
            new StoreProduct("Corsair Carbide 200R Case", 9, 22, 69.99),
            new StoreProduct("Gigabyte GTX 1070Ti", 10, 24, 479.99)
    };

    //Main method
    public static void main(String[] args)
    {
        displayInventory(storeProducts);


        System.out.println("\n\nSorted by Product Number in Ascending order.");
        displayInventory(sortByProductNumber(storeProducts, 1));

        System.out.println("\n\nSorted by Product Number in Descending order.");
        displayInventory(sortByProductNumber(storeProducts, 2));

        System.out.println("\n\nSorted by Quantity in Ascending order.");
        displayInventory(sortByQuantity(storeProducts, 1));

        System.out.println("\n\nSorted by Quantity in Descending order.");
        displayInventory(sortByQuantity(storeProducts, 2));

        System.out.println("\n\nSorted by Name in Ascending order.");
        displayInventory(sortByName(storeProducts, 1));

        System.out.println("\n\nSorted by Name in Descending order.");
        displayInventory(sortByName(storeProducts, 2));

        System.out.println("\n\nSorted by Price in Ascending order.");
        displayInventory(sortByPrice(storeProducts));
    }

    //Static method that traverses through the array and prints each element in a table format.
    private static void displayInventory(StoreProduct[] storeProducts)
    {
        System.out.println(" == Inventory == ");
        System.out.printf("%-28s%-12s%-10s%-10s%n", "Name", "Product #", "Qty", "Price");

        for(StoreProduct storeProduct : storeProducts)
        {
            System.out.println(storeProduct.toString());
        }
        System.out.println();
    }

    //Sorts array by product number using Insertion (Ascending and Descending)
    private static StoreProduct[] sortByProductNumber(StoreProduct[] storeProducts, int order)
    {
        StoreProduct[] output = new StoreProduct[storeProducts.length];

        for(int i = 0; i < storeProducts.length; i++)
        {
            StoreProduct nextStoreProduct = storeProducts[i];
            int insertIndex = 0;
            int j = i;
            while(j > 0 && insertIndex == 0)
            {
                if(nextStoreProduct.getProductNumber() > output[j-1].getProductNumber() && order == 1)
                {
                    insertIndex = j;
                }
                if(nextStoreProduct.getProductNumber() < output[j-1].getProductNumber() && order == 2)
                {
                    insertIndex = j;
                }
                else
                {
                    output[j] = output[j-1];
                }
                j--;
            }
            output[insertIndex] = nextStoreProduct;
        }
        return output;
    }

    //Sorts array by quantity using Insertion (Ascending and Descending)
    private static StoreProduct[] sortByQuantity(StoreProduct[] storeProducts, int order)
    {
        StoreProduct[] output = new StoreProduct[storeProducts.length];
        for(int i = 0; i < storeProducts.length; i++)
        {
            StoreProduct nextStoreProduct = storeProducts[i];
            int insertIndex = 0;
            int j = i;
            while(j > 0 && insertIndex == 0)
            {
                if(nextStoreProduct.getQuantity() > output[j-1].getQuantity() && order == 1)
                {
                    insertIndex = j;
                }
                else if(nextStoreProduct.getQuantity() < output[j-1].getQuantity() && order == 2)
                {
                    insertIndex = j;
                }
                else
                {
                    output[j] = output[j-1];
                }
                j--;
            }
            output[insertIndex] = nextStoreProduct;
        }
        return output;
    }

    //Sorts array by product name using Selection (Ascending and Descending)
    private static StoreProduct[] sortByName(StoreProduct[] source, int order)
    {
        StoreProduct[] dest = source.clone();

        int posMax;

        StoreProduct temp;
        for(int i = dest.length -1; i >= 0; i--)
        {
            posMax = 0;
            for(int k = 0; k <= i; k++)
            {
                if(dest[k].getName().compareTo(dest[posMax].getName()) > 0 && order == 1)
                {
                    posMax = k;
                }
                else if(dest[k].getName().compareTo(dest[posMax].getName()) < 0 && order == 2)
                {
                    posMax = k;
                }
            }
            temp = dest[i];
            dest[i] = dest[posMax];
            dest[posMax] = temp;
        }
        return dest;
    }

    //Sorts array by product price using Merge (Ascending)
    private static StoreProduct[] sortByPrice(StoreProduct[] source)
    {
        StoreProduct[] output = source;
        mergeSortByPrice(output, 0, output.length - 1);
        return output;
    }

    public static void mergeSortByPrice(StoreProduct[] storeProducts, int low, int high)
    {
        if(low == high)
        {
            return;
        }

        int mid = (low + high) / 2;

        mergeSortByPrice(storeProducts, low, mid);
        mergeSortByPrice(storeProducts, mid + 1, high);
        mergeByPrice(storeProducts, low, mid, high);
    }

    public static void mergeByPrice(StoreProduct[] storeProducts, int low, int mid, int high)
    {
        StoreProduct[] temp = new StoreProduct[high - low + 1];

        int i = low;
        int j = mid + 1;
        int n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid)
            {
                temp[n] = storeProducts[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = storeProducts[i];
                i++;
            }
            else if(storeProducts[i].getPrice() < storeProducts[j].getPrice())
            {
                temp[n] = storeProducts[i];
                i++;
            }
            else
            {
                temp[n] = storeProducts[j];
                j++;
            }
            n++;
        }

        for(int k = low; k <= high; k++)
        {
            storeProducts[k] = temp[k - low];
        }
    }
}
