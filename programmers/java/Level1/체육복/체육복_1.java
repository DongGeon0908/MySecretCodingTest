import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
    	// 모든 학생이 체육복을 하나씩 갖고 있다고 생각하기
    	int[] student = new int[n];
		Arrays.fill(student, 1);

		// 추가적으로 체육복이 있는 학생 ++하기
		for (int i = 0; i < reserve.length; i++) {
			student[(reserve[i] - 1)]++;
		}

		// 체육복을 잃어버린 학생 --
		for (int i = 0; i < lost.length; i++) {
			student[lost[i] - 1]--;
		}

		for (int i = 0; i < lost.length; i++) {
			
			// 첫번째 학생의 경우 두번째 학생에게만 빌릴 수 있음
			if (lost[i] - 1 == 0 && student[0] == 0) {
				if (student[1] == 2) {
					student[0] = 1;
					student[1] = 1;
				}
			} 
			// 마지막 학생은 자기 바로 앞번 학생에게만 빌릴 수 있음
			else if (lost[i] == n && student[n - 1] == 0) {
				if (student[n - 1] == 2) {
					student[n - 1] = 1;
					student[n - 2] = 1;
				}
			} 
			
			// 그외 학생은 앞뒤로 빌릴 수 있음
			else if (student[lost[i] - 1] == 0) {
				if (student[lost[i] - 2] == 2) {
					student[lost[i] - 2] = 1;
					student[lost[i] - 1] = 1;
				} else if (student[lost[i]] == 2) {
					student[lost[i] - 1] = 1;
					student[lost[i]] = 1;
				}
			}
		}

		int result = 0;
		for (int i : student) {
			if (i >= 1) {
				result = result + 1;
			}
		}
        
        return result;
    }
}

/*
 * 처음 해당 코드가 실행되지 않았던 이유는
 * 잃어버린 학생이 여분을 갖고 왔을 경우를 생각하지 못함
 * 
 * 
 * */

