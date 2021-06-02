import java.util.HashMap;
import java.util.Map;

public class FindAnagramsMapping_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 11, 27, 45, 31, 50 };
		int[] B = { 50, 11, 31, 45, 27 };

		int[] result = anagramMappings(A, B);

		for (int i : result) {
			System.out.println(i + " ");
		}
	}

	private static int[] anagramMappings(int[] a, int[] b) {
		// TODO Auto-generated method stub

		int[] result = new int[a.length];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			map.put(b[i], i);
		}

		for (int i = 0; i < a.length; i++) {
			result[i] = map.get(a[i]);
		}

		return result;
	}

}
