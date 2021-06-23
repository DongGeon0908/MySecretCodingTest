class Solution_1 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        		String[] data = new String[n];

		for (int i = 0; i < n; i++) {
			String A = Integer.toBinaryString(arr1[i]);
			String B = Integer.toBinaryString(arr2[i]);

			int length = n - A.length();
			for (int j = 0; j < length; j++) {
				A = "0" + A;
			}

			length = n - B.length();
			for (int j = 0; j < length; j++) {
				B = "0" + B;
			}

			data[i] = "";
			for (int j = 0; j < n; j++) {
				if (A.substring(j, j + 1).equals("1") || B.substring(j, j + 1).equals("1")) {
					data[i] += "#";
				} else {
					data[i] += " ";
				}
			}
		}
        return data;
    }
}