/**
 * Purpose: Student object for gradebook
 *
 * Author: Aaron H
 * Date 8-2-18
 */

import java.util.ArrayList;
import java.util.List;

public class Student {
    //Instance variables are needed for the student name and five quiz scores.
    private String name;
    private int[] scores;

    //A constructor is needed to provide a way to define a student object and initialize the quiz scores.
    public Student(String name, int[] scores)
    {
        this.name = name;
        this.scores = scores;
    }

    //a method that takes in a quiz number as input and then returns the appropriate quiz value
    public int getScore(int quiz)
    {
        return scores[quiz];
    }

    //a method that sets a quiz score based on inputing a quiz number and new quiz score
    public void setScore(int quiz, int score)
    {
        scores[quiz] = score;
    }

    //a method to get the name of a student
    public String getName()
    {
        return name;
    }

    //a method to set the name of a student

    public void setName(String name)
    {
        this.name = name;
    }

    //a toString() method that prints the name of the student along with the quiz scores
    public String toString()
    {
        String string = "";

        string += name;
        for(int score : scores)
        {
            string += " - " + score;
        }

        return string;
    }
}
