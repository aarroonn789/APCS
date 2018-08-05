/**
 * This class defines a Square object by extending Rectangle.
 * The toString method has been added.
 *
 * @author Aaron H
 * @version 4-24-18
 */
public class Square4 extends Rectangle4
{

    // Constructor for objects of class Box
    public Square4(int s)
    {
        // call superclass
        super(s, s);
    }

    // String to display when object is printed.
    public String toString()
    {
        return "The square's dimensions are " + getLength() + " X " + getWidth();
    }
}