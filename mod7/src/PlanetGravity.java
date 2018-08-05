import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Calculates and writes planet gravity to file
 *
 * @author aaron
 * @date 12-5-2017
 */

public class PlanetGravity
{
    public static double GRAVITATIONAL_CONSTANT()
    {
        return 6.67e-11;
    }

    public static double [] calculateSurfaceGravity(double [] diameter, double [] mass)
    {
        double [] surfaceGravity = new double[diameter.length];
        double radius;

        for (int i = 0; i < diameter.length; i++){
            radius = (diameter[i]*1000)/2;
            surfaceGravity[i] = (GRAVITATIONAL_CONSTANT() * mass[i]) / (Math.pow(radius, 2));
        }
        return surfaceGravity;
    }

    public static void writeSurfaceGravityToFile(File file, double [] surfaceGravity) throws IOException
    {
        PrintWriter printWriter = new PrintWriter(file);

        for (double value : surfaceGravity)
        {
            printWriter.println(value);
        }

        printWriter.close();
    }

    public static void printPlanetGravity(String [] name, double [] diameter, double [] mass, double [] g)
    {
        System.out.printf("%-12s%10s%10s%12s%n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("=================================================");
        for (int i = 0; i < name.length; i++)
        {
            System.out.printf("%-12s%10.2f%10.2e%12.2f%n", name[i], (diameter[i]), mass[i], g[i]);
        }
    }

    public static void main(String [] args) throws IOException
    {
        File dataFile = new File("surfaceGravity.txt");

        String [] planetNames = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
        double [] planetDiameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double [] planetMass = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};

        double [] planetSurfaceGravity = calculateSurfaceGravity(planetDiameter, planetMass);

        writeSurfaceGravityToFile(dataFile, planetSurfaceGravity);

        printPlanetGravity(planetNames, planetDiameter, planetMass, planetSurfaceGravity);
    }
}