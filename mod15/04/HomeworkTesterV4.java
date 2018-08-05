/**
 * Author: Aaron
 * Description: Tests "HomeworkV4" class
 * Date: 7-30-18
 */
import java.util.ArrayList;
import java.util.List;

public class HomeworkTesterV4 {
    public static void main(String args[]){
        //ArrayList of homework
        List<HomeworkV4> homework = new ArrayList<HomeworkV4>();

        //Add courses
        homework.add(new EnglishV4());
        homework.add(new GeometryV4());
        homework.add(new ChemistryV4());
        homework.add(new EconomicsV4());

        //Add assignments
        for(HomeworkV4 course : homework)
        {
            course.createAssignment((int)(Math.random() * 10) + 5);
        }

        //Display homework, Complete part of homework, display remaining homework
        for(HomeworkV4 course : homework)
        {
            System.out.println("Before reading: " + course);
            course.doHomework((int)(Math.random() * 5));
            System.out.println("After reading: " + course);
            System.out.println();
        }

        //Compares homework
        for(HomeworkV4 course : homework)
        {
            for(HomeworkV4 course2 : homework)
            {
                if(course.getHomeworkType().equals(course2.getHomeworkType()))
                {
                    break;
                }
                else if(course.compareTo(course2) > 0)
                {
                    System.out.println(course.getHomeworkType() + " has more homework than " + course2.getHomeworkType());
                }
                else if(course.compareTo(course2) == 0)
                {
                    System.out.println(course.getHomeworkType() + " has as much homework as " + course2.getHomeworkType());
                }
                else
                {
                    System.out.println(course.getHomeworkType() + " has less homework than " + course2.getHomeworkType());
                }
            }
        }
    }
}
