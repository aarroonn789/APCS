import java.util.Scanner;

/**
 * Calculates grade average as grades are added.
 *
 * @author Aaron Harabedian
 * @version 10/20/2017
 */
public class GradesV3
{
    public static void main(String[] args)
    {
        //Create scanner object
        Scanner input = new Scanner(System.in);

        //local variables
        int totalAssignments;         //Total number of tests
        int assignmentGrade ;         //Test grade
        int totalPoints = 0;        //Total points for all tests
        double average;         //Average grade

        String name;            //Name of user
        String subject;         //Subject of clas
        String assignmentType;  //Assignment type

        //Get user data
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your subject: ");
        subject = input.nextLine();

        System.out.print("What type of " + subject + "assignments do you want to average? (test|quiz|homework) ");
        assignmentType = input.nextLine();

        System.out.print("How many " + assignmentType + " assignments do you want to average? ");
        totalAssignments = input.nextInt();

        //Grade question loop
        for ( int assignmentNumber = 1; assignmentNumber < (totalAssignments + 1) ; assignmentNumber++){
            System.out.print("Enter grade for " + assignmentType + " number " + assignmentNumber + ": ");
            assignmentGrade = input.nextInt();

            totalPoints += assignmentGrade;
            average = (double)totalPoints/assignmentNumber;

            System.out.print(assignmentType + " " + assignmentNumber + " grade: " + assignmentGrade + " | ");
            System.out.print("Total Points: " + totalPoints + " | ");
            System.out.println("Current Average: " + average);
        }

        //Closing print functions
        average = (double)totalPoints/totalAssignments;
        System.out.println();
        System.out.println("============================================================================================");
        System.out.println("Hey, " + name + "! Here is the average of your " + totalAssignments + " " + assignmentType + " assignments!");
        System.out.println("Average score: " + average + "  | Total points: " + totalPoints);
    }
}
