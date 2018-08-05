/**
 * Author: Aaron
 * Description: Tests "HomeworkV3" class
 * Date: 7-30-18
 */
import java.util.ArrayList;

public class HomeworkTester {
    public static void main(String args[]){
        //ArrayList of homework
        ArrayList<Homework> homework = new ArrayList<>();

        //Add courses
        homework.add(new English());
        homework.add(new Geometry());
        homework.add(new Chemistry());
        homework.add(new Economics());

        //Add assignments
        for(Homework course : homework)
        {
            course.createAssignment((int)(Math.random() * 5) + 5);
        }

        //Display homework
        for(Homework course : homework)
        {
            System.out.println(course);
        }
    }
}
