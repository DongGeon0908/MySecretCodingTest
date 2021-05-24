
// 연속 구간합 구하기 문제!!
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(solve(nums));
	}

	private static int solve(int[] nums) {
		// TODO Auto-generated method stub

		// 1
		int newSum = nums[0]; // 새로운 값
		int max = nums[0]; // 기존 Max값

		// 2 - 구간 설정 주의하기!!
		for (int i = 1; i < nums.length; i++) {
			newSum = Math.max(nums[i], newSum + nums[i]);
			max = Math.max(newSum, max);
		}

		return max;
	}

}
