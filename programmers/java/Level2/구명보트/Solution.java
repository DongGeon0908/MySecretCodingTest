import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < people.length; i++) {
            queue.addFirst(people[i]);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int temp = queue.poll();

            while (!queue.isEmpty()) {
                if (temp + queue.peekLast() > limit) {
                    break;
                }
                temp += queue.pollLast();
            }
            count++;
        }
        return count;
    }
}
