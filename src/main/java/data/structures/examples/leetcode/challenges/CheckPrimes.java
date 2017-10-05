package data.structures.examples.leetcode.challenges;

import java.math.BigInteger;

/**
 * @author ilariacorda on 09/08/2017.
 * @project Java-Code-Experiments
 * Check whether a number is a prime via BigInteger
 */
public class CheckPrimes {

    public static void main(String[] args) {

        int[] primeNum = {3, 4, 7, 8, 1};

        boolean isPrime = CheckPrimes.isPrime(primeNum[0]);

        System.out.println("is this a prime number " + isPrime);


    }

    private static boolean isPrime(int num) {

        BigInteger bigInteger = BigInteger.valueOf(num);

        return bigInteger.isProbablePrime(num);

    }
}
