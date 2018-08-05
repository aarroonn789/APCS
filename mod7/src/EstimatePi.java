import java.util.Random;
import java.util.Scanner;

/**
 * Estimates Pi
 *
 * @author aaron
 * @date 1-5-2018
 */

public class EstimatePi
{
    //Asks user for darts per trial
    public static int getDartsPerTrial(){
        Scanner scanner = new Scanner(System.in);
        int dartsPerTrial = 0;

        System.out.println("How many darts would you like to throw per trial? ");
        dartsPerTrial = Integer.parseInt(scanner.nextLine());

        return dartsPerTrial;
    }

    //Asks user for trials
    public static int getTrials(){
        Scanner scanner = new Scanner(System.in);
        int trials = 0;

        System.out.println("How many trials would you like to run? ");
        trials = Integer.parseInt(scanner.nextLine());

        return trials;
    }

    //Simulates dart throw
    public static boolean throwDart(double radius){
        Random rand = new Random();

        double X = (rand.nextDouble() * 2.0) - 1.0;
        double Y = (rand.nextDouble() * 2.0) - 1.0;

        double H = Math.sqrt(Math.pow(X,2) + Math.pow(Y,2)); //Calculates hypotenuse

        return (H <= radius); // Returns true for a hit and false for a miss
    }

    //runs a single trial
    public static double runTrial(int dartThrows){
        int totalHits = 0;
        double estimatedPi;

        for (int dartThrow = 0; dartThrow < dartThrows; dartThrow++) {
            if (throwDart(1.0)){
                totalHits++;
            }
        }
        estimatedPi = (4.0 * ((double)totalHits/dartThrows)); //Estimates pi from hits and misses
        return estimatedPi;
    }

    //Runs a number of trials and returns results as an array
    public static double[] getTrialResults(int dartThrows, int trials, double radius){
        double [] trialResults = new double[trials];

        for (int trial = 0; trial < trials; trial++) {
            trialResults[trial] = runTrial(dartThrows);
        }
        return trialResults;
    }

    //Returns average trial result
    public static double getAverageTrialResult(double [] trialResults, int trials){
        double resultSum = 0;

        //adds every result to sum
        for (double result : trialResults){
            resultSum += result;
        }

        //returns average
        return resultSum/trials;
    }

    //Prints results
    public static void printResults(int trials, double[] trialResults, double averageTrialResult){
        for (int trial = 0; trial < trials; trial++) {
            System.out.printf("%10s%2.5f%n","Trial " + (trial + 1) + " : ",trialResults[trial]);
        }
        System.out.println("Average Trial Result: " + averageTrialResult);
    }

    public static void main(String [] args){
        int dartsPerTrial = getDartsPerTrial();
        int trials = getTrials();
        double [] trialResults = getTrialResults(dartsPerTrial, trials, 1.0);
        double averageTrialResult = getAverageTrialResult(trialResults, trials);
        printResults(trials, trialResults, averageTrialResult);
    }
}
