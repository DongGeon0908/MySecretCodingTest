import java.util.ArrayDeque;
import java.util.Deque;


class Solution_1 {
    public int solution(int[][] board, int[] moves) {
int answer = 0;

		Deque<Integer> data = new ArrayDeque<Integer>();
		for (int i = 0; i < moves.length; i++) {

			// 크레인이 가는 위치
			int loc = moves[i] - 1;

			for (int j = 0; j < board.length; j++) {
				if (board[j][loc] != 0) {
					if (data.size() == 0) {
						data.addLast(board[j][loc]);
						board[j][loc] = 0;
					} else {
						if (data.getLast() == board[j][loc]) {
							data.removeLast();
							board[j][loc] = 0;
							answer += 2;
						} else {
							data.addLast(board[j][loc]);
							board[j][loc] = 0;
						}
					}
					break;
				}
			}

		}

		return answer;
    }
}