/* TwoSum
 * 
 * 배열에서 있는 값을 이용해서 타겟을 만들 수 있는지
 * 
 * 이중 for문을 사용해서 데이터값이 맞는지 비교하고, 맞으면 break;
 */
public class TwoSum_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		int[] nums = { 2, 8, 11, 14 };
		int target = 16;

		undo: for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					if (nums[i] + nums[j] == target) {
						System.out.println((i + 1) + " " + (j + 1));
						break undo;
					}
				}
			}
		}
	}
}
