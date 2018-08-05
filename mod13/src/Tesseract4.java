/**
 * This class defines a Tesseract object by extending Box and adds wDimension.
 * The toString method has been added.
 *
 * @author Aaron Harabedian
 * @version 4-24-18
 */
public class Tesseract4 extends Box4
{
    //Instance Vars
    private int wDimension;

    // Constructor for objects of class Cube
    public Tesseract4(int l, int w, int h, int wDim)
    {
        // call superclass
        super(l, w, h);

        //Init instance vars
        wDimension = wDim;

    }

    // return the side length
    public int getwDimension()
    {
        return wDimension;
    }

    public boolean equals(Tesseract4 o) {
        if (getLength() == o.getLength() && getWidth() == o.getWidth() && getHeight() == o.getHeight() && getwDimension() == o.getwDimension()){
            return true;
        } else {
            return false;
        }
    }


    // String to display when object is printed.
    public String toString()
    {
        return "The tesseract's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + getwDimension();
    }
}