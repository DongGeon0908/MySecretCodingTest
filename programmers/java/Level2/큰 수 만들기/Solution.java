import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < number.length(); i++) {
            int temp = number.charAt(i) - '0';

            while (!deque.isEmpty()) {
                if (temp <= deque.peekLast() || k == 0) {
                    break;
                }
                deque.pollLast();
                k--;
            }
            deque.addLast(temp);
        }

        StringBuilder result = new StringBuilder();
        int count = deque.size() - k;
        for (int i = 0; i < count; i++) {
            result.append(deque.pollFirst());
        }
        
        return result.toString();
    }
}
