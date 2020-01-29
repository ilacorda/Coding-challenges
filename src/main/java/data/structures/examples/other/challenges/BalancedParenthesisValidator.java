package data.structures.examples.other.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * 1) create a Stack
 * 2) use loop to iterate one by one character in the expression.
 * 3) if character is not a symbol ignore it.
 * 4) if character is symbol i.e. opening symbol i.e. either ( or { or [ , push it into Stack.
 * 5) if character is closing symbol i.e. either ) or } ] , pop it from stack and match correspondingly.
 * if matched then return true else false.
 */

public class BalancedParenthesisValidator {

    public static boolean isValid(String str) {
        if (str.isEmpty()) {
            return true;
        }

        //Create stack to employ the LIFO approach
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }


            } else if (ch == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }


            } else if (ch == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.empty();

    }

    public static void main(String args[]) {
        String valid_parenthesis = "{[()]}";
        String invalid_parenthesis = "{[(]}";

        Boolean isValidParenthesis = isValid(valid_parenthesis);
        System.out.println(isValidParenthesis);

        Boolean isInvalidParenthesis = isValid(invalid_parenthesis);
        System.out.println(isInvalidParenthesis);


    }
}
