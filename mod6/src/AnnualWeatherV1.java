/**
 * Annual Weather description:
 *
 * @author Aaron Harabedian
 * @version 10-27-17
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1
{
    public static void printResults(String city, String state, String tempLabel, String precipLabel, double [] temperature, String [] month, double [] precipitation, double averageTemp, int totalPrecipitation){
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
            System.out.println(month[index] + "        " + temperature[index] + "                " + precipitation[index]);
        }
        System.out.println("Average: " + averageTemp + "    Total: " + totalPrecipitation );
    }

    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Apalachicola";
        String state = "FL";

        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        double [] temperature ={52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};     //initialize with Fahrenheit values
        double [] precipitation ={4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};      //initialize with inch values

        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in

        int totalTemp = 0;
        int totalPrecipitation = 0;

        double averageTemp = 0;

        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
            totalTemp += temperature[index];
            totalPrecipitation += precipitation[index];
        }

        averageTemp = (double)totalTemp / 12;

        printResults(city, state, tempLabel, precipLabel, temperature, month, precipitation, averageTemp, totalPrecipitation);

    }//end main
}//end class