import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> dq = new ArrayDeque<>();

		for (int i = 0; i < progresses.length; i++) {
			dq.addLast((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
		}

		ArrayList<Integer> data = new ArrayList<Integer>();

		while (dq.size() != 0) {
			int tmp = dq.removeFirst();

			int check = 1;
			while (dq.size() != 0) {
				int cnp = dq.peek();

				if (tmp >= cnp) {
					check++;
					dq.remove();
				} else {
					break;
				}
			}

			data.add(check);
		}

		int[] answer = new int[data.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = data.get(i);
		}
        return answer;
    }
}