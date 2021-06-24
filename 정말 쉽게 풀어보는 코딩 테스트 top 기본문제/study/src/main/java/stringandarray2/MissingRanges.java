package stringandarray2;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 50, 75};
        int lower = 0;
        int upper = 99;

        System.out.println(solve(nums, lower, upper));
    }

    private static List<String> solve(int[] nums, int lower, int upper) {

        // 1 -> 예외처리
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        // 2 - 1 -> 초기값이 어떤지 확인
        if (lower < nums[0]) {
            result.add(makeRange(lower, nums[0] - 1));
        }

        // 2 - 2 -> 중간 값 처리
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1] && nums[i] + 1 < nums[i + 1]) {
                result.add(makeRange(nums[i] + 1, nums[i + 1] - 1));
            }
        }

        // 2 - 3 -> 마지막 값 처리
        if (nums[nums.length - 1] < upper) {
            result.add(makeRange(nums[nums.length - 1] + 1, upper));
        }

        return result;
    }

    private static String makeRange(int low, int high) {
        if (low == high) {
            return String.valueOf(low);
        }
        return low + "->" + high;
    }
}
