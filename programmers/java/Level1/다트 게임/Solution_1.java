import java.util.ArrayDeque;
import java.util.Deque;

class Solution_1 {
    public int solution(String dartResult) {
        int[] result = new int[3];

		Deque<String> data = new ArrayDeque<String>();

		for (int i = 0; i < dartResult.length(); i++) {
			data.addLast("" + dartResult.charAt(i));
		}

		for (int i = 0; i < 3; i++) {
			String n = data.removeFirst();
			if (data.getFirst().equals("0")) {
				n += data.removeFirst();
			}

			String bonus = data.removeFirst();

			if (bonus.equals("S")) {
				result[i] = Integer.parseInt(n);
			} else if (bonus.equals("D")) {
				result[i] = (int) Math.pow(Integer.parseInt(n), 2);
			} else if (bonus.equals("T")) {
				result[i] = (int) Math.pow(Integer.parseInt(n), 3);
			}

			if (data.size() != 0) {
				if (data.getFirst().equals("#")) {
					result[i] *= (-1);
					data.removeFirst();
				} else if (data.getFirst().equals("*")) {
					if (i != 0) {
						result[i - 1] *= 2;
						result[i] *= 2;
					} else {
						result[0] *= 2;
					}
					data.removeFirst();
				}
			}
		}

		int end = 0;
		for (int i : result) {
			end += i;
		}
        return end;
    }
}