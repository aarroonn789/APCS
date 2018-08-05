/**
 * Name: Aaron H
 * Date: 7-30-18
 * Description: Furniture abstract class
 */
public abstract class Furniture implements Product
{
    //Instance vars for name and cost
    private String name;
    private int cost;

    //Constructor to initialize name and cost
    public Furniture(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

    //Methods from implementation class
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    //Abstract method to be overridden by subclasses
    abstract public void use();
}
