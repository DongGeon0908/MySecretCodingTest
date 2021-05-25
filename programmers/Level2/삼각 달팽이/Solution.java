class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
		int x = -1;
		int y = 0;
		int tmp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (i % 3 == 0) {
					x++;
				} else if (i % 3 == 1) {
					y++;
				} else if (i % 3 == 2) {
					x--;
					y--;
				}
				arr[x][y] = ++tmp;
			}
		}
		int[] answer = new int[tmp];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					break;
				}
				answer[k++] = arr[i][j];
			}
		}
        return answer;
    }
}