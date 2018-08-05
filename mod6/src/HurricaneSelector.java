/**
 * Displays hurricane data
 *
 * @author Aaron Harabedian
 * @version 11-27-17
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HurricaneSelector
{
    public static void main(String [] args) throws IOException
    {
        File hurricaneData = new File("HurricaneData.txt");
        Scanner readData = new Scanner(hurricaneData);
        Scanner input = new Scanner(System.in);

        //Vars
        int startYear = 0;
        int endYear = 0;
        int hurricaneIndex = 0;

        int MAX_VALUE = Integer.MAX_VALUE;
        int MIN_VALUE = Integer.MIN_VALUE;

        int HURRICANES = 156;

        double categoryTotal = 0;
        double windSpeedMPHTotal = 0;
        double pressureTotal = 0;
        int numberOfIncludedHurricanes = 0;
        double categoryMax = MIN_VALUE;
        double categoryMin = MAX_VALUE;
        double windSpeedMPHMax = MIN_VALUE;
        double windSpeedMPHMin = MAX_VALUE;
        double pressureMax = MIN_VALUE;
        double pressureMin = MAX_VALUE;
        double averageCategory;
        double averageWindSpeedMPH;
        double averagePressure;

        //Arrays
        String [] hurricaneName = new String[HURRICANES];

        int [] hurricaneYear = new int[HURRICANES];
        int [] hurricanePressure = new int[HURRICANES];
        int [] hurricaneWindSpeedKTS = new int[HURRICANES];
        int [] hurricaneCategory = new int[HURRICANES];
        int [] categoryTotals = new int[6];

        double [] hurricaneWindSpeedMPH = new double[HURRICANES];

        boolean [] includedHurricane = new boolean[HURRICANES];
        boolean validStartYear = false;
        boolean validEndYear = false;

        //Initialize categoryTotals as = 0
        for (int c = 0; c < categoryTotals.length; c++){
            categoryTotals[c] = 0;
        }

        //Read file to arrays
        while (readData.hasNextLine())
        {
            hurricaneYear[hurricaneIndex] = Integer.parseInt(readData.next());
            readData.next();
            hurricanePressure[hurricaneIndex] = Integer.parseInt(readData.next());
            hurricaneWindSpeedKTS[hurricaneIndex] = Integer.parseInt(readData.next());
            hurricaneName[hurricaneIndex] = readData.next();
            hurricaneIndex++;
        }

        //Convert KTS to MPH
        for (int i = 0; i < hurricaneWindSpeedKTS.length; i++)
        {
            hurricaneWindSpeedMPH[i] = (double)hurricaneWindSpeedKTS[i] * 1.152;
        }

        //Calculate Hurricane Category
        for (int i = 0; i < hurricaneWindSpeedMPH.length; i++)
        {
            if (hurricaneWindSpeedMPH[i] > 73 && hurricaneWindSpeedMPH[i] < 96)
            {
                hurricaneCategory[i] = 1;
            }
            else if (hurricaneWindSpeedMPH[i] > 95 && hurricaneWindSpeedMPH[i] < 111)
            {
                hurricaneCategory[i] = 2;
            }
            else if (hurricaneWindSpeedMPH[i] > 110 && hurricaneWindSpeedMPH[i] < 130)
            {
                hurricaneCategory[i] = 3;
            }
            else if (hurricaneWindSpeedMPH[i] > 129 && hurricaneWindSpeedMPH[i] < 157)
            {
                hurricaneCategory[i] = 4;
            }
            else if (hurricaneWindSpeedMPH[i] > 156)
            {
                hurricaneCategory[i] = 5;
            }
            else
            {
                hurricaneCategory[i] = 0;
            }
        }

        //Prompt user for date range and check range
        while (!validStartYear) {
            System.out.println("Enter starting year: ");
            startYear = Integer.parseInt(input.nextLine());
            for (int year : hurricaneYear){
                if (year == startYear){
                    validStartYear = true;
                }
            }
        }

        while(!validEndYear) {
            System.out.println("Enter ending year: ");
            endYear = Integer.parseInt(input.nextLine());
            for (int year : hurricaneYear){
                if (year == endYear){
                    validEndYear = true;
                }
            }
        }

        //Check if hurricanes are included
        for (int h = 0; h < hurricaneYear.length; h++){
            if (hurricaneYear[h] >= startYear && hurricaneYear[h] <= endYear){
                includedHurricane[h] = true;
            } else {
                includedHurricane[h] = false;
            }
        }

        //Generate Averages, Min, Max, and Totals
        for (int h = 0; h < hurricaneYear.length; h++){
            if (includedHurricane[h]){
                categoryTotal += hurricaneCategory[h];
                pressureTotal += hurricanePressure[h];
                windSpeedMPHTotal += hurricaneWindSpeedMPH[h];
                numberOfIncludedHurricanes++;
                if (hurricaneCategory[h] < categoryMin){
                    categoryMin = hurricaneCategory[h];
                }
                if (hurricaneCategory[h] > categoryMax){
                    categoryMax = hurricaneCategory[h];
                }
                if (hurricanePressure[h] < pressureMin){
                    pressureMin = hurricanePressure[h];
                }
                if (hurricanePressure[h] > pressureMax){
                    pressureMax = hurricanePressure[h];
                }
                if (hurricaneWindSpeedMPH[h] < windSpeedMPHMin){
                    windSpeedMPHMin = hurricaneWindSpeedMPH[h];
                }
                if (hurricaneWindSpeedMPH[h] > windSpeedMPHMax){
                    windSpeedMPHMax = hurricaneWindSpeedMPH[h];
                }
                if (hurricaneCategory[h] == 5){
                    categoryTotals[5]++;
                }
                else if (hurricaneCategory[h] == 4){
                    categoryTotals[4]++;
                }
                else if (hurricaneCategory[h] == 3){
                    categoryTotals[3]++;
                }
                else if (hurricaneCategory[h] == 2){
                    categoryTotals[2]++;
                }
                else if (hurricaneCategory[h] == 1){
                    categoryTotals[1]++;
                }
                else {
                    categoryTotals[0]++;
                }
            }
        }
        averageCategory = categoryTotal/numberOfIncludedHurricanes;
        averagePressure = pressureTotal/numberOfIncludedHurricanes;
        averageWindSpeedMPH = windSpeedMPHTotal/numberOfIncludedHurricanes;

        //Print output
        System.out.println();
        System.out.println("Hurricanes from " + startYear + " to " + endYear + ":");
        System.out.println();
        System.out.printf("%-6s%-12s%10s%10s%12s%n", "Year", "Name", "Category", "Pressure", "Wind Speed");
        System.out.printf("%6s%12s%10s%10s%12s%n", "", "", "", "(mb)", "(mph)");
        System.out.println("=====================================================");

        for (int h = 0; h < hurricaneYear.length; h++){
            if (includedHurricane[h]){
                System.out.printf("%-6s%-12s%10s%10d%12.2f%n", hurricaneYear[h], hurricaneName[h], hurricaneCategory[h], hurricanePressure[h], hurricaneWindSpeedMPH[h]);
            }
        }

        System.out.println("=====================================================");
        System.out.printf("%6s%-12s%10.2f%10.2f%12.2f%n", "", "Average:", averageCategory, averagePressure, averageWindSpeedMPH);
        System.out.printf("%6s%-12s%10.0f%10.2f%12.2f%n", "", "Minimum:", categoryMin, pressureMin, windSpeedMPHMin);
        System.out.printf("%6s%-12s%10.0f%10.2f%12.2f%n", "", "Maximum:", categoryMax, pressureMax, windSpeedMPHMax);
        System.out.println("================== Category Totals ==================");

        for (int c = 0; c < categoryTotals.length; c++){
            System.out.printf("Cat " + c + ": %2d%n", categoryTotals[c]);
        }
    }
}