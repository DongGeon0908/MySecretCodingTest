class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] tmp = Integer.toString(x).split("");
        int cnp = 0;
		for (int i = 0; i < tmp.length; i++) {
			cnp = cnp + Integer.parseInt(tmp[i]);
		}
        
        if(x%cnp != 0){
            answer = false;
        }
        return answer;
    }
}