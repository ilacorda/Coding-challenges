package data.structures.examples.leetcode.challenges;

import java.util.Arrays;
import java.util.List;

import static data.structures.examples.leetcode.challenges.RomanToInteger.RomanToIntegerConversion.*;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "III"
 * Output: 3
 * Example 2:
 * <p>
 * Input: s = "IV"
 * Output: 4
 * Example 3:
 * <p>
 * Input: s = "IX"
 * Output: 9
 * Example 4:
 * <p>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 * <p>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */


public class RomanToInteger {
    static List<RomanToIntegerConversion> enumList = Arrays.asList(RomanToIntegerConversion.values());


    public static void main(String[] args) {
        int result = romanToInt("III");
        System.out.println(result);
        
    }

    enum RomanToIntegerConversion {
        I('I', 1),
        V('V', 5),
        X('X', 10),
        L('L', 50),
        C('C', 100),
        D('D', 500),
        M('M', 1000);

        private final int romanInt;
        private final char romanLiteral;

        RomanToIntegerConversion(char c, int intCode) {
            this.romanLiteral = c;
            this.romanInt = intCode;

        }

        public static RomanToIntegerConversion getRomanLiteral(char ch) {
            for (RomanToIntegerConversion conversion : enumList) {
                if (ch == conversion.romanLiteral) {
                    return conversion;
                }
            }
            return null;
        }

        public int getRomanInt() {
            return romanInt;
        }

        public RomanToIntegerConversion precursor() {
            switch (this) {
                case V:
                case X:
                    return I;
                case L:
                case C:
                    return X;
                case D:
                case M:
                    return C;
                case I:
                default:
                    return null;
            }
        }

        public static int romanToInt(String str) {
            int result = 0;
            // Sanity checks
            if (str.isEmpty() || str.isBlank()) {
                return 0;
            }
            char[] chars = str.toCharArray();
            int index = chars.length - 1;
            while (index >= 0) {
                RomanToIntegerConversion romanEnums = getRomanLiteral(chars[index]);
                RomanToIntegerConversion preEnums = index > 0
                        ? getRomanLiteral(chars[index - 1]) : null;
                if (preEnums != null && preEnums == romanEnums.precursor()) {
                    result += romanEnums.getRomanInt() - preEnums.getRomanInt();
                    index -= 2;
                } else {
                    assert romanEnums != null;
                    result += romanEnums.getRomanInt();
                    index--;
                }
            }

            return result;
        }
    }
}

