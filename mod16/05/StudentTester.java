/**
 * Purpose: Gradebook tester for Student object
 *
 * Author: Aaron H
 * Date 8-2-18
 */

import java.util.ArrayList;
import java.util.List;

public class StudentTester {

    /**
     * Test your methods by calling each at least once to demonstrate all of your algorithms. The output needs to be clearly labeled as to the change performed. Display the grade book after each change.
     * This will allow you or anyone else to verify the changes were done properly.
     */

    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<Student>();

        //Start with five students in your class.
        students.add(new Student("John", new int[]{100, 95, 60, 75, 80}));
        students.add(new Student("Alex", new int[]{100, 98, 95, 97, 92}));
        students.add(new Student("Stephen", new int[]{90, 95, 60, 74, 82}));
        students.add(new Student("Joe", new int[]{90, 90, 82, 77, 92}));
        students.add(new Student("Ryan", new int[]{100, 95, 90, 87, 80}));

        System.out.println("== Gradebook ==");
        printStudents(students);

        changeStudentName(students, "Joe", "Joseph");
        System.out.println(" == Joe changed to Joseph");
        printStudents(students);

        changeStudentGrade(students, "Stephen", 2, 80);
        System.out.println(" == Stephen's Quiz 3 changed to 80");
        printStudents(students);

        replaceStudent(students, "Alex", "Mark", new int[]{80, 85, 78, 75, 80});
        System.out.println(" == Alex has been replaced by Mark");
        printStudents(students);

        insertStudent(students, "Joseph", "Alex", new int[]{100, 98, 95, 97, 92});
        System.out.println(" == Alex has been inserted before Joseph");
        printStudents(students);

        removeStudentByName(students, "John");
        System.out.println(" == John has been removed");
        printStudents(students);
    }

    //traverse through the data structure and print each element in a neat table format.
    private static void printStudents(List<Student> students)
    {
        System.out.printf("%10s%8s%8s%8s%8s%8s%n","Name", "Quiz 1", "Quiz 2", "Quiz 3", "Quiz 4", "Quiz 5");

        for(Student student : students)
        {
            if(student != null)
            {
                System.out.printf("%10s%8d%8d%8d%8d%8d%n",student.getName(), student.getScore(0), student.getScore(1), student.getScore(2), student.getScore(3), student.getScore(4));
            }
        }
        System.out.println();
    }

    //replace a student's name with a new one.
    private static void changeStudentName(List<Student> data, String oldName, String newName)
    {
        for(int i = 0; i < data.size(); i++)
        {
            if(data.get(i) != null && data.get(i).getName().equals(oldName))
            {
                data.get(i).setName(newName);
            }
        }
    }

    //replace a student's quiz grade with a new one. It should replace only one quiz grade, as indicated by the quiz number, when it is called.
    //It will have the data structure, quiz number, and new quiz score as input.
    private static void changeStudentGrade(List<Student> data, String student, int quiz, int score)
    {
        for(int i = 0; i < data.size(); i++)
        {
            if(data.get(i) != null && data.get(i).getName().equals(student))
            {
                data.get(i).setScore(quiz, score);
            }
        }
    }

    //replace a student with another one. It will have the data structure, name to replace, new student name, and quiz scores as input.
    private static void replaceStudent(List<Student> data, String oldName, String newName, int[] newScores)
    {
        for(int i = 0; i < data.size(); i++)
        {
            if(data.get(i) != null && data.get(i).getName().equals(oldName))
            {
                data.set(i, new Student(newName, newScores));
            }
        }
    }

    //insert a new student before another student in the data structure.
    //It will have the data structure, name to find, new student name, and quiz scores as input.
    private static void insertStudent(List<Student> data, String find, String name, int[] scores)
    {
        int index = 0;

        for(int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(find)) {
                index = i;
            }
        }

        data.add(index, new Student(name, scores));
    }

    //delete a student by finding the student name. It will take the data structure and name to find as input.
    public static void removeStudentByName(List<Student> data, String find)
    {
        int location = 0;
        int i;

        for(i = 0; i < data.size(); i++) {
            if ((data.get(i) != null) && (data.get(i).getName().equals(find)))
            {
                location = i;
                break;
            }
            else if (data.get(i) == null)
            {
                location = -1;
                break;
            }
        }
        if ((i != data.size()) && (location >= 0))
        {
            for(i = location; i < data.size() -1; i++) {
                data.set(i, data.get(i + 1));
            }
            data.set(data.size() - 1, null);
        }
    }
}
