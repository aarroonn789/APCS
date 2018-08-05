import java.util.Scanner;

public class TacoShop
{
    public static void main(String[] args){
        TacoTemplate burritoTaco = new TacoTemplate();
        Scanner input = new Scanner(System.in);

        burritoTaco.price = 5.25;
        burritoTaco.ingredients = new String[] {"Tortilla", "Lettuce", "Cheese", "Chicken", "Sour Cream"};


        String taco2Name = "Cheese Taco";
        String taco3Name = "Taco Taco";
        String taco4Name = "Salsa Taco";

        double taco2Price = 2.25;
        double taco3price = 2.25;
        double taco4price = 2.75;

        String [] taco2Ingredients = {};
        String [] taco3Ingredients = {};
        String [] taco4Ingredients = {};

        burritoTaco.listIngredients();
        System.out.println(burritoTaco.name);

    }
}
