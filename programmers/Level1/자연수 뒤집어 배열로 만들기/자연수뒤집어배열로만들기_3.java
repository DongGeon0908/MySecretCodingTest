class Solution {
  public int[] solution(long n) {
      String s = String.valueOf(n);
      StringBuilder sb = new StringBuilder(s);
      
      // reverse라는 새로운 메서드.. 거꾸로 만들어줌.,.,
      sb = sb.reverse();
      String[] ss = sb.toString().split("");

      int[] answer = new int[ss.length];
      for (int i=0; i<ss.length; i++) {
          answer[i] = Integer.parseInt(ss[i]);
      }
      return answer;
  }
}

/*
* 자바에서 제공하는 메소드를 활용해서 문제를 풀면 더 쉽게 접근 가능하다!
*
*
*/