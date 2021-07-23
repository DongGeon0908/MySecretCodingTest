class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }
    
    public int dfs(int[] numbers,int max,int sum,int target){
        if (max == numbers.length) {
            if (target == sum) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return dfs(numbers, max + 1, sum + numbers[max], target) +
                    dfs(numbers, max + 1, sum - numbers[max], target);
        }
    }
}
