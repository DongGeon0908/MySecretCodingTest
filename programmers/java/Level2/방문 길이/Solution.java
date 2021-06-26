class Solution {
    public int solution(String dirs) {
        int[][][][] loc = new int[11][11][11][11];

        String[] input = dirs.split("");

        int x = 5;
        int y = 5;

        int result = 0;
        for (int i = 0; i < input.length; i++) {
            int tmpx = x;
            int tmpy = y;

            if (input[i].equals("U")) {
                tmpy++;
            } else if (input[i].equals("D")) {
                tmpy--;
            } else if (input[i].equals("L")) {
                tmpx--;
            } else {
                tmpx++;
            }

                        if (tmpx < 0 || tmpx > 10) {
                continue;
            }


            if (tmpy < 0 || tmpy > 10) {
                continue;
            }
            
            if (loc[x][y][tmpx][tmpy] != 1) {
                loc[x][y][tmpx][tmpy] = 1;
                loc[tmpx][tmpy][x][y] = 1;
                result++;
            }

            x = tmpx;
            y = tmpy;
        }
        return result;
    }
}