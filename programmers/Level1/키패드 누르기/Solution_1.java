class Solution_1 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
		StringBuffer sb = new StringBuffer();

		// 처음 왼손의 위치
		int[] L = { 0, 0 };

		// 처음 오른손의 위치
		int[] R = { 2, 0 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1) {
				sb.append("L");
				L[0] = 0;
				L[1] = 3;
			} else if (numbers[i] == 4) {
				sb.append("L");
				L[0] = 0;
				L[1] = 2;
			} else if (numbers[i] == 7) {
				sb.append("L");
				L[0] = 0;
				L[1] = 1;
			} else if (numbers[i] == 3) {
				sb.append("R");
				R[0] = 2;
				R[1] = 3;
			} else if (numbers[i] == 6) {
				sb.append("R");
				R[0] = 2;
				R[1] = 2;
			} else if (numbers[i] == 9) {
				sb.append("R");
				R[0] = 2;
				R[1] = 1;
			} else if (numbers[i] == 2) {
				int LL = Math.abs(3 - L[1]) + Math.abs(1 - L[0]);
				int RL = Math.abs(3 - R[1]) + Math.abs(1 - R[0]);

				if (RL > LL) {
					sb.append("L");
					L[0] = 1;
					L[1] = 3;
				} else if (LL > RL) {
					sb.append("R");
					R[0] = 1;
					R[1] = 3;
				} else {
					if (hand.equals("left")) {
						sb.append("L");
						L[0] = 1;
						L[1] = 3;
					} else {
						sb.append("R");
						R[0] = 1;
						R[1] = 3;
					}
				}
			} else if (numbers[i] == 5) {
				int LL = Math.abs(2 - L[1]) + Math.abs(1 - L[0]);
				int RL = Math.abs(2 - R[1]) + Math.abs(1 - R[0]);

				if (RL > LL) {
					sb.append("L");
					L[0] = 1;
					L[1] = 2;
				} else if (LL > RL) {
					sb.append("R");
					R[0] = 1;
					R[1] = 2;
				} else {
					if (hand.equals("left")) {
						sb.append("L");
						L[0] = 1;
						L[1] = 2;
					} else {
						sb.append("R");
						R[0] = 1;
						R[1] = 2;
					}
				}
			} else if (numbers[i] == 8) {
				int LL = Math.abs(1 - L[1]) + Math.abs(1 - L[0]);
				int RL = Math.abs(1 - R[1]) + Math.abs(1 - R[0]);

				if (RL > LL) {
					sb.append("L");
					L[0] = 1;
					L[1] = 1;
				} else if (LL > RL) {
					sb.append("R");
					R[0] = 1;
					R[1] = 1;
				} else {
					if (hand.equals("left")) {
						sb.append("L");
						L[0] = 1;
						L[1] = 1;
					} else {
						sb.append("R");
						R[0] = 1;
						R[1] = 1;
					}
				}
			} else if (numbers[i] == 0) {
				int LL = Math.abs(0 - L[1]) + Math.abs(1 - L[0]);
				int RL = Math.abs(0 - R[1]) + Math.abs(1 - R[0]);

				if (RL > LL) {
					sb.append("L");
					L[0] = 1;
					L[1] = 0;
				} else if (LL > RL) {
					sb.append("R");
					R[0] = 1;
					R[1] = 0;
				} else {
					if (hand.equals("left")) {
						sb.append("L");
						L[0] = 1;
						L[1] = 0;
					} else {
						sb.append("R");
						R[0] = 1;
						R[1] = 0;
					}
				}
			}
		}

		answer = sb.toString();
		return answer;
    }
}