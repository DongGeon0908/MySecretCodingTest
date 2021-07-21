class Solution {
    public int solution(String s) {
          int answer = s.length();
        for (int i = 1; i < s.length(); i++) {
            int j = 0;
            String init = "";
            String cnp = "";
            int count = 1;
            while (true) {
                if (j == 0) {
                    init = s.substring(j, j + i);
                    cnp = s.substring(j, j + i);
                    j += i;
                } else if (j + i <= s.length()) {
                    String temp = s.substring(j, j + i);
                    j += i;
                    if (!temp.equals(cnp)) {
                        cnp = temp;

                        if (count > 1) {
                            init = init + count + cnp;
                            count = 1;
                        } else {
                            init += cnp;
                        }
                    } else {
                        count++;
                    }
                } else {
                    if (count > 1) {
                        init = init + count;
                    }
                    init += s.substring(j);
                    break;
                }
            }
            answer = Math.min(init.length(), answer);
        }
        
        return answer;
    }
}
