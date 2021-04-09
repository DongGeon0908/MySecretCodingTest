class Solution {
    public int[] solution(int n, int m) {
        
        int[] result = new int[2];
		
		result[0] = n > m ? GCD(n, m) : GCD(m, n);
		result[1] = n > m ? LCM(n, m) : LCM(m, n);
		
		return result;
    
    }
    
    // 최대공약수
	public static int GCD(int x, int y) {
		if (x % y == 0) {
			return y;
		}
		return GCD(y, x % y);
	}

	// 최소공배수
	public static int LCM(int x, int y) {
		return x * y / GCD(x, y);
	}
}