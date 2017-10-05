package data.structures.examples.hackerRank.challenges;

import java.util.Scanner;

/**
 * @author ilariacorda on 10/07/2017.
 * @project Java-Code-Experiments
 * Print a reversed array
 */
public class HackerRankPrintReversedArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        HackerRankPrintReversedArray.printReversed(arr);
    }

    private static void printReversed(int inputArray[]) {
        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
