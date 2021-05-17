import java.util.Arrays;

class Solution {
	public String solution(String s) {
		String[] tmp = s.split(" ");

		int[] data = new int[tmp.length];
		for (int i = 0; i < tmp.length; i++) {
			data[i] = Integer.parseInt(tmp[i]);
		}

		Arrays.sort(data);

		return data[0] + " " + data[data.length - 1];
	}
}