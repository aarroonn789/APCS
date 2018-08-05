/**
 * Author: Aaron H
 * Description: Finds prime numbers
 * Date: 7-20-18
 */

import java.util.ArrayList;

public class PrimeFinder
{
    //Declare instance vars
    private int lowerLimit, upperLimit;

    private ArrayList<Integer> primes = new ArrayList<Integer>();

    //Constructor requires lowerLimit and upperLimit
    public PrimeFinder(int lowerLimit, int upperLimit)
    {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    //Getter method for primes ArrayList
    public ArrayList<Integer> getPrimes() {
        return this.primes;
    }

    //Calculates list of primes for primes ArrayList
    public void calculatePrimes()
    {
        for (int i = lowerLimit; i < upperLimit; i++)
        {
            if(isPrime(i))
            {
                this.primes.add(i);
            }
        }
    }

    //Checks if given int num is prime
    private boolean isPrime(int num)
    {
        if(num == 1)
        {
            return false;
        }
        else
        {
            boolean notPrime = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    notPrime = true;
                }
            }
            return !notPrime;
        }
    }
}
