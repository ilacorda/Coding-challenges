/*
 * Task:
 *
 * Given an integer, , perform the following conditional actions:
 * If  is odd, print Weird
 * If  is even and in the inclusive range of 2 to 5 , print Not Weird
 * If  is even and in the inclusive range of 6 to 20 , print Weird
 * If  is even and greater than 20 print Not Weird
 */


package data.structures.examples.hackerRank.challenges;

import java.util .*;

public class HackerRankIfElseChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0) {
            System.out.println("Weird");
        }
        if (N % 2 == 0 && isNumWithinRange(N, 2, 5)) {
            System.out.println("Not Weird");
        }
        if (N % 2 == 0 && isNumWithinRange(N, 6, 20)) {
            System.out.println("Not Weird");
        }
        if ((N % 2 == 0) && (N > 20)) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }

    private static boolean isNumWithinRange(int i, int minValueInclusive, int maxValueInclusive) {
        return (i >= minValueInclusive && i <= maxValueInclusive);
    }

}
