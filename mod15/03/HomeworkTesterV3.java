/**
 * Author: Aaron
 * Description: Tests "HomeworkV3" class
 * Date: 7-30-18
 */
import java.util.ArrayList;
import java.util.List;

public class HomeworkTesterV3 {
    public static void main(String args[]){
        //ArrayList of homework
        List<HomeworkV3> homework = new ArrayList<HomeworkV3>();

        //Add courses
        homework.add(new EnglishV3());
        homework.add(new GeometryV3());
        homework.add(new ChemistryV3());
        homework.add(new EconomicsV3());

        //Add assignments
        for(HomeworkV3 course : homework)
        {
            course.createAssignment((int)(Math.random() * 10) + 5);
        }

        //Display homework, Complete part of homework, display remaining homework
        for(HomeworkV3 course : homework)
        {
            System.out.println("Before reading: " + course);
            course.doHomework((int)(Math.random() * 5));
            System.out.println("After reading: " + course);
            System.out.println();
        }
    }
}
