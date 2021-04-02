import java.util.*;

class Solution {
  public int solution(int[] d, int budget) {
      int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget = budget - d[i];

            if (budget < 0) {
            	break;
            }

            answer = answer + 1;
        }

        return answer;
  }
}

/* 내가 처음에 생각했던 방식은
 * 배열에 들어있는 값을 하나씩 뺴와서 더하는 방식이었다. 
 * 하지만 해당 코드는 budget 값에 배열에 들어있는 값을 하나씩 제외시켜주는 방식이다.
 * 코드가 간결하다..
 * 
 * /
