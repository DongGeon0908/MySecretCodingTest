class Solution {
    public int solution(int n) {
        int result = 0;
		for (int i = 1; i <= n; i++) {

			int temp = 0;
			for (int j = i; j <= n; j++) {
				temp += j;

				if (temp == n) {
					result++;
				}

				if (temp > n) {
					break;
				}
			}
		}
        return result;
    }
}