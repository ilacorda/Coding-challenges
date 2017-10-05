package data.structures.examples.codility.challenges;

/**
 * @author ilariacorda on 16/07/2017.
 * @project Java-Code-Experiments
 */
public class BinaryGap {
    public int solution(int N) {
        // conver the integer into a binary representation
        int binaryGap = 0;
        String binRep = Integer.toBinaryString(N);
        //Convert the string with the binary representation to an array of characters
        char[] stringToCharacters = binRep.toCharArray();
        int j = 0;
        //Loop through each character in the binary representation
        //and increase at each 0 encountered
        for (Character chr : stringToCharacters) {
            if (chr.equals('0')) {
                j++;
            }
            if (chr.equals('1')) {
                if (j > binaryGap) {
                    binaryGap = j;
                }
                j = 0;
            }
        }
        return binaryGap;
    }
}

