import java.util.Stack;


class Solution_1 {
    boolean solution(String s) {

       Stack<String> stack = new Stack<String>();

		boolean answer = true;

		for (char c : s.toCharArray()) {
			if (stack.isEmpty() || c == '(') {
				stack.push(String.valueOf(c));
			} else if (stack.isEmpty() && c == ')') {
				answer = false;
				break;
			} else {
				stack.pop();
			}
		}

		if (stack.size() != 0) {
			return false;
		}
        
        return answer;
    }
}