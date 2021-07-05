package QueueAndStack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(solve(str));

    }

    private static boolean solve(String str) {
        // 1
        Stack<Character> stack = new Stack<>();

        // 2
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (str.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (str.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
