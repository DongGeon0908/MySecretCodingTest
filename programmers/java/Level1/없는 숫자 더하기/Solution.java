class Solution {
    public int solution(int[] numbers) {
    
        int result = 45;
        
        for(int num : numbers){
            result -= num;
        }
        
        return result;
    }
}
