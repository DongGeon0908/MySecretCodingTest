class Solution_1 {
    public String solution(int a, int b) {
        String[] result = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 };

		int day = b - 1;
		for (int i = 0; i < a - 1; i++) {
			day += month[i];
		}

		return result[day % 7];
    }
}