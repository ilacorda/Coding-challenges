package data.structures.examples.other.challenges;

/*
 * Collection of the most used String methods -  not exhaustive
 */

public class StringOperations {

    private static String test_string = "This is a string for testing";
    private static String another_test_string = "and another string";

    public static void main(String[] args) {

        //Return char values from a String
        char ch = test_string.charAt(1);
        System.out.println("Character at position 1 " + ch);

        //Substring logic
        String substring = test_string.substring(2);
        System.out.println("Substring at position 2 " + substring);

        //Substring with
        String substring_with_range = test_string.substring(0, 5);
        System.out.println("Substring between position 0 and 5 " + substring_with_range);

        //Contains
        Boolean doesItContainsSuchCharacter = test_string.contains("z");
        System.out.println("The character is not contained in the provided string " + doesItContainsSuchCharacter);

        //Concat string
        String concatenated_strings = test_string.concat(another_test_string);
        System.out.println("The concatenated string is  " + concatenated_strings);

        //Replace values in strings
        char another_ch = test_string.charAt(2);
        String replace_values_in_string = test_string.replace(ch, another_ch);
        System.out.println("The string with the replaced char is  " + replace_values_in_string);

        //Returns the interned String
        String internedString = test_string.intern();
        System.out.println("Return interned String " + internedString);

    }
}
