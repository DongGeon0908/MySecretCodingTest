import java.util.ArrayList;
import java.util.List;

class Solution {
    private int[][] dr = {{-1, 0, 1, 0}, {0, -1, 0, 1}};
    private boolean[][][] visited = new boolean[500][500][4];

    public int[] solution(String[] grid) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length(); j++) {
                for (int k = 0; k < 4; k++) {
                    if (!visited[i][j][k]) {
                        final int move = move(grid, i, j, k);
                        result.add(move);
                    }
                }
            }
        }
        return result.stream()
            .sorted()
            .mapToInt(i -> i)
            .toArray();
    }

    private int move(String[] grid, int x, int y, int direction) {
        int moveLength = 0;
        while (!visited[x][y][direction]) {

            moveLength++;
            visited[x][y][direction] = true;

            if (grid[x].charAt(y) == 'L') {
                if (direction == 0) {
                    direction = 3;
                } else {
                    direction -= 1;
                }
            } else if (grid[x].charAt(y) == 'R') {
                if (direction == 3) {
                    direction = 0;
                } else {
                    direction += 1;
                }
            }

            x = (x + dr[0][direction] + grid.length) % grid.length;
            y = (y + dr[1][direction] + grid[0].length()) % grid[0].length();
        }
        return moveLength;
    }
}
