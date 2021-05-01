import java.util.*;
class Solution_3 {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }

        return nums.length/2 > list.size() ? list.size() : nums.length/2;
    }
}