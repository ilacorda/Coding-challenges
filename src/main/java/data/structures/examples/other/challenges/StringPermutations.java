package data.structures.examples.other.challenges;

public class StringPermutations {

    public static void main(String[] args) {
        String s = "aytr";
        printPermutn(s, "");
    }


    // Function to print all the permutations of str
    static void printPermutn(String str, String perm) {

        // If string is empty
        if (str.length() == 0 || str == null) {
            System.out.print(perm + " ");
            return;

        }

        for (int i = 0; i < str.length(); i++) {

            // /We fix one character in the string to allow permutation to begin
            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            printPermutn(ros, perm + ch);
        }
    }
}
