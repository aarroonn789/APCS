import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Calculates weight of user based on planet surface gravity
 *
 * @author aaron
 * @date 12-5-2017
 */

public class PlanetWeight
{
    public static double [] getSurfaceGravity(File file, int length) throws IOException
    {
        Scanner readFile = new Scanner(file);
        double [] surfaceGravity = new double[length];
        for (int i = 0; i < length; i++)
        {
            surfaceGravity[i] = Double.parseDouble(readFile.nextLine());
        }
        return  surfaceGravity;
    }

    public static void printWeights(String [] name, double [] surfaceGravity, double [] weight)
    {
        System.out.printf("%-12s%10s%10s%n", "Planet", "Gravity", "Weight");
        System.out.println("=================================================");
        for (int i = 0; i < name.length; i++)
        {
            System.out.printf("%-12s%10.2f%10.2f%n", name[i], surfaceGravity[i], weight[i]);
        }
    }

    public static double [] calculateWeights(double [] surfaceGravity, double userWeight)
    {
        double [] weights = new double[surfaceGravity.length];
        for (int i = 0; i < surfaceGravity.length; i++)
        {
            weights[i] = userWeight * (surfaceGravity[i] / 9.8);
        }
        return weights;
    }

    public static double getUserWeight()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in LBS: ");
        double weight = Double.parseDouble(input.nextLine());
        return weight;
    }

    public static void main(String [] args) throws IOException
    {
        File surfaceGravityFile = new File("surfaceGravity.txt");

        String [] planetNames = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
        double [] surfaceGravity = getSurfaceGravity(surfaceGravityFile, planetNames.length);

        double userWeight = getUserWeight();

        double [] calculatedWeights = calculateWeights(surfaceGravity, userWeight);

        printWeights(planetNames, surfaceGravity, calculatedWeights);
    }
}
