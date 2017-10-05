package data.structures.examples.codility.challenges;

/**
 * @author ilariacorda on 11/08/2017.
 * @project Java-Code-Experiments
 * Reverse string by splitting the string after each space and reverting each of the token
 */

public class ReverseStringWithSpaces {

    public static void main(String[] args) {

        String S = "we test coders";

        String revertedString = ReverseStringWithSpaces.reverseStringWithSpace(S);
        System.out.println(revertedString);

    }

    public static String reverseStringWithSpace(String S) {
        //Splitting the string after each space
        String[] splittedString = S.split("\\s");
        for (int i = 0; i < splittedString.length; i++) {
            System.out.println(splittedString[i]);
        }
        StringBuilder stringBuild = new StringBuilder();
        for (String str : splittedString) {
            stringBuild.append(new StringBuffer(str).reverse());
            stringBuild.append(' ');
        }
        return stringBuild.toString().trim();
    }
}

