import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
		Queue<Print> queue = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			queue.offer(new Print(priorities[i], i));
		}

		int answer = 0;
		while (!queue.isEmpty()) {
			boolean check = false;
			int currentPrint = queue.peek().getImportance();

			for (Print print : queue) {
				if (currentPrint < print.getImportance()) {
					check = true;
                    break;
				}
			}

			if (check) {
				queue.offer(queue.poll());
			} else {
				if (queue.poll().getOrder() == location) {
					answer = priorities.length - queue.size();
				}
			}

		}

		return answer;
	}

	class Print {
		private int importance;
		private int order;

		public Print(int importance, int order) {
			this.importance = importance;
			this.order = order;
		}

		public int getImportance() {
			return this.importance;
		}

		public int getOrder() {
			return this.order;
		}

	}
}
