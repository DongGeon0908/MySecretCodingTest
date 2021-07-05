class Solution {
    public int[] solution(int brown, int yellow) {

            int[] result = new int[2];
        int sum = brown + yellow;

        for (int row = sum; row >= 3; row--) {
            if (sum % row == 0) {
                int col = sum / row;

                int doYellow = (col - 2) * (row - 2);

                if (yellow == doYellow) {
                    result[0] = row;
                    result[1] = col;
                    break;
                }

            }
        }
        return result;
    }
}