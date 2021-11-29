package data.structures.examples.leetcode.challenges;

import java.util.HashSet;

public class FindMissingPositive {

    public static int identifyMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return nums.length + 1;

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 4};

        int findInt = identifyMissingPositive(array);

        System.out.println("Found positive integer " + findInt);

    }
}

