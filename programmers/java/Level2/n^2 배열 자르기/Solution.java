import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, long left, long right) {
        // list 자료형 선언
        List<Integer> data = new ArrayList<>();

        while (left <= right) {
            // x좌표 구하기
            long x = left % n;
            
            // y좌표 구하기
            long y = left / n;

            // x와 y의 max 값에 1을 더하면, 해당 좌표값이 됨
            int result = (int) Math.max(x, y) + 1;
            
            // 구해진 좌표값을 list에 저장
            data.add(result);
            
            // left 한칸 전진
            left++;
        }
        
        // list를 배열로 변환
        return data.stream().mapToInt(datum -> datum).toArray();
    }
}
