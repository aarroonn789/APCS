/**
 * Name: Aaron H
 * Date: 7-30-18
 * Description: Chair concrete class
 */
public class Chair extends Furniture
{
    //Instance vars
    private boolean isPushedIn;

    //Constructor
    public Chair(String name, int cost, boolean isPushedIn)
    {
        super(name, cost);
        this.isPushedIn = isPushedIn;
    }

    //getter method
    public boolean isPushedIn()
    {
        return isPushedIn;
    }

    //use method
    public void use()
    {
        if(isPushedIn)
        {
            System.out.println("The chair has been pulled out.");
            isPushedIn = false;
        }
        else
        {
            System.out.println("The chair has been pushed in.");
            isPushedIn = true;
        }
    }
}
