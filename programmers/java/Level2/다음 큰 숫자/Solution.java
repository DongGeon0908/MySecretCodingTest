class Solution {
    public int solution(int n) {
        		String data = Integer.toBinaryString(n);

		int count = 0;

		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == '1') {
				count++;
			}
		}

		int result = 0;
		for (int i = n + 1; i <= 1000000; i++) {
			String tmp = Integer.toBinaryString(i);
			int cnt = 0;
			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.charAt(j) == '1') {
					cnt++;
				}

				if (cnt > count) {
					break;
				}
			}

			if (count == cnt) {
				result = i;
				break;
			}
		}
        
        return result;
    }
}