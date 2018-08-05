
/**
 * This class demonstrates objects derived from Rectangle and overridden methods.
 *
 * @author Aaron Harabedian
 * @version 4-24-18
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String [] args)
    {
        //Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( new Rectangle4(10, 10) );
        shapes.add( new Box4(4, 4, 4) );
        shapes.add( new Cube4(4));
        shapes.add( new Square4(10));
        shapes.add( new Tesseract4(6, 6, 3, 7));

        for(Rectangle4 r: shapes)
        {
            System.out.println(r);
            System.out.println();
        }

        System.out.println("\n \n \n ##### EQUALITY CHECK #### \n \n \n");

        for(Rectangle4 r1: shapes){
            for(Rectangle4 r2: shapes){
                if (r1.equals(r2)){
                    System.out.println("===| "+ r1 + " EQUALS " + r2);
                } else {
                    System.out.println(r1 + " DOES NOT EQUAL " + r2);
                }
            }
        }
    }
}