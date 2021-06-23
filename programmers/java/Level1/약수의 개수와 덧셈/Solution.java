class Solution {
   private int RESULT = 0;
	
	public int solution(int left, int right) {
		for (int i = left; i <= right; i++) {

			int k = 0;
			
			for(int j=1; j <= i; j++) {
				k += isDivisor(i, j);
			}

			if(isEven(k)) {
				RESULT += i;
				continue;
			}
			RESULT -=i;
		}
		return RESULT;
	}
	
	private int isDivisor(int num1, int num2) {
		if(num1 % num2 == 0) {
			return 1;
		}
		return 0; 
	}
	
	private boolean isEven(int num) {
		if(num % 2 ==0) {
			return true;
		} 
		return false;
	}
}