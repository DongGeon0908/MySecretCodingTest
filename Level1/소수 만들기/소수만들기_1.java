class Solution {
    public int solution(int[] nums) {
        int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[j] == nums[i]) {
					continue;
				}

				for (int k = j; k < nums.length; k++) {
					if (nums[k] == nums[i] || nums[k] == nums[j]) {
						continue;
					}
					
					// 각각 서로 다른 값
					int tmp = nums[i] + nums[j] + nums[k];

					// 소수인지 판별하기
					boolean check = true;
					for (int l = 2; l < tmp; l++) {
						if (tmp % l == 0) {
							check = false;
						}
					}
					
					
					// 소수이면 result + 1
					if (check == true) {
						System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
						result = result + 1;
					}

				}
			}
		}
        
        return result;
    }
}
/*
 * 더 효율적인 코드를 찾고 싶은데, 대부분의 사람들이 이와 비슷한 방식으로 구현함
 * 
 * 
 * */
 */