import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_bfs {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        NumberOfIsland_bfs a = new NumberOfIsland_bfs();

        int m = grid.length;
        int n = grid[0].length;
        System.out.println(a.solve(grid, m, n));
    }


    // BFS == 기본 틀
    private int solve(char[][] grid, int m, int n) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    int m, n;
    int count = 0;
    int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    private void bfs(char[][] grid, int i, int j) {
        grid[i][j] = '0'; // visited;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] dir : dirs) {
                int temp_i = cur[0] + dir[0];
                int temp_j = cur[1] + dir[1];

                if (temp_i >= 0 && temp_i < m && temp_j >= 0 && temp_j < n && grid[temp_i][temp_j] == '1') {
                    grid[temp_i][temp_j] = '0';
                    queue.offer(new int[]{temp_i, temp_j});
                }
            }


        }
    }
// BFS == 기본 틀
}
