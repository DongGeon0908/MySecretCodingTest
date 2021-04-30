class Solution_1 {
    public int solution(int n) {
        
        String result = "";
        while (n > 0) {
			result = (n % 3) + result;
			n = n / 3;
		}
        
        StringBuffer sb = new StringBuffer(result);
		result = sb.reverse().toString();
        
        return Integer.parseInt(result, 3);
        
    }
}