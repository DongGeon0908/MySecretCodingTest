public class NumberOfIsland_dfs {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        NumberOfIsland_dfs a = new NumberOfIsland_dfs();

        int m = grid.length;
        int n = grid[0].length;
        System.out.println(a.solve(grid, m, n));
    }


    // DFS == 기본 틀
    private int solve(char[][] grid, int m, int n) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    int m, n;
    int count = 0;
    int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0'; // visited;

        for (int[] dir : dirs) {
            dfs(grid, i + dir[0], j + dir[1]);
        }
    }
    // DFS == 기본 틀
}