import java.util.Scanner;

/**
 * Online purchase system
 *
 * @author Aaron Harabedian
 * @version 10/21/2017
 */

public class BuyBlender
{
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        String blenderModel;
        String firstName;
        String lastName;
        String date;
        String orderNumber;
        String card;
        String pin;

        Double blenderPrice;
        int blenderQuantity;
        double orderPrice;

        //Headder
        System.out.println("+===========================+");
        System.out.println("| Welcome to Blenders-R-Us! |");
        System.out.println("+===========================+");
        System.out.println();

        System.out.println("Which fine blender would you like to purchase? ");
        blenderModel = input.nextLine();    //gets blender model

        System.out.println("What is the price of the " + blenderModel + "? (USD) ");
        blenderPrice = Double.parseDouble(input.nextLine());  //gets blender price

        System.out.println("How many " + blenderModel + "s would you like? ");
        blenderQuantity = Integer.parseInt(input.nextLine());  //gets blender quantity

        //total price calculations
        orderPrice = blenderPrice * blenderQuantity;

        //divider
        System.out.println();
        System.out.println("============================================================================================");
        System.out.println("Total cost for " + blenderQuantity + " " + blenderModel + " blenders is " + orderPrice + " USD" );
        System.out.println();
        System.out.println("+==================================+");
        System.out.println("| Please enter payment info below. |");
        System.out.println("+==================================+");

        System.out.println("Today's date (mm/dd/yyyy): ");
        date = input.nextLine();            //gets date

        System.out.println("First Name: ");
        firstName = input.nextLine();       //gets first name

        System.out.println("Last Name: ");
        lastName = input.nextLine();        //gets last name

        System.out.println("Card number (####-####-####-####): ");
        card = input.nextLine();            //gets card

        System.out.println("PIN (####): ");
        pin = input.nextLine();             //gets PIN
        System.out.println();
        System.out.println("Thank You, " + firstName + " for choosing Blenders-R-Us!");

        System.out.println();
        System.out.println("+=============================+");
        System.out.println("| Processing your purchase... |");
        System.out.println("+=============================+");

        //Generate order number
        orderNumber = firstName.substring(0,1) + lastName.substring(0,1) + pin.substring(2,4) + card.substring(6,7);

        System.out.println();
        System.out.println("Purchase receipt.");
        System.out.println();
        System.out.println(date + " | Blenders-R-Us Order #" + orderNumber);
        System.out.println();
        System.out.println("Customer " + firstName + " " + lastName + ".");
        System.out.println();
        System.out.println("Blender purchases: ");
        System.out.println("\t" + blenderModel + " x" + blenderQuantity + " at $" + blenderPrice);
        System.out.println("\t Total Order Cost: " + orderPrice );
        System.out.println();
        System.out.println("We hope you enjoy your purchase!");
    }
}
