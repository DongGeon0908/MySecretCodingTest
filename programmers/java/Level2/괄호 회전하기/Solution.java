

import java.util.*;


class Solution {
    public int solution(String s) {
       Queue<Character> temp = new LinkedList<>();
        for (Character chars : s.toCharArray()) {
            temp.add(chars);
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            Stack<String> stack = new Stack<>();

            boolean answer = true;

            for (char c : temp) {
                if (stack.isEmpty() || (c == '(' || c == '{' || c == '[')) {
                    stack.push(String.valueOf(c));
                } else if (stack.isEmpty() && (c == ')' || c == ']' || c == '}')) {
                    answer = false;
                    break;
                } else {
                    if (stack.peek().equals("(") && c == ')') {
                        stack.pop();
                    } else if (stack.peek().equals("{") && c == '}') {
                        stack.pop();
                    } else if (stack.peek().equals("[") && c == ']') {
                        stack.pop();
                    }
                }
            }

            if (stack.size() != 0) {
                answer = false;
            }

            if (answer) {
                result++;
            }

            Character cnp = temp.poll();
            temp.add(cnp);

        }
        return result;
    }
}
