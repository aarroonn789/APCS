import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Counts family children structures and calculates percentages.
 *
 *@author aaron
 *@date 11-2-2017
 */

public class Family {

    public static void main(String[] args) throws IOException
    {
        //declare variables
        int totalFamilies = 0;
        int boyBoyFamilies = 0;
        int boyGirlFamilies = 0;
        int girlGirlFamilies = 0;

        double BBPercentage = 0;
        double GGPercentage = 0;
        double BGPercentage = 0;

        String token = "";
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        //loop to read lines
        while ( inFile.hasNext() )
        {
            token = inFile.next();
            //count family types
            if (token.equals("BB"))
            {
                boyBoyFamilies++;
            }
            else if (token.equals("GG"))
            {
                girlGirlFamilies++;
            }
            else
            {
                boyGirlFamilies++;
            }

            totalFamilies++;
        }

        //calculations
        BBPercentage = (double)((int)(((double)boyBoyFamilies / totalFamilies * 100) * 10)) / 10;
        GGPercentage = (double)((int)(((double)girlGirlFamilies / totalFamilies * 100) * 10)) / 10;
        BGPercentage = (double)((int)(((double)boyGirlFamilies / totalFamilies * 100) * 10)) / 10;

        System.out.println("Resuts:");
        System.out.println("Total Families: " + totalFamilies);
        System.out.println("2 boys: " + boyBoyFamilies + "   Percentage: " + BBPercentage);
        System.out.println("2 girls: " + girlGirlFamilies + "   Percentage: " + GGPercentage);
        System.out.println("1 boy 1 girl: " + boyGirlFamilies + "   Percentage: " + BGPercentage);

    }
}
