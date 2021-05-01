import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] tmp = Integer.toString(n).split("");
        
        for (int i = 0; i < tmp.length; i++) {
            answer = answer + Integer.parseInt(tmp[i]); 
		}

        return answer;
    }
}