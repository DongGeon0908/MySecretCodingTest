import java.util.HashMap;
import java.util.Map;

/* TwoSum
 * - Map + String(getOrDefault())
 * - Map + Array
 * - Map + Math.max
 * - Map + Set
 * - Map + Map
 * - Set + Set
 * 
 * 배열에서 있는 값을 이용해서 타겟을 만들 수 있는지
 * 이중 for문을 사용해서 데이터값이 맞는지 비교하고, 맞으면 break;
 */
public class TwoSum_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		int[] nums = { 2, 8, 11, 14 };
		int target = 16;

		int[] result = solve(nums, target);

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	public static int[] solve(int[] nums, int target) {
		// 1. 데이터를 담을 그릇 생성
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		// 2. 결과값 구하기
		for (int i = 0; i < nums.length; i++) {

			// map안에 num값이 저장되어 있다며
			if (map.containsKey(nums[i])) {
				int value = map.get(nums[i]);
				result[0] = value + 1;
				result[1] = i;
				break;
			} else {
				map.put(target - nums[i], i);
			}
		}

		return result;

	}
}
