import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

		// ds
		Map<String, Integer> data = new HashMap<>();
		int[] part = new int[n];

		int cnt = 0;
		for (int i = 0; i < words.length; i++) {
			if (cnt == n) {
				cnt = 0;
			}
			if (words[i].length() == 1) {
				break;
			}

			if (i != 0) {
				if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
					break;
				}
			}

			if (data.containsKey(words[i])) {
				break;
			} else {
				data.put(words[i], cnt);
				part[cnt++]++;
			}
		}

		if (cnt == n) {
			answer[0] = 0;
			answer[1] = 0;
		} else {
			answer[0] = cnt + 1;
			answer[1] = part[cnt] + 1;
		}
        


        return answer;
    }
}