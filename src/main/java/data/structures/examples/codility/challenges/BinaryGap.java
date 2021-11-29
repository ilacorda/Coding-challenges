package data.structures.examples.codility.challenges;

/**
 * @author ilariacorda on 16/07/2017.
 * @project Java-Code-Experiments
 */

public class BinaryGap {
	public int solution(int N) {
		// convert the integer into a binary representation
		int binaryGap = 0;
		var binRep = Integer.toBinaryString(N);
		// Convert the string with the binary representation to an array of characters
		char[] stringToCharacters = binRep.toCharArray();
		int j = 0;
		// Loop through each character in the binary representation
		// and increase at each 0 encountered
		for (int i = 0, stringToCharactersLength = stringToCharacters.length; i < stringToCharactersLength; i++) {
			Character chr = stringToCharacters[i];
			if (chr == '0') {
				j++;
			}
			if (chr == '1') {
				if (j > binaryGap) {
					binaryGap = j;
				}
				j = 0;
			}
		}
		return binaryGap;
	}
}
