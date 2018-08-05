import java.util.Scanner;

/**
 * This program calculates the BMI of the user.
 *
 * @author Aaron
 * @version 11-2-2017
 */

public class BMI
{
    public static void main(String args[ ])
    {
        String firstName;
        String lastName;
        String stringFeetInches;
        String stringFeet;
        String stringInches;
        String stringPounds;

        String BMICategory;

        int feet;
        int inches;
        int pounds;

        double kilograms;
        double meters;
        double BMI;

        int spaceIndex;

        Scanner scanner = new Scanner(System.in);

        System.out.println("+========================+");
        System.out.println("| --- BMI Calculator --- |");
        System.out.println("+========================+");
        System.out.println();

        System.out.println("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.println("Enter your height (FEET INCHES): ");
        stringFeetInches = scanner.nextLine();

        System.out.println("Enter your weight in pounds: ");
        stringPounds = scanner.nextLine();

        spaceIndex = stringFeetInches.indexOf(" ");
        stringFeet = stringFeetInches.substring(0,(spaceIndex));
        stringInches = stringFeetInches.substring(spaceIndex + 1);

        pounds = Integer.parseInt(stringPounds);
        feet = Integer.parseInt(stringFeet);
        inches = Integer.parseInt(stringInches);

        meters = ((feet * 12 ) + inches) * 0.0254;
        kilograms = pounds * 0.45359237;

        BMI = kilograms / (meters * meters);

        /*  Below 18.5	Underweight
        *   18.5—24.9	Normal or Healthy Weight
        *   25.0—29.9	Overweight
        *   29.9        and Above	Obese
        */

        if (BMI < 18.5) {
            //Underweight
            BMICategory = "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            //Normal
            BMICategory = "Healthy";
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            //Overweight
            BMICategory = "Overweight";
        } else {
            //Obese
            BMICategory = "Obese";
        }

        System.out.println();
        System.out.println("+========================+");
        System.out.println("| ----- BMI Result ----- |");
        System.out.println("+========================+");

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Height: " + meters + "m");
        System.out.println("Weight: " + kilograms + "kg");
        System.out.println("BMI: " + BMI);
        System.out.println("BMI Category: " + BMICategory);
    }
}
