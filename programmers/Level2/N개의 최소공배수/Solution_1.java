class Solution_1 {
    public int solution(int[] arr) {
        int[] data = new int[101];

		for (int i = 0; i < arr.length; i++) {

			int[] tmp = new int[101];
			for (int j = 2; j <= arr[i]; j++) {
				while (arr[i] % j == 0) {
					tmp[j]++;
					arr[i] /= j;
				}
			}

			for (int j = 2; j < 101; j++) {
				if (tmp[j] > data[j]) {
					data[j] = tmp[j];
				}
			}

		}

		int result = 1;

		for (int i = 2; i < 101; i++) {
			if (data[i] != 0) {
				result *= Math.pow(i, data[i]);
			}
		}
        
        
        
        return result;
    }
}