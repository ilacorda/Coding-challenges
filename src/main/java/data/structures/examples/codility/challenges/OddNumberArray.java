package data.structures.examples.codility.challenges;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ilariacorda on 16/07/2017.
 * @project Java-Code-Experiments
 */
public class OddNumberArray {

    public static void main(String args[]) {
        int[] arrayInt = {9, 3, 9, 3, 9, 7, 9};
        int unpaired = OddNumberArray.returnUnpairedOddNumber(arrayInt);
        System.out.println("Print the only unpaired number " + unpaired);
    }


    public static int returnUnpairedOddNumber(int[] Unpaired) {
        //Use Set as they do not accept duplicates
        Set<Integer> numSet = new HashSet<Integer>();
        for (int item : Unpaired) {
            if (!numSet.remove(item)) {
                numSet.add(item);
            }
        }

        if (numSet.size() == 1) {

            return numSet.iterator().next();
        }

        return 0;
    }

}
