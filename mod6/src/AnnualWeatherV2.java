/**
 * Annual Weather description:
 *
 * @author Aaron Harabedian
 * @version 10-27-17
 *
 */
import java.util.Scanner;
public class AnnualWeatherV2
{
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);

        String city = "Apalachicola";
        String state = "FL";

        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        double [] temperature ={52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};     //initialize with Fahrenheit values
        double [] precipitation ={4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};      //initialize with inch values

        //Values from Daytona Beach
        //double [] temperature ={58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};
        //double [] precipitation ={3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};

        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in

        int totalTemp = 0;
        int totalPrecipitation = 0;

        double averageTemp = 0;

        //Prompt user for units
        System.out.println("What temperature unit (F or C): ");
        if (in.nextLine().toUpperCase().equals("F")){
            System.out.println("Fahrenheit Selected.");
        } else {
            System.out.println("Celsius Selected.");
            tempLabel = "C";
            for (int index = 0; index < temperature.length; index++){
                temperature[index] = (temperature[index] - 32) * ( 5.0 / 9.0 );
            }
        }

        System.out.println("What precipitation unit (in or cm): ");
        if (in.nextLine().toUpperCase().equals("IN")){
            System.out.println("Inches Selected.");
        } else {
            System.out.println("Centimeters Selected.");
            precipLabel = "cm";
            for (int index = 0; index < precipitation.length; index++){
                precipitation[index] = precipitation[index] * 2.54;
            }
        }

        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
            totalTemp += temperature[index];
            totalPrecipitation += precipitation[index];
        }

        averageTemp = (double)totalTemp / 12;

        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
            System.out.printf("%-12s %8.1f %21.1f %n", month[index], temperature[index], precipitation[index]);
        }
        System.out.println();
        System.out.printf("Avg Temp: %-4.1f | Total Precipitation: %-4d", averageTemp, totalPrecipitation);
    }//end main
}//end class