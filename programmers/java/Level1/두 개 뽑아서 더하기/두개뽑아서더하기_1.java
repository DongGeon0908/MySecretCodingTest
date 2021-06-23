import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> tmp = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j) {
					tmp.add(numbers[i] + numbers[j]);
				}
			}
		}

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int item : tmp) {
			if (!arrayList.contains(item))
				arrayList.add(item);
		}

		int[] answer = new int[arrayList.size()];

		int t = 0;
		for (int k : arrayList) {
			answer[t++] = k;
		}

		Arrays.sort(answer);
        
        return answer;
    }
}