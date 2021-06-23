import java.util.PriorityQueue;

class Solution_1 {
    public int solution(int[] scoville, int K) {
       int answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i : scoville) {
			pq.offer(i);
		}

		while (pq.peek() <= K) {
			if (pq.size() == 1) {
				answer = -1;
				break;
			}

			int result = pq.poll() + pq.poll() * 2;

			pq.offer(result);
			answer++;
		}
        
        return answer;
    }
}