import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Simulates observing fox squirrels
 *
 * @author aaron
 * @date 11-18-2017
 */
public class AnimalPopulation
{
    public static void main(String args[]) throws IOException {
        PrintWriter writer = new PrintWriter(new File("FieldNotes.txt"));
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Scanner file = new Scanner(new File("FieldNotes.txt"));

        //Vars
        String stringTrials;
        String stringFileAnimalsSpotted;

        int trials = 0;
        int animalType = 0;
        int animalsSpotted = 0;

        int fileTrials = 0;
        int fileAnimalsSpotted = 0;
        int fileTotalAnimalsSpotted = 0;

        double fileAverage;

        //Prompt for trials & check trials above 1000
        while(trials < 1000) {
            System.out.println("Number of trials must be greater than 1000.");
            System.out.println("Enter number of trials: ");
            stringTrials = input.nextLine();
            trials = Integer.parseInt(stringTrials);
        }

        System.out.println("STARTING TRIALS...");

        //Run for number of trials
        for (int t = 1; t <= trials; t++){
            //System.out.println("TRIAL NUMBER: " + t);
            //Reset counters
            animalsSpotted = 0;
            animalType = 0;
            //Loop until animal found
            while(animalType != 10){
                animalType = rand.nextInt(11);
                animalsSpotted++;
                //System.out.println("ANIMAL: " + animalType + "  COUNT: " + animalsSpotted);
            }
            //record data
            writer.println(animalsSpotted);
        }
        //close file
        writer.close();

        //INTO THE LAB

        //loop until file out of lines
        while (file.hasNextLine()){
            stringFileAnimalsSpotted = file.nextLine();
            fileAnimalsSpotted = Integer.parseInt(stringFileAnimalsSpotted);
            fileTotalAnimalsSpotted += fileAnimalsSpotted;
            fileTrials++;
        }

        //Find and print average
        fileAverage = (double)fileTotalAnimalsSpotted / fileTrials;
        System.out.println("Average animals spotted before Fox Squirrel: " + fileAverage);
    }
}
