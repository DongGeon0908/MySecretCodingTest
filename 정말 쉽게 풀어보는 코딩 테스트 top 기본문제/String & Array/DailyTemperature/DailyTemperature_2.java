/* DailyTemperature
 * 해당 문제는 오늘 날짜의 온도보다 높은 온도가 나오는 미래의 날짜까지의 차를 구하는 문제이다.
 * 
 */

public class DailyTemperature_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };

		int[] result = solve(nums);

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	public static int[] solve(int[] nums) {
		// 1. 데이터를 담을 그릇 생성
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					result[i] = j - i;
					break;
				}
			}
		}

		return result;

	}
}
