class Solution_5 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[][] student = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        int check[] = new int[3];

        //정답 수 체크 
        for(int i=0; i<answers.length; i++) {
            for(int j =0; j<3; j++) {               
                if(answers[i]==student[j][i%student[j].length])
                    check[j]++; 
            }
        }

        //최대수 구하기 
        int temp = 0;
        for(int i=0; i<check.length; i++)
            if(temp<check[i])   temp = check[i];

        int size = 0;
        for(int i=0;i<check.length; i++) if(check[i]==temp) size++;

        answer = new int[size];
        int num = 0;
        for(int i=0; i<check.length; i++) {
            if(check[i]==temp) {
                answer[num] = i+1;
            num++;
            }
        }
        return answer;
    }
}