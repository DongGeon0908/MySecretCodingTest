import java.util.LinkedList;
import java.util.Queue;


public class MaxOfIsland {
    public static void main(String[] args) {
        int[][] input = {
                {1, 1, 0, 1, 1},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

        int answer = new MaxOfIsland().maxAreaOfIsland(input);
        System.out.println(answer);
    }

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m, n;

    public int maxAreaOfIsland(int[][] grid) {
        // 1
        if (grid == null || grid.length == 0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, 0);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    int dfs(int[][] grid, int x, int y, int area) {
        // 1
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0) {
            return area;
        }

        // 2
        grid[x][y] = 0;
        area++;

        for (int[] dir : dirs) {
            area = dfs(grid, x + dir[0], y + dir[0], area);
        }
        return area;
    }

}
