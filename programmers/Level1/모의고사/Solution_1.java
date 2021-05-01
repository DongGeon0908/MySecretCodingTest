class Solution_1 {
    public int[] solution(int[] answers) {
        int[] answerA = { 1, 2, 3, 4, 5 };
        int[] answerB = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] answerC = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] check = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answerA[i % answerA.length] == answers[i]) {
                check[0]++;
            }

            if (answerB[i % answerB.length] == answers[i]) {
                check[1]++;
            }

            if (answerC[i % answerC.length] == answers[i]) {
                check[2]++;
            }
        }

        if (check[0] == check[1] && check[1] == check[2]) {
            int[] answer = { 1, 2, 3 };
            return answer;
        } else if (check[0] == check[1] && check[1] != check[2] && check[0] > check[2]) {
            int[] answer = { 1, 2 };
            return answer;
        } else if (check[0] != check[1] && check[1] == check[2] && check[1] > check[0]) {
            int[] answer = { 2, 3 };
            return answer;
        } else if (check[0] == check[2] && check[0] != check[1] && check[0] > check[1]) {
            int[] answer = { 1, 3 };
            return answer;
        } else if (check[0] > check[1] && check[0] > check[2]) {
            int[] answer = { 1 };
            return answer;
        } else if (check[1] > check[0] && check[1] > check[2]) {
            int[] answer = { 2 };
            return answer;
        } else {
            int[] answer = { 3 };
            return answer;
        }
    }
}
