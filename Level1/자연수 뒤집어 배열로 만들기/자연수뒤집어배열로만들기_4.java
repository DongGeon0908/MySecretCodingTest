class Solution {
  public int[] solution(long n) {
      int length = Long.toString(n).length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
  }
}

/*
 * 나는 ArrayList에 데이터 넣은 다음 배열에 추가했다.
 * 그 이유는 Integer.toString이 불가능했기 때문이다.
 * Long에도 toString을 오버라이딩한 메소드가 존재한다.
 * 더 공부하자
 */