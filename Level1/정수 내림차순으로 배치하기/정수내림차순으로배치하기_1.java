import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        
        String[] tmp = Long.toString(n).split("");
		
		Arrays.sort(tmp,Collections.reverseOrder());
	
		String cnp = "";
		for(String i : tmp) {
			cnp = cnp + i;
		}
		
		long answer = Long.parseLong(cnp);
        
        return answer;
    }
}