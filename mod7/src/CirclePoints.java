/**
 * Find points on a circle
 *
 * @author aaron
 * @date 11-29-17
 *
 */

public class CirclePoints
{
    public static void main(String [] args)
    {
        //Radius and Increment constants
        double RADIUS = 1;
        double INCREMENT = 0.1;

        double y1 = 0;
        double y2 = 0;

        System.out.println("Points on a circle with Radius of " + RADIUS);
        System.out.printf("%8s %8s %8s %n", "X", "Y1", "Y2");
        System.out.println("===========================");

        for (double x = RADIUS; x >= -RADIUS; x -= INCREMENT)
        {
            y1 = -(Math.sqrt(Math.pow(RADIUS, 2) - Math.pow(x, 2)));
            y2 = (Math.sqrt(Math.pow(RADIUS, 2) - Math.pow(x, 2)));

            System.out.printf("%8.2f %8.2f %8.2f %n", x, y1, y2);
        }
    }
}
