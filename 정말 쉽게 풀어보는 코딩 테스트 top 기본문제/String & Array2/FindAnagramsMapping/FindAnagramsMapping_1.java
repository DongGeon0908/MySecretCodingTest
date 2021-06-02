import java.util.HashMap;
import java.util.Map;

public class FindAnagramsMapping_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 11, 27, 45, 31, 50 };
		int[] B = { 50, 11, 31, 45, 27 };

		Map<Integer, Integer> data = new HashMap<Integer, Integer>();

		for (int i = 0; i < B.length; i++) {
			data.put(i, B[i]);
		}

		for (int i = 0; i < A.length; i++) {
			for (int j : data.keySet()) {
				if (A[i] == data.get(j)) {
					System.out.print(j + " ");
					break;
				}
			}
		}

	}

}
