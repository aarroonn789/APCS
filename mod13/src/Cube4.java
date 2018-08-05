/**
 * This class defines a Cube object by extending Box.
 * The toString method has been added.
 *
 * @author Aaron Harabedian
 * @version 4-24-18
 */
public class Cube4 extends Box4
{
    // Constructor for objects of class Cube
    public Cube4(int s)
    {
        // call superclass
        super(s, s, s);

    }

    // return the side length
    public int getSideLength()
    {
        return getHeight();
    }

    // String to display when object is printed.
    public String toString()
    {
        return "The cube's dimensions are " + getSideLength() + " X " + getSideLength() + " X " + getSideLength();
    }
}