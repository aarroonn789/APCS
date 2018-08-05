/**
 * Name: Aaron H
 * Date: 7-30-18
 * Description: Food class
 */
public class Food implements Product, Comparable<Food>
{
    //Instance vars for name and cost
    private String name;
    private int cost;

    //Construction to initialize name and cost
    public Food(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

    //Methods from implementation class
    public String getName()
    {
        return name;
    }

    public int getCost()
    {
        return cost;
    }

    //compareTo method based on cost of product
    public int compareTo(Food obj)
    {
        if(this.cost > obj.cost)
        {
            return 1;
        }
        else if(this.cost == obj.cost)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
