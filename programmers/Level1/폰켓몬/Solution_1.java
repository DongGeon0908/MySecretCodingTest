class Solution {
    public int solution(int[] nums) {
        boolean[] data = new boolean[200001];

        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (data[nums[i]] == false) {
                data[nums[i]] = true;
                tmp += 1;
            }
        }

        if (nums.length / 2 <= tmp) {
            return nums.length / 2;
        } else {
            return tmp;
        }
    }
}