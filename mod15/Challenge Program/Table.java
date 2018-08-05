/**
 * Name: Aaron H
 * Date: 7-30-18
 * Description: Table concrete class
 */
public class Table extends Furniture
{
    //Instance vars
    private boolean isTableSet;

    //Constructor
    public Table(String name, int cost, boolean isTableSet)
    {
        super(name, cost);
        this.isTableSet = isTableSet;
    }

    //getter method
    public boolean isTableSet()
    {
        return isTableSet;
    }

    //use method
    public void use()
    {
        if(isTableSet)
        {
            System.out.println("The table has been cleared.");
            isTableSet = false;
        }
        else
        {
            System.out.println("The table has been set.");
            isTableSet = true;
        }
    }
}
