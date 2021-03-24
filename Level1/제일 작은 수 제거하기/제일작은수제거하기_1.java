import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
			int[] answer = { -1 };
			return answer;
		} else {
			int[] answer = new int[arr.length - 1];
			int min = arr[0];
			int tmp = 0;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] <= min) {
					min = arr[i];
					tmp = i;
				}
			}
			
			int j=0;
			for(int i=0; i < arr.length; i++) {
				if(tmp != i) {
					answer[j] = arr[i];
					j++;
				}
			}
			return answer;
		}
    }
}