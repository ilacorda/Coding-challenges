package data.structures.examples.leetcode.challenges;

/**
 * @author ilariacorda on 14/07/2017.
 * @project Java-Code-Experiments
 * Check whether an integer is a Palindrome
 */
public class PalindromeInteger {

    public static void main(String args[]) {
        int num = 121;
        boolean palindrome = isPalindrome(num);
        System.out.println("is " + num + " a palindrome = " + palindrome);

    }

    public static boolean isPalindrome(int x) {
        String convertedInt = String.valueOf(x);
        StringBuilder sb = new StringBuilder(convertedInt);
        String revertedString = sb.reverse().toString();
        return convertedInt.equals(revertedString);

    }
}
