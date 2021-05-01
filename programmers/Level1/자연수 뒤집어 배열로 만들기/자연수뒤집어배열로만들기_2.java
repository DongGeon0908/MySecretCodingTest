class Solution {
  public int[] solution(long n) {
      
	  // String + Long = String.... 와..
	  String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
  }
}

/*
* 문자열에 숫자를 더하면 문자열이다...
* 자바의 기본적인 문법이다.....
* 반성하자!!
*
*/