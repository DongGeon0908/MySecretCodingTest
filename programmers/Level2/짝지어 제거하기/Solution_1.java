import java.util.Stack;

class Solution_1
{
    public int solution(String s)
    {
        Stack<String> stack = new Stack<String>();

		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty() || !stack.peek().equals(String.valueOf(s.charAt(i)))) {
				stack.push(String.valueOf(s.charAt(i)));
			} else if (stack.peek().equals(String.valueOf(s.charAt(i)))) {
				stack.pop();
			}
		}
        
        if (stack.size() == 0) {
			return 1;
		} else {
			return 0;
		}
    }
}