import java.util.Scanner;

/**
 * This program inputs the first name, gender, age, weight
 * in pounds, and height in inches of the user. With this
 * information, it calculates and outputs the user's weight
 * in kilograms, height in centimeters, and basal metabolic
 * rate in kcal per day.
 *
 * @author Aaron
 * @version 10-28-2017
 */

public class BMRV2
{
    public static void main(String [] args)
    {
        char gender;
        boolean isFemale;
        int age;
        int heightInches;
        int weightPounds;
        double heightCm;
        double weightKg;
        double BMR;

        String firstName;
        String genderString;
        String ageString;
        String heightInchesString;
        String weightPoundsString;


        Scanner in = new Scanner(System.in);

        //Gather Input
        System.out.print("Enter your first name: ");
        firstName = in.next();

        System.out.print("Gender (M or F): ");
        genderString = in.next();

        System.out.print("Enter your age: ");
        ageString = in.next();

        System.out.print("Height in inches: ");
        heightInchesString = in.next();

        System.out.print("Weight in pounds: ");
        weightPoundsString = in.next();

        //Determine gender
        gender = genderString.charAt(0);
        isFemale = gender == 'F';

        //Parse numeric input
        age = Integer.parseInt(ageString);
        heightInches = Integer.parseInt(heightInchesString);
        weightPounds = Integer.parseInt(weightPoundsString);

        //Convert height and weight
        heightCm = 2.54 * heightInches;
        weightKg = 0.45359237 * weightPounds;

        //Determine BMR
        // The BMR formula:
        // 10.0 * mass in kilograms
        // + 6.25 * height in centimeters
        // - 5.0 * age
        // + s, where s is +5 for males and -161 for females

        int s;
        if(gender == 'F')
            s = -161;
        else
            s = 5;

        BMR = (10.0 * weightKg) + (6.25 * heightCm) - (5.0 * age) + s;

        //Display results
        System.out.println("\n\n");
        System.out.println("Calculate Your Basal Metabolism\n");
        System.out.println("Name: " + firstName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);

        //Note: numeric values displayed to one decimal place
        System.out.println("Weight (kg): " + (int)(10 * weightKg)/10.0 );
        System.out.println("Height (cm): " + (int)(10 * heightCm)/10.0 );
        System.out.println("Basal Metabolic Rate: " + (int)(10 * BMR)/10.0 );
    }
}