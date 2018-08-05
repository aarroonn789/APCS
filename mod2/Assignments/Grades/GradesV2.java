
/**
 * Will calculate the total points and average grade each time a new score is added to the total.
 *
 * @author Aaron Harabedian
 * @version 10/10/2017
 */
public class GradesV2
{
    public static void main(String[] args)
    {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests 
        double average = 0.0;  //average grade
        
        //Test 1
        testGrade = 95;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
        
        //Test 2
        testGrade = 73;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
        
        //Test 3
        testGrade = 91;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
        
        //Test 4
        testGrade = 82;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
        
        //Test 5
        testGrade = 63;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
        
        //Test 6
        testGrade = 99;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
        
        //Test 7
        testGrade = 93;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
        
        //Test 8
        testGrade = 87;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
        
        //Test 9
        testGrade = 28;
        numTests ++;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        
        System.out.print("Test " + numTests + " grade: " + testGrade + " | ");
        System.out.print("Total Points: " + totalPoints + " | ");
        System.out.println("Current Average: " + average);
    }
}
