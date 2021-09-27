class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                if (max < sizes[i][j]) {
                    max = sizes[i][j];
                }
            }
        }

        int pair = 0;
        for (int i = 0; i < sizes.length; i++) {
            int tmp = Math.min(sizes[i][0], sizes[i][1]);
            if (tmp > pair) {
                pair = tmp;
            }
        }
        
        return max * pair;
    }
}
