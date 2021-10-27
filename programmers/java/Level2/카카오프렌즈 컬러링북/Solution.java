class Solution {
    // 변수 접근을 위한 전역 변수들.
    static int tempCount = 0;

    // 좌표 변경을 위한 배열
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public int[] solution(int m, int n, int[][] picture) {
        boolean[][] check = new boolean[m][n];
        int areaCount = 0;
        int maxSize = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 모든 원소 탐색
                if (picture[i][j] != 0 && !check[i][j]) {
                    areaCount++;
                    dfs(i, j, picture, check);
                }
                // MAX SIZE 변환
                if (tempCount > maxSize) {
                    maxSize = tempCount;
                }
                // 영역 초기화 진행
                tempCount = 0;
            }
        }

        return new int[]{areaCount, maxSize};
    }

    // DFS 메소드
    public static void dfs(int x, int y, int[][] picture, boolean[][] check) {
        // 방문한 좌표인 경우 종료
        if (check[x][y]) {
            return;
        }
        // 방문 노드 표시
        check[x][y] = true;
        // 현재 방문한 영역의 개수 증가
        tempCount++;

        // DFS 탐색 진행
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 영역에서 벗어나면, 다른 위치로 돌리기
            if (nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) {
                continue;
            }
            // DFS로 탐색 확장
            if (picture[x][y] == picture[nx][ny] && !check[nx][ny]) {
                dfs(nx, ny, picture, check);
            }
        }
    }
}
