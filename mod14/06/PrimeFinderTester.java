/**
 * Author: Aaron H
 * Description: Tests "PrimeFinder" class
 * Date: 7-20-18
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFinderTester
{
    public static void main(String args[])
    {
        //Declare vars
        int lower, upper;
        ArrayList<Integer> primes;

        Scanner scanner = new Scanner(System.in);

        //Prompt user and set lower and upper limit
        System.out.println("Welcome to Prime-Finder. This will calculate all primes within a given range.");
        System.out.println("Enter a lower bound: ");
        lower = scanner.nextInt();
        System.out.println("Enter an upper bound: ");
        upper = scanner.nextInt();

        //Calculate primes with PrimeFinder
        PrimeFinder primeFinder = new PrimeFinder(lower, upper);
        primeFinder.calculatePrimes();
        primes = primeFinder.getPrimes();

        //Display results
        System.out.println("There are " + primes.size() + " prime numbers in the range " + lower + " to " + upper);
        for (int prime : primes)
        {
            System.out.println(prime);
        }
    }
}
