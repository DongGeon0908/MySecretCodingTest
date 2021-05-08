import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution_1 {
    public int[] solution(int N, int[] stages) {
        int allClear = 0;

		// 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
		double[] noClear = new double[N];
		for (int i = 0; i < stages.length; i++) {
			if (stages[i] > N) {
				allClear++;
			} else {
				noClear[stages[i] - 1]++;
			}
		}

		// 스테이지에 도달한 플레이어 수
		double[] Clear = new double[N];
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				Clear[i] += noClear[j];
			}
			Clear[i] += allClear;
		}

		// 실패율 구하기
		Map<Integer, Double> fail = new HashMap<>();
		for (int i = 0; i < N; i++) {
			fail.put(i + 1, Clear[i] == 0 ? 0 : noClear[i] / Clear[i]);
		}

		List<Integer> keySetList = new ArrayList<>(fail.keySet());

		Collections.sort(keySetList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return fail.get(o2).compareTo(fail.get(o1));
			}
		});

		// 결과
		int k = 0;
		int[] result = new int[N];
		for (Integer key : keySetList) {
			result[k++] = key;
		}
        
        return result;
    }
}