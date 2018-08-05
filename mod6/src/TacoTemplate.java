public class TacoTemplate
{
    String name = "Taco";

    double price;

    String[] ingredients;

    void listIngredients(){
        for (String ingredient : ingredients){
            System.out.println(ingredient);
        }
    }
}
