class Solution {
    public int solution(int n) {
        int num = 0;
		int result = 1;

		for (int i = 0; i < n - 1; i++) {
			int tmp = num % 1234567;
			num = result % 1234567;
			result = (tmp + result) % 1234567;
		}
        return result;
    }
}