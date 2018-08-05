/*
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given
 * the current exchange rate.
 *
 * @author Aaron Harabedian
 * @version 10/12/2017
 */
public class CurrencyV1
{
    public static void main(String[] args)
    {
        // Declare and initialize local variables
        double startingUsDollars = 6500.00;

        double pesosSpent = 7210.25;
        double pesoExchangeRate = 19.57852;
        double dollarsSpentInMexico;
        double dollarsAfterMexico;

        double yenSpent = 112342.50;
        double yenExchangeRate = 112.39;
        double dollarsSpentInJapan;
        double dollarsAfterJapan;

        double eurosSpent = 1221.52;
        double euroExchangeRate = 1.18;
        double dollarsSpentInSpain;
        double dollarsAfterSpain;

        double remainingDollars;

        // Message to user stating purpose
        System.out.println("+------------------------------------------------+");
        System.out.println("| This program converts an amount of money       |");
        System.out.println("| from a specific country into the equivalent    |");
        System.out.println("| currency of another country given the current  |");
        System.out.println("| exchange rate.                                 |");
        System.out.println("+------------------------------------------------+");
        System.out.println();

        // Conversion
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;

        dollarsSpentInJapan = yenSpent / yenExchangeRate;
        dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan;

        dollarsSpentInSpain = eurosSpent / euroExchangeRate;
        dollarsAfterSpain = dollarsAfterJapan - dollarsSpentInSpain;

        remainingDollars = dollarsAfterSpain;

        // Print functions
        System.out.println("Starting US dollars:        " + startingUsDollars);
        System.out.println();
        System.out.println("Mexico:");
        System.out.println("| Pesos spent:              " + pesosSpent);
        System.out.println("| US dollars equivalent:    " + dollarsSpentInMexico);
        System.out.println("| US dollars remaining:     " + dollarsAfterMexico);
        System.out.println();
        System.out.println("Japan:");
        System.out.println("| Yen spent:                " + yenSpent);
        System.out.println("| US dollars equivalent:    " + dollarsSpentInJapan);
        System.out.println("| US dollars remaining:     " + dollarsAfterJapan);
        System.out.println();
        System.out.println("Spain:");
        System.out.println("| Euros spent:              " + eurosSpent);
        System.out.println("| US dollars equivalent:    " + dollarsSpentInSpain);
        System.out.println("| US dollars remaining:     " + dollarsAfterSpain);
        System.out.println();
        System.out.println("Total US Dollar Remaining:  " + remainingDollars);
        System.out.println();

        // Complete the code below for Souvenir Purchases
        System.out.println("+---------------------------+");
        System.out.println("| Souvenir Purchases (USD)  |");
        System.out.println("+---------------------------+");

        // Variables for Souvenir #1
        int costItem1 = 17;              // Cost per item of first souvenir
        int budget1 = 900;               // Budget for first item
        int totalItems1;                 // How many items can be purchased
        int budgetRemaining1;            // How much of the budget is left

        // Calculations for Souvenir #1
        totalItems1 = budget1 / costItem1;
        budgetRemaining1 = budget1 % costItem1;

        // Print functions for Souvenir #1
        System.out.println("Item 1:");
        System.out.println("| Cost per item:           $" + costItem1);
        System.out.println("| Budget:                  $" + budget1);
        System.out.println("| Total items purchased:    " + totalItems1);
        System.out.println("| Budget remaining:        $" + budgetRemaining1);
        System.out.println();

        // Variables for Souvenir #2
        double costItem2 = 39.75;        // Cost per item of second souvenir
        int budget2 = 1350;              // Budget for second item
        int totalItems2;                 // How many items can be purchased
        double budgetRemaining2;        // How much of the budget is left

        // Calculations for Souvenir #2
        totalItems2 = (int) ((double) budget2 / costItem2);
        budgetRemaining2 = budget2 % costItem2;

        System.out.println("Item 2:");
        System.out.println("| Cost per item:           $" + costItem2);
        System.out.println("| Budget:                  $" + budget2);
        System.out.println("| Total items purchased:    " + totalItems2);
        System.out.println("| Budget remaining:        $" + budgetRemaining2);

    } // end of main method
} // end of class
