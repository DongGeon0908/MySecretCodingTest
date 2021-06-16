class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
		while (isEqual(a,b)) {
			a = solve(a);
			b = solve(b);
			
			answer++;
		}

        return answer;
    }
    
    public boolean isEqual(int num1, int num2){
        if(num1 == num2){
            return false;
        } 
        return true;
    }
    
    public int solve(int num) {
		if (num % 2 == 0) {
			return num / 2;
		}
		return num / 2 + 1;
	}
}