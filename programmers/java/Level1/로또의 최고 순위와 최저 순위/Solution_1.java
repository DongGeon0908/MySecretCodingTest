class Solution_1 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int win = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zero++;
            } else {
                for (int j = 0; j < 6; j++) {
                    if (lottos[i] == win_nums[j]) {
                        win++;
                        break;
                    }
                }
            }
        }
        if (zero == 0 && win == 0) {
            int[] result = { 6, 6 };
            return result;
        } else {
            int[] result = { (6 - zero - win + 1), win == 0 ? (6 - win) : (6 - win + 1) };
            return result;
        }


    }
}