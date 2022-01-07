// 플루이드 워셜 알고리즘
    public int solution(int n, int[][] results) {
        boolean[][] answer = new boolean[n + 1][n + 1];

        for (int[] result : results) {
            answer[result[0]][result[1]] = true;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (answer[i][k] && answer[k][j]) {
                        answer[i][j] = true;
                    }
                }
            }
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (answer[i][j] || answer[j][i]) {
                    count++;
                }
            }

            if (count == n - 1) {
                result++;
            }
        }
        return result;
    }
