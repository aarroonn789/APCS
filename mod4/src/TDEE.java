import java.util.Scanner;

/**
 * Description: Calculates TDEE of user
 *
 * @author Aaron
 * @date 10/7/2017
 */

public class TDEE
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String name;
        String stringBMR;
        String stringGender;
        String stringActivityLevel;

        double BMR;
        double activityFactor;
        double TDEE;
        boolean isMale;

        //User prompts
        System.out.println("+=================+");
        System.out.println("| TDEE Calculator |");
        System.out.println("+=================+");
        System.out.println("");

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter M for Male or F for Female: ");
        stringGender = scanner.nextLine();

        System.out.println("Enter BMR: ");
        stringBMR = scanner.nextLine();

        System.out.println("Activity Levels:");
        System.out.println("\t [A] Resting: Sleeping, reclining");
        System.out.println("\t [B] Sedentary: Minimal movement, mainly sitting/lying down (e.g., watching TV, reading, etc.)");
        System.out.println("\t [C] Light: Office work, sitting (e.g., walking, laundry, walking on level ground at 2.5 – 3.0 mph.)");
        System.out.println("\t [D] Moderate: Light manual labor (e.g., dancing, cycling, gardening, etc.)");
        System.out.println("\t [E] Very Active: Hard manual labor (e.g., team sports, climbing, agricultural labor, etc.)");
        System.out.println("\t [F] Extremely Active: Heavy manual labor (e.g., full-time athletes, construction workers, etc.)");
        System.out.println("Please enter the letter that corresponds to your activity level: ");
        stringActivityLevel = scanner.nextLine();


        //Variable conversions
        BMR = Double.parseDouble(stringBMR);
        stringActivityLevel = stringActivityLevel.toUpperCase();
        stringGender = stringGender.toUpperCase();

        //Gender check
        isMale = stringGender.equals("M");

        //Activity factor check
        if (stringActivityLevel.equals("A")) {
            if (isMale) {
                activityFactor = 1.0;
            }
            else {
                activityFactor = 1.0;
            }
        }
        else if (stringActivityLevel.equals("B")) {
            if (isMale) {
                activityFactor = 1.3;
            }
            else {
                activityFactor = 1.3;
            }
        }
        else if (stringActivityLevel.equals("C")) {
            if (isMale) {
                activityFactor = 1.6;
            }
            else {
                activityFactor = 1.5;
            }
        }
        else if (stringActivityLevel.equals("D")) {
            if (isMale) {
                activityFactor = 1.7;
            }
            else {
                activityFactor = 1.6;
            }
        }
        else if (stringActivityLevel.equals("E")) {
            if (isMale) {
                activityFactor = 2.1;
            }
            else {
                activityFactor = 1.9;
            }
        }
        else if (stringActivityLevel.equals("F")) {
            if (isMale) {
                activityFactor = 2.4;
            }
            else {
                activityFactor = 2.2;
            }
        }
        else {
            activityFactor = 0;
            System.out.println("ERROR: Invalid activity level!");
        }

        //Calculations
        TDEE = BMR * activityFactor;

        //Results
        System.out.println();
        System.out.println("+=========+");
        System.out.println("| Results |");
        System.out.println("+=========+");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("TDEE: " + TDEE);
        System.out.println("\t Activity Factor: " + activityFactor);
        System.out.println("\t BMR: " + BMR);
        System.out.print("\t Gender: ");
        if (isMale) {
            System.out.println("M");
        } else {
            System.out.println("F");
        }
    }
}