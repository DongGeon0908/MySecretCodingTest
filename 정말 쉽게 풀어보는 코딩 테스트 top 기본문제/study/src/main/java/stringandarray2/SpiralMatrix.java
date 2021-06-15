package stringandarray2;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println(spiralOrder(nums));
    }

    private static List<Integer> spiralOrder(int[][] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums.length == 0 || nums == null) {
            return result;
        }

        int rowStart = 0;
        int rowEnd = nums.length - 1;
        int colStart = 0;
        int colEnd = nums[0].length - 1;

        while (rowStart < rowEnd && colStart < colEnd) {

            for (int i = colStart; i <= colEnd; i++) {
                result.add(nums[rowStart][i]);
            }

            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(nums[i][colEnd]);
            }

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colEnd; i--) {
                    result.add(nums[rowEnd][i]);
                }
            }

            rowEnd--;

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(nums[i][colStart]);
                }
            }
            colStart++;


        }

        return result;
    }

}
