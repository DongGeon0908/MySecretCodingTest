import java.util.*;


class Solution {
    public String solution(int[][] scores) {
        int[][] newScores = new int[scores.length][scores.length];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                newScores[j][i] = scores[i][j];
            }
        }

        String answer = "";
        for (int i = 0; i < scores.length; i++) {
            int[] temp = newScores[i];

            double result = 0;
            int count = 0;
            for (int j = 0; j < scores.length; j++) {
                if (temp[i] == temp[j]) {
                    count++;
                }
                result += temp[j];
            }

            Arrays.sort(temp);
            
            int divideNum = scores.length;
            if (count == 1 && (scores[i][i] == temp[0] || scores[i][i] == temp[scores.length - 1])) {
                divideNum -= 1;
                result -= scores[i][i];
            }
            result /= divideNum;


            if (result >= 90) {
                answer += "A";
            } else if (result >= 80) {
                answer += "B";
            } else if (result >= 70) {
                answer += "C";
            } else if (result >= 50) {
                answer += "D";
            } else {
                answer += "F";
            }
        }
        
        return answer;
    }
}
